/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-25 16:16:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editadminpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/dev_tools/apache-tomcat-8.0.23/webapps/ssm/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1500995551149L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<div class=\"navigation\">当前位置：密码更改&nbsp;>&nbsp;修改登录密码</div>\n");
      out.write("<form id=\"inputForm\" name=\"inputForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/updateadminpassword\" method=\"post\" >\n");
      out.write("\t<div class=\"detail\" style=\"margin-top: 40px;margin-left: 40px;\">\n");
      out.write("\t\t\t<div class=\"itempanel\">\n");
      out.write("\t\t\t\t<div class=\"floatleft title\">请输入原密码：</div>\n");
      out.write("\t\t\t\t<div class=\"floatleft editor\"><input type=\"password\" id=\"oldpassword\" name=\"aldpassword\" placeholder=\"******\" maxlength=\"20\"/></div>\n");
      out.write("\t\t\t\t<div class=\"floatleft message\">请输入一个长度为5-20的字符串</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"itempanel\">\n");
      out.write("\t\t\t\t<div class=\"floatleft title\">请输入新密码：</div>\n");
      out.write("\t\t\t\t<div class=\"floatleft editor\"><input type=\"password\" id=\"password\" name=\"password\" placeholder=\"******\"  maxlength=\"20\"/></div>\n");
      out.write("\t\t\t\t<div class=\"floatleft message\">请输入一个长度为5-20的字符串</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"itempanel\">\n");
      out.write("\t\t\t\t<div class=\"floatleft title\">请再次输入新密码：</div>\n");
      out.write("\t\t\t\t<div class=\"floatleft editor\"><input type=\"password\" id=\"confirmPassword\" name=\"confirmPassword\"  placeholder=\"******\" maxlength=\"20\" /></div>\n");
      out.write("\t\t\t\t<div class=\"floatleft message\">请输入一个长度为5-20的字符串</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t<div class=\"actionbar\">\n");
      out.write("\t\t\t\t<input id=\"submit_btn\" class=\"greenbutton2\"  onclick=\"gotoUrl()\" type=\"button\" value=\"保存\"/>\n");
      out.write("\t\t\t\t<input id=\"cancel_btn\" class=\"greenbutton2\" style=\"margin-left: 29px;\" type=\"button\" value=\"返回\" onclick=\"history.back()\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("<script type=\"text/javascript\">\t\t\n");
      out.write("\t\tfunction gotoUrl(){\n");
      out.write("\t\t\tvar oldpassword1='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("\t\t\tvar oldpassword = md5(document.inputForm.oldpassword.value);\n");
      out.write("\t\t\tvar password = document.inputForm.password.value;\n");
      out.write("\t\t\tvar confirmPassword = document.inputForm.confirmPassword.value;\n");
      out.write("\t\t\tif(oldpassword!=oldpassword1){\n");
      out.write("\t\t\t\talert(\"原密码错误，请重新输入！\");\n");
      out.write("\t\t\t\tdocument.inputForm.username.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}if(password.length==0){\n");
      out.write("\t\t\t\talert(\"新密码不能为空\");\n");
      out.write("\t\t\t\tdocument.inputForm.password.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}if(password.length<5 || password.length>20){\n");
      out.write("\t\t\t\talert(\"密码长度必须为5-20\");\n");
      out.write("\t\t\t\tdocument.inputForm.password.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}if(confirmPassword.length==0){\n");
      out.write("\t\t\t\talert(\"再次输入密码\");\n");
      out.write("\t\t\t\tdocument.inputForm.confirmPassword.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}if(password!=confirmPassword){\n");
      out.write("\t\t\t\talert(\"两次输入的密码不一样！请重新输入\");\n");
      out.write("\t\t\t\tdocument.inputForm.confirmPassword.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t} \n");
      out.write("\t\t    var user=document.getElementById(\"inputForm\");\n");
      out.write("\t\t    user.submit();\n");
      out.write("\t\t}\n");
      out.write("</script>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/user/editadminpassword.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/user/editadminpassword.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/user/editadminpassword.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
