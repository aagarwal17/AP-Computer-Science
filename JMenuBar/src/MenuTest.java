import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 * @author Arun Agarwal Pd. 7 AP Computer Science Test Program
 *
 */

public class MenuTest extends JFrame
{
	public MenuTest()
	{
		JLabel label = new JLabel("Click on an Option");
		add(label);
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu menu1 = new JMenu ("File");
		
		JMenuItem save = new JMenuItem("Save");
		menu1.add(save);
		
		JMenuItem close = new JMenuItem("Close");
		menu1.add(close);
		
		JMenuItem copy = new JMenuItem("Copy");
		menu1.add(copy);
		
		JMenuItem paste = new JMenuItem("Paste");
		menu1.add(paste);
		
		menubar.add(menu1);
		
		JMenu menu2 = new JMenu("Edit");
		
		JMenuItem select = new JMenuItem("Select");
		menu2.add(select);
		
		JMenu menu2Other = new JMenu("Other");
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem delete = new JMenuItem("Delete");
		menu2Other.add(cut);
		menu2Other.add(delete);
		menu2.add(menu2Other);
		menubar.add(menu2);
		
		JMenuItem help = new JMenuItem("Help");
		menubar.add(help);
		
		this.setJMenuBar(menubar);
		
		this.setBounds(100,100,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
	
	menu1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			label.setText(((JMenuItem) (e.getSource())).getText());
		}
		});
	
	menu2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			label.setText(((JMenuItem) (e.getSource())).getText());
		}
	});
	
	help.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {}
			
		});
}
}
