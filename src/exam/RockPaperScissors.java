package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class RockPaperScissors extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnROCK;
	private static final int ROCK=0;
	private static final int PAPER=1;
	private static final int SCISSOR=2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissors frame = new RockPaperScissors();
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
	public RockPaperScissors() {
		setTitle("가위바위보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1027, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnROCK = new JButton("");
		btnROCK.setIcon(new ImageIcon(RockPaperScissors.class.getResource("/exam/rock.png")));
		btnROCK.addActionListener(this);
		panel_1.add(btnROCK);
		
		JButton btnPAPER = new JButton("");
		btnPAPER.setIcon(new ImageIcon(RockPaperScissors.class.getResource("/exam/paper1.png")));
		btnPAPER.addActionListener(this);
		panel_1.add(btnPAPER);
		
		JButton btnSCISSORS = new JButton("");
		btnSCISSORS.setIcon(new ImageIcon(RockPaperScissors.class.getResource("/exam/scissor.png")));
		btnSCISSORS.addActionListener(this);
		panel_1.add(btnSCISSORS);
		
		textField = new JTextField();
		panel.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		setVisible(true);
		pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//컴퓨터의 가위,바위,보 생성하기
				Random random = new Random();
				// random.nextInt(3) : 괄호안의 숫자는 미포함해서 0,1,2 중에서
				// 나오게 함
				int computer = random.nextInt(3);
				
				
				//사용자가 누른 버튼의 값을 가져온 후
				String user = e.getActionCommand();
				if(user.equals("ROCK")) { // 사용자가 주먹을 선택한경우
					if(computer==ROCK) {
						textField.setText("비김");
					}else if(computer==SCISSOR) {
						textField.setText("내가 이김");
					}else {
						textField.setText("컴퓨터 이김");
					}
				}else if(user.equals("PAPER")) { // 사용자가 보를 선택한 경우
                    if(computer==ROCK) {
                    	textField.setText("내가 이김");
					}else if(computer==SCISSOR) {
						textField.setText("컴퓨터가 이김");
					}else {
						textField.setText("비김");
					}
				}else {//사용자가 가위 선택한 경우
					if(computer==ROCK) {
						textField.setText("컴퓨터가 이김");
					}else if(computer==SCISSOR) {
						textField.setText("비김");
					}else {
						textField.setText("내가 이김");
					}
				}
				//가위,바위,보를 해서 누가 이겼는지 
				//textField 에 보여주기
				
		
	}

}
