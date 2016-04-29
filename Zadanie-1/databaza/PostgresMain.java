//zdroj pripojenia k DB: https://examples.javacodegeeks.com/core-java/java-postgresql-example/

package databaza;

import java.awt.event.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

import view.*;


public class PostgresMain {

	public static void main(String[] args) {
		
		PostgresHelper client = new PostgresHelper(
				DBContract.HOST, 
				DBContract.DB_NAME,
				DBContract.USERNAME,
				DBContract.PASSWORD);
		
		try {
			if (client.connect()) {
				System.out.println("DB connected");
				
				ResultSet rs = client.execQuery(
						"SELECT hra.id, hra.nazov, kategoria.nazov FROM hra, kategoria WHERE kategoria_id = kategoria.id ORDER BY hra.id ASC");
				
				int columns = rs.getMetaData().getColumnCount();
				
				View view = new View();
				
				DefaultTableModel model = (DefaultTableModel) view.getTable().getModel();
				
				model.addColumn("ID hry");
				model.addColumn("Názov hry");
				model.addColumn("Kategória");
				
				while(rs.next()) {
					
					Object[] row = new Object[columns];
		            for (int i = 1; i <= columns; i++) {  
		                row[i - 1] = rs.getObject(i);
		            }
					
		            model.insertRow(view.getTable().getRowCount(),row);
				}
				
				/**
				 * Otvorenie okna pridania
				 */
				view.getBtnPridaj().addActionListener(
						new ActionListener() {
							@SuppressWarnings({ "unchecked", "rawtypes" })
							public void actionPerformed(ActionEvent e) {
								Pridanie pridanie = new Pridanie();
								pridanie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
								
								try {
									ResultSet kategorie = client.execQuery(
											"SELECT nazov FROM kategoria");
									
									Vector nazvy_kategorii = new Vector();
									
									while (kategorie.next()) {
										nazvy_kategorii.add(kategorie.getString(1));
										//System.out.printf("%s\n", kategorie.getString(1));
									}
									final DefaultComboBoxModel model = new DefaultComboBoxModel(nazvy_kategorii);
									
									pridanie.setComboBox(new JComboBox(model));
								} catch (SQLException e2) {
									e2.printStackTrace();
								}
								
								pridanie.setVisible(true);
								
								/**
								 * Pridanie noveho vyvojara - HOTOVO
								 */
								pridanie.getBtnPridajVyvojara().addActionListener(
										new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												PridajVyvojara pridajVyvojara = new PridajVyvojara();
												pridajVyvojara.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
												pridajVyvojara.setVisible(true);
												
												pridajVyvojara.getOkButton().addActionListener(
														new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																try {
																	client.execQuery(
																			"INSERT INTO vyvojar (nazov) VALUES "
																	+ "(\'" + pridajVyvojara.getTextField().getText() + "\');");
																} catch (SQLException e1) {
																	e1.printStackTrace();
																}
																
																pridajVyvojara.dispose();
															}
														}
													);
											}
										}
									);
								
								/**
								 * Pridanie noveho vydavatela - HOTOVO
								 */
								pridanie.getBtnPridajVydavatela().addActionListener(
										new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												PridajVydavatela pridajVydavatela = new PridajVydavatela();
												pridajVydavatela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
												pridajVydavatela.setVisible(true);
												
												pridajVydavatela.getOkButton().addActionListener(
														new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																try {
																	client.execQuery(
																			"INSERT INTO vydavatel (nazov) VALUES "
																	+ "(\'" + pridajVydavatela.getTextField().getText() + "\');");
																} catch(SQLException e1) {
																	e1.printStackTrace();
																}
																
																pridajVydavatela.dispose();
															}
														}
													);
											}
										}
									);
								
								/**
								 * TODO Pridanie novej hry
								 */
								pridanie.getOkButton().addActionListener(
										new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												try {
													String vybrany_nazov = pridanie.getTextField_1().getText();
													Object vybrana_kategoria = pridanie.getComboBox().getSelectedItem();
													Object vybrana_platforma = pridanie.getComboBox_4().getSelectedItem();
													Object vybrany_rok_vydania = pridanie.getComboBox_1().getSelectedItem();
													Object vybrany_vyvojar = pridanie.getComboBox_2().getSelectedItem();
													Object vybrany_vydavatel = pridanie.getComboBox_3().getSelectedItem();
													int vybrany_pocet_kusov = Integer.parseInt(pridanie.getTextField().getText());
													
													
													/*client.execQuery("INSERT INTO hra (nazov, kategoria_id) VALUES "
															+ "(\"" + vybrany_nazov + "\", " +
															"(SELECT id FROM kategoria WHERE nazov = vybrana kategoria)");");*/
													
													//pridanie.dispose();
													//jeho odstranenie vyrazne zjednodusuje
													//pridanie hry na viacero platform
												} catch (Exception e1) {
													e1.printStackTrace();
												}
											}
										}
									);
							}
						}
					);
				
				/**
				 * Otvorenie okna hladania - HOTOVO
				 */
				view.getBtnHladaj().addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Hladanie hladanie = new Hladanie();
								hladanie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
								hladanie.setVisible(true);
								
								/**
								 * Spustenie hladania na zaklade zadanych udajov - HOTOVO
								 */
								hladanie.getOkButton().addActionListener(
										new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												
												String vybrane_meno = hladanie.getTextField().getText();
												String vybrana_kategoria = hladanie.getTextField_1().getText();
												String vybrana_platforma = hladanie.getTextField_2().getText();
												String vybrany_vyvojar = hladanie.getTextField_4().getText();
												String vybrany_vydavatel = hladanie.getTextField_5().getText();
												String vybrany_rok_vydania = hladanie.getTextField_3().getText();
												
												try {
													ResultSet temp;
													
													if (Objects.equals(vybrane_meno, "N/A")) {
														//System.out.printf("ZIADNE ZADANE MENO!\n");
														
														if (Objects.equals(vybrana_kategoria, "N/A")) {
															//System.out.printf("ZIADNA ZADANA KATEGORIA!\n");
															
															if (Objects.equals(vybrana_platforma, "N/A")) {
																//System.out.printf("ZIADNA ZADANA PLATFORMA!\n");
																
																if (Objects.equals(vybrany_vyvojar, "N/A")) {
																	//System.out.printf("ZIADEN ZADANY VYVOJAR!\n");
																	
																	if (Objects.equals(vybrany_vydavatel, "N/A")) {
																		//System.out.printf("ZIADEN ZADANY VYDAVATEL!\n");
																		
																		if (Objects.equals(vybrany_rok_vydania, "N/A")) {
																			//System.out.printf("ZIADEN ZADANY ROK VYDANIA!\n");
																			System.out.printf("Nebolo zadane ziadne kriterium vyhladavania!");
																		} else {
																			//System.out.printf("Bol zadany rok vydania hry!\n");
																			
																			temp =  client.execQuery("SELECT count(rok_vydania) FROM hra_platforma WHERE rok_vydania = "
																					+ vybrany_rok_vydania);
																			
																			while (temp.next()) {
																				System.out.printf("%d\n", temp.getInt(1));
																			}
																		}
																	} else {
																		//System.out.printf("Bol zadany vydavatel hry!\n");
																		
																		temp =  client.execQuery("SELECT nazov FROM vydavatel WHERE nazov LIKE "
																				+ "\'%" + vybrany_vydavatel + "%\'");
																		
																		while (temp.next()) {
																			System.out.printf("%s\n", temp.getString(1));
																		}
																	}
																} else {
																	//System.out.printf("Bol zadany vyvojar hry!\n");
																	
																	temp =  client.execQuery("SELECT nazov FROM vyvojar WHERE nazov LIKE "
																			+ "\'%" + vybrany_vyvojar + "%\'");
																	
																	while (temp.next()) {
																		System.out.printf("%s\n", temp.getString(1));
																	}
																}
															} else {
																//System.out.printf("Bola zadana platforma hry!\n");
																
																temp =  client.execQuery("SELECT nazov FROM platforma WHERE nazov LIKE "
																		+ "\'%" + vybrana_platforma + "%\'");
																
																while (temp.next()) {
																	System.out.printf("%s\n", temp.getString(1));
																}
															}
														} else {
															//System.out.printf("Bola zadana kategoria hry!\n");
															
															temp =  client.execQuery("SELECT nazov FROM kategoria WHERE nazov LIKE "
																	+ "\'%" + vybrana_kategoria + "%\'");
															
															while (temp.next()) {
																System.out.printf("%s\n", temp.getString(1));
															}
														}
													} else {
														//System.out.printf("Bolo zadane meno hry!\n");
														
														temp =  client.execQuery("SELECT nazov FROM hra WHERE nazov LIKE "
																+ "\'%" + vybrane_meno + "%\'");
														
														while (temp.next()) {
															System.out.printf("%s\n", temp.getString(1));
														}
													}
													
												} catch (SQLException e1) {
													e1.printStackTrace();
												}
												
												hladanie.dispose();
											}
										}
									);
							}
						}
					);
				
				/**
				 * Otvorenie okna aktualizovania
				 */
				view.getBtnAktualizuj().addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Aktualizacia aktualizacia = new Aktualizacia(view.getTable().getSelectedRow());
								aktualizacia.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
								aktualizacia.setVisible(true);
								
								/**
								 * TODO Aktualizovanie hry
								 */
								int aktualizuj = view.getTable().getSelectedRow() + 1;
								int pocetKs = Integer.parseInt(aktualizacia.getTextField_1().getText()); 
								String staryNazov = (String) aktualizacia.getComboBox_5().getSelectedItem();
								String novyNazov = aktualizacia.getTextField().getText();
								String novaPlatforma = (String) aktualizacia.getComboBox_1().getSelectedItem();
								String novaKategoria = (String) aktualizacia.getComboBox().getSelectedItem();
								String novyVyvojar = (String) aktualizacia.getComboBox_2().getSelectedItem();
								String novyVydavatel = (String) aktualizacia.getComboBox_3().getSelectedItem();
								String novyRokVydania = (String) aktualizacia.getComboBox_4().getSelectedItem();
								
								try {
									client.execQuery("BEGIN"
											+ "UPDATE hra SET nazov = " + novyNazov + " WHERE nazov = " + staryNazov + ";" 
											+ "COMMIT;");
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							}
						}
					);
				
				/**
				 * Otvorenie okna filtrovania
				 */
				view.getBtnFiltrovanie().addActionListener(
						new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Filtrovanie filtrovanie = new Filtrovanie();
								filtrovanie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
								filtrovanie.setVisible(true);
								
								/**
								 * TODO Filtrovanie hier
								 */
								try {
									//priklad filtrovania podla kategoria == 1
									ResultSet filter = client.execQuery("SELECT * FROM hra INNER JOIN kategoria USING (kategoria_id)");
									
									while (filter.next()) {
										System.out.printf("%d\t%s\t%s\n", filter.getInt(1), filter.getString(2), filter.getString(3));
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							}
						}
					);
				
				/**
				 * Otvorenie okna odoberania - TAKMER HOTOVO
				 */
				view.getBtnOdober().addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int vymaz = view.getTable().getSelectedRow() + 1;
							
							try {
								client.execQuery("BEGIN;"
										+ "DELETE FROM hra_platforma WHERE hra_id = " + vymaz + ";"
										+ "DELETE FROM vyroba WHERE hra_id = " + vymaz + ";"
										+ "DELETE FROM vypozicka WHERE hra_id = " + vymaz + ";"
										+ "DELETE FROM hra WHERE id = " + vymaz + ";"
										+ "COMMIT;");
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							
							/**
							 * TODO Update tabulky po odobrati hry z databazy
							 */
							model.fireTableDataChanged();
							}
						}
					);
				
				/**
				 * Otvorenie okna pozicania
				 */
				view.getBtnPozicanie().addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							Pozicanie pozicanie = new Pozicanie();
							pozicanie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							
							pozicanie.setVisible(true);
							
							/**
							 * TODO Vytvorenie vypozicky
							 */
							
							/**
							 * Pridanie noveho zakaznika - HOTOVO
							 */
							pozicanie.getBtnPridajZakaznika().addActionListener(
									new ActionListener() {
										public void actionPerformed(ActionEvent arg0) {
											PridajZakaznika pridajZakaznika = new PridajZakaznika();
											pridajZakaznika.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
											
											/**
											 * Vlozenie noveho zakaznika do databazy
											 */
											pridajZakaznika.getOkButton().addActionListener(
													new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															try {
																client.execQuery(
																		"INSERT INTO zakaznik (meno) VALUES "
																		+ "(\'" + pridajZakaznika.getTextField().getText() + "\');");
															} catch(SQLException e1) {
																e1.printStackTrace();
															}
															
															pridajZakaznika.dispose();
														}
													}
												);
											pridajZakaznika.setVisible(true);
										}
									}
								);
							}
						}
					);
				
				/**
				 * Otvorenie okna vratenia
				 */
				view.getBtnVratenie().addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Vratenie vratenie = new Vratenie();
							vratenie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							vratenie.setVisible(true);
							
							/**
							 * TODO Vratenie vypozicky
							 */
							}
						}
					);
				
				view.getFrame().setVisible(true);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
