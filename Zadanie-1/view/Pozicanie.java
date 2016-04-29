package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class Pozicanie extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private String[] vyber = {"-Vyber-"};
	
	private JComboBox<String[]> comboBox;
	private JComboBox<String[]> comboBox_1;
	private JComboBox<String[]> comboBox_2;
	private JComboBox<String[]> comboBox_3;
	private JComboBox<String[]> comboBox_4;
	private JComboBox<String[]> comboBox_5;
	private JComboBox<String[]> comboBox_6;
	
	private JButton btnPridajZakaznika = new JButton("Pridaj Z�kazn�ka");
	private JButton okButton = new JButton("OK");
	private JButton cancelButton = new JButton("Cancel");
	
	private JLabel label = new JLabel("Kateg�ria");
	private JLabel label_1 = new JLabel("Platforma");
	private JLabel label_2 = new JLabel("V�voj�r");
	private JLabel label_3 = new JLabel("Vyd�vate�");
	private JLabel label_4 = new JLabel("Rok vydania");
	private JLabel label_5 = new JLabel("N�zov");
	private JLabel lblZakaznik = new JLabel("Z�kazn�k");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Pozicanie dialog = new Pozicanie();
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
	public Pozicanie() {
		setBounds(100, 100, 406, 388);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);		
		{
			panel = new JPanel();
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));

			comboBox = new JComboBox(vyber);
			comboBox_1 = new JComboBox(vyber);
			comboBox_2 = new JComboBox(vyber);
			comboBox_3 = new JComboBox(vyber);
			comboBox_4 = new JComboBox(vyber);			
			comboBox_5 = new JComboBox(vyber);			
			comboBox_6 = new JComboBox(vyber);
			
			JLabel lblDatumZapozicania = new JLabel("Datum zapozicania");
			
			JFormattedTextField formattedTextField = new JFormattedTextField();
			
			JLabel lblDatumVratenia = new JLabel("Datum vratenia");
			
			JFormattedTextField formattedTextField_1 = new JFormattedTextField();
			
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(label)
								.addGap(157)
								.addComponent(label_3))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addGap(70)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(label_1)
								.addGap(157)
								.addComponent(label_4))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addGap(70)
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(label_2)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
								.addGap(70)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(label_5)
										.addGap(116))
									.addComponent(comboBox_5, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblDatumZapozicania)
										.addContainerGap())
									.addComponent(formattedTextField)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblDatumVratenia)
										.addContainerGap())
									.addComponent(formattedTextField_1)))))
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblZakaznik))
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnPridajZakaznika, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_6, Alignment.LEADING, 0, 133, Short.MAX_VALUE)))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(11)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(label)
							.addComponent(label_3))
						.addGap(6)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(11)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(label_1)
							.addComponent(label_4))
						.addGap(6)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(11)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(label_2)
							.addComponent(label_5))
						.addGap(6)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblZakaznik)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnPridajZakaznika))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblDatumZapozicania)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblDatumVratenia)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(68, Short.MAX_VALUE))
			);
			panel.setLayout(gl_panel);
		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
					.addContainerGap())
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
	 * @return the comboBox_6
	 */
	public JComboBox<String[]> getComboBox_6() {
		return comboBox_6;
	}

	/**
	 * @param comboBox_6 the comboBox_6 to set
	 */
	public void setComboBox_6(JComboBox<String[]> comboBox_6) {
		this.comboBox_6 = comboBox_6;
	}

	/**
	 * @return the btnPridajZakaznika
	 */
	public JButton getBtnPridajZakaznika() {
		return btnPridajZakaznika;
	}

	/**
	 * @param btnPridajZakaznika the btnPridajZakaznika to set
	 */
	public void setBtnPridajZakaznika(JButton btnPridajZakaznika) {
		this.btnPridajZakaznika = btnPridajZakaznika;
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
