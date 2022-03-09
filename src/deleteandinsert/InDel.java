package deleteandinsert;

import dbcon.Dbcon;
import com.kinlib.currenttime.CrtTime;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InDel {
	
	public static void exceqution(String query) throws Exception {
		Connection connection = Dbcon.dbcon();
		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(query);
		System.out.println("number of rows="+rows);
		
	}

	public static void insert(String stdId, String bookid, String bookname, String takeDate) throws Exception {
		Connection connection = Dbcon.dbcon();
		StringBuilder querystr = new StringBuilder();
		querystr.append("insert into kinlib (StuId,BookId,BookName,TDate) values('").append(stdId).append("','")
				.append(bookid).append("','").append(bookname).append("','").append(takeDate).append("')");
		// ("+ "'"+stdId+"','"+bookid+"','"+bookname+"','"+takeDate+"')";
		String query = querystr.toString();
		exceqution(query);
		
	}

	public static void delydelete(String name, String bookid) throws Exception {
		Connection connection = Dbcon.dbcon();
		StringBuilder querystr = new StringBuilder();
		querystr.append("select * from kinlib where StuId=('").append(name).append("') and BookId=('").append(bookid)
				.append("')  ");
		String query = querystr.toString();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		long val = 0;
		int i = 1;
		String date = null;
		long n = 0;
		while (rs.next()) {

			val = rs.getLong(i);
			if (val > 0) {
				date = rs.getString(4);
				n = (int) CrtTime.finedays(date);
				System.out.println(n);
				

			}

		}
		
		if (n == 1) {
			delete(name);
		}
		else {
			update(name,date);
		}

	
	}
	public static void delete(String name) throws Exception {
		StringBuilder querystr = new StringBuilder();
		querystr.append("delete from kinlib where StuId=('").append(name).append("')");
		String  query1= querystr.toString();
		exceqution(query1);
	
	}
	public static void update(String name,String date) throws Exception {
		StringBuilder querystr = new StringBuilder();
		querystr.append("update kinlib set  TDate=('").append(CrtTime.month).append("') where StuId=('").append(name).append("')");
		String  query1= querystr.toString();
		exceqution(query1);
	
	}

}
