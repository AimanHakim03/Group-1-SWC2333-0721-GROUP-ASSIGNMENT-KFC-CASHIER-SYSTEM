import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KFC_MENU {
    JFrame MenuFrame;
	
	private JTextField txtSetA;
	private JTextField txtSetB;
	private JTextField txtSetC;
	private JTextField txtFamilyFeast;
	private JTextField txtZingerBox;
	private JTextField txtCheesyWedges;
	private JTextField txtIceLemonTea;
	private JTextField txtMineralWater;
	private JTextField txtMilo;
	private JTextField txtPepsi;
	private JTextField txtSprite;
	private JTextField txtTax;
	private JTextField txtsubTotal;
	private JTextField txtTotal;

	double SetA = 19.99;
	double SetB = 21.99;
	double SetC = 26.99;
	double FamilyFeast = 60.99;
	double ZingerBox = 20.49;
	double CheesyWedges = 6.90;
	double IceLemonTea = 1.90;
	double MineralWater = 1.00;
	double Milo = 1.90;
	double Pepsi = 1.90;
	double Sprite = 1.90;
	double tax = 0.75;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KFC_MENU window = new KFC_MENU();
					window.MenuFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KFC_MENU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MenuFrame = new JFrame();
		MenuFrame.setIconImage(new ImageIcon("C:\\Users\\Roy\\eclipse-workspace\\KFC PROJECT\\image\\uncle-kfc.png").getImage());
		MenuFrame.setTitle("KFC Menu");
		MenuFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				 txtSetA.setEnabled(false);
				 txtSetB.setEnabled(false);
				 txtSetC.setEnabled(false);
				 txtFamilyFeast.setEnabled(false);
				 txtZingerBox.setEnabled(false);
				 txtCheesyWedges.setEnabled(false);
				 txtIceLemonTea.setEnabled(false);
				 txtMineralWater.setEnabled(false);
				 txtMilo.setEnabled(false);
				 txtPepsi.setEnabled(false);
				 txtSprite.setEnabled(false);
				 
				 
				
			}
		});
		MenuFrame.getContentPane().setFont(new Font("Arial", Font.BOLD, 20));
		MenuFrame.getContentPane().setBackground(new Color(0, 0, 0));
		MenuFrame.getContentPane().setForeground(new Color(0, 0, 0));
		MenuFrame.setBounds(0, 0, 1341, 700);
		MenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(139, 0, 0)));
		panel.setBounds(141, 11, 995, 141);
		MenuFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KFC MENU");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Cooper Black", Font.BOLD, 60));
		lblNewLabel.setBounds(357, 31, 369, 70);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxSetB = new JCheckBox("Set B");
		chckbxSetB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSetB.isSelected())
				{
					txtSetB.setEnabled(true);
					txtSetB.setText("0");
					txtSetB.requestFocus();
				}
				else
				{
					txtSetB.setEnabled(false);
					txtSetB.setText("0");
				}
			}
		});
		chckbxSetB.setForeground(new Color(255, 255, 255));
		chckbxSetB.setBackground(new Color(139, 0, 0));
		chckbxSetB.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxSetB.setBounds(141, 231, 184, 62);
		MenuFrame.getContentPane().add(chckbxSetB);
		
		JCheckBox chckbxSetC = new JCheckBox("Set C");
		chckbxSetC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxSetC.isSelected())
				{
					txtSetC.setEnabled(true);
					txtSetC.setText("0");
					txtSetC.requestFocus();
				}
				else
				{
					txtSetC.setEnabled(false);
					txtSetC.setText("0");
				}
			}
		});
		chckbxSetC.setForeground(new Color(255, 255, 255));
		chckbxSetC.setBackground(new Color(139, 0, 0));
		chckbxSetC.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxSetC.setBounds(141, 299, 184, 62);
		MenuFrame.getContentPane().add(chckbxSetC);
		
		JCheckBox chckbxFamilyFeast = new JCheckBox("Family Feast");
		chckbxFamilyFeast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxFamilyFeast.isSelected())
				{
					txtFamilyFeast.setEnabled(true);
					txtFamilyFeast.setText("0");
					txtFamilyFeast.requestFocus();
				}
				else
				{
					txtFamilyFeast.setEnabled(false);
					txtFamilyFeast.setText("0");
				}
			}
		});
		chckbxFamilyFeast.setBackground(new Color(139, 0, 0));
		chckbxFamilyFeast.setForeground(new Color(255, 255, 255));
		chckbxFamilyFeast.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxFamilyFeast.setBounds(141, 363, 184, 62);
		MenuFrame.getContentPane().add(chckbxFamilyFeast);
		
		JCheckBox chckbxZingerBox = new JCheckBox("Zinger Box");
		chckbxZingerBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxZingerBox.isSelected())
				{
					txtZingerBox.setEnabled(true);
					txtZingerBox.setText("0");
					txtZingerBox.requestFocus();
				}
				else
				{
					txtZingerBox.setEnabled(false);
					txtZingerBox.setText("0");
				}
				
			}
		});
		chckbxZingerBox.setForeground(new Color(255, 255, 255));
		chckbxZingerBox.setBackground(new Color(139, 0, 0));
		chckbxZingerBox.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxZingerBox.setBounds(141, 428, 184, 62);
		MenuFrame.getContentPane().add(chckbxZingerBox);
		
		JCheckBox chckbxCheesyWedges = new JCheckBox("Cheesy Wedges");
		chckbxCheesyWedges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxCheesyWedges.isSelected())
				{
					txtCheesyWedges.setEnabled(true);
					txtCheesyWedges.setText("0");
					txtCheesyWedges.requestFocus();
				}
				
				else
				{
					txtCheesyWedges.setEnabled(false);
					txtCheesyWedges.setText("0");
				}
				
			}
		});
		chckbxCheesyWedges.setBackground(new Color(139, 0, 0));
		chckbxCheesyWedges.setForeground(new Color(255, 255, 255));
		chckbxCheesyWedges.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxCheesyWedges.setBounds(141, 493, 184, 62);
		MenuFrame.getContentPane().add(chckbxCheesyWedges);
		
		JCheckBox chckbxIceLemonTea = new JCheckBox("Ice Lemon Tea");
		chckbxIceLemonTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxIceLemonTea.isSelected())
				{
					txtIceLemonTea.setEnabled(true);
					txtIceLemonTea.setText("0");
					txtIceLemonTea.requestFocus();
				}
				else
				{
					txtIceLemonTea.setEnabled(false);
					txtIceLemonTea.setText("0");
				}
			}
		});
		chckbxIceLemonTea.setForeground(new Color(255, 255, 255));
		chckbxIceLemonTea.setBackground(new Color(139, 0, 0));
		chckbxIceLemonTea.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxIceLemonTea.setBounds(141, 558, 184, 62);
		MenuFrame.getContentPane().add(chckbxIceLemonTea);
		
		JCheckBox chckbxSetA = new JCheckBox("Set A");
		chckbxSetA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSetA.isSelected())
				{
					txtSetA.setEnabled(true);
					txtSetA.setText("0");
					txtSetA.requestFocus();
				}
				else
				{
					txtSetA.setEnabled(false);
					txtSetA.setText("0");
				}
			}
		});
		chckbxSetA.setBackground(new Color(139, 0, 0));
		chckbxSetA.setForeground(new Color(255, 255, 255));
		chckbxSetA.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxSetA.setBounds(141, 166, 184, 62);
		MenuFrame.getContentPane().add(chckbxSetA);
		
		txtSetA = new JTextField();
		txtSetA.setText("0");
		txtSetA.setFont(new Font("Arial", Font.BOLD, 20));
		txtSetA.setHorizontalAlignment(SwingConstants.CENTER);
		txtSetA.setBounds(352, 190, 79, 38);
		MenuFrame.getContentPane().add(txtSetA);
		txtSetA.setColumns(10);
		
		txtSetB = new JTextField();
		txtSetB.setText("0");
		txtSetB.setToolTipText("0");
		txtSetB.setFont(new Font("Arial", Font.BOLD, 20));
		txtSetB.setHorizontalAlignment(SwingConstants.CENTER);
		txtSetB.setColumns(10);
		txtSetB.setBounds(352, 246, 79, 38);
		MenuFrame.getContentPane().add(txtSetB);
		
		txtSetC = new JTextField();
		txtSetC.setText("0");
		txtSetC.setToolTipText("0");
		txtSetC.setFont(new Font("Arial", Font.BOLD, 20));
		txtSetC.setHorizontalAlignment(SwingConstants.CENTER);
		txtSetC.setColumns(10);
		txtSetC.setBounds(352, 313, 79, 38);
		MenuFrame.getContentPane().add(txtSetC);
		
		txtFamilyFeast = new JTextField();
		txtFamilyFeast.setText("0");
		txtFamilyFeast.setToolTipText("0");
		txtFamilyFeast.setFont(new Font("Arial", Font.BOLD, 20));
		txtFamilyFeast.setHorizontalAlignment(SwingConstants.CENTER);
		txtFamilyFeast.setColumns(10);
		txtFamilyFeast.setBounds(352, 363, 79, 38);
		MenuFrame.getContentPane().add(txtFamilyFeast);
		
		txtZingerBox = new JTextField();
		txtZingerBox.setText("0");
		txtZingerBox.setToolTipText("0");
		txtZingerBox.setFont(new Font("Arial", Font.BOLD, 20));
		txtZingerBox.setHorizontalAlignment(SwingConstants.CENTER);
		txtZingerBox.setColumns(10);
		txtZingerBox.setBounds(352, 428, 79, 38);
		MenuFrame.getContentPane().add(txtZingerBox);
		
		txtCheesyWedges = new JTextField();
		txtCheesyWedges.setText("0");
		txtCheesyWedges.setToolTipText("0");
		txtCheesyWedges.setFont(new Font("Arial", Font.BOLD, 20));
		txtCheesyWedges.setHorizontalAlignment(SwingConstants.CENTER);
		txtCheesyWedges.setColumns(10);
		txtCheesyWedges.setBounds(352, 493, 79, 38);
		MenuFrame.getContentPane().add(txtCheesyWedges);
		
		txtIceLemonTea = new JTextField();
		txtIceLemonTea.setText("0");
		txtIceLemonTea.setToolTipText("0");
		txtIceLemonTea.setFont(new Font("Arial", Font.BOLD, 20));
		txtIceLemonTea.setHorizontalAlignment(SwingConstants.CENTER);
		txtIceLemonTea.setColumns(10);
		txtIceLemonTea.setBounds(352, 558, 79, 38);
		MenuFrame.getContentPane().add(txtIceLemonTea);
		
		txtMineralWater = new JTextField();
		txtMineralWater.setText("0");
		txtMineralWater.setToolTipText("0");
		txtMineralWater.setFont(new Font("Arial", Font.BOLD, 20));
		txtMineralWater.setHorizontalAlignment(SwingConstants.CENTER);
		txtMineralWater.setColumns(10);
		txtMineralWater.setBounds(643, 190, 79, 38);
		MenuFrame.getContentPane().add(txtMineralWater);
		
		txtMilo = new JTextField();
		txtMilo.setText("0");
		txtMilo.setFont(new Font("Arial", Font.BOLD, 20));
		txtMilo.setHorizontalAlignment(SwingConstants.CENTER);
		txtMilo.setColumns(10);
		txtMilo.setBounds(643, 246, 79, 38);
		MenuFrame.getContentPane().add(txtMilo);
		
		txtPepsi = new JTextField();
		txtPepsi.setText("0");
		txtPepsi.setToolTipText("0");
		txtPepsi.setFont(new Font("Arial", Font.BOLD, 20));
		txtPepsi.setHorizontalAlignment(SwingConstants.CENTER);
		txtPepsi.setColumns(10);
		txtPepsi.setBounds(643, 313, 79, 38);
		MenuFrame.getContentPane().add(txtPepsi);
		
		txtSprite = new JTextField();
		txtSprite.setText("0");
		txtSprite.setFont(new Font("Arial", Font.BOLD, 20));
		txtSprite.setHorizontalAlignment(SwingConstants.CENTER);
		txtSprite.setColumns(10);
		txtSprite.setBounds(643, 378, 79, 38);
		MenuFrame.getContentPane().add(txtSprite);
		
		JCheckBox chckbxMineralWater = new JCheckBox("Mineral Water");
		chckbxMineralWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxMineralWater.isSelected())
				{
					txtMineralWater.setEnabled(true);
					txtMineralWater.setText("0");
					txtMineralWater.requestFocus();
				}
				else
				{
					txtMineralWater.setEnabled(false);
					txtMineralWater.setText("0");
				}
				
			}
		});
		chckbxMineralWater.setBackground(new Color(139, 0, 0));
		chckbxMineralWater.setForeground(new Color(255, 255, 255));
		chckbxMineralWater.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxMineralWater.setBounds(453, 166, 184, 62);
		MenuFrame.getContentPane().add(chckbxMineralWater);
		
		JCheckBox chckbxMilo = new JCheckBox("Milo");
		chckbxMilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxMilo.isSelected())
				{
					txtMilo.setEnabled(true);
					txtMilo.setText("0");
					txtMilo.requestFocus();
				}
				else
				{
					txtMilo.setEnabled(false);
					txtMilo.setText("0");
				}
			}
		});
		chckbxMilo.setForeground(new Color(255, 255, 255));
		chckbxMilo.setBackground(new Color(139, 0, 0));
		chckbxMilo.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxMilo.setBounds(453, 231, 184, 62);
		MenuFrame.getContentPane().add(chckbxMilo);
		
		JCheckBox chckbxPepsi = new JCheckBox("Pepsi");
		chckbxPepsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxPepsi.isSelected())
				{
					txtPepsi.setEnabled(true);
					txtPepsi.setText("0");
					txtPepsi.requestFocus();
				}
				else
				{
					txtPepsi.setEnabled(false);
					txtPepsi.setText("0");
				}
			}
		});
		chckbxPepsi.setBackground(new Color(139, 0, 0));
		chckbxPepsi.setForeground(new Color(255, 255, 255));
		chckbxPepsi.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxPepsi.setBounds(453, 298, 184, 62);
		MenuFrame.getContentPane().add(chckbxPepsi);
		
		JCheckBox chckbxSprite = new JCheckBox("Sprite");
		chckbxSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxSprite.isSelected())
				{
					txtSprite.setEnabled(true);
					txtSprite.setText("0");
					txtSprite.requestFocus();
				}
				else
				{
					txtSprite.setEnabled(false);
					txtSprite.setText("0");
				}
			}
		});
		chckbxSprite.setForeground(new Color(255, 255, 255));
		chckbxSprite.setBackground(new Color(139, 0, 0));
		chckbxSprite.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		chckbxSprite.setBounds(453, 363, 184, 62);
		MenuFrame.getContentPane().add(chckbxSprite);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(139, 0, 0)));
		panel_1.setBounds(453, 448, 269, 172);
		MenuFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblTax.setBounds(25, 37, 65, 24);
		panel_1.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblSubTotal.setBounds(25, 81, 107, 24);
		panel_1.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblTotal.setBounds(25, 116, 65, 24);
		panel_1.add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setColumns(10);
		txtTax.setBounds(142, 23, 96, 38);
		panel_1.add(txtTax);
		
		txtsubTotal = new JTextField();
		txtsubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtsubTotal.setColumns(10);
		txtsubTotal.setBounds(142, 67, 96, 38);
		panel_1.add(txtsubTotal);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setColumns(10);
		txtTotal.setBounds(142, 112, 96, 38);
		panel_1.add(txtTotal);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtReceipt.setBounds(732, 163, 404, 464);
		MenuFrame.getContentPane().add(txtReceipt);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double A = SetA * Double.parseDouble(txtSetA.getText());
				double B = SetB * Double.parseDouble(txtSetB.getText());
				double C = SetC * Double.parseDouble(txtSetC.getText());
				double F = FamilyFeast * Double.parseDouble(txtFamilyFeast.getText());
				double Z = ZingerBox * Double.parseDouble(txtZingerBox.getText());
				double CH = CheesyWedges * Double.parseDouble(txtCheesyWedges.getText());
				double I = IceLemonTea * Double.parseDouble(txtIceLemonTea.getText());
				double M = MineralWater * Double.parseDouble(txtMineralWater.getText());
				double MI = Milo * Double.parseDouble(txtMilo.getText());
				double P = Pepsi * Double.parseDouble(txtPepsi.getText());
				double S = Sprite * Double.parseDouble(txtSprite.getText());
				
				double sum = A + B + C + F + Z +CH + I + M + MI + P + S;
				double cTax = (tax * sum)/100;
				double SumTotal = sum + cTax;
				
				
				String Sum2 = String.format("RM %.2f", sum);
				txtsubTotal.setText(Sum2);
				
				String tTax = String.format("RM %.2f", cTax);
				txtTax.setText(tTax);
				
				String tTotal = String.format("RM %.2f", SumTotal);
				txtTotal.setText(tTotal);
				
				if(SumTotal < 1) {
					
					JOptionPane.showMessageDialog(null,"Please enter quantity!");
				}
				
				
			}
		});
		btnTotal.setToolTipText("TOTAL");
		btnTotal.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnTotal.setBounds(1146, 198, 127, 65);
		MenuFrame.getContentPane().add(btnTotal);
		
		JButton btnReceipt = new JButton("RECEIPT");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String cSetA = String.format(txtSetA.getText());
				String cSetB = String.format(txtSetB.getText());
				String cSetC = String.format(txtSetC.getText());
				String cFamilyFeast = String.format(txtFamilyFeast.getText());
				String cZingerBox = String.format(txtZingerBox.getText());
				String cCheesyWedges = String.format(txtCheesyWedges.getText());
				String cIceLemonTea = String.format(txtIceLemonTea.getText());
				String cMineralWater = String.format(txtMineralWater.getText());
				String cMilo = String.format(txtMilo.getText());
				String cPepsi = String.format(txtPepsi.getText());
				String cSprite = String.format(txtSprite.getText());
				
				String costTax = String.format(txtTax.getText());
				String costSubTotal = String.format(txtsubTotal.getText());
				String cTotal = String.format(txtTotal.getText());
				
				int refs = 1325 + (int)(Math.random()*4238);
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
				sdfTime.format(timer.getTime());
				
				SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
				sdfDate.format(timer.getTime());
				
				txtReceipt.append("\t\tKFC Order" + 
				"\nOrder:  \t\t\t" + refs + 
				"\n========================================== \t" + 
				"\nSetA: \t" + cSetA + " " + 
				"\nSetB: \t" + cSetB + " " + 
				"\nSetC: \t" + cSetC + " " + 
				"\nFamily Feast: \t" + cFamilyFeast + " " + 
				"\nZinger Box: \t" + cZingerBox + " " +
				"\nCheesy Wedges: \t" + cCheesyWedges + " " + 
				"\nIce Lemon Tea: \t" + cIceLemonTea + " " +
				"\nMineral Water: \t" + cMineralWater + " " +
				"\nMilo: \t" + cMilo + " " +
				"\nPepsi: \t" + cPepsi + " " +
				"\nSprite: \t" + cSprite + " " +
				"\n========================================== \t" + 
				"\nTax: \t................." + costTax +
				"\nSub Total: \t..........." + costSubTotal + 
				"\nTotal: \t..............." + cTotal + 
				"\n========================================== \t" + 
				"\nDate: \t" + sdfDate.format(timer.getTime()) + 
				"\nTime: \t" + sdfTime.format(timer.getTime()) + 
				"\n\t\tThank You!\n");
				
				
				
				
				
				
			}
			
			
		});
		btnReceipt.setToolTipText("RECEIPT");
		btnReceipt.setFont(new Font("Cooper Black", Font.PLAIN, 17));
		btnReceipt.setBounds(1146, 274, 127, 62);
		MenuFrame.getContentPane().add(btnReceipt);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 txtTax.setText(null);
				 txtsubTotal.setText(null);
				 txtTotal.setText(null);
				 
				 txtSetA.setText(null);
				 txtSetB.setText(null);
				 txtSetC.setText(null);
				 txtFamilyFeast.setText(null);
				 txtZingerBox.setText(null);
				 txtCheesyWedges.setText(null);
				 txtIceLemonTea.setText(null);
				 txtMineralWater.setText(null);
				 txtMilo.setText(null);
				 txtPepsi.setText(null);
				 txtSprite.setText(null);
				 txtReceipt.setText(null);
				 
				 chckbxSetA.setSelected(false);
				 chckbxSetB.setSelected(false);
				 chckbxSetC.setSelected(false);
				 chckbxFamilyFeast.setSelected(false);
				 chckbxZingerBox.setSelected(false);
				 chckbxCheesyWedges.setSelected(false);
				 chckbxIceLemonTea.setSelected(false);
				 chckbxMineralWater.setSelected(false);
				 chckbxMilo.setSelected(false);
				 chckbxPepsi.setSelected(false);
				 chckbxSprite.setSelected(false);
				 
			}
			 
	
		});
		btnReset.setToolTipText("RESET");
		btnReset.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnReset.setBounds(1146, 347, 127, 65);
		MenuFrame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuFrame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(MenuFrame, "Are you sure you want to exit?" , "KFC Menu" , 
				   JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setToolTipText("EXIT");
		btnExit.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnExit.setBounds(1146, 499, 127, 65);
		MenuFrame.getContentPane().add(btnExit);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KFCOrderConfirm kfcoc = new KFCOrderConfirm();
				kfcoc.OrderConfirmFrame.setVisible(true);
				MenuFrame.dispose();
				
			}
		});
		btnNext.setToolTipText("EXIT");
		btnNext.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		btnNext.setBounds(1146, 423, 127, 65);
		MenuFrame.getContentPane().add(btnNext);
	}

}
