/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2024-11-13 07:59:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/demo/jsp-servlet-ecommerce-website-master/jsp-servlet-ecommerce-website-master/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1729162668157L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
 response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/head.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"site-wrap\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"site-blocks-cover\" style=\"background-image: url(static/images/hero_1.jpg);\" data-aos=\"fade\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-start align-items-md-center justify-content-end\">\n");
      out.write("                <div class=\"col-md-5 text-center text-md-left pt-5 pt-md-0\">\n");
      out.write("                    <h1 class=\"mb-2\">Finding Your Perfect Shoes</h1>\n");
      out.write("\n");
      out.write("                    <div class=\"intro-text text-center text-md-left\">\n");
      out.write("                        <p class=\"mb-4\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus at iaculis\n");
      out.write("                            quam. Integer accumsan tincidunt fringilla.\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"shop\" class=\"btn btn-sm btn-primary\">Shop Now</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"site-section site-section-sm site-blocks-1\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4\" data-aos=\"fade-up\" data-aos-delay=\"\">\n");
      out.write("                    <div class=\"icon mr-4 align-self-start\">\n");
      out.write("                        <span class=\"icon-truck\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <h2 class=\"text-uppercase\">Free Shipping</h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus at iaculis quam. Integer\n");
      out.write("                            accumsan tincidunt fringilla.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n");
      out.write("                    <div class=\"icon mr-4 align-self-start\">\n");
      out.write("                        <span class=\"icon-refresh2\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <h2 class=\"text-uppercase\">Free Returns</h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus at iaculis quam. Integer\n");
      out.write("                            accumsan tincidunt fringilla.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6 col-lg-4 d-lg-flex mb-4 mb-lg-0 pl-4\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("                    <div class=\"icon mr-4 align-self-start\">\n");
      out.write("                        <span class=\"icon-help\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <h2 class=\"text-uppercase\">Customer Support</h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus at iaculis quam. Integer\n");
      out.write("                            accumsan tincidunt fringilla.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/collections-section.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/featured-products.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"site-section block-8\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center  mb-5\">\n");
      out.write("                <div class=\"col-md-7 site-section-heading text-center pt-4\">\n");
      out.write("                    <h2>Big Sale!</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("                <div class=\"col-md-12 col-lg-7 mb-5\">\n");
      out.write("                    <a href=\"#\"><img src=\"static/images/blog_1.jpg\" alt=\"Image placeholder\"\n");
      out.write("                                     class=\"img-fluid rounded\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12 col-lg-5 text-center pl-md-5\">\n");
      out.write("                    <h2><a href=\"#\">50% less in all items</a></h2>\n");
      out.write("                    <p class=\"post-meta mb-4\">By <a href=\"#\">Carl Smith</a> <span class=\"block-8-sep\">&bullet;</span>\n");
      out.write("                        September 3, 2018</p>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quisquam iste dolor accusantium facere\n");
      out.write("                        corporis ipsum animi deleniti fugiat. Ex, veniam?</p>\n");
      out.write("                    <p><a href=\"shop\" class=\"btn btn-primary btn-sm\">Shop Now</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/footer.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/scripts.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
