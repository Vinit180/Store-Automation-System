import java.sql.*;
public class Database {
    public static void main(String args[])
    {
        try
        {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","akash","akash1780");
          if(con!=null)
          {
              System.out.println("Connected to database");
          }
          else
          {
              System.out.println("Error in connection");
          }
          Statement s =con.createStatement();
         // s.executeQuery("create table login(username varchar2(15),password varchar2(15))");
         // s.executeQuery("insert into login values('akash','akash')");
          ResultSet r=s.executeQuery("select * from login");
          r.next();
          System.out.println(r.getString(1)+" "+r.getString(2));
         con.close();
        }catch(Exception e){System.out.println(e);}
    }
    
}
