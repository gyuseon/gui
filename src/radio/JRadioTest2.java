package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioTest2 extends JFrame implements  ItemListener /*ActionListener*/{

	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdo1,rdo2,rdo3,rdo4,rdo5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest2 frame = new JRadioTest2();
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
	public JRadioTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("선호하는 애완동물은?");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdo1 = new JRadioButton("사막여우(희귀)");
//		rdo1.addActionListener(this);
		rdo1.addItemListener(this);
		panel.add(rdo1);
		
		rdo2 = new JRadioButton("고양이");
		//rdo2.addActionListener(this);
		rdo2.addItemListener(this);
		panel.add(rdo2);
		
		rdo3 = new JRadioButton("고슴도치");
//		rdo3.addActionListener(this);
		rdo3.addItemListener(this);
		panel.add(rdo3);
		
		rdo4 = new JRadioButton("돼지");
//		rdo4.addActionListener(this);
		rdo4.addItemListener(this);
		panel.add(rdo4);
		
		rdo5 = new JRadioButton("나무늘보(추천)");
//		rdo5.addActionListener(this);
		rdo5.addItemListener(this);
		panel.add(rdo5);
		
		//버튼그룹 생성
		ButtonGroup group = new ButtonGroup();
		group.add(rdo1);
		group.add(rdo2);
		group.add(rdo3);
		group.add(rdo4);
		group.add(rdo5);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		                                                     
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JRadioButton radio = (JRadioButton) e.getSource();
//		
//		if(radio.isSelected()) {
//			System.out.println("선택됨");
//		}else {
//			System.out.println("선택 안됨");
//		}
//		
//		textField.setText(e.getActionCommand());
//		
//	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		JRadioButton radio = (JRadioButton) e.getItem();
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(radio == rdo1 ) {
				System.out.println("rdo1 선택");
			}else if(radio == rdo2) {
				System.out.println("rdo2 선택");
			}
		}else {
			if(radio == rdo1) {
				System.out.println("rdo1 해제");
			}else if(radio == rdo2) {
				System.out.println("rdo2 해제");
			}
		}
	}

}
