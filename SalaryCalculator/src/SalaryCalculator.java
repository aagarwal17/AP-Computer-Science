import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Arun Agarwal
 * AP Computer Science Period 7
 * Salary Calculator with GUI
 */
public class SalaryCalculator 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setSize(300,200);
		myFrame.setLocation(475, 235);
		
		myFrame.setLayout(null);
		myFrame.setTitle("Salary Calculator");
		
		
		JLabel hourlyRate = new JLabel("Hourly Rate: ");
		hourlyRate.setBounds(25,25,125,25);
		myFrame.add(hourlyRate);
		
		JTextField hourlyRateText = new JTextField();
		hourlyRateText.setBounds(105,25,125,25);
		myFrame.add(hourlyRateText);
		
		
		JLabel avgHrs = new JLabel("Hours/Week:");
		avgHrs.setBounds(25,50,125,25);
		myFrame.add(avgHrs);
		
		JTextField avgHrsText = new JTextField();
		avgHrsText.setBounds(105,50,125,25);
		myFrame.add(avgHrsText);
		
			
		JCheckBox fullTime = new JCheckBox("Full Time");
		fullTime.setBounds(25,75,125,25);
		myFrame.add(fullTime);
		
		
		JButton calc = new JButton("Calculate");
		calc.setBounds(25,100,115,25);
		myFrame.add(calc);
		
		
		JLabel total = new JLabel("Annual Salary: $ ");
		total.setBounds(150,100,125,25);
		myFrame.add(total);
		
		JLabel sal = new JLabel("0.00");
		sal.setBounds(247,100,125,25);
		myFrame.add(sal);
		
		fullTime.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent d)
					{
						if (fullTime.isSelected())
						{
							avgHrsText.setText("40");
						}	
					}
				});
		
		calc.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						double hourly = Double.parseDouble(hourlyRateText.getText());
						double hours = Double.parseDouble(avgHrsText.getText());
						
								double make = (52*hours*hourly);
								String sala = "" + make;
								sal.setText(sala);
								
						}
				});
						
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}



//Error: The Program does not clear the hours/week when the checkbox is clicked
//Do we need a keyListener
//Do we need to account for implausible values (more hours per week than possible, for example)
