import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LayoutFrame extends JFrame
{
	public LayoutFrame()
	{
	setBounds(500,500,500,500);
	setSize(1000,1000);
	ArrayList <BankAccount> total = new ArrayList<BankAccount>();
	setTitle("Bank Account Management");
	CardLayout c1= new CardLayout();
	JPanel overall= new JPanel();
	overall.setLayout(c1);
	add(overall);
	
	JPanel homescreen= new HomePanel();
	
	JPanel deposit= new DepositPanel(total);
	
	JPanel withdraw= new WithdrawPanel(total);
	
	JPanel transfer = new TransferPanel(total);
	
	JPanel createaccount= new AccountPanel(total);
	
	JPanel getAccount= new FindAccountPanel(total);
	
	JPanel deleteAccount= new DeleteAccountPanel(total);
	
	JPanel getBalance= new getBalancePanel(total);
	
	overall.add(homescreen, "WELCOME");
	overall.add(deposit, "Deposit");
	overall.add(withdraw, "Withdraw");
	overall.add(transfer, "Transfer");
	overall.add(createaccount, "Create a New Account");
	overall.add(getAccount, "Find Your Account");
	overall.add(deleteAccount, "Delete an Account");
	overall.add(getBalance, "Get Balance");
	
	JMenuBar mBar= new JMenuBar();
	JMenu accts = new JMenu("Accounts");
	JMenu trans= new JMenu("Transactions");
	JMenuItem create= new JMenuItem("Create Account");
	JMenuItem delete= new JMenuItem("Delete Account");
	JMenuItem find= new JMenuItem("Find Accounts");
	accts.add(create);
	accts.add(delete);
	accts.add(find);
	JMenuItem in= new JMenuItem("Deposit");
	JMenuItem out= new JMenuItem("Withdraw");
	JMenuItem move= new JMenuItem("Transfer");
	JMenuItem bal= new JMenuItem("Get Balance");
	trans.add(in);
	trans.add(out);
	trans.add(move);
	trans.add(bal);
	mBar.add(accts);
	mBar.add(trans);
	
	
	
	create.addActionListener(new ActionListener() 
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			c1.show(overall, "Create a New Account");
			
		}
		
	});
	
	delete.addActionListener(new ActionListener() 
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			c1.show(overall, "Delete an Account");
			
		}
		
	
	});
	
	find.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e)
		{
			c1.show(overall, "Find Your Account");
			
		}
		
	});
	
	in.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e)
		{
			c1.show(overall,"Deposit");
			
		}
		
	});
	
	out.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			c1.show(overall, "Withdraw");
			
		}
		
	});
	move.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e)
		{
			c1.show(overall, "Transfer");
		}
		
	});
	
	bal.addActionListener(new ActionListener() 
	{

		
		public void actionPerformed(ActionEvent e) 
		{
			c1.show(overall, "Get Balance");
			
		}
		
	});
	
	
	
	
	setJMenuBar(mBar);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	
	
	}
	public static void main(String[] args)
	{
		new LayoutFrame();
	}
	
}
