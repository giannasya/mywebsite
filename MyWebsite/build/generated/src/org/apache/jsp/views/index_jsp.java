package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.ProductController;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Homepage", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"d-flex flex-column h-100\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            ProductController pc = new ProductController();
            ResultSet rs = pc.get();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Begin page content -->\n");
      out.write("        <main class=\"flex-shrink-0\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <h1 class=\"mt-5\">Sticky footer with fixed navbar</h1>\n");
      out.write("            <p class=\"lead\">Pin a footer to the bottom of the viewport in desktop browsers with this custom HTML and CSS. A fixed navbar has been added with <code class=\"small\">padding-top: 60px;</code> on the <code class=\"small\">main &gt; .container</code>.</p>\n");
      out.write("            <div class=\"row pt-5\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>No.</th>\n");
      out.write("                                <th>Nama Barang</th>\n");
      out.write("                                <th>Jenis Barang</th>\n");
      out.write("                                <th>Stok</th>\n");
      out.write("                                <th>Aksi</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 while(rs.next()) { 
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( rs.getString("id") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("name") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("product_type") );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( rs.getString("stock") );
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-sm btn-info\">Edit</a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-sm btn-danger\">Delete</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/scripts.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
