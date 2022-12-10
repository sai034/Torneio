import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDao2 {
			private String dburl = "jdbc:mysql://localhost:3306/project";
			private String dbuname = "root";
			private String dbpassword = "sindhu";
			private String dbdriver = "com.mysql.cj.jdbc.Driver";
			public void loadDriver(String dbDriver) {
				try {
					Class.forName(dbDriver);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			public Connection getConnection()
			{
				Connection con = null;
				try {
					con = DriverManager.getConnection(dburl, dbuname, dbpassword);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
			}
			public String insert(Member2 member2)
			{
				loadDriver(dbdriver);
				Connection con = getConnection();
				String result1 = " Data entered successfully ";
				String sql = "insert into project.member2 values(?,?,?,?,?,?)";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, member2.getUsn());
					ps.setString(2, member2.getName());
					ps.setString(3, member2.getGame());
					ps.setString(4, member2.getSem());
					ps.setString(5, member2.getSec());
					ps.setString(6, member2.getPhone());
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
	  				result1 = "Data not entered";
				}
				
				return result1;
			}

}
