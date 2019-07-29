package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import com.java.DB.Student;
import com.java.DB.StudentManager;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <title> Student</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("        \n");
      out.write("            ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("           <a class=\"navbar-brand\" href=\"Student.jsp\">Navbar</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"Student.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("        <table class=\"table\">\n");
      out.write("  <thead class=\"thead-dark\">\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">Họ tên</th>\n");
      out.write("      <th scope=\"col\">Khoa</th>\n");
      out.write("      <th scope=\"col\">Lớp</th>\n");
      out.write("      <th scope=\"col\">Chức năng</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("   \n");
      out.write("        ");
 
            
            StudentManager sm=new StudentManager();
            List<Student> l=new ArrayList<Student>();
            l=sm.show();
           for(Student s:l){
               
           
                    
            
           
      out.write("\n");
      out.write("            <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print( s.getId()   );
      out.write("</th>\n");
      out.write("      \n");
      out.write("       <td> ");
      out.print( s.getHoTen());
      out.write("</td>\n");
      out.write("        <td> ");
      out.print( s.getKhoa());
      out.write("</td>\n");
      out.write("         <td> ");
      out.print( s.getLop());
      out.write("</td>\n");
      out.write("         <td> \n");
      out.write("             <a href=\"Update.jsp?&id=");
      out.print( s.getId());
      out.write(" \" class=\"btn btn-primary\" >Sửa</a>\n");
      out.write("             <a href=\"Delete?id=");
      out.print( s.getId());
      out.write(" \" class=\"btn btn-danger\">Xóa</a>\n");
      out.write("         </td>\n");
      out.write("   \n");
      out.write("    </tr>\n");
      out.write("    ");
 } 
   
    
      out.write("\n");
      out.write("   \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("    <a href=\"AddStudent.jsp\" class=\"btn btn-success\">Thêm mới</a>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
