package com.cafe_pol.kiosk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class option_select extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	String name;
	int num;
	String cup;
	String Size;
	int shot;
	String ice;
	JLabel Product_label, Product_en_label, Price_label, num_label;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			option_select dialog = new option_select();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public option_select() {
		setResizable(false);
		getContentPane().setSize(new Dimension(300, 50));
		setBounds(800, 300, 388, 500);
		getContentPane().setLayout(new BorderLayout());
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(380, 300));
		getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		contentPanel.setPreferredSize(new Dimension(5, 5));
		panel_1.add(contentPanel);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		
		JLabel Product_image = new JLabel("New label");
		Product_image.setIcon(new ImageIcon("C:\\Users\\Jaehyeon\\Pictures\\수정됨_americano.png"));
		Product_image.setBounds(12, 10, 150, 157);
		contentPanel.add(Product_image);
		{
			Product_label = new JLabel("아메리카노");
			Product_label.setFont(new Font("나눔명조", Font.PLAIN, 14));
			Product_label.setBounds(174, 30, 194, 24);
			contentPanel.add(Product_label);
		}
		{
			Product_en_label = new JLabel("Americano");
			Product_en_label.setBounds(174, 64, 72, 15);
			contentPanel.add(Product_en_label);
		}
		{
			Price_label = new JLabel("4000 원");
			Price_label.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
			Price_label.setBounds(174, 89, 105, 42);
			contentPanel.add(Price_label);
		}
		{
			JButton low_btn = new JButton("<");
			low_btn.setBounds(174, 141, 41, 23);
			contentPanel.add(low_btn);
		}
		{
			num_label = new JLabel("1");
			num_label.setHorizontalAlignment(SwingConstants.CENTER);
			num_label.setBounds(227, 145, 28, 15);
			contentPanel.add(num_label);
		}
		{
			JButton high_btn = new JButton(">");
			high_btn.setBounds(267, 141, 41, 23);
			contentPanel.add(high_btn);
		}
		
		JToggleButton mug_cup = new JToggleButton("머그컵");
		buttonGroup.add(mug_cup);
		mug_cup.setBounds(28, 215, 95, 23);
		contentPanel.add(mug_cup);
		
		JToggleButton personal_cup = new JToggleButton("개인 컵");
		buttonGroup.add(personal_cup);
		personal_cup.setBounds(135, 215, 95, 23);
		contentPanel.add(personal_cup);
		
		JToggleButton plastic_cup = new JToggleButton("일회용 컵");
		buttonGroup.add(plastic_cup);
		plastic_cup.setBounds(242, 215, 95, 23);
		contentPanel.add(plastic_cup);
		
		JLabel select_cup = new JLabel("컵 선택");
		select_cup.setBounds(32, 190, 57, 15);
		contentPanel.add(select_cup);
		
		JComboBox select_size = new JComboBox();
		select_size.setModel(new DefaultComboBoxModel(new String[] {"Tall", "Grande (+500)", "Venti (+1000)"}));
		select_size.setBounds(135, 277, 202, 21);
		contentPanel.add(select_size);
		
		JLabel size_label = new JLabel("사이즈");
		size_label.setHorizontalAlignment(SwingConstants.CENTER);
		size_label.setBounds(28, 280, 95, 15);
		contentPanel.add(size_label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox.setBounds(135, 308, 202, 21);
		contentPanel.add(comboBox);
		
		JLabel label = new JLabel("샷 추가");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(28, 311, 95, 15);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("얼음양");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(32, 340, 91, 15);
		contentPanel.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"기본", "적게", "많이"}));
		comboBox_1.setBounds(135, 338, 202, 21);
		contentPanel.add(comboBox_1);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton okButton = new JButton("주문하기");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cofirm Confirm = new cofirm();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
