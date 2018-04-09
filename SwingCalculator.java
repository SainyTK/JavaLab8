import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener
{
	private JTextField jtf;
	private JPanel jpanel;
	private JButton[] jbtn;

	private double a;
	private double b;
	private int state;

	private final String[] btnStrings = {"7","8","9","+",
										"4","5","6","-",
										"1","2","3","*",
										"C","0","=","/"};

	public SwingCalculator()
	{
		super("Swing Calculator");

		a = 0;
		b = 0;
		state = 1;

		jtf = new JTextField(500);
		jtf.setHorizontalAlignment(SwingConstants.RIGHT);
		jtf.setText("0");
		jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(4,4));

		jbtn = new JButton[16];
		for(int i=0;i<16;i++)
		{
			jbtn[i] = new JButton(btnStrings[i]);
			jbtn[i].addActionListener(this);
			jpanel.add(jbtn[i]);
		}

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(jtf,BorderLayout.NORTH);
		c.add(jpanel,BorderLayout.CENTER);

		this.setSize(350,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}	

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == jbtn[12]) // C
		{
			a = 0;
			b = 0;
			state = 1;
			jtf.setText("0");
		}
		else if(e.getSource() == jbn[14]) // = 
		{
			jtf.setText((a+b)+"");
			a = 0;
			b = 0;
			state = 1;
		}
		else if(e.getSource == jbtn[3]) //+
		{
			
		}
	}							
}