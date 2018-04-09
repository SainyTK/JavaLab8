import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter extends JFrame
{
	private int count;
	private JLabel jlabel;
	private JTextField jTextField;
	private JButton jButton;

	public SwingCounter()
	{
		super("Swing Counter");

		count = 0;

		jlabel = new JLabel("Counter");
		jTextField = new JTextField(10);
		jTextField.setText("0");
		jButton = new JButton("Count");

		jButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				count++;
				jTextField.setText(count+"");
			}
		});

		Container c = getContentPane();
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,5,5);
		c.setLayout(flowLayout);

		c.add(jlabel);
		c.add(jTextField);
		c.add(jButton);

		this.setSize(500,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}