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

public class ConvertMile1 extends JFrame  implements ActionListener{

	private JPanel contentPane;
	private JTextField txtDistance;
	private JTextField txtMile;
	private JButton btnChange;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertMile1 frame = new ConvertMile1();
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
	public ConvertMile1() {
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("거리를 마일 단위로 입력하세요");
		panel.add(lblNewLabel);
		
		txtDistance = new JTextField();
		panel.add(txtDistance);
		txtDistance.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		btnChange = new JButton("변환");
		btnChange.addActionListener(this);
		panel_1.add(btnChange);
		
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		txtMile = new JTextField();
		panel_2.add(txtMile);
		txtMile.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnChange) {
			double op1=Double.parseDouble(txtDistance.getText());
			
			txtMile.setText(String.valueOf(op1*1.6));
		}else {
			txtDistance.setText("");
			txtMile.setText("");
			
		}
		
	}

}
