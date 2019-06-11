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

		JButton btnNewButton_6 = new JButton("New button");
		panel_2.add(btnNewButton_6);

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("NewButton");
			}
		});
		panel_3.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button1");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bNB1");
			}
		});
		panel_3.add(btnNewButton_1);



		JButton btnNewButton_2 = new JButton("New button2");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bNB2");
			}
		});
		panel_3.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button3");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bNB3");
			}
		});
		panel_3.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("New button4");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bNB4");
			}
		});
		panel_3.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("New button5");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("bNB5");
			}
		});
		panel_3.add(btnNewButton_5);
	}
}
