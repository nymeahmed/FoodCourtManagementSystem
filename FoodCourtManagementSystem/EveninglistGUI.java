import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class EveninglistGUI extends JFrame  
{
	Connection conn=null;
	ResultSet rs=null;
	Statement st=null;

	public EveninglistGUI()
	{
		this.setBounds(400,0,160,10000);
		this.setLayout(new FlowLayout());
		try
		{
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_food_order","root","");
			st=conn.createStatement();
		}catch(Exception ex) 
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}

		String query = "Select * from evening";
		try{
			rs = st.executeQuery(query);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		try
		{
			while (rs.next())
			{
				int num=rs.getInt("id");
				JLabel title=new JLabel("Order no:"+num);
				this.add(title);
				String a=rs.getString("pasta");
				JLabel title2=new JLabel("Pasta:"+a);
				this.add(title2);
				String b=rs.getString("pizza");
				JLabel title3=new JLabel("Pizza:"+b);
				this.add(title3);
				String c=rs.getString("burger");
				JLabel title4=new JLabel("Burger:"+c);
				this.add(title4);
				String dd=rs.getString("shawarma");
				JLabel title55=new JLabel("Shawarma:"+dd);
				this.add(title55);
				String d=rs.getString("drinks");
				JLabel title5=new JLabel("Drinks:"+d);
				this.add(title5);
				String e=rs.getString("tk");
				JLabel title6=new JLabel("Total:"+e);
				this.add(title6);
				JLabel title7=new JLabel(".....................................................");
				this.add(title7);
			}
		}catch (Exception ex)
		{
				System.out.println(ex.getMessage());
		}
	}
}