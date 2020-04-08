package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class JLabelTest2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelTest2 frame = new JLabelTest2();
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
	public JLabelTest2() {
		setTitle("토글버튼을 이용한 아이콘");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("이미지 보려면 클릭하세요!");
		tglbtnNewToggleButton.addActionListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.SOUTH);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon dog = new ImageIcon(getClass().getResource("dog.gif"));
        AbstractButton btn =(AbstractButton)e.getSource();
			if(btn.isSelected()) {
				lblNewLabel.setIcon(dog);
				lblNewLabel.setText("어흥~!!");
			}else {
				lblNewLabel.setIcon(null);
				lblNewLabel.setText("그림이 사라졌어요");
			}
	
	}

}
