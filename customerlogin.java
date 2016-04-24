import java.io.IOException;  
import java.io.PrintWriter; 
import java.sql.*;
public class FirstServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {   
  response.setContentType("text/html");
PrintWriter out=response.getWriter();
        Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
Statement st=con.createStatement();
	           String customername=request.getParamter("customername");
String mobilenumber=request.getParameter("mobilenumber"); 
	       st.executeUpdate("insert into customer values(customername,mobilenumber)");
	st.executeUpdate("insert into admin ("customername","mobilenumber") values(customername,mobilenumber)");
out.println("Welcome to the pantaloons ");
response.forward(itemsservlet);
out.close();
       }  
}  

