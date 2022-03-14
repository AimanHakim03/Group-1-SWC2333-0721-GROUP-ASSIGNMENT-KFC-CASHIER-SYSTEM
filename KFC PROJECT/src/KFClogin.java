import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class KFClogin {
    
	JFrame LoginFrame;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KFClogin window = new KFClogin();
					window.LoginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KFClogin() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		LoginFrame = new JFrame();
		LoginFrame.setTitle("KFC Login(Admin)");
		LoginFrame.setIconImage(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\uncle-kfc.png").getImage());
		LoginFrame.getContentPane().setBackground(Color.BLACK);
		LoginFrame.getContentPane().setForeground(Color.BLACK);
		LoginFrame.setBounds(100, 100, 1300, 700);
		LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(-17, 0, 1300, 700);
		LoginFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		user = new JTextField();
		user.setBounds(595, 290, 324, 33);
		panel.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(595, 358, 324, 33);
		panel.add(pass);
		
		JLabel username = new JLabel("       Username");
		username.setForeground(new Color(0, 0, 0));
		username.setFont(new Font("Times New Roman", Font.BOLD, 27));
		username.setBounds(389, 289, 196, 33);
		panel.add(username);
		
		JLabel password = new JLabel("       Password");
		password.setForeground(new Color(0, 0, 0));
		password.setFont(new Font("Times New Roman", Font.BOLD, 27));
		password.setBounds(389, 357, 196, 33);
		panel.add(password);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String un = user.getText();
				String ps = pass.getText();
				
				if(un.equals("kfcadmin")&& ps.equals("kfc1234")) {
					JOptionPane.showMessageDialog(null,"Login is succesful!");
					KFC_MENU kfcmn = new KFC_MENU();
					kfcmn.MenuFrame.setVisible(true);
					LoginFrame.dispose();
					
					
				}
				else
					JOptionPane.showMessageDialog(null,"Invalid username/password.");
				
			}
		});
		btnlogin.setFont(new Font("Arial", Font.BOLD, 13));
		btnlogin.setBounds(806, 423, 113, 43);
		panel.add(btnlogin);
		ImageIcon icon = new ImageIcon("image/logo-kfc.png");
		
		JLabel lblkfcmotto = new JLabel("        It's finger lickin' good!");
		lblkfcmotto.setForeground(Color.WHITE);
		lblkfcmotto.setFont(new Font("MV Boli", Font.BOLD, 37));
		lblkfcmotto.setBounds(389, 578, 648, 71);
		panel.add(lblkfcmotto);
		
		JButton btnback = new JButton("Back");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KFCWelcome kfcw = new KFCWelcome();
				kfcw.WelcomeFrame.setVisible(true);
				LoginFrame.dispose();
			}
		});
		
		btnback.setFont(new Font("Arial", Font.BOLD, 13));
		btnback.setBounds(595, 423, 113, 47);
		panel.add(btnback);
		
		JLabel lblkfcuncle = new JLabel("");
		lblkfcuncle.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\kfc.png"));
		lblkfcuncle.setBounds(992, 179, 513, 486);
		panel.add(lblkfcuncle);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\logo-KFC.png"));
		lblNewLabel.setBounds(432, 59, 550, 145);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\KFC-border.jpg"));
		lblNewLabel_1.setBounds(0, 0, 308, 665);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(178, 34, 34));
		panel_1.setBounds(131, 11, 461, 464);
		LoginFrame.getContentPane().add(panel_1);
	}
}
