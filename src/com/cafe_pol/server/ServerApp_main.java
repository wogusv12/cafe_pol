package com.cafe_pol.server;

import javafx.scene.control.Alert;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalTime;

public class ServerApp_main extends JFrame {

	private JPanel contentPane;
	DefaultListModel model = new DefaultListModel();
	DefaultListModel model_1 = new DefaultListModel();
	DefaultListModel model_2 = new DefaultListModel();
	JList list, list_1,list_2;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {


			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ServerApp_main frame = new ServerApp_main();
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
	public ServerApp_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(5, 5, 1340, 47);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("이것은 주문받는 화면");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 62, 1340, 657);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("주문번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(1, 0, 222, 46);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("주문 메뉴");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setBounds(223, 0, 734, 46);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("주문 시간");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3.setBounds(957, 0, 382, 46);
		panel_1.add(lblNewLabel_3);

		list = new JList(model);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(1, 56, 222, 591);
		panel_1.add(list);

		list_1 = new JList(model_1);
		list_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_1.setBounds(223, 56, 734, 591);
		panel_1.add(list_1);

		list_2 = new JList(model_2);
		list_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_2.setBounds(957, 56, 382, 591);
		panel_1.add(list_2);


		list_1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2) {
					ServerApp_Push sp = new ServerApp_Push();
					sp.setVisible(true);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		addItem(0,0,"Server Start");

		}


	public void addItem(int index,int OrderNum, String OrderMenu){
		String DateTiem = LocalDate.now().toString()+" / "+LocalTime.now().toString();

		model.add(index,OrderNum);
		model_1.add(index,OrderMenu);
		model_2.add(index, DateTiem);
		try{
			Thread.sleep(100);
		}catch (Exception e){
			e.printStackTrace();
		}

		for(int i=0;i<model_1.getSize();i++){
			System.out.println("model1 "+i+"번쨰 값"+model_1.get(i).toString());
		}

	}

}


