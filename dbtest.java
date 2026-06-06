import java.sql.*;
class dbtest
{
 public static void main(String []args)throws Exception
{
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
 Statement st=con.createStatement();
 st.executeUpdate("CREATE TABLE STUDENT22(regno int,name varchar(30),sem int)");
 st.executeUpdate("INSERT INTO STUDENT22 VALUES(2001,'harsh',4)");
 st.executeUpdate("INSERT INTO STUDENT22 VALUES(2002,'ha',4)");
 st.executeUpdate("INSERT INTO STUDENT22 VALUES(2003,'harh',4)");
 ResultSet rs=st.executeQuery("SELECT * FROM STUDENT22");
 while(rs.next())
 System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
 con.close();
}
}