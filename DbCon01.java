import java.sql.*;

public class DbCon01 {

	public static void main(String[] args) {
		try {
			class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306:")
		}
	}

}
