package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.ProductController;
import java.sql.ResultSet;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            .input-group-append {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/js-datepicker/dist/datepicker.min.css\"> \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"d-flex flex-column h-100\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Begin page content -->\n");
      out.write("        <main class=\"flex-shrink-0\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"mt-5\">Tambah Produk</h1>\n");
      out.write("                <p class=\"lead\">Tambah produk baru pada sistem aplikasi produk</p>\n");
      out.write("                <div class=\"row pt-5\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <form method=\"POST\" action=\"create\">\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"form-label\">Nama Produk</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Masukkan nama produk...\" name=\"name\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"form-label\">Jenis Produk</label>\n");
      out.write("                                <select class=\"form-select\" aria-label=\"Default select example\" name=\"type\" required>\n");
      out.write("                                    <option value=\"1\">Alat Mandi</option>\n");
      out.write("                                    <option value=\"2\">Alat Bersih-bersih</option>\n");
      out.write("                                    <option value=\"3\">Alat Makan</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"form-label\">Harga Produk</label>\n");
      out.write("                                <input type=\"number\" min=\"0\" class=\"form-control\" placeholder=\"Masukkan harga...\" name=\"price\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"form-label\">Stok Produk</label>\n");
      out.write("                                <input type=\"number\" min=\"0\" class=\"form-control\" placeholder=\"Masukkan stok...\" name=\"stock\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"form-label\">Tanggal Expired</label>\n");
      out.write("                                <div class=\"input-group date\" id=\"datepicker\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"date\" name=\"expired\" required />\n");
      out.write("                                    <span class=\"input-group-append\">\n");
      out.write("                                        <span class=\"input-group-text bg-light d-block\">\n");
      out.write("                                            <i class='bx bxs-calendar'></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-small btn-rounded\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/scripts.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/js-datepicker\"></script> \n");
      out.write("        <script>\n");
      out.write("            const picker = datepicker('#date', {\n");
      out.write("                formatter: (input, date, instance) => {\n");
      out.write("                    input.value = date.toLocaleDateString(); // => '1/1/2099'\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("        </script>\n");
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
