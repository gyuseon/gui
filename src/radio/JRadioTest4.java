package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JRadioTest4 extends JFrame implements ActionListener,ItemListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private ButtonGroup group;
	private ButtonGroup group1;
	private ButtonGroup group2;
	private JRadioButton rdo11,rdo12,rdo13,rdo21,rdo22,rdo23,rdo24,rdo31,rdo32,rdo33;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest4 frame = new JRadioTest4();
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
	public JRadioTest4() {
		setTitle("피자주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("자바 피자에 오신 것을 환영합니다");
		lblNewLabel.setForeground(Color.BLUE);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdo11 = new JRadioButton("콤보");
		rdo11.addItemListener(this);
		panel_2.add(rdo11);
		
		rdo12 = new JRadioButton("포테이토");
		rdo12.addItemListener(this);
		panel_2.add(rdo12);
		
		rdo13 = new JRadioButton("불고기");
		rdo13.addItemListener(this);
		panel_2.add(rdo13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uCD94\uAC00 \uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdo21 = new JRadioButton("피망");
		rdo21.addItemListener(this);
		panel_3.add(rdo21);
		
		rdo22 = new JRadioButton("고구마");
		rdo22.addItemListener(this);
		panel_3.add(rdo22);
		
		rdo23 = new JRadioButton("파인애플");
		rdo23.addItemListener(this);
		panel_3.add(rdo23);
		
		rdo24 = new JRadioButton("베이컨");
		rdo24.addItemListener(this);
		panel_3.add(rdo24);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdo31 = new JRadioButton("Small");
		rdo31.addItemListener(this);
		panel_4.add(rdo31);
		
		rdo32 = new JRadioButton("Medium");
		rdo32.addItemListener(this);
		panel_4.add(rdo32);
		
		rdo33 = new JRadioButton("Large");
		rdo33.addItemListener(this);
		panel_4.add(rdo33);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("주문");
		btnNewButton.addActionListener(this);
		panel_5.add(btnNewButton);
		
		btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(this);
		panel_5.add(btnNewButton_1);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		
		group = new ButtonGroup();
		group.add(rdo11);
		group.add(rdo12);
		group.add(rdo13);
		
		group1 = new ButtonGroup();
		group1.add(rdo21);
		group1.add(rdo22);
		group1.add(rdo23);
		group1.add(rdo24);
		
		group2 = new ButtonGroup();
		group2.add(rdo31);
		group2.add(rdo32);
		group2.add(rdo33);
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String order = "종류"+group+"토핑"+group2+"크기"+"group2";
		if(btn==btnNewButton) {
			JOptionPane.showMessageDialog(this, order,order , JOptionPane.PLAIN_MESSAGE, null);
			
		}
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	
	}
}