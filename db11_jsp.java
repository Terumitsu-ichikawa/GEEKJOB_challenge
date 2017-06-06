package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class db11_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>更新フォーム</h1>\n");
      out.write("        <form action = \"DB11\" method = \"post\">\n");
      out.write("            userID: <input type = \"number\" name = \"userID\"><br>\n");
      out.write("            名前:    <input type = \"text\" name = \"name\"><br>\n");
      out.write("            電話番号: <input type = \"text\" name = \"tell\" value = \"000-0000-0000\"><br>\n");
      out.write("            年齢:    <input type = \"text\" name = \"age\" ><br>\n");
      out.write("            誕生日:  <input type = \"date\" name = \"birthday\" min = \"0\" max = \"100\" value = \"0\"><br>\n");
      out.write("            所属ID:  <br><input type = \"radio\" name = \"departmentID\" value = \"1\">営業部<br>\n");
      out.write("                    <input type = \"radio\" name = \"departmentID\" value = \"2\">経理部<br>\n");
      out.write("                    <input type = \"radio\" name = \"departmentID\" value = \"3\">ボブ<br>\n");
      out.write("                    <input type = \"radio\" name = \"departmentID\" value = \"4\">レシーブ<br>\n");
      out.write("                    <input type = \"radio\" name = \"departmentID\" value = \"5\">バビブ<br>\n");
      out.write("            勤務地:  <br><input type = \"radio\" name = \"stationID\" value = \"1\">九段下<br>\n");
      out.write("                    <input type = \"radio\" name = \"stationID\" value = \"2\">茅場町<br>\n");
      out.write("                    <input type = \"radio\" name = \"stationID\" value = \"3\">津田沼<br>\n");
      out.write("                    <input type = \"radio\" name = \"stationID\" value = \"4\">西船橋<br>\n");
      out.write("                    <input type = \"radio\" name = \"stationID\" value = \"5\">船橋<br>\n");
      out.write("            <input type = \"submit\" name = \"btnSubmit\" value = \"更新\">\n");
      out.write("        </form>\n");
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
