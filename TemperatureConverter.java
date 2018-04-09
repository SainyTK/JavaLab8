import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener
{
	private JLabel celciusLabel;
	private JTextField celciusTextField;
	private JLabel fahrenhietLabel;
	private JTextField fahrenheitTextField;

	private double celcius;
	private double fahrenheit;

	public TemperatureConverter()
	{
		super("Temperature Converter");

		celcius = 0.0;
		fahrenheit = celcius * 9/5 + 32;

		celciusLabel = new JLabel("Celcius:");
		celciusTextField = new JTextField(10);
		celciusTextField.setText(celcius+"");
		fahrenhietLabel = new JLabel("Fahrenheit:");
		fahrenheitTextField = new JTextField(10);
		fahrenheitTextField.setText(fahrenheit+"");

		celciusTextField.addActionListener(this);
		fahrenheitTextField.addActionListener(this);

		Container c = getContentPane();
		GridLayout gridLayout = new GridLayout(2,2);
		c.setLayout(gridLayout);

		c.add(celciusLabel);
		c.add(celciusTextField);
		c.add(fahrenhietLabel);
		c.add(fahrenheitTextField);

		this.setSize(500,150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{

		if(e.getSource() == celciusTextField)
		{
			celcius = Double.parseDouble(celciusTextField.getText());
			fahrenheit = celcius * 9/5 + 32;
			fahrenheitTextField.setText(fahrenheit+"");
		}
		else if(e.getSource() == fahrenheitTextField)
		{

			fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
			celcius = (fahrenheit-32) * 5/9;
			celciusTextField.setText(celcius+"");
		}
	}
}