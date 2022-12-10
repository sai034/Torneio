import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDao {
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
			public String insert(Member member)
			{
				loadDriver(dbdriver);
				Connection con = getConnection();
				String result = " Data entered successfully ";
				String sql = "insert into project.member values(?,?,?,?,?,?)";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, member.getFirstName());
					ps.setString(2, member.getSecondName());
					ps.setString(3, member.getPhone());
					ps.setString(4, member.getEmail());
					ps.setString(5, member.getPassword());
					ps.setString(6, member.getGender());
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
	  				result = "Data not entered";
				}
				
				return result;
			}

}
