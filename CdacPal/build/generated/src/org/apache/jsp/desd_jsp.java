package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class desd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>CDacPal</title>\n");
      out.write("\n");
      out.write("  <!-- mobile responsive meta -->\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("  \n");
      out.write("  <!-- ** Plugins Needed for the Project ** -->\n");
      out.write("  <!-- Bootstrap -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/bootstrap/bootstrap.min.css\">\n");
      out.write("  <!-- slick slider -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/slick/slick.css\">\n");
      out.write("  <!-- themefy-icon -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/themify-icons/themify-icons.css\">\n");
      out.write("  <!-- animation css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/animate/animate.css\">\n");
      out.write("  <!-- aos -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/aos/aos.css\">\n");
      out.write("  <!-- venobox popup -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/venobox/venobox.css\">\n");
      out.write("\n");
      out.write("  <!-- Main Stylesheet -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("  \n");
      out.write("  <!--Favicon-->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload = \"myFunction()\">\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <p id = \"courseid\">1</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- navbar -->\n");
      out.write("  <div class=\"navigation w-100\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-light p-0\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>\n");
      out.write("        <button class=\"navbar-toggler rounded-0\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\"\n");
      out.write("          aria-controls=\"navigation\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navigation\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto text-center\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"index_after_login.jsp\">Home</a>\n");
      out.write("            </li>\n");
      out.write("          \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<!-- /header -->\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"signupModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("        <div class=\"modal-content rounded-0 border-0 p-4\">\n");
      out.write("            <div class=\"modal-header border-0\">\n");
      out.write("                <h3>Register</h3>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"login\">\n");
      out.write("                    <form action=\"#\" class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"text\" class=\"form-control mb-3\" id=\"signupPhone\" name=\"signupPhone\" placeholder=\"Phone\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"text\" class=\"form-control mb-3\" id=\"signupName\" name=\"signupName\" placeholder=\"Name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"email\" class=\"form-control mb-3\" id=\"signupEmail\" name=\"signupEmail\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"password\" class=\"form-control mb-3\" id=\"signupPassword\" name=\"signupPassword\" placeholder=\"Password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">SIGN UP</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("        <div class=\"modal-content rounded-0 border-0 p-4\">\n");
      out.write("            <div class=\"modal-header border-0\">\n");
      out.write("                <h3>Login</h3>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form action=\"#\" class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <input type=\"text\" class=\"form-control mb-3\" id=\"loginPhone\" name=\"loginPhone\" placeholder=\"Phone\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <input type=\"text\" class=\"form-control mb-3\" id=\"loginName\" name=\"loginName\" placeholder=\"Name\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <input type=\"password\" class=\"form-control mb-3\" id=\"loginPassword\" name=\"loginPassword\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">LOGIN</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- page title -->\n");
      out.write("<section class=\"page-title-section overlay\" data-background=\"images/backgrounds/page-title.jpg\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-8\">\n");
      out.write("        <ul class=\"list-inline custom-breadcrumb\">\n");
      out.write("          <li class=\"list-inline-item\"><a class=\"h2 text-primary font-secondary\" href=\"@@page-link\">PG-DESD</a></li>\n");
      out.write("          <li class=\"list-inline-item text-white h3 font-secondary @@nasted\"></li>\n");
      out.write("        </ul>\n");
      out.write("        <p class=\"text-lighten\">Realizing the growth of embedded systems in day-to-day life and the need for trained manpower in this promising area, C-DAC has launched a Diploma in Embedded Systems Design (DESD) for Engineers in computers, electronics and IT. Embedded Systems is a unique field, where engineers need to have sound knowledge in hardware and software design. Keeping this aspect in view, C-DAC has designed the diploma giving equal emphasis to hardware and software, enabling engineers to face challenges in the design and development of state of the art embedded systems. The latest curriculum includes a module on wireless embedded systems design, specifically focusing on wireless technologies and Wireless Sensor Networks  (WSN).</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<section>\n");
      out.write("    <div> \n");
      out.write("         \n");
      out.write("          <br></br> <br></br>\n");
      out.write("    \n");
      out.write("    <table align = \"center\"\n");
      out.write("            id=\"table\" border=\"2\" cellspacing=\"2\" cellpadding=\"7\"> \n");
      out.write("    </table> \n");
      out.write("    </div>     \n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- /page title -->\n");
      out.write("\n");
      out.write("<!-- teachers -->\n");
      out.write("<section class=\"section\">\n");
      out.write("  <div data-ref=\"mixitup-target\" class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-12\">\n");
      out.write("        <!-- teacher category list -->\n");
      out.write("        <ul class=\"list-inline text-center filter-controls mb-5\">\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("</section>\n");
      out.write("<!-- /teachers -->\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer>\n");
      out.write(" \n");
      out.write("   <!-- footer content -->\n");
      out.write("  <div class=\"footer bg-footer section border-bottom\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-8 col-sm-8 mb-10 mb-lg-0\">\n");
      out.write("          <!-- logo -->\n");
      out.write("          <a class=\"logo-footer\" href=\"index.html\"><img class=\"img-fluid mb-4\" src=\"images/logo.png\" alt=\"logo\"></a>\n");
      out.write("          <ul class=\"list-unstyled\">\n");
      out.write("            <li class=\"mb-2\">Plot No. 6 & 7, Hardware Park,Sy No. 1/1</li>\n");
      out.write("            <li class=\"mb-2\">Srisailam Highway</li>\n");
      out.write("            <li class=\"mb-2\">Hyderabad</li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("                <!-- links -->\n");
      out.write("        <div class=\"col-lg-2 col-md-3 col-sm-4 col-6 mb-5 mb-md-0\">\n");
      out.write("          <h4 class=\"text-white mb-10\">LINKS</h4>\n");
      out.write("          <ul class=\"list-unstyled\">\n");
      out.write("            <li class=\"mb-3\"><a class=\"text-color\" href=\"seeAll.html\">CDAC Courses</a></li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</footer>\n");
      out.write("<!-- /footer -->\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("<script src=\"plugins/jQuery/jquery.min.js\"></script>\n");
      out.write("<!-- Bootstrap JS -->\n");
      out.write("<script src=\"plugins/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("<!-- slick slider -->\n");
      out.write("<script src=\"plugins/slick/slick.min.js\"></script>\n");
      out.write("<!-- aos -->\n");
      out.write("<script src=\"plugins/aos/aos.js\"></script>\n");
      out.write("<!-- venobox popup -->\n");
      out.write("<script src=\"plugins/venobox/venobox.min.js\"></script>\n");
      out.write("<!-- mixitup filter -->\n");
      out.write("<script src=\"plugins/mixitup/mixitup.min.js\"></script>\n");
      out.write("<!-- google map -->\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCcABaamniA6OL5YvYSpB3pFMNrXwXnLwU&libraries=places\"></script>\n");
      out.write("<script src=\"plugins/google-map/gmap.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Main Script -->\n");
      out.write("<script src=\"js/script.js\"></script>\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("   function myFunction() {   \n");
      out.write("       \n");
      out.write("       var courseid = document.getElementById(\"\");\n");
      out.write("            \n");
      out.write("                console.log('hii')\n");
      out.write("                 var output ;\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"get\",\n");
      out.write("                    url: 'http://localhost:8083/cdacpal/getcoursematerial?courseid=4',\n");
      out.write("                    \n");
      out.write("                    success: function (response) {\n");
      out.write("                        console.log(response);\n");
      out.write("                        //var data = JSON.parse(response);\n");
      out.write("                        \n");
      out.write("//                        document.getElementById(\"para\").innerHTML = \"Click on the button to create \" \n");
      out.write("//                                                            +   \"the table from the JSON data.<br><br>\" \n");
      out.write("//                                                                    + JSON.stringify(response[0]) + \"<br>\"  \n");
      out.write("//                                                                    + JSON.stringify(response[1]) + \"<br>\" \n");
      out.write("//                                                                    + JSON.stringify(response[2]);+ \"<br>\"\n");
      out.write("//                                                                    + JSON.stringify(response[2]);\n");
      out.write("//                                      \n");
      out.write("                                                    selector= document.getElementById(\"table\"); \n");
      out.write("              \n");
      out.write("                                                         // Getting the all column names \n");
      out.write("                                                          var cols = Headers(response, selector);   \n");
      out.write("   \n");
      out.write("                                                        // Traversing the JSON data \n");
      out.write("                                                        console.log(\"Response\",response)\n");
      out.write("                                             for (var i = 0; i < response.length; i++) { \n");
      out.write("                                              var row = $('<tr/>');    \n");
      out.write("                                               for (var colIndex = 0; colIndex < cols.length; colIndex++) \n");
      out.write("                                               { \n");
      out.write("                                                    var val = response[i][cols[colIndex]];\n");
      out.write("                                                        if(colIndex == 3)\n");
      out.write("                                                        {   \n");
      out.write("                                                            console.log(\"out\", val)\n");
      out.write("                                                            val = '<a href='+val+'>'+val+'</a>'\n");
      out.write("                                                        }\n");
      out.write("                                                    // If there is any key, which is matching \n");
      out.write("                                                    // with the column name \n");
      out.write("                                                    if (val == null) val = \"\";   \n");
      out.write("                                                     row.append($('<td/>').html(val)); \n");
      out.write("                                                     \n");
      out.write("                                                    \n");
      out.write("                                                     \n");
      out.write("                                                     } \n");
      out.write("                  \n");
      out.write("                                                             // Adding each row to the table \n");
      out.write("                                                         $(selector).append(row); \n");
      out.write("                                                }\n");
      out.write("////                                              \n");
      out.write("                                             \n");
      out.write("        \n");
      out.write("                                        function Headers(response, selector) { \n");
      out.write("                                                    var columns = []; \n");
      out.write("                                                    var header = $('<tr/>'); \n");
      out.write("              \n");
      out.write("                                                    for (var i = 0; i < response.length; i++) { \n");
      out.write("                                                                        var row = response[i]; \n");
      out.write("                  \n");
      out.write("                                                        for (var k in row) { \n");
      out.write("                                                        if ($.inArray(k, columns) == -1) { \n");
      out.write("                                                                columns.push(k); \n");
      out.write("                          \n");
      out.write("                                                                    // Creating the header \n");
      out.write("                                                             header.append($('<th/>').html(k)); \n");
      out.write("                                                            } \n");
      out.write("                                                        } \n");
      out.write("                                                     } \n");
      out.write("              \n");
      out.write("                                                        // Appending the header to the table \n");
      out.write("                                                    $(selector).append(header); \n");
      out.write("                                                    return columns; \n");
      out.write("                                                    }        \n");
      out.write("                            }\n");
      out.write("                        \n");
      out.write("                       });\n");
      out.write("                 }  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("</body>\n");
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
