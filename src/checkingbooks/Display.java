package checkingbooks;

import dbcon.Dbcon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display {

	public static void checkbook() throws Exception {
		Connection connection = Dbcon.dbcon();
		String query = "select * from kinlib";

		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		System.out.println("stdId" + "  " + "bookId" + "  " + "bookname" + "  " + "gettime");
		

		while (rs.next()) {
			int i = 0;
			System.out.println(rs.getString(++i) + "   " + rs.getString(++i) + "    " + rs.getString(++i) + "  "
					+ rs.getString(++i));

		}

		connection.close();

	}

}
