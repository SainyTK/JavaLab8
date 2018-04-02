import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter extends JFrame implements ActionListener{

	private JLabel jlCount;
	private JTextField jtfCount;
	private JButton jbCount;

	private int n;

	public SwingCounter()
	{
		super("Swing Counter");


		jlCount = new JLabel("Counter");
		jtfCount = new JTextField(10);

		n = 0;
		jtfCount.setText(n+"");

		jbCount = new JButton("count");

		jbCount.addActionListener(this);

		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

		c.add(jlCount);
		c.add(jtfCount);
		c.add(jbCount);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(300,200);
		this.setVisible(true);
	}

	//override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == jbCount)
		{
			n++;
			jtfCount.setText(n+"");
		}
	}
	
}
