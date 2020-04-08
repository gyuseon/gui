package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.Color;

public class JRadioTest3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest3 frame = new JRadioTest3();
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
	public JRadioTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("어떤 크기의 피자를 주문하시겠습니까?~");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uC0AC\uC774\uC988", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		contentPane.add(panel_1);
		
		JRadioButton rdo1 = new JRadioButton("Small Size");
		rdo1.addActionListener(this);
		panel_1.add(rdo1);
		
		JRadioButton rdo2 = new JRadioButton("Medium Size");
		rdo2.addActionListener(this);
		panel_1.add(rdo2);
		
		JRadioButton rdo3 = new JRadioButton("Large Size");
		rdo3.addActionListener(this);
		panel_1.add(rdo3);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		panel_2.add(textField);
		textField.setColumns(20);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdo1);
		group.add(rdo2);
		group.add(rdo3);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText(e.getActionCommand()+" 가 선택되었습니다!!");
		
	}

}
