import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class UserlistGUI extends JFrame  
{
	Connection conn=null;
	ResultSet rs=null;
	Statement st=null;

	public UserlistGUI()
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

		String query = "Select * from user";
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
				JLabel title=new JLabel("User no:"+num);
				this.add(title);
				String a=rs.getString("fname");
				JLabel title2=new JLabel("First Name:"+a);
				this.add(title2);
				String b=rs.getString("lname");
				JLabel title3=new JLabel("Last Name:"+b);
				this.add(title3);
				String c=rs.getString("uname");
				JLabel title4=new JLabel("User Name:"+c);
				this.add(title4);
				String d=rs.getString("email");
				JLabel title5=new JLabel("Email:"+d);
				this.add(title5);
				String e=rs.getString("phone");
				JLabel title6=new JLabel("Phone:"+e);
				this.add(title6);
				String f=rs.getString("area");
				JLabel title7=new JLabel("Area:"+f);
				this.add(title7);
				String g=rs.getString("address");
				JLabel title8=new JLabel("Address:"+g);
				this.add(title8);
				JLabel title9=new JLabel(".....................................................");
				this.add(title9);
			}
		}catch (Exception ex)
		{
				System.out.println(ex.getMessage());
		}
	}
}