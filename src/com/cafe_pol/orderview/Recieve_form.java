package com.cafe_pol.orderview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Recieve_form extends JFrame {

	private JPanel contentPane;
	JButton btnNewButton_6; // BigButton
	JButton btnNewButton;
	JButton btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5;
	int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recieve_form frame = new Recieve_form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Recieve_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 584, 80);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Cafe_pol");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 21));
		panel.add(lblNewLabel, BorderLayout.WEST);

		JLabel lblNewLabel_1 = new JLabel("\uC8FC\uBB38\uD558\uC2E0 \uC0C1\uD488\uC774 \uB098\uC654\uC2B5\uB2C8\uB2E4.");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 78, 584, 283);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));


		btnNewButton_6 = new JButton("");
		panel_2.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setButton();
			}
		});

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeNum(btnNewButton.getText().toString());
			}
		});
		panel_3.add(btnNewButton);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeNum(btnNewButton_1.getText().toString());
			}
		});
		panel_3.add(btnNewButton_1);



		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeNum(btnNewButton_2.getText().toString());
			}
		});
		panel_3.add(btnNewButton_2);

		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeNum(btnNewButton_3.getText().toString());
			}
		});
		panel_3.add(btnNewButton_3);

		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeNum(btnNewButton_4.getText().toString());
			}
		});
		panel_3.add(btnNewButton_4);

		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeNum(btnNewButton_5.getText().toString());
			}
		});
		panel_3.add(btnNewButton_5);
	}

	void setButton(){
		for(int i=0;i<6;i++) {
			if (btnNewButton_5.getText().toString().equals("")) {
				btnNewButton_5.setText(btnNewButton_6.getText().toString());
				btnNewButton_6.setText("");
			}
			if (btnNewButton_4.getText().toString().equals("")) {
				btnNewButton_4.setText(btnNewButton_5.getText().toString());
				btnNewButton_5.setText("");
			}
			if (btnNewButton_3.getText().toString().equals("")) {
				btnNewButton_3.setText(btnNewButton_4.getText().toString());
				btnNewButton_4.setText("");
			}
			if (btnNewButton_2.getText().toString().equals("")) {
				btnNewButton_2.setText(btnNewButton_3.getText().toString());
				btnNewButton_3.setText("");
			}
			if (btnNewButton_1.getText().toString().equals("")) {
				btnNewButton_1.setText(btnNewButton_2.getText().toString());
				btnNewButton_2.setText("");
			}
			if (btnNewButton.getText().toString().equals("")) {
				btnNewButton.setText(btnNewButton_1.getText().toString());
				btnNewButton_1.setText("");
			}
		}
	}

	void addButton(String num){
		setButton();
		btnNewButton_6.setText(String.valueOf(num));
	}

	void removeNum(String num){
		if(btnNewButton_5.getText().toString().equals(num)){
			btnNewButton_5.setText("");

		}
		if(btnNewButton_4.getText().toString().equals(num)){
			btnNewButton_4.setText("");

		}
		if(btnNewButton_3.getText().toString().equals(num)){
			btnNewButton_3.setText("");

		}
		if(btnNewButton_2.getText().toString().equals(num)){
			btnNewButton_2.setText("");

		}
		if(btnNewButton_1.getText().toString().equals(num)){
			btnNewButton_1.setText("");

		}
		if(btnNewButton.getText().toString().equals(num)){
			btnNewButton.setText("");

		}
		setButton();
	}
}
