package com.cafe_pol.kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main main1 = new Main();
					main1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 683 );
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(10, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uBA54\uB274 \uC120\uD0DD");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setPreferredSize(new Dimension(52, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 5));
		
		JButton category_btn1 = new JButton("콜드브루");
		
		panel.add(category_btn1);
		
		JButton category_btn2 = new JButton("에스프레소");
	
		panel.add(category_btn2);
		
		JButton category_btn3 = new JButton("프라푸치노");

		panel.add(category_btn3);
		
		JButton category_btn4 = new JButton("블랜디드");
		panel.add(category_btn4);
		
		JButton category_btn5 = new JButton("티바나");
		panel.add(category_btn5);
		
		JButton category_btn6 = new JButton("푸드");
		panel.add(category_btn6);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton shop_btn = new JButton("\uC7A5\uBC14\uAD6C\uB2C8");
		shop_btn.setPreferredSize(new Dimension(780, 30));
		panel_1.add(shop_btn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(new Rectangle(0, 0, 10, 10));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 3, 10, 10));
		
		
		JButton Menu_btn1 = new JButton("          콜드브루 \r\n 4000원");
		Menu_btn1.setIconTextGap(0);
		Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\나이트로 쇼콜라 클라우드.jpg"));
		panel_2.add(Menu_btn1);
		JButton Menu_btn2 = new JButton("New button");
		panel_2.add(Menu_btn2);
		JButton Menu_btn3 = new JButton("New button");
		panel_2.add(Menu_btn3);
		JButton Menu_btn4 = new JButton("New button");
		Menu_btn4.setIcon(new ImageIcon("C:\\Program Files\\internet explorer\\images\\bing.ico"));
		panel_2.add(Menu_btn4);
		JButton Menu_btn5 = new JButton("New button");
		panel_2.add(Menu_btn5);
		JButton Menu_btn6 = new JButton("New button");
		panel_2.add(Menu_btn6);
	}
}
