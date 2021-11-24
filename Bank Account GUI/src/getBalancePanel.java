import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class getBalancePanel extends JPanel
{
	ArrayList <BankAccount> bankaccounts;
	BankAccount [] matched;
	public getBalancePanel(ArrayList<BankAccount> total)
	{
		bankaccounts=total;
		setSize(700,400);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel name= new JLabel ("Write the Name Under The Account You Would Like To Find the Balance of");
		add(name, gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		JTextField entername= new JTextField();
		entername.setPreferredSize(new Dimension(250,30));
		add(entername, gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		JButton submit= new JButton("Submit");
		add(submit, gbc);
		
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel found= new JLabel("Here is a list of all Accounts Under This Name:");
		add(found, gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		JList thelist= new JList(matched);
		thelist.setPreferredSize(new Dimension(250,30));
		add(thelist,gbc);
		thelist.setVisible(true);
		
		JScrollPane all= new JScrollPane(thelist);
		all.setPreferredSize(new Dimension (250,30));
		add(all, gbc);
		all.setVisible(true);
		
		gbc.gridx=0;
		gbc.gridy=2;
		JLabel invalid= new JLabel("Please Enter Name Field");
		add(invalid, gbc);
		invalid.setVisible(false);
		
		gbc.gridx=0;
		gbc.gridy=2;
		JLabel nomatch=new JLabel("No Accounts Under This Name Were Found");
		add(nomatch,gbc);
		nomatch.setVisible(false);
		
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(entername.getText().equals(""))
				{
					invalid.setVisible(true);
					nomatch.setVisible(false);
				}
				else
				{
					String nme= entername.getText();
					int i=0;
					int j=0;
					int yes=0;
					while(i<bankaccounts.size())
					{
						if(nme.equals(bankaccounts.get(i).getName()))
						{
							yes++;
							matched[j]= bankaccounts.get(i);
							j++;
							entername.setText("");
						}
						i++;
					}
					if(yes==0)
					{
						matched=null;
						nomatch.setVisible(true);
						invalid.setVisible(false);
					}
				}
				
			}
			
		});
	}
}
