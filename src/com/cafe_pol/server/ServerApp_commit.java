package com.cafe_pol.server;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class ServerApp_commit extends JDialog {

	JList NameList, NumList, CupList, SizeList, ShotList, IceList;
	DefaultListModel name= new DefaultListModel();
	DefaultListModel num= new DefaultListModel();
	DefaultListModel cup= new DefaultListModel();
	DefaultListModel size= new DefaultListModel();
	DefaultListModel shot= new DefaultListModel();
	DefaultListModel ice= new DefaultListModel();

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ServerApp_commit dialog = new ServerApp_commit();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ServerApp_commit() {
		setBounds(100, 100, 900, 475);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			panel.setLayout(new GridLayout(0, 6, 0, 0));
			{
				JLabel lblNewLabel_3 = new JLabel("주문메뉴");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("수량");
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("컵");
				lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_5);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("사이즈");
				lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_6);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("샷추가");
				lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_7);
			}
			{
				JLabel lblNewLabel_8 = new JLabel("얼음양");
				lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_8);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(0, 6, 0, 0));
			{
				NameList = new JList();
				NameList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

				NameList.setFocusable(false);
				NameList.setModel(new AbstractListModel() {
					String[] values = new String[] {"아메리카노"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				panel.add(NameList);
			}
			{
				NumList = new JList();
				NumList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

				//NumList.setEnabled(false);
				NumList.setFocusable(false);

				NumList.setModel(new AbstractListModel() {
					String[] values = new String[] {"1"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				panel.add(NumList);
			}
			{
				CupList = new JList();
				CupList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				CupList.setModel(new AbstractListModel() {
					String[] values = new String[] {"\uBA38\uADF8\uCEF5"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});

				panel.add(CupList);
			}
			{
				SizeList = new JList();
				SizeList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				SizeList.setModel(new AbstractListModel() {
					String[] values = new String[] {"Tall"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				panel.add(SizeList);
			}
			{
				ShotList = new JList();
				ShotList.setModel(new AbstractListModel() {
					String[] values = new String[] {"0"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				ShotList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				panel.add(ShotList);
			}
			{
				IceList = new JList();
				IceList.setModel(new AbstractListModel() {
					String[] values = new String[] {"\uC5C6\uC74C"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				IceList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				panel.add(IceList);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton okButton = new JButton("\uC2B9\uC778");
				okButton.setFont(new Font("굴림", Font.PLAIN, 24));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\uAC70\uBD80");
				cancelButton.setFont(new Font("굴림", Font.PLAIN, 24));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JLabel lblNewLabel = new JLabel("A-32");
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Order");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setFont(new Font("함초롬굴림", Font.PLAIN, 30));
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("2019.00.00 00:00:00");
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
				panel.add(lblNewLabel_2);
			}
		}

		setCenterAlign(NameList);
		setCenterAlign(NumList);
		setCenterAlign(CupList);
		setCenterAlign(SizeList);
		setCenterAlign(ShotList);
		setCenterAlign(IceList);
	}

	public void setCenterAlign(JList jlist) {
		DefaultListCellRenderer renderer =  (DefaultListCellRenderer)jlist.getCellRenderer();
		renderer.setHorizontalAlignment(JLabel.CENTER);
	}

	public void getmodel(DefaultListModel name, DefaultListModel num, DefaultListModel cup, DefaultListModel size, DefaultListModel shot, DefaultListModel ice) {
		this.name = name;
		this.num = num;
		this.cup = cup;
		this.size = size;
		this.shot = shot;
		this.ice = ice;
		NameList.setModel(name);
		NumList.setModel(num);
		CupList.setModel(cup);
		SizeList.setModel(size);
		ShotList.setModel(shot);
		IceList.setModel(ice);

	}

}
