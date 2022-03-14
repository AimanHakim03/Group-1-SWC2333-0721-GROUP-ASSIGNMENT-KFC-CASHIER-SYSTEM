import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class KFCWelcome {
	
	 JFrame WelcomeFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KFCWelcome window2 = new KFCWelcome();
					window2.WelcomeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the application.
	 */
	public KFCWelcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		WelcomeFrame = new JFrame();
		WelcomeFrame.setIconImage(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\uncle-kfc.png").getImage());
		WelcomeFrame.setTitle("KFC Welcome");
		WelcomeFrame.getContentPane().setBackground(new Color(0, 0, 0));
		WelcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WelcomeFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 1300, 700);
		WelcomeFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			KFClogin kfclg = new KFClogin();
			kfclg.LoginFrame.setVisible(true);
			WelcomeFrame.dispose();
				
			}
		});
		btnContinue.setFont(new Font("Bodoni MT", Font.BOLD, 25));
		
		btnContinue.setForeground(SystemColor.desktop);
		btnContinue.setBackground(SystemColor.controlHighlight);
		btnContinue.setBounds(606, 607, 183, 37);
		panel.add(btnContinue);
		
		JLabel lblfood1 = new JLabel("");
		lblfood1.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\KFC-food.png"));
		lblfood1.setBounds(884, 116, 395, 543);
		panel.add(lblfood1);
		
		JLabel lblfood2 = new JLabel("");
		lblfood2.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\KFC-food2.png"));
		lblfood2.setBounds(1032, 155, 264, 204);
		panel.add(lblfood2);
		
		JLabel lblHello = new JLabel("");
		lblHello.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\KF-Hello.png"));
		lblHello.setBounds(336, 44, 672, 360);
		panel.add(lblHello);
		
		JLabel lblWelcomeTo = new JLabel(" Welcome To");
		lblWelcomeTo.setForeground(new Color(0, 0, 0));
		lblWelcomeTo.setFont(new Font("Cooper Black", Font.PLAIN, 77));
		lblWelcomeTo.setBounds(404, 340, 506, 120);
		panel.add(lblWelcomeTo);
		
		JLabel lblKFC = new JLabel("");
		lblKFC.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\logo-KFC.png"));
		lblKFC.setBounds(374, 432, 602, 145);
		panel.add(lblKFC);
		
		JLabel lblfood3 = new JLabel("");
		lblfood3.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\KFC-food3.png"));
		lblfood3.setBounds(-890, 0, 1342, 659);
		panel.add(lblfood3);
	}
}
