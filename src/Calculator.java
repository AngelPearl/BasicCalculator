import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel jLabelApotelesma = null;

	private JLabel jLabelPrwtosArithmos = null;

	private JLabel jLabelDefterosArithmos = null;

	private JLabel jLabelApotelesma2 = null;

	private JTextField jTextFieldArithmosA = null;

	private JTextField jTextFieldArithmosB = null;

	private JButton jButtonBB = null;

	private JButton jButtonResetAll = null;

	private JButton jButtonAddition = null;

	private JButton jButtonSubtraction = null;

	private JButton jButtonMultiplication = null;

	private JButton jButtonDivision = null;

	/**
	 * This is the default constructor
	 */
	public Calculator() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(495, 331);
		this.setContentPane(getJContentPane());
		this.setTitle("Calculator");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelApotelesma2 = new JLabel();
			jLabelApotelesma2.setBounds(new Rectangle(195, 17, 182, 59));
			jLabelApotelesma2.setText("");
			jLabelDefterosArithmos = new JLabel();
			jLabelDefterosArithmos.setBounds(new Rectangle(15, 166, 168, 59));
			jLabelDefterosArithmos.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelDefterosArithmos.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabelDefterosArithmos.setText("Δέυτερος Αριθμός(Β)");
			jLabelPrwtosArithmos = new JLabel();
			jLabelPrwtosArithmos.setBounds(new Rectangle(15, 91, 167, 61));
			jLabelPrwtosArithmos.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabelPrwtosArithmos.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabelPrwtosArithmos.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelPrwtosArithmos.setText("Πρώτος Αριθμός(Α)");
			jLabelApotelesma = new JLabel();
			jLabelApotelesma.setBounds(new Rectangle(14, 15, 168, 61));
			jLabelApotelesma.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabelApotelesma.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabelApotelesma.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelApotelesma.setForeground(Color.blue);
			jLabelApotelesma.setText("Αποτέλεσμα");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelApotelesma, null);
			jContentPane.add(jLabelPrwtosArithmos, null);
			jContentPane.add(jLabelDefterosArithmos, null);
			jContentPane.add(jLabelApotelesma2, null);
			jContentPane.add(getJTextFieldArithmosA(), null);
			jContentPane.add(getJTextFieldArithmosB(), null);
			jContentPane.add(getJButtonBB(), null);
			jContentPane.add(getJButtonResetAll(), null);
			jContentPane.add(getJButtonAddition(), null);
			jContentPane.add(getJButtonSubtraction(), null);
			jContentPane.add(getJButtonMultiplication(), null);
			jContentPane.add(getJButtonDivision(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldArithmosA	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldArithmosA() {
		if (jTextFieldArithmosA == null) {
			jTextFieldArithmosA = new JTextField();
			jTextFieldArithmosA.setBounds(new Rectangle(195, 91, 183, 61));
		}
		return jTextFieldArithmosA;
	}

	/**
	 * This method initializes jTextFieldArithmosB	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldArithmosB() {
		if (jTextFieldArithmosB == null) {
			jTextFieldArithmosB = new JTextField();
			jTextFieldArithmosB.setBounds(new Rectangle(194, 165, 183, 61));
		}
		return jTextFieldArithmosB;
	}

	/**
	 * This method initializes jButtonBB	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBB() {
		if (jButtonBB == null) {
			jButtonBB = new JButton();
			jButtonBB.setBounds(new Rectangle(16, 241, 165, 28));
			jButtonBB.setFont(new Font("Dialog", Font.BOLD, 14));
			jButtonBB.setForeground(Color.red);
			jButtonBB.setText("BYE-BYE");
			jButtonBB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					System.exit(0);
				}
			});
		}
		return jButtonBB;
	}

	/**
	 * This method initializes jButtonResetAll	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonResetAll() {
		if (jButtonResetAll == null) {
			jButtonResetAll = new JButton();
			jButtonResetAll.setBounds(new Rectangle(195, 240, 182, 31));
			jButtonResetAll.setFont(new Font("Dialog", Font.BOLD, 14));
			jButtonResetAll.setText("RESET ALL");
			jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					jTextFieldArithmosA.setText(String.valueOf(0));
					jTextFieldArithmosB.setText(String.valueOf(0));
					jLabelApotelesma2.setText(String.valueOf(0));
				}
			});
		}
		return jButtonResetAll;
	}

	/**
	 * This method initializes jButtonAddition	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAddition() {
		if (jButtonAddition == null) {
			jButtonAddition = new JButton();
			jButtonAddition.setBounds(new Rectangle(389, 17, 80, 44));
			jButtonAddition.setFont(new Font("Dialog", Font.BOLD, 14));
			jButtonAddition.setText("=A+B");
			jButtonAddition.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					double A=Double.parseDouble(jTextFieldArithmosA.getText());
					double B=Double.parseDouble(jTextFieldArithmosB.getText());
					AdderClass ApB=new AdderClass(A,B);
					double res=ApB.CalculateResult(A, B);
					jLabelApotelesma2.setText(String.valueOf(res));
					
					
				}
			});
		}
		return jButtonAddition;
	}

	/**
	 * This method initializes jButtonSubtraction	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSubtraction() {
		if (jButtonSubtraction == null) {
			jButtonSubtraction = new JButton();
			jButtonSubtraction.setBounds(new Rectangle(389, 76, 80, 45));
			jButtonSubtraction.setFont(new Font("Dialog", Font.BOLD, 14));
			jButtonSubtraction.setText("=A-B");
			jButtonSubtraction.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
					double A=Double.parseDouble(jTextFieldArithmosA.getText());
					double B=Double.parseDouble(jTextFieldArithmosB.getText());
					SubtractionClass ApB=new SubtractionClass(A,B);
					double res=ApB.CalculateResult(A, B);
					jLabelApotelesma2.setText(String.valueOf(res));
				}
			});
		}
		return jButtonSubtraction;
	}

	/**
	 * This method initializes jButtonMultiplication	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonMultiplication() {
		if (jButtonMultiplication == null) {
			jButtonMultiplication = new JButton();
			jButtonMultiplication.setBounds(new Rectangle(390, 137, 78, 44));
			jButtonMultiplication.setFont(new Font("Dialog", Font.BOLD, 14));
			jButtonMultiplication.setText("=A*B");
			jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					double A=Double.parseDouble(jTextFieldArithmosA.getText());
					double B=Double.parseDouble(jTextFieldArithmosB.getText());
					MultiplicationClass ApB=new MultiplicationClass(A,B);
					double res=ApB.CalculateResult(A, B);
					jLabelApotelesma2.setText(String.valueOf(res));
				}
			});
		}
		return jButtonMultiplication;
	}

	/**
	 * This method initializes jButtonDivision	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDivision() {
		if (jButtonDivision == null) {
			jButtonDivision = new JButton();
			jButtonDivision.setBounds(new Rectangle(390, 195, 77, 46));
			jButtonDivision.setFont(new Font("Dialog", Font.BOLD, 14));
			jButtonDivision.setText("=A/B");
			jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); 
					double A=Double.parseDouble(jTextFieldArithmosA.getText());
					double B=Double.parseDouble(jTextFieldArithmosB.getText());
					DivisionClass ApB=new DivisionClass(A,B);
					double res=ApB.CalculateResult(A, B);
					jLabelApotelesma2.setText(String.valueOf(res));
				}
			});
		}
		return jButtonDivision;
	}

}  //  @jve:decl-index=0:visual-constraint="180,21"
