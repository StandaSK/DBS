package view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class Aktualizacia extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private String[] vyber = {"-Vyber-"}; 
	
	private JComboBox<String[]> comboBox;
	private JComboBox<String[]> comboBox_1;
	private JComboBox<String[]> comboBox_2;
	private JComboBox<String[]> comboBox_3;
	private JComboBox<String[]> comboBox_4;
	private JComboBox<String[]> comboBox_5;
	
	private JButton okButton = new JButton("OK");
	private JButton cancelButton = new JButton("Cancel");
	
	private JLabel lblKategoria = new JLabel("Kategória");
	private JLabel lblPlatforma = new JLabel("Platforma");
	private JLabel lblVyvojar = new JLabel("Vývojár");
	private JLabel lblVydavatel = new JLabel("Vydávate¾");
	private JLabel lblRokVydania = new JLabel("Rok vydania");
	private JLabel lblNazov = new JLabel("Starý názov");
	private JLabel lblPocetKusov = new JLabel("Poèet kusov");
	private JLabel lblNovyNazov = new JLabel("Nový názov");

	private JTextField textField = new JTextField();
	private JTextField textField_1 = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Aktualizacia dialog = new Aktualizacia(0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Aktualizacia(int hra_id) {
		setBounds(100, 100, 225, 560);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);

		comboBox = new JComboBox(vyber);
		comboBox_1 = new JComboBox(vyber);
		comboBox_2 = new JComboBox(vyber);
		comboBox_3 = new JComboBox(vyber);
		comboBox_4 = new JComboBox(vyber);
		comboBox_5 = new JComboBox(vyber);
				
		textField.setColumns(10);
		textField_1.setColumns(10);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblKategoria)
						.addComponent(lblPlatforma)
						.addComponent(comboBox_5, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox_3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox_4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox, 0, 175, Short.MAX_VALUE)
						.addComponent(lblVyvojar)
						.addComponent(lblVydavatel)
						.addComponent(lblRokVydania)
						.addComponent(lblNazov)
						.addComponent(lblNovyNazov)
						.addComponent(textField)
						.addComponent(lblPocetKusov)
						.addComponent(textField_1))
					.addContainerGap(274, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblKategoria)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPlatforma)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblVyvojar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblVydavatel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblRokVydania)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNazov)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNovyNazov)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPocetKusov)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	/**
	 * @return the vyber
	 */
	public String[] getVyber() {
		return vyber;
	}

	/**
	 * @param vyber the vyber to set
	 */
	public void setVyber(String[] vyber) {
		this.vyber = vyber;
	}

	/**
	 * @return the comboBox
	 */
	public JComboBox<String[]> getComboBox() {
		return comboBox;
	}

	/**
	 * @param comboBox the comboBox to set
	 */
	public void setComboBox(JComboBox<String[]> comboBox) {
		this.comboBox = comboBox;
	}

	/**
	 * @return the comboBox_1
	 */
	public JComboBox<String[]> getComboBox_1() {
		return comboBox_1;
	}

	/**
	 * @param comboBox_1 the comboBox_1 to set
	 */
	public void setComboBox_1(JComboBox<String[]> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	/**
	 * @return the comboBox_2
	 */
	public JComboBox<String[]> getComboBox_2() {
		return comboBox_2;
	}

	/**
	 * @param comboBox_2 the comboBox_2 to set
	 */
	public void setComboBox_2(JComboBox<String[]> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	/**
	 * @return the comboBox_3
	 */
	public JComboBox<String[]> getComboBox_3() {
		return comboBox_3;
	}

	/**
	 * @param comboBox_3 the comboBox_3 to set
	 */
	public void setComboBox_3(JComboBox<String[]> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	/**
	 * @return the comboBox_4
	 */
	public JComboBox<String[]> getComboBox_4() {
		return comboBox_4;
	}

	/**
	 * @param comboBox_4 the comboBox_4 to set
	 */
	public void setComboBox_4(JComboBox<String[]> comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}

	/**
	 * @return the comboBox_5
	 */
	public JComboBox<String[]> getComboBox_5() {
		return comboBox_5;
	}

	/**
	 * @param comboBox_5 the comboBox_5 to set
	 */
	public void setComboBox_5(JComboBox<String[]> comboBox_5) {
		this.comboBox_5 = comboBox_5;
	}

	/**
	 * @return the okButton
	 */
	public JButton getOkButton() {
		return okButton;
	}

	/**
	 * @param okButton the okButton to set
	 */
	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}
	
	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * @return the textField_1
	 */
	public JTextField getTextField_1() {
		return textField_1;
	}

	/**
	 * @param textField_1 the textField_1 to set
	 */
	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}
}
