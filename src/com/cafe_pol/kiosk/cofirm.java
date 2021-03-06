package com.cafe_pol.kiosk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class cofirm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	Shop_basket sb;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			cofirm dialog = new cofirm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void get_basket(Shop_basket s_b){
		this.sb = s_b;

	}

	/**
	 * Create the dialog.
	 */
	public cofirm() {
		setResizable(false);
		setBounds(870, 500, 265, 98);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("주문이 추가되었습니다.");
			label.setBounds(56, 10, 158, 23);
			contentPanel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton okButton = new JButton("장바구니로 가기");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						sb.setVisible(true);
						sb.setFocusable(true);
						dispose();

					}
				});

			}
			{
				JButton cancelButton = new JButton("추가 주문하기");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
			}
		}
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}


}
