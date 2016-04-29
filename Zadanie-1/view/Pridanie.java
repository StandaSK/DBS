package view;

import java.awt.*;
import javax.swing.*;
import java.util.Vector;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings({"serial", "rawtypes"})
public class Pridanie extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField = new JTextField();
	private JTextField textField_1 = new JTextField();
	
	
	private JComboBox comboBox;
	private JComboBox<Vector> comboBox_1;
	private JComboBox<Vector> comboBox_2;
	private JComboBox<Vector> comboBox_3;
	private JComboBox<Vector> comboBox_4;
	
	private JButton btnPridajVyvojara = new JButton("Pridaj vývojára");
	private JButton btnPridajVydavatela = new JButton("Pridaj vydávate¾a");
	private JButton okButton = new JButton("OK");
	private JButton cancelButton = new JButton("Cancel");
	
	private PridajVyvojara pridajVyvojara;
	private PridajVydavatela pridajVydavatela;
	
	private JLabel lblKategoria = new JLabel("Kategória");
	private JLabel lblRokVydania = new JLabel("Rok vydania");
	private JLabel lblVyvojar = new JLabel("Vývojár");
	private JLabel lblNewLabel = new JLabel("Vydávate¾");
	private JLabel lblPocetKusov = new JLabel("Poèet kusov");
	private JLabel lblPlatforma = new JLabel("Platforma");
	private JLabel lblNazov = new JLabel("Názov");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Pridanie dialog = new Pridanie();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings("unchecked")
	public Pridanie() {
		setBounds(100, 100, 352, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		comboBox = new JComboBox();
		comboBox_1 = new JComboBox();
		comboBox_2 = new JComboBox();
		comboBox_3 = new JComboBox();
		comboBox_4 = new JComboBox();
		
		textField.setColumns(10);
		textField_1.setColumns(10);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNazov)
							.addComponent(textField_1)
							.addComponent(comboBox_1, Alignment.TRAILING, 0, 126, Short.MAX_VALUE)
							.addComponent(lblKategoria)
							.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblPlatforma)
							.addComponent(comboBox_4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(lblRokVydania))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_2, Alignment.TRAILING, 0, 162, Short.MAX_VALUE)
						.addComponent(comboBox_3, 0, 162, Short.MAX_VALUE)
						.addComponent(lblNewLabel)
						.addComponent(lblPocetKusov)
						.addComponent(lblVyvojar)
						.addComponent(btnPridajVydavatela, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
						.addComponent(btnPridajVyvojara, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNazov)
						.addComponent(lblVyvojar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblKategoria)
								.addComponent(btnPridajVyvojara))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblPlatforma)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPridajVydavatela)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(34)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblRokVydania)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblPocetKusov))
					.addGap(144))
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
	 * @return the pridajVyvojara
	 */
	public PridajVyvojara getPridajVyvojara() {
		return pridajVyvojara;
	}

	/**
	 * @param pridajVyvojara the pridajVyvojara to set
	 */
	public void setPridajVyvojara(PridajVyvojara pridajVyvojara) {
		this.pridajVyvojara = pridajVyvojara;
	}

	/**
	 * @return the pridajVydavatela
	 */
	public PridajVydavatela getPridajVydavatela() {
		return pridajVydavatela;
	}

	/**
	 * @param pridajVydavatela the pridajVydavatela to set
	 */
	public void setPridajVydavatela(PridajVydavatela pridajVydavatela) {
		this.pridajVydavatela = pridajVydavatela;
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

	/**
	 * @return the comboBox
	 */
	public JComboBox getComboBox() {
		return comboBox;
	}

	/**
	 * @param comboBox the comboBox to set
	 */
	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	/**
	 * @return the comboBox_1
	 */
	public JComboBox<Vector> getComboBox_1() {
		return comboBox_1;
	}

	/**
	 * @param comboBox_1 the comboBox_1 to set
	 */
	public void setComboBox_1(JComboBox<Vector> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	/**
	 * @return the comboBox_2
	 */
	public JComboBox<Vector> getComboBox_2() {
		return comboBox_2;
	}

	/**
	 * @param comboBox_2 the comboBox_2 to set
	 */
	public void setComboBox_2(JComboBox<Vector> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	/**
	 * @return the comboBox_3
	 */
	public JComboBox<Vector> getComboBox_3() {
		return comboBox_3;
	}

	/**
	 * @param comboBox_3 the comboBox_3 to set
	 */
	public void setComboBox_3(JComboBox<Vector> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	/**
	 * @return the comboBox_4
	 */
	public JComboBox<Vector> getComboBox_4() {
		return comboBox_4;
	}

	/**
	 * @param comboBox_4 the comboBox_4 to set
	 */
	public void setComboBox_4(JComboBox<Vector> comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}

	/**
	 * @return the btnPridajVyvojara
	 */
	public JButton getBtnPridajVyvojara() {
		return btnPridajVyvojara;
	}

	/**
	 * @param btnPridajVyvojara the btnPridajVyvojara to set
	 */
	public void setBtnPridajVyvojara(JButton btnPridajVyvojara) {
		this.btnPridajVyvojara = btnPridajVyvojara;
	}

	/**
	 * @return the btnPridajVydavatela
	 */
	public JButton getBtnPridajVydavatela() {
		return btnPridajVydavatela;
	}

	/**
	 * @param btnPridajVydavatela the btnPridajVydavatela to set
	 */
	public void setBtnPridajVydavatela(JButton btnPridajVydavatela) {
		this.btnPridajVydavatela = btnPridajVydavatela;
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
}
