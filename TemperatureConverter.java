import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame
{
	private JLabel jlCelcius;
	private JLabel jlFarenheit;
	private JTextField jtfCelcius;
	private JTextField jtfFarenheit;

	private double celcius;
	private double farenheit;

	public TemperatureConverter()
	{
		super("Temperature Converter");

		jlCelcius = new JLabel("Celcius:");
		jlFarenheit = new JLabel("Farenheit:");
		jtfCelcius = new JTextField(10);
		jtfFarenheit = new JTextField(10);

		celcius = 0;
		farenheit = celcius * 9/5 + 32;

		jtfCelcius.setText(celcius+"");
		jtfFarenheit.setText(farenheit+"");

		jtfCelcius.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String s = jtfCelcius.getText();
				celcius = Integer.parseInt(s);
				farenheit = celcius * 9/5 + 32;
				jtfFarenheit.setText(farenheit+"");
			}
		});

		jtfFarenheit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String s = jtfCelcius.getText();
				farenheit = Integer.parseInt(s);
				celcius = (farenheit - 32) * 5/9;
				jtfCelcius.setText(celcius+"");
			}
		});

		setLayout(new GridLayout(2,2));

		add(jlCelcius);
		add(jtfCelcius);
		add(jlFarenheit);
		add(jtfFarenheit);

		this.setSize(300,100);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
