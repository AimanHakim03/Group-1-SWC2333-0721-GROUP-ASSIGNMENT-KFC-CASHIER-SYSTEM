import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class KFCOrderConfirm extends KFC_MENU {

	 JFrame OrderConfirmFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KFCOrderConfirm window = new KFCOrderConfirm();
					window.OrderConfirmFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public KFCOrderConfirm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		OrderConfirmFrame = new JFrame();
		OrderConfirmFrame.setTitle("KFC Order Confirm");
		OrderConfirmFrame.setIconImage(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\uncle-kfc.png").getImage());
		OrderConfirmFrame.getContentPane().setBackground(new Color(139, 0, 0));
		OrderConfirmFrame.setBounds(100, 100, 748, 461);
		OrderConfirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OrderConfirmFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 24, 716, 89);
		OrderConfirmFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Confirmation");
		lblNewLabel.setBounds(140, 11, 446, 47);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		lblNewLabel.setToolTipText("Receipt");
		panel.add(lblNewLabel);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OrderConfirmFrame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(OrderConfirmFrame, "Are you sure you want to exit?" , "KFC " , 
				   JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnExit.setBounds(377, 286, 154, 65);
		OrderConfirmFrame.getContentPane().add(btnExit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KFC_MENU kfcmn = new KFC_MENU();
				kfcmn.MenuFrame.setVisible(true);
				OrderConfirmFrame.dispose();
			}
		});
		btnBack.setToolTipText("BACK");
		btnBack.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnBack.setBounds(174, 286, 154, 65);
		OrderConfirmFrame.getContentPane().add(btnBack);
		
		JLabel lblOrderMade = new JLabel("Order has been made!");
		lblOrderMade.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderMade.setForeground(new Color(0, 250, 154));
		lblOrderMade.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		lblOrderMade.setBounds(164, 162, 377, 65);
		OrderConfirmFrame.getContentPane().add(lblOrderMade);
	}

}
