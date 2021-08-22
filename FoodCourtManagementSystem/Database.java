import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Database
{
	Connection conn=null;
	ResultSet rs=null;
	Statement st=null;

	public Database()
	{
		try
		{
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_food_order","root","");
			st=conn.createStatement();
		}catch(Exception ex) 
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}
	public void registerUser(User user)
	{
		String query="INSERT INTO `user` (`id`,`fname`,`lname`,`uname`,`password`,`email`,`phone`,`area`,`address`) VALUES (NULL,'"+user.fname+"','"+user.lname+"','"+user.username+"','"+user.password+"','"+user.email+"','"+user.phone+"','"+user.area+"','"+user.address+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public boolean validateUser(User user)
	{
		String query="select password from user where uname='"+user.username+"'";
		try
		{
			rs=st.executeQuery(query);
			while(rs.next())
			{
				if(rs.getString("password").equals(user.password))
				{
					return true;
				}
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		return false;
	}

	public boolean validateAdmin(Admin admin)
	{
		String query="select adminPassword from admin where adminName='"+admin.adminName+"'";
		try
		{
			rs=st.executeQuery(query);
			while(rs.next())
			{
				if(rs.getString("adminPassword").equals(admin.adminPassword))
				{
					return true;
				}
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		return false;
	}

	public void breakfast(Breakfast x)
	{
		String query="INSERT INTO `breakfast` (`id`,`parotta`,`khichuri`,`noodles`,`drinks`,`tk`) VALUES (NULL,'"+x.parotta+"','"+x.khichuri+"','"+x.noodles+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void lunch(Lunch x)
	{
		String query="INSERT INTO `lunch` (`id`,`plane_rice`,`biriyani`,`khichuri`,`drinks`,`tk`) VALUES (NULL,'"+x.plane_rice+"','"+x.biriyani+"','"+x.khichuri+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void evening(Evening x)
	{
		String query="INSERT INTO `evening` (`id`,`pasta`,`pizza`,`burger`,`shawarma`,`drinks`,`tk`) VALUES (NULL,'"+x.pasta+"','"+x.pizza+"','"+x.burger+"','"+x.shawarma+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void dinner(Dinner x)
	{
		String query="INSERT INTO `dinner` (`id`,`plane_rice`,`biriyani`,`khichuri`,`drinks`,`tk`) VALUES (NULL,'"+x.plane_rice+"','"+x.biriyani+"','"+x.khichuri+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}
}