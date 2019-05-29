package com.cafe_pol.kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame implements ActionListener {

	private JPanel contentPane;
	Shop_basket shop_basket;
	int option = 0;
	int item = 0;
	JButton Menu_btn1;
	JButton Menu_btn2;
	JButton Menu_btn3;
	JButton Menu_btn4;
	JButton Menu_btn5;
	JButton Menu_btn6;
	JButton category_btn1;
	JButton category_btn2;
	JButton category_btn3;
	JButton category_btn4;
	JButton category_btn5;
	JButton category_btn6;
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
		shop_basket = new Shop_basket();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 860 );
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
		
		category_btn1 = new JButton("콜드브루");
		category_btn1.addActionListener(this);
		panel.add(category_btn1);
		
		category_btn2 = new JButton("에스프레소");
		category_btn2.addActionListener(this);
		panel.add(category_btn2);
		
		 category_btn3 = new JButton("프라푸치노");
		category_btn3.addActionListener(this);
		panel.add(category_btn3);
		
		category_btn4 = new JButton("블랜디드");
		category_btn4.addActionListener(this);
		panel.add(category_btn4);
		
		category_btn5 = new JButton("티바나");
		category_btn5.addActionListener(this);
		panel.add(category_btn5);
		
		category_btn6 = new JButton("푸드");
		category_btn6.addActionListener(this);
		panel.add(category_btn6);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton shop_btn = new JButton("\uC7A5\uBC14\uAD6C\uB2C8");
		shop_btn.setPreferredSize(new Dimension(780, 30));
		shop_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shop_basket.setVisible(true);
			}
		});
		panel_1.add(shop_btn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(new Rectangle(0, 0, 10, 10));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 3, 10, 10));
		
		
		Menu_btn1 = new JButton();
		Menu_btn1.setIconTextGap(0);
		Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 브루.jpg"));

		panel_2.add(Menu_btn1);
		Menu_btn2 = new JButton(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 브루 몰트.jpg"));

		panel_2.add(Menu_btn2);
		Menu_btn3 = new JButton(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 브루 플로트.jpg"));
		panel_2.add(Menu_btn3);
		Menu_btn4 = new JButton(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 폼 콜드 브루.jpg"));
		panel_2.add(Menu_btn4);
		Menu_btn5 = new JButton(new ImageIcon("Coffee_Photo\\ColdBrew\\돌체 콜드브루.jpg"));
		panel_2.add(Menu_btn5);
		Menu_btn6 = new JButton(new ImageIcon("Coffee_Photo\\ColdBrew\\바닐라 크림 콜드 브루.jpg"));
		panel_2.add(Menu_btn6);
		Menu_btn1.addActionListener(this);
		Menu_btn2.addActionListener(this);
		Menu_btn3.addActionListener(this);
		Menu_btn4.addActionListener(this);
		Menu_btn5.addActionListener(this);
		Menu_btn6.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Menu_btn1) {
			item = 0;
			new option_select(option,item,shop_basket);

		}else if(e.getSource() == Menu_btn2) {
			item = 1;
			new option_select(option,item,shop_basket);

		}else if(e.getSource() == Menu_btn3) {
			item = 2;
			new option_select(option,item,shop_basket);

		}else if(e.getSource() == Menu_btn4) {
			item = 3;
			new option_select(option,item,shop_basket);

		}else if(e.getSource() == Menu_btn5) {
			item = 4;
			new option_select(option,item,shop_basket);

		}else if(e.getSource() == Menu_btn6) {
			item = 5;
			new option_select(option,item,shop_basket);
		}

		if(e.getSource() == category_btn1) {
			option = 0;
			Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 브루.jpg"));
			Menu_btn2.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 브루 몰트.jpg"));
			Menu_btn3.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 브루 플로트.jpg"));
			Menu_btn4.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\콜드 폼 콜드 브루.jpg"));
			Menu_btn5.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\돌체 콜드브루.jpg"));
			Menu_btn6.setIcon(new ImageIcon("Coffee_Photo\\ColdBrew\\바닐라 크림 콜드 브루.jpg"));

		}else if(e.getSource() == category_btn2) {
			option = 1;
			Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\Espresso\\카페라떼.jpg"));
			Menu_btn2.setIcon(new ImageIcon("Coffee_Photo\\Espresso\\아이스 카페라떼.jpg"));
			Menu_btn3.setIcon(new ImageIcon("Coffee_Photo\\Espresso\\카페 모카.jpg"));
			Menu_btn4.setIcon(new ImageIcon("Coffee_Photo\\Espresso\\아이스 카페 모카.jpg"));
			Menu_btn5.setIcon(new ImageIcon("Coffee_Photo\\Espresso\\카라멜 마키아또.jpg"));
			Menu_btn6.setIcon(new ImageIcon("Coffee_Photo\\Espresso\\아이스 카라멜 마키아또.jpg"));

		}else if(e.getSource() == category_btn3) {
			option =2;
			Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\Prapuccino\\그린티 크림 프라푸치노.jpg"));
			Menu_btn2.setIcon(new ImageIcon("Coffee_Photo\\Prapuccino\\카라멜 프라푸치노.jpg"));
			Menu_btn3.setIcon(new ImageIcon("Coffee_Photo\\Prapuccino\\다크 카라멜 커피 프라푸치노.jpg"));
			Menu_btn4.setIcon(new ImageIcon("Coffee_Photo\\Prapuccino\\모카 프라푸치노.jpg"));
			Menu_btn5.setIcon(new ImageIcon("Coffee_Photo\\Prapuccino\\바닐라 크림 프라푸치노.jpg"));
			Menu_btn6.setIcon(new ImageIcon("Coffee_Photo\\Prapuccino\\자바 칩 프라푸치노.jpg"));

		}else if(e.getSource() == category_btn4) {
			option =3;
			Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\Blandid\\딸기 요거트 블렌디드.jpg"));
			Menu_btn2.setIcon(new ImageIcon("Coffee_Photo\\Blandid\\딸기 피치 블렌디드.jpg"));
			Menu_btn3.setIcon(new ImageIcon("Coffee_Photo\\Blandid\\망고 바나나 블렌디드.jpg"));
			Menu_btn4.setIcon(new ImageIcon("Coffee_Photo\\Blandid\\망고 패션 후르츠 블렌디드.jpg"));
			Menu_btn5.setIcon(new ImageIcon("Coffee_Photo\\Blandid\\아몬드 바나나 블렌디드.jpg"));
			Menu_btn6.setIcon(new ImageIcon("Coffee_Photo\\Blandid\\아보카도 블렌디드.jpg"));
		}else if(e.getSource() == category_btn5) {
			option = 4;
			Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\Tibana(Tea)\\그린 티 라뗴.jpg"));
			Menu_btn2.setIcon(new ImageIcon("Coffee_Photo\\Tibana(Tea)\\라임 패션 티.jpg"));
			Menu_btn3.setIcon(new ImageIcon("Coffee_Photo\\Tibana(Tea)\\레몬 민트 티.jpg"));
			Menu_btn4.setIcon(new ImageIcon("Coffee_Photo\\Tibana(Tea)\\민트 블렌드 티.jpg"));
			Menu_btn5.setIcon(new ImageIcon("Coffee_Photo\\Tibana(Tea)\\아이스 라임 패션 티.jpg"));
			Menu_btn6.setIcon(new ImageIcon("Coffee_Photo\\Tibana(Tea)\\아이스 레몬 민트 티.jpg"));
		}else if(e.getSource() == category_btn6) {
			option =5;
			Menu_btn1.setIcon(new ImageIcon("Coffee_Photo\\Food\\DT밀당 케이크 촉촉 초코.jpg"));
			Menu_btn2.setIcon(new ImageIcon("Coffee_Photo\\Food\\구운 바나나 케이크.jpg"));
			Menu_btn3.setIcon(new ImageIcon("Coffee_Photo\\Food\\레드벨벳 크림치즈 케이크.jpg"));
			Menu_btn4.setIcon(new ImageIcon("Coffee_Photo\\Food\\마스카포네 티라미수 케이크.jpg"));
			Menu_btn5.setIcon(new ImageIcon("Coffee_Photo\\Food\\블루베리 쿠키 치즈 케이크.jpg"));
			Menu_btn6.setIcon(new ImageIcon("Coffee_Photo\\Food\\초콜릿 페스티벌 케이크.jpg"));
		}

	}
}
