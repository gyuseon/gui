package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;

public class InterRest2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtMoney;
	private JTextField txtAdd;
	private JTextField txtResult;
	private JButton btnChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterRest2 frame = new InterRest2();
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
	public InterRest2() {
		setTitle("이자 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("원금을 입력하시오");
		panel.add(lblNewLabel);
		
		txtMoney = new JTextField();
		panel.add(txtMoney);
		txtMoney.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("이율을 입력하시오");
		panel_1.add(lblNewLabel_1);
		
		txtAdd = new JTextField();
		panel_1.add(txtAdd);
		txtAdd.setColumns(10);
		
		btnChange = new JButton("변환");
		panel_1.add(btnChange);
		btnChange.addActionListener(this);
		
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		txtResult = new JTextField();
		panel_2.add(txtResult);
		txtResult.setColumns(10);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnChange) {
			int op1=Integer.parseInt(txtMoney.getText());
			double op2=Double.parseDouble(txtAdd.getText());
		
			txtResult.setText(String.valueOf(op1*op2));
		}else {
			txtMoney.setText("");
			txtAdd.setText("");
			txtResult.setText("");
		}
		
	}

}
