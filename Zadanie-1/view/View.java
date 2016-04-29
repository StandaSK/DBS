package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class View {

	private JFrame frame;
	private JTable table;
	
	private JButton btnPridaj = new JButton("Pridaj");
	private JButton btnOdober = new JButton("Odober");
	private JButton btnAktualizuj = new JButton("Aktualizuj");
	private JButton btnHladaj = new JButton("H¾adaj");
	private JButton btnFiltrovanie = new JButton("Filtrovanie");
	private JButton btnPozicanie = new JButton("Požièanie");
	private JButton btnVratenie  = new JButton("Vrátenie");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnVratenie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnPozicanie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnPridaj, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnOdober, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAktualizuj, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnHladaj, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnFiltrovanie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnPridaj)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnOdober)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAktualizuj)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnHladaj)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFiltrovanie)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPozicanie)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnVratenie)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @return the table
	 */
	public JTable getTable() {
		return table;
	}

	/**
	 * @param table the table to set
	 */
	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * @return the btnPridaj
	 */
	public JButton getBtnPridaj() {
		return btnPridaj;
	}

	/**
	 * @param btnPridaj the btnPridaj to set
	 */
	public void setBtnPridaj(JButton btnPridaj) {
		this.btnPridaj = btnPridaj;
	}

	/**
	 * @return the btnOdober
	 */
	public JButton getBtnOdober() {
		return btnOdober;
	}

	/**
	 * @param btnOdober the btnOdober to set
	 */
	public void setBtnOdober(JButton btnOdober) {
		this.btnOdober = btnOdober;
	}

	/**
	 * @return the btnAktualizuj
	 */
	public JButton getBtnAktualizuj() {
		return btnAktualizuj;
	}

	/**
	 * @param btnAktualizuj the btnAktualizuj to set
	 */
	public void setBtnAktualizuj(JButton btnAktualizuj) {
		this.btnAktualizuj = btnAktualizuj;
	}

	/**
	 * @return the btnHladaj
	 */
	public JButton getBtnHladaj() {
		return btnHladaj;
	}

	/**
	 * @param btnHladaj the btnHladaj to set
	 */
	public void setBtnHladaj(JButton btnHladaj) {
		this.btnHladaj = btnHladaj;
	}

	/**
	 * @return the btnFiltrovanie
	 */
	public JButton getBtnFiltrovanie() {
		return btnFiltrovanie;
	}

	/**
	 * @param btnFiltrovanie the btnFiltrovanie to set
	 */
	public void setBtnFiltrovanie(JButton btnFiltrovanie) {
		this.btnFiltrovanie = btnFiltrovanie;
	}

	/**
	 * @return the btnPozicanie
	 */
	public JButton getBtnPozicanie() {
		return btnPozicanie;
	}

	/**
	 * @param btnPozicanie the btnPozicanie to set
	 */
	public void setBtnPozicanie(JButton btnPozicanie) {
		this.btnPozicanie = btnPozicanie;
	}

	/**
	 * @return the btnVratenie
	 */
	public JButton getBtnVratenie() {
		return btnVratenie;
	}

	/**
	 * @param btnVratenie the btnVratenie to set
	 */
	public void setBtnVratenie(JButton btnVratenie) {
		this.btnVratenie = btnVratenie;
	}
}
