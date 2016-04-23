import java.io.IOException;  
import java.io.PrintWriter; 
public class AdminloginServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {   
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
String adminname=request.getParamter("adminname");
String password=request.getParameter("password");
if(adminname="praneeth" && password="praneeth");
{
	out.println("login successful");
RequestDispatcher rd=request.getRequestDispatcher("Adminhome");  
   rd.include(request,response);  
else
{  
        out.print("Sorry adminname or password is incorrect"); 
RequestDispatcher rd=request.getRequestDispatcher("adminlogin.html");  
        rd.include(request,response);

    }
out.close();   
        
} 
