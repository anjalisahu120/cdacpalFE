package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\"  defer></script>\n");
      out.write("        <meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"Expires\" content=\"Sat, 01 Dec 2001 00:00:00 GMT\">\n");
      out.write("        <meta name=\"google-signin-scope\" content=\"profile email\">\n");
      out.write("        <meta name=\"google-signin-client_id\"\n");
      out.write("     content=\"536466055968-d0ptk0e0dhjfm06et254e7k5kgejj2t6.apps.googleusercontent.com\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap/bootstrap.min.css\">\n");
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
      out.write(" \n");
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function preventBack() { window.history.forward(); }\n");
      out.write("        setTimeout(\"preventBack()\", 0);\n");
      out.write("        window.onunload = function () { null };\n");
      out.write("    </script>\n");
      out.write("  \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .aParenthai\n");
      out.write("            {\n");
      out.write("                float: left;\n");
      out.write("                clear: none; \n");
      out.write("            }\n");
      out.write("            #d1\n");
      out.write("            {\n");
      out.write("                float:center;\n");
      out.write("                margin-left: 300px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    <script src=\"plugins/jQuery/jquery.min.js\"></script>    \n");
      out.write("       <!-- <div class=\"modal fade\" id=\"signupModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("       <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("        <div class=\"modal-content rounded-0 border-0 p-4\">-->\n");
      out.write("       \n");
      out.write(" <section class=\"page-title-section overlay\" data-background=\"images/backgrounds/page-title.jpg\">\n");
      out.write("          \n");
      out.write("  <div class=\"container\">\n");
      out.write("      \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-8\">\n");
      out.write("        <ul class=\"list-inline custom-breadcrumb\">\n");
      out.write("          &emsp;<li class=\"list-inline-item\"><a class=\"h2 text-primary font-secondary\" href=\"@@page-link\">REGISTER</a></li>\n");
      out.write("          <li class=\"list-inline-item text-white h3 font-secondary @@nasted\"> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href = \"index.jsp\">Skip</a></li>\n");
      out.write("        </ul>      \n");
      out.write("          \n");
      out.write("      <div class=\"modal-header border-0\">\n");
      out.write("                \n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("               <form action=\"#\" class=\"row\"  method =\"post\"  id=\"signup\" name = \"myform\" >\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"text\" class=\"form-control mb-3\" id=\"signupName\" name=\"Name\" placeholder=\"Name\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                  \n");
      out.write("                        \n");
      out.write("                        <select id=\"signupCourse\" name=\"signupCourse\"   required>\n");
      out.write("                                       <option value=\"0\">----Courses----</option>\n");
      out.write("                                        <option value=\"1\">PG-DAC</option>\n");
      out.write("                                        <option value =\"2\">PG-DMC</option>\n");
      out.write("                                        <option value = \"3\">PG-DVLSI</option>\n");
      out.write("                                        <option value = \"4\">PG-DESD</option>\n");
      out.write("                                        <option value = \"5\">PG-DITISS</option>\n");
      out.write("                                        <option value= \"6\">PG-DBIHI</option>\n");
      out.write("                                        <option  value = \"7\">PG-DSSD</option>\n");
      out.write("                                        <option  value = \"8\">PG-DIOT</option>\n");
      out.write("                                        <option  value = \"9\">PG-DBDA</option>\n");
      out.write("                                        <option value =\"10\">PG-HPCSA</option>\n");
      out.write("                                        <option value = \"11\">PG-DASSD</option>\n");
      out.write("                                        <option value= \"12\">PG-DGI</option>\n");
      out.write("                                        <option value =\"13\">PG-DAI</option>\n");
      out.write("                        </select>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"date\"  pattern=\"dd-mm-yyyy\" class=\"form-control mb-3\" id=\"signupDob\" name=\"dob\" placeholder=\"DOB\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("              \n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                          <!-- <input type=\"text\" id=\"theinput\" name=\"theinput\" />-->\n");
      out.write("                        <select name=\"thelist\" id=\"signupGender\" required>\n");
      out.write("                                       <option>----Gender----</option>\n");
      out.write("                                        <option>Male</option>\n");
      out.write("                                        <option>Female</option>\n");
      out.write("                                       <option>Other</option>\n");
      out.write("                        </select>\n");
      out.write("                           <!-- <input type=\"text\" class=\"form-control mb-3\" id=\"signupGender\" name=\"gender\" placeholder=\"Gender\">-->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"email\" class=\"form-control mb-3\" id=\"signupLoginId\" name=\"emailLoginid\" placeholder=\"Email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"col-12\">\n");
      out.write("                            <input type=\"password\" class=\"form-control mb-3\" id=\"signupPassword\" name=\"emailPassword\" placeholder=\"Password\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"col-12\">\n");
      out.write("                            <input type=\"password\" class=\"form-control mb-3\" id=\"signupConpassword\" name=\"emailConpassword\" placeholder=\"confirm-password\" required>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"col-12\">\n");
      out.write("                            <input type=\"tel\" class=\"form-control mb-3\" id=\"signupMobile\" name=\"emailMobile\" placeholder=\"Mobile\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"col-12\">\n");
      out.write("                            <input type=\"text\" class=\"form-control mb-3\" id=\"signupAddress\" name=\"signupAddress\" placeholder=\"Address\" required>\n");
      out.write("                        </div>\n");
      out.write("                                                \n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary\" onclick=\"formValidation()\" id =\"btnsubmit\" >SIGN UP</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>    \n");
      out.write("                      \n");
      out.write("                                   \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("     \n");
      out.write("     \n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<script>\n");
      out.write("    function formValidation()\n");
      out.write("{\n");
      out.write("        //alert(\"hello\");\n");
      out.write("\tvar vname=document.myform.Name.value; \n");
      out.write("\tif (vname==null || vname==\"\")\n");
      out.write("\t{  \n");
      out.write("  \t\talert(\"Name can't be blank\");  \n");
      out.write("  \t\treturn false;  \n");
      out.write("\t} \n");
      out.write("\t\n");
      out.write("password1 = myform.emailPassword.value; \n");
      out.write("if(password1.length<6){  \n");
      out.write("  alert(\"Password must be at least 6 characters long.\");  \n");
      out.write("  return false;  \n");
      out.write("  }  \n");
      out.write("  var x=document.myform.emailLoginid.value;  \n");
      out.write("var atposition=x.indexOf(\"@\");  \n");
      out.write("var dotposition=x.lastIndexOf(\".\");  \n");
      out.write("if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  \n");
      out.write("  alert(\"Please enter a valid e-mail address \");  \n");
      out.write("  return false;  \n");
      out.write("  }  \n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tpassword1 = myform.emailPassword.value; \n");
      out.write("                password2 = myform.emailConpassword.value; \n");
      out.write("  \n");
      out.write("                 if (password1 != password2) { \n");
      out.write("                    alert (\"\\nPassword did not match: Please try again...\") \n");
      out.write("                    return false; \n");
      out.write("                } \n");
      out.write("  \n");
      out.write("\n");
      out.write("if( document.myform.emailMobile.value == \"\" ||\n");
      out.write("isNaN( document.myform.emailMobile.value) ||\n");
      out.write("document.myform.emailMobile.value.length != 10 )\n");
      out.write("{\n");
      out.write("alert( \"Please provide a valid Mobile No \" );\n");
      out.write("document.myform.emailMobile.focus() ;\n");
      out.write("\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("var a = document.myform.signupAddress.value;\n");
      out.write("if(a==\"\")\n");
      out.write("{\n");
      out.write("alert(\"Please Enter Your address\");\n");
      out.write("document.myform.signupAddress.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("     register();            \n");
      out.write("\t    \n");
      out.write("}\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    function register(){\n");
      out.write("                    var name= document.getElementById(\"signupName\").value;\n");
      out.write("                    var course = document.getElementById(\"signupCourse\").value;\n");
      out.write("                    var dob = document.getElementById(\"signupDob\").value;\n");
      out.write("                    var gender = document.getElementById(\"signupGender\").value;\n");
      out.write("                    var loginid = document.getElementById(\"signupLoginId\").value;\n");
      out.write("                    var password = document.getElementById(\"signupPassword\").value;\n");
      out.write("                    var conpassword = document.getElementById(\"signupConpassword\").value;\n");
      out.write("                    var mobile = document.getElementById(\"signupMobile\").value;\n");
      out.write("                    var address = document.getElementById(\"signupAddress\").value;\n");
      out.write("                    var datedob=new Date(dob);\n");
      out.write("                    dob=datedob;\n");
      out.write("    //  console.log(\"value : \"+datedob);\n");
      out.write("\n");
      out.write("\n");
      out.write("    $.ajax({\n");
      out.write("\n");
      out.write("            type:\"GET\",\n");
      out.write("            url:'http://localhost:8083/cdacpal/user/register?name='+name+'&course='+course+'&dob='+dob+'&gender='+gender+'&loginid='+loginid+'&password='+password+'&conpassword='+conpassword+'&address='+address+'&mobile='+mobile,\n");
      out.write("            success:function(responsedata){\n");
      out.write("                if(responsedata.success==0)\n");
      out.write("                {\n");
      out.write("                    alert(responsedata.error);\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    alert(responsedata.error);\n");
      out.write("                    setTimeout(function() {window.location='/CdacPal/index_after_login.jsp',1000});\n");
      out.write("                }\n");
      out.write("                  // alert(\"got response as \"+\"'\"+responsedata+\"'\");\n");
      out.write("\n");
      out.write("            }\n");
      out.write("         })\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("         \n");
      out.write("      </script>   \n");
      out.write("         \n");
      out.write("     \n");
      out.write("     \n");
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
