package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class Hladanie extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JLabel lblAkNiecoNehcete = new JLabel("Pri h¾adaní využíva iba 1 pole, ostatné ponechajte prázdne (N/A).");;
	private JLabel lblNazov = new JLabel("Názov");
	private JLabel lblKategoria = new JLabel("Kategória");
	private JLabel lblPlatforma = new JLabel("Platforma");
	private JLabel lblRokVydania = new JLabel("Rok vydania");
	private JLabel lblVyvojar = new JLabel("Vývojár");
	private JLabel lblVydavatel = new JLabel("Vydávate¾");
	
	private JTextField textField = new JTextField("N/A");
	private JTextField textField_1 = new JTextField("N/A");
	private JTextField textField_2 = new JTextField("N/A");
	private JTextField textField_3 = new JTextField("N/A");
	private JTextField textField_4 = new JTextField("N/A");
	private JTextField textField_5 = new JTextField("N/A");
	
	private JButton okButton = new JButton("H¾adaj");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Hladanie dialog = new Hladanie();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Hladanie() {
		setBounds(100, 100, 424, 277);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			//okButton.setActionCommand("OK");
			//getRootPane().setDefaultButton(okButton);
		}
		textField.setColumns(10);
		textField_1.setColumns(10);
		textField_2.setColumns(10);		
		textField_3.setColumns(10);		
		textField_4.setColumns(10);		
		textField_5.setColumns(10);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(okButton, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAkNiecoNehcete)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNazov)
										.addComponent(lblKategoria)
										.addComponent(lblPlatforma)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(textField, Alignment.LEADING)
												.addComponent(textField_1, Alignment.LEADING)
												.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
											.addGap(18)))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRokVydania)
										.addComponent(lblVydavatel)
										.addComponent(lblVyvojar)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
											.addComponent(textField_4, Alignment.LEADING)
											.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_5))
											.addComponent(textField_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))))
							.addContainerGap())))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lblAkNiecoNehcete)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNazov)
						.addComponent(lblVyvojar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKategoria)
						.addComponent(lblVydavatel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPlatforma)
						.addComponent(lblRokVydania))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
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
	 * @return the textField_2
	 */
	public JTextField getTextField_2() {
		return textField_2;
	}

	/**
	 * @param textField_2 the textField_2 to set
	 */
	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	/**
	 * @return the textField_3
	 */
	public JTextField getTextField_3() {
		return textField_3;
	}

	/**
	 * @param textField_3 the textField_3 to set
	 */
	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	/**
	 * @return the textField_4
	 */
	public JTextField getTextField_4() {
		return textField_4;
	}

	/**
	 * @param textField_4 the textField_4 to set
	 */
	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	/**
	 * @return the textField_5
	 */
	public JTextField getTextField_5() {
		return textField_5;
	}

	/**
	 * @param textField_5 the textField_5 to set
	 */
	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
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
