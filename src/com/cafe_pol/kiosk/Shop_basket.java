package com.cafe_pol.kiosk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class Shop_basket extends JDialog {

	private final JPanel contentPanel = new JPanel();
	DefaultListModel model = new DefaultListModel();
	JList list = new JList(model);
	int order_number = 0;

	int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Shop_basket dialog = new Shop_basket();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Shop_basket() {
		setBounds(800, 300, 459, 457);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("장바구니");
			lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 419, 25);
			contentPanel.add(lblNewLabel);
		}
		

		list.setBounds(12, 45, 419, 330);

		contentPanel.add(list);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if(model.getSize() !=0) {

							for (int j = 0; j < model.getSize(); j++) {
								System.out.println(order_number + "/" + model.get(j).toString());
							}
							order_number++;
							model.clear();
							i = 0;
						}else {
							JOptionPane.showMessageDialog(null, "장바구니가 비었습니다!", "Error", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
			}
		}
	}
	public void input_data(String s) {
		model.add(i, s);
		i++;
	}
}
