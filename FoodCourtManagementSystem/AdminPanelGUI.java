import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanelGUI extends JFrame
{
	JButton a,b,c,d,e;
	Database db;

	public AdminPanelGUI()
	{
		db=new Database();

		JLabel title=new JLabel("Welcome to admin panel");
		title.setFont(new Font("Elephant",Font.ITALIC,18)); 
        title.setForeground(Color.BLUE);
        this.add(title);
        JLabel title2=new JLabel("Select the list you want to see: ");
        this.add(title2);

        a=new JButton("User list");
        b=new JButton("Breakfast order list");
        c=new JButton("Lunch order list");
        d=new JButton("Evening order list");
        e=new JButton("Dinner order list");

        this.setBounds(500,280,250,260);
        this.setLayout(new FlowLayout());
        this.add(a);
        this.add(b);
        this.add(c);
        this.add(d);
        this.add(e);

        a.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					UserlistGUI a=new UserlistGUI();
					a.setVisible(true);
					a.setTitle("user list");
					a.getContentPane().setLayout(null);
					a.getContentPane().setBackground(Color.YELLOW);
				}
			}
		);

		b.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					BreakfastlistGUI a=new BreakfastlistGUI();
					a.setVisible(true);
					a.setTitle("breakfast list");
					a.getContentPane().setLayout(null);
					a.getContentPane().setBackground(Color.YELLOW);
				}
			}
		);

		c.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					LunchlistGUI a=new LunchlistGUI();
					a.setVisible(true);
					a.setTitle("lunch list");
					a.getContentPane().setLayout(null);
					a.getContentPane().setBackground(Color.YELLOW);
				}
			}
		);

		d.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					EveninglistGUI a=new EveninglistGUI();
					a.setVisible(true);
					a.setTitle("evening list");
					a.getContentPane().setLayout(null);
					a.getContentPane().setBackground(Color.YELLOW);
				}
			}
		);

		e.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					DinnerlistGUI a=new DinnerlistGUI();
					a.setVisible(true);
					a.setTitle("dinner list");
					a.getContentPane().setLayout(null);
					a.getContentPane().setBackground(Color.YELLOW);
				}
			}
		);
	}
}