package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SimpleCalc2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtOp1;
	private JTextField txtOp2;
	private JTextField txtResult;
	private JButton btnAdd,btnReset;
	private JButton btnSubtract;
	private JButton btnMultiply;
	private JButton btnDivision;
	private JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc2 frame = new SimpleCalc2();
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
	public SimpleCalc2() {
		setTitle("사칙연산 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtOp1 = new JTextField();
		panel.add(txtOp1);
		txtOp1.setColumns(10);
		
		lblNewLabel = new JLabel("?");
		panel.add(lblNewLabel);
		
		txtOp2 = new JTextField();
		panel.add(txtOp2);
		txtOp2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		panel.add(lblNewLabel_1);
		
		txtResult = new JTextField();
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(this);
		panel_1.add(btnAdd);
		
		btnReset = new JButton("reset");
		btnReset.addActionListener(this);
		
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(this);
		panel_1.add(btnSubtract);
		
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(this);
		panel_1.add(btnMultiply);
		
		btnDivision = new JButton("/");
		btnDivision.addActionListener(this);
		panel_1.add(btnDivision);
		panel_1.add(btnReset);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			//txtOp1,txtOp2 숫자를 가져와서 더하기를 한 후 
			int op1=Integer.parseInt(txtOp1.getText());
			int op2=Integer.parseInt(txtOp2.getText());
			lblNewLabel.setText("+");
			
			//txtResult에 결과값 보여주기
			txtResult.setText(String.valueOf(op1+op2));
		}else if(e.getSource()==btnSubtract){
			int op1=Integer.parseInt(txtOp1.getText());
			int op2=Integer.parseInt(txtOp2.getText());
			lblNewLabel.setText("-");
			
			txtResult.setText(String.valueOf(op1-op2));
		}else if(e.getSource()==btnMultiply) {
			int op1=Integer.parseInt(txtOp1.getText());
			int op2=Integer.parseInt(txtOp2.getText());
			lblNewLabel.setText("*");
			
			
			txtResult.setText(String.valueOf(op1*op2));
		}else if(e.getSource()==btnDivision) {
			int op1=Integer.parseInt(txtOp1.getText());
			int op2=Integer.parseInt(txtOp2.getText());
			lblNewLabel.setText("/");
			
			
			txtResult.setText(String.valueOf(op1/op2));
				
		}else {
			//txtOp1, txtOp2,txtResult 내용 지우기
			txtOp1.setText("");
			txtOp2.setText("");
			txtResult.setText("");
			
		}
	/*  @Override
		public void actionPerformed(ActionEvent e) {
			
			JButton btn = (JButton)e.getSource();
			
			int op1=Integer.parseInt(txtOp1.getText());
			int op2=Integer.parseInt(txtOp2.getText());
			int result=0;
			
			if(btn==btnPlus) {
				lblOper.setText("+");
				result = op1+op2;			
			}else if(btn==btnMinus) {
				lblOper.setText("-");
				result = op1-op2;
			}else if(btn==btnMulti) {
				lblOper.setText("*");
				result = op1*op2;
			}else if(btn==btnDiv) {
				lblOper.setText("/");
				result = op1/op2;
			}else {
				//txtOp1, txtOp2, txtResult 내용 지우기
				txtOp1.setText("");
				txtOp2.setText("");
				txtResult.setText("");
			}	
			txtResult.setText(result+"");
		*/
	}

}
