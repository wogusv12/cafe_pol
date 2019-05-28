package com.cafe_pol.kiosk;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ServerApp_Push extends JDialog {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerApp_commit frame = new ServerApp_commit();
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
	public ServerApp_Push() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"제주 후지샷 크림 프라푸치노"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(46, 102, 200, 258);
		contentPane.add(list);
		
		JLabel label_4 = new JLabel("갯수");
		label_4.setBounds(258, 77, 57, 15);
		contentPane.add(label_4);
		
		JList list_1 = new JList();
		list_1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		list_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"1"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_1.setBounds(258, 102, 35, 258);
		contentPane.add(list_1);
		
		JLabel label_5 = new JLabel("컵");
		label_5.setDisplayedMnemonic(KeyEvent.VK_ENTER);
		label_5.setBounds(305, 77, 68, 15);
		contentPane.add(label_5);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"머그컵"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_2.setBounds(305, 102, 68, 258);
		contentPane.add(list_2);
		
		JLabel label_6 = new JLabel("사이즈");
		label_6.setBounds(385, 77, 57, 15);
		contentPane.add(label_6);
		
		JList list_3 = new JList();
		list_3.setModel(new AbstractListModel() {
			String[] values = new String[] {"Tall"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_3.setBounds(387, 103, 83, 257);
		contentPane.add(list_3);
		
		JLabel label_7 = new JLabel("샷추가");
		label_7.setBounds(479, 77, 57, 15);
		contentPane.add(label_7);
		
		JList list_4 = new JList();
		list_4.setModel(new AbstractListModel() {
			String[] values = new String[] {"0"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_4.setBounds(482, 103, 35, 258);
		contentPane.add(list_4);
		
		JLabel lblNewLabel = new JLabel("얼음양");
		lblNewLabel.setBounds(537, 77, 57, 15);
		contentPane.add(lblNewLabel);
		
		JList list_5 = new JList();
		list_5.setModel(new AbstractListModel() {
			String[] values = new String[] {"없음"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
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
}
