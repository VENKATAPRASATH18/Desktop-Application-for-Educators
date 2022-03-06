package source;
import java.sql.*;
public class DBoperations {
	private static Connection con;
	private static PreparedStatement ps;
	private static PreparedStatement pstmt;
	public static void createTb() {
		try {
			con = DBconnect.EstablishConnection();
			String CreateTb ="Create table Students (NAME varchar(20),ROLLNO varchar(8),YEAR number(4),DEPARTMENT varchar(10),SEMESTER number(4),PERCENTAGE number(5))";
			ps = con.prepareStatement(CreateTb);
			ps.executeUpdate();}
		catch(Exception e) {
				System.out.println(e);	}
		
	}
	
	
	public  void InsertData(String name,String rlno,int yr,String dpt,int sem,double per) {
		try {
			con = DBconnect.EstablishConnection();
			String insert ="insert into Students values(?,?,?,?,?,?)";
			 pstmt = con.prepareStatement(insert);
			pstmt.setString(1, name);            pstmt.setString(2, rlno);
			pstmt.setInt(3, yr);                 pstmt.setString(4, dpt);
			pstmt.setInt(5, sem);				pstmt.setDouble(6, per);	
			pstmt.executeUpdate();} 
		catch (Exception e) {
			System.out.println(e);	}}
	

}
