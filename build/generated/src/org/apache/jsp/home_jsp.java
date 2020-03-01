package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("       <style>\n");
      out.write("            header\n");
      out.write("            {\n");
      out.write("                height: 100px;\n");
      out.write("                background-color: wheat;\n");
      out.write("            }\n");
      out.write("            main\n");
      out.write("            {\n");
      out.write("                height: 500px;\n");
      out.write("            }\n");
      out.write("            main iframe\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: gray;\n");
      out.write("                height: 500px;\n");
      out.write("            }\n");
      out.write("            footer\n");
      out.write("            {\n");
      out.write("                height: 100px;\n");
      out.write("                background-color: wheat;\n");
      out.write("            }\n");
      out.write("            table td{\n");
      out.write("                background-color: seagreen;\n");
      out.write("                border-radiud: 10px;\n");
      out.write("                padding: 3px;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            table td:hover{\n");
      out.write("                background-color: slategray;\n");
      out.write("                border-radiud: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            table td a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: white;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <span><img src=\"images/Logo.png\" height=\"100\" width=\"100\" alt=\"Logo\" style=\"float:left; border-radius:100px;\"></span>\n");
      out.write("                <span style=\"font-size:30px; font-weight: bold;\">Its a sample project that is useless</span>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"home.jsp\" target=\"ifr\">Home</a></td>\n");
      out.write("                        <td><a href=\"about.html\" target=\"ifr\">About Us</a></td>\n");
      out.write("                        <td><a href=\"login.jsp\" target=\"ifr\">Login</a></td>\n");
      out.write("                        <td><a href=\"register.jsp\" target=\"ifr\">Register</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <iframe name=\"ifr\" src=\"images/Logo.png\">\n");
      out.write("                \n");
      out.write("            </iframe>\n");
      out.write("        </main>\n");
      out.write("        <footer></footer>>\n");
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
