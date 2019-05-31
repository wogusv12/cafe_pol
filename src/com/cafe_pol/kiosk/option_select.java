package com.cafe_pol.kiosk;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class option_select extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	int product_price = 4000;
	int price = product_price;
	String name;
	int num =1;
	String cup;
	String Size;
	int shot;
	String ice;
	JLabel Product_label, Product_en_label, Price_label, num_label;
	int option, item;
	JLabel label_1 = new JLabel("얼음양");;
	Shop_basket shop_basket;
	JComboBox select_ice= new JComboBox();;


	//이름, 영어이름, 가격 배열로 설정
	String[] ColdBrew = {"콜드 브루", "콜드 브루 몰트", "콜드 브루 플로트", "콜드 폼 콜드 브루", "돌체 콜드브루", "바닐라 크림 콜드 브루"};
	String[] ColdBrew_en = {"ColdBrew", "ColdBrew Malt", "ColdBrew Float", "Cold Foam ColdBrew", "Dolce ColdBrew", "Vanilla Cream ColdBrew"};
	int[] ColdBrew_price = {4500,8500,8000,5800,5800,5500};

	String[] Espresso = {"카페라떼", "아이스 카페라떼", "카페 모카", "아이스 카페 모카", "카라멜 마키아또", "아이스 카라멜 마키아또"};
	String[] Espresso_en = {"Caffe Latte", "Ice Caffe Latte", "Caffe Mocha", "Ice Caffe Mocha", "Caramel Macchiato", "Ice Caramel Macchiato"};
	int[] Espresso_price = {4600,4600,5100,5100,5600,5600};

	String[] Prapuccino = {"그린티 크림 프라푸치노", "카라멜 프라푸치노", "다크 카라멜 커피 프라푸치노", "모카 프라푸치노", "바닐라 크림 프라푸치노", "자바 칩 프라푸치노"};
	String[] Prapuccino_en = {"Green Tea Prappuccino", "Caramel Prappuccino", "Dark Caramel Coffee Prappuccino", "Mocha Prappuccino", "Vanilla Cream Frappuccino", "Java Chip Frappuccino"};
	int[] Prapuccino_price = {6300,5600,6300,5600,4800,6100};

	String[] Blandid = {"딸기 요거트 블렌디드", "딸기 피치 블렌디드", "망고 바나나 블렌디드", "망고 패션 후르츠 블렌디드", "아몬드 바나나 블렌디드", "아보카도 블렌디드"};
	String[] Blandid_en = {"Strawberry Yogurt Blended", "Strawberry Peach Blended","Mango Banana Blended", "Mango Passion Fruit Blended", "Almond Banana Blended", "Avocado Blended"};
	int[] Blandid_price = {6100,6300,6300,5000,6500,6900};

	String[] Tibana = {"그린 티 라뗴", "라임 패션 티", "레몬 민트 티", "민트 블렌드 티", "아이스 라임 패션 티", "아이스 레몬 민트 티"};
	String[] Tibana_en = {"Green Tea Latte","Lime Passion Tea","Iced Lemon Mint Tea","Mint Blend Brewed Tea","Iced Lime Passion Tea", "Iced Lemon Mint Tea"};
	int[] Tibana_price = {5900,5600,5600,4100,5600,5600};

	String[] Food= {"DT밀당 케이크 촉촉 초코", "구운 바나나 케이크", "레드벨벳 크림치즈 케이크", "마스카포네 티라미수 케이크", "블루베리 쿠키 치즈 케이크", "초콜릿 페스티벌 케이크"};
	String[] Food_en = {"DT Cake_Rich Chocolate", "Baked Banana Cake", "Red Velvet Cream Cheese Cake","Mascarpone Tiramisu Cake", "Blueberry Cookie Cheese Cake", "Chocolate Festival Cake"};
	int[] Food_price = {3900,4600,5500,5900,6900,5800};

	JComboBox select_shot;
	JComboBox select_size;
	String path;



	/**
	 * Create the dialog.
	 */
	public option_select(int option, int item, Shop_basket shop_basket) {
		this.shop_basket = shop_basket;
		setResizable(false);
		getContentPane().setSize(new Dimension(300, 50));
		setBounds(800, 300, 388, 500);
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(380, 300));
		getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		contentPanel.setPreferredSize(new Dimension(5, 5));
		panel_1.add(contentPanel);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		
		JLabel Product_image = new JLabel("New label");


		Product_image.setBounds(12, 10, 150, 157);
		//상품 리스트 테스트 - 다른값으로 덮어씌워짐
		contentPanel.add(Product_image);
		{
			Product_label = new JLabel("아메리카노");
			Product_label.setFont(new Font("나눔고딕", Font.PLAIN, 14));
			Product_label.setBounds(174, 30, 194, 24);
			contentPanel.add(Product_label);
		}
		{
			Product_en_label = new JLabel("Americano");
			Product_en_label.setBounds(174, 64, 194, 15);
			contentPanel.add(Product_en_label);
		}
		{
			Price_label = new JLabel(price+" 원");
			Price_label.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
			Price_label.setBounds(174, 89, 105, 42);
			contentPanel.add(Price_label);
		}
		{
			JButton low_btn = new JButton("<");
			low_btn.setBounds(174, 141, 41, 23);
			low_btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(num >1) {
						num = num-1;
						num_label.setText(String.valueOf(num));
						shot = Integer.parseInt(select_shot.getSelectedItem().toString());
						price = price - (product_price +  (shot *500)+(select_size.getSelectedIndex()*500));
						Price_label.setText(price + " 원");

						//Price_label;

					}
				}
			});
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

			high_btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					num+=1;
					num_label.setText(String.valueOf(num));
					shot = Integer.parseInt(select_shot.getSelectedItem().toString());
					price = price + (product_price +  (shot *500) + (select_size.getSelectedIndex()*500));
					Price_label.setText(price + " 원");
				}
			});
		}
		switch(option) {
			case 0:
				path = "ColdBrew";
				Product_image.setIcon(new ImageIcon("Coffee_Photo\\" + path + "\\" + ColdBrew[item] + ".jpg"));
				Product_label.setText(ColdBrew[item]);
				Product_en_label.setText(ColdBrew_en[item]);
				product_price = ColdBrew_price[item];
				Price_label.setText( product_price+" 원");
				price = product_price;
				break;
			case 1:
				path = "Espresso";
				Product_image.setIcon(new ImageIcon("Coffee_Photo\\"+path+"\\"+Espresso[item]+".jpg"));
				Product_label.setText(Espresso[item]);
				Product_en_label.setText(Espresso_en[item]);
				product_price = Espresso_price[item];
				Price_label.setText( product_price+" 원");
				price = product_price;
				if(item == 0 || item == 2 || item == 4) {
					label_1.setVisible(false);
					select_ice.setVisible(false);

				}
				break;
			case 2:
				path = "Prapuccino";
				Product_image.setIcon(new ImageIcon("Coffee_Photo\\"+path+"\\"+Prapuccino[item]+".jpg"));
				Product_label.setText(Prapuccino[item]);
				Product_en_label.setText(Prapuccino_en[item]);
				product_price = Prapuccino_price[item];
				Price_label.setText( product_price+" 원");
				price = product_price;
				break;
			case 3:
				path = "Blandid";
				Product_image.setIcon(new ImageIcon("Coffee_Photo\\"+path+"\\"+Blandid[item]+".jpg"));
				Product_label.setText(Blandid[item]);
				Product_en_label.setText(Blandid_en[item]);
				product_price = Blandid_price[item];
				Price_label.setText( product_price+" 원");
				price = product_price;
				break;
			case 4:
				path = "Tibana(Tea)";
				Product_image.setIcon(new ImageIcon("Coffee_Photo\\"+path+"\\"+Tibana[item]+".jpg"));
				Product_label.setText(Tibana[item]);
				Product_en_label.setText(Tibana_en[item]);
				product_price = Tibana_price[item];
				Price_label.setText( product_price+" 원");
				price = product_price;
                if(item == 0 || item == 2 || item == 3|| item == 1) {
                    label_1.setVisible(false);
                    select_ice.setVisible(false);

                }

				break;
			case 5:
				path = "Food";
				Product_image.setIcon(new ImageIcon("Coffee_Photo\\"+path+"\\"+Food[item]+".jpg"));
				Product_label.setText(Food[item]);
				Product_en_label.setText(Food_en[item]);
				product_price = Food_price[item];
				Price_label.setText( product_price+" 원");

				price = product_price;
				break;
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
		
		select_size = new JComboBox();
		select_size.setModel(new DefaultComboBoxModel(new String[] {"Tall", "Grande (+500)", "Venti (+1000)"}));
		select_size.setBounds(135, 277, 202, 21);
		select_size.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				price = (product_price + (Integer.parseInt(select_shot.getSelectedItem().toString())*500))*num;
				price = price + ((select_size.getSelectedIndex()*500) * num);
				Price_label.setText(price + " 원");
			}
		});
		contentPanel.add(select_size);
		
		JLabel size_label = new JLabel("사이즈");
		size_label.setHorizontalAlignment(SwingConstants.CENTER);
		size_label.setBounds(28, 280, 95, 15);
		contentPanel.add(size_label);
		
		select_shot = new JComboBox();
		select_shot.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		select_shot.setBounds(135, 308, 202, 21);
		select_shot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				price = (product_price + (select_size.getSelectedIndex() * 500))*num;
				price = price + (Integer.parseInt(select_shot.getSelectedItem().toString())*500*num);
				Price_label.setText(price + " 원");
			}
		});
		contentPanel.add(select_shot);
		
		JLabel label = new JLabel("샷 추가");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(28, 311, 95, 15);
		contentPanel.add(label);
		

		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(32, 340, 91, 15);
		contentPanel.add(label_1);
		

		select_ice.setModel(new DefaultComboBoxModel(new String[] {"기본","없음", "적게", "많이"}));
		select_ice.setBounds(135, 338, 202, 21);
		contentPanel.add(select_ice);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton okButton = new JButton("주문하기");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					if(mug_cup.isSelected()==true||personal_cup.isSelected()==true||plastic_cup.isSelected() == true) {
						name = Product_label.toString();
						//	price = Integer.parseInt(Price_label.toString());
						if (mug_cup.isSelected() == true) {
							cup = "머그컵";
						} else if (personal_cup.isSelected() == true) {
							cup = "개인용 컵";
						} else if (plastic_cup.isSelected() == true) {
							cup = "플라스틱 컵";
						}

						Size = select_size.getSelectedItem().toString();
						shot = Integer.parseInt(select_shot.getSelectedItem().toString());
						if(option == 1){
						    if(item == 0 || item ==2 || item ==4) {
						        ice = "없음";
                            }
                        }else if(option == 4) {
						    if(item == 0 || item ==1|| item==2||item==3){
						        ice="없음";
                            }
                        }else {
                            ice = select_ice.getSelectedItem().toString();
                        }
						System.out.println(Product_label.getText() + "/" + price + "/" + num + "/" + cup + "/" + Size + "/" + shot + "/" + ice);

						System.out.println(Price_label.getText());
						System.out.println(num);
						System.out.println(cup);
						System.out.println(Size);
						System.out.println(shot);
						System.out.println(ice);
						shop_basket.input_data(Product_label.getText() + "/" + price + "/" + num + "/" + cup + "/" + Size + "/" + shot + "/" + ice);
						cofirm Confirm = new cofirm();
						Confirm.get_basket(shop_basket);
						//Confirm.get_option_select(this);
						dispose();
					}else{
						  JOptionPane.showMessageDialog(null, "컵을 선택해주세요!", "Error", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);

			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}
}
