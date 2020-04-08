package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

class MyButton extends JButton{
	static int count = 0;
	int index;//자리값을 표시하기 위한 index
	
	public MyButton(String str) {
		super(str);
		index=count++;
	}
}

public class Puzzle extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private MyButton btn[]=new MyButton[9];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		Puzzle puzzle = new Puzzle();
//		puzzle.setVisible(true);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle frame = new Puzzle();
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
	public Puzzle() {
		setTitle("puzzle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		MyButton btn0 = new MyButton("1");
		btn[0] = btn0;
		btn0.addActionListener(this);
		panel.add(btn0);
		
		MyButton btn1 = new MyButton("2");
		btn[1] = btn1;
		btn1.addActionListener(this);
		panel.add(btn1);
		
		MyButton btn2 = new MyButton("3");
		btn[2] = btn2;
		btn2.addActionListener(this);
		panel.add(btn2);
		
		MyButton btn3 = new MyButton("4");
		btn[3] = btn3;
		btn3.addActionListener(this);
		panel.add(btn3);
		
		MyButton btn4 = new MyButton("5");
		btn[4] = btn4;
		btn4.addActionListener(this);
		panel.add(btn4);
		
		MyButton btn5 = new MyButton("6");
		btn[5] = btn5;
		btn5.addActionListener(this);
		panel.add(btn5);
		
		MyButton btn6 = new MyButton("7");
		btn[6] = btn6;
		btn6.addActionListener(this);
		panel.add(btn6);
		
		MyButton btn7 = new MyButton("8");
		btn[7] = btn7;
		btn7.addActionListener(this);
		panel.add(btn7);
		
		MyButton btn8 = new MyButton("");
		btn[8] = btn8;
		btn8.addActionListener(this);
		panel.add(btn8);
		
		MyButton btn9 = new MyButton("Reset");
		btn9.addActionListener(this);
		btn9.setFont(new Font("궁서", Font.PLAIN, 18));
		btn9.setForeground(new Color(255, 255, 51));
		btn9.setBackground(new Color(0, 0, 0));
		contentPane.add(btn9, BorderLayout.SOUTH);
//		setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		MyButton b =(MyButton)e.getSource();
		System.out.println( "index : "+b.index);
		
		if(b.equals("")) return;
		
		if(b.index==0) {
			if(btn[1].getText().equals("")) {
				btn[1].setText(b.getText());
				b.setText("");
			}else if(btn[3].getText().equals("")) {
				btn[3].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==1) {
			if(btn[0].getText().equals("")) {
				btn[0].setText(b.getText());
				b.setText("");
			}else if(btn[2].getText().equals("")) {
				btn[2].setText(b.getText());
				b.setText("");
			}else if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==2) {
			if(btn[1].getText().equals("")) {
				btn[1].setText(b.getText());
				b.setText("");
			}else if(btn[5].getText().equals("")) {
				btn[5].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==3) {
			if(btn[0].getText().equals("")) {
				btn[0].setText(b.getText());
				b.setText("");
			}else if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			}else if(btn[6].getText().equals("")) {
				btn[6].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==4) {
			if(btn[1].getText().equals("")) {
				btn[1].setText(b.getText());
				b.setText("");
			}else if(btn[3].getText().equals("")) {
				btn[3].setText(b.getText());
				b.setText("");
			}else if(btn[5].getText().equals("")) {
				btn[5].setText(b.getText());
				b.setText("");
			}else if(btn[7].getText().equals("")) {
				btn[7].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==5) {
			if(btn[2].getText().equals("")) {
				btn[2].setText(b.getText());
				b.setText("");
			}else if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			}else if(btn[8].getText().equals("")) {
				btn[8].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==6) {
			if(btn[3].getText().equals("")) {
				btn[3].setText(b.getText());
				b.setText("");
			}else if(btn[7].getText().equals("")) {
				btn[7].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==7) {
			if(btn[8].getText().equals("")) {
				btn[8].setText(b.getText());
				b.setText("");
			}else if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			}else if(btn[6].getText().equals("")) {
				btn[6].setText(b.getText());
				b.setText("");
			}
		}else if(b.index==8) {
			if(btn[7].getText().equals("")) {
				btn[7].setText(b.getText());
				b.setText("");
			}else if(btn[5].getText().equals("")) {
				btn[5].setText(b.getText());
				b.setText("");
			}
		}else if(b.getText().equalsIgnoreCase("reset")) {
			for(int i=0;i<btn.length-1;i++) {
				btn[i].setText((i+1)+"");
				//8번 버튼은 비워놓기
				btn[8].setText("");
			}
		}
		
		
		
	}
}
