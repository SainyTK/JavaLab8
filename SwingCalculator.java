import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener{

	private JTextField jtfDisplay;
	private JPanel jpInput;

	private JButton jb7;
	private JButton jb8;
	private JButton jb9;
	private JButton jbPlus;
	private JButton jb4;
	private JButton jb5;
	private JButton jb6;
	private JButton jbMinus;
	private JButton jb1;
	private JButton jb2;
	private JButton jb3;
	private JButton jbMul;
	private JButton jbC;
	private JButton jb0;
	private JButton jbEqual;
	private JButton jbSlash;

	private String screenBuffer;
	private double a;
	private double b;
	private double result;

	public SwingCalculator()
	{
		super("Swing Counter");

		screenBuffer = "";
		a = 0;
		b = 0;
		result = 0;

		 jtfDisplay = new JTextField(10);
		 jpInput = new JPanel();
		 jpInput.setLayout(new GridLayout(4,4));

		 JButton jb7 = new JButton("7");
		 JButton jb8 = new JButton("8");
		 JButton jb9 = new JButton("9");
		 JButton jbPlus = new JButton("+");
		 JButton jb4 = new JButton("4");
		 JButton jb5 = new JButton("5");
		 JButton jb6 = new JButton("6");
		 JButton jbMinus = new JButton("-");
		 JButton jb1 = new JButton("1");
		 JButton jb2 = new JButton("2");
		 JButton jb3 = new JButton("3");
		 JButton jbMul = new JButton("*");
		 JButton jbC = new JButton("C");
		 JButton jb0 = new JButton("0");
		 JButton jbEqual = new JButton("=");
		 JButton jbSlash = new JButton("/");

		 jb7.addActionListener(this);
		 jb8.addActionListener(this);
		 jb9.addActionListener(this);
		 jbPlus.addActionListener(this);
		 jb4.addActionListener(this);
		 jb5.addActionListener(this);
		 jb6.addActionListener(this);
		 jbMinus.addActionListener(this);
		 jb1.addActionListener(this);
		 jb2.addActionListener(this);
		 jb3.addActionListener(this);
		 jbMul.addActionListener(this);
		 jbC.addActionListener(this);
		 jb0.addActionListener(this);
		 jbEqual.addActionListener(this);
		 jbSlash.addActionListener(this);

		 jpInput.add(jb7);
		 jpInput.add(jb8);
		 jpInput.add(jb9);
		 jpInput.add(jbPlus);

		 jpInput.add(jb4);
		 jpInput.add(jb5);
		 jpInput.add(jb6);
		 jpInput.add(jbMinus);

		 jpInput.add(jb1);
		 jpInput.add(jb2);
		 jpInput.add(jb3);
		 jpInput.add(jbMul);

		 jpInput.add(jbC);
		 jpInput.add(jb0);
		 jpInput.add(jbEqual);
		 jpInput.add(jbSlash);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		c.add(jtfDisplay,BorderLayout.NORTH);
		c.add(jpInput,BorderLayout.CENTER);

		this.setSize(200,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		
	}
}
