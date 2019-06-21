package com.cafe_pol.server;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ServerApp_Push extends JDialog {

	private JPanel contentPane;
	DefaultListModel name= new DefaultListModel();
	DefaultListModel num= new DefaultListModel();
	DefaultListModel cup= new DefaultListModel();
	DefaultListModel size= new DefaultListModel();
	DefaultListModel shot= new DefaultListModel();
	DefaultListModel ice= new DefaultListModel();
	JList list,list_1,list_2,list_3,list_4,list_5;

	DefaultListModel Data= new DefaultListModel();
	String order_num; //주문번호

	int price = 0;


	/**
	 * Create the frame.
	 */
	public ServerApp_Push(DefaultListModel data) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("주문번호");
		label.setBounds(12, 49, 57, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("선택한 주문입니다.");
		label_1.setFont(new Font("굴림", Font.PLAIN, 16));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(191, 10, 231, 28);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("2019-05-28 17:18:19");
		label_2.setBounds(479, 49, 116, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("커피 이름");
		label_3.setBounds(46, 77, 57, 15);
		contentPane.add(label_3);
		
		list = new JList(name);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));

		list.setBounds(46, 102, 200, 258);
		contentPane.add(list);
		
		JLabel label_4 = new JLabel("갯수");
		label_4.setBounds(258, 77, 57, 15);
		contentPane.add(label_4);
		
		list_1 = new JList(num);
		list_1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		list_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		list_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_1.setBounds(258, 102, 35, 258);
		contentPane.add(list_1);
		
		JLabel label_5 = new JLabel("컵");
		label_5.setDisplayedMnemonic(KeyEvent.VK_ENTER);
		label_5.setBounds(305, 77, 68, 15);
		contentPane.add(label_5);
		
		list_2 = new JList(cup);

		list_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_2.setBounds(305, 102, 68, 258);
		contentPane.add(list_2);
		
		JLabel label_6 = new JLabel("사이즈");
		label_6.setBounds(385, 77, 57, 15);
		contentPane.add(label_6);
		
		list_3 = new JList(size);

		list_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_3.setBounds(387, 103, 83, 257);
		contentPane.add(list_3);
		
		JLabel label_7 = new JLabel("샷추가");
		label_7.setBounds(479, 77, 57, 15);
		contentPane.add(label_7);
		
		list_4 = new JList(shot);

		list_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_4.setBounds(482, 103, 35, 258);
		contentPane.add(list_4);
		
		JLabel lblNewLabel = new JLabel("얼음양");
		lblNewLabel.setBounds(537, 77, 57, 15);
		contentPane.add(lblNewLabel);
		
		list_5 = new JList(ice);

		list_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_5.setBounds(535, 103, 57, 258);
		contentPane.add(list_5);
		
		JButton btnNewButton = new JButton("제조 완료");
		btnNewButton.setActionCommand("");
		btnNewButton.setBounds(2, 399, 313, 58);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("종료");
		button.setActionCommand("");
		button.setBounds(321, 399, 313, 58);
		contentPane.add(button);
	}

	public void getData(int idx, String data){
		this.Data.add(idx, data);
	}

	public void setting(int i){
		String[] s = Data.get(i).toString().split("/");
		order_num = s[0]; // 오더번호 입력
		name.add(i,s[1]);
		cup.add(i,s[4]);
		num.add(i,s[3]);
		size.add(i,s[5]);
		shot.add(i,s[6]);
		ice.add(i,s[7]);

		price = price + Integer.parseInt(s[2]);



	}
}
