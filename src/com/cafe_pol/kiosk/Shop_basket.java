package com.cafe_pol.kiosk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
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
								String ToServerData = order_number + "/" + model.get(j).toString();
								Client cl = new Client(); // 소캣 통신을 위한 객체 생성
								try{
									cl.SocketStart();  // 소캣 개설
									cl.ClientRun(ToServerData); // 데이터 전송
									cl.SocketClose(); // 소캣 해제
									cl=null;  // 객체 제거

									mysqlconn();

								} catch(Exception ee){
									ee.printStackTrace();
								}

								System.out.println(ToServerData);
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

	public void mysqlconn(){
		Connection con = null;
		String server = "localhost";
		String database = "cafe_pol";
		String user_name="root";
		String password="1234";

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e){
			System.err.println("!! <JDBC오류> Driver load 오류 : "+e.getMessage());
			e.printStackTrace();
		}

		try{
			con = DriverManager.getConnection("jdbc:mysql://"+server+"/"+database+"?serverTimezone=UTC",user_name,password);
			System.out.println("정상적으로 연결되었습니다");
		} catch(SQLException sqle){
			System.err.println("con load 오류 : "+sqle.getMessage());
			sqle.printStackTrace();
		}


			String sql = "insert into payment(PPcomplete,PPPrice,PPStatus,PPDate) values('성공',100000,'결제완료',?)";
			PreparedStatement pstmt=null;
			try{
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, LocalDateTime.now().toString());
				pstmt.executeUpdate();
			} catch (SQLException e){
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null && !pstmt.isClosed()) {
						pstmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
}



