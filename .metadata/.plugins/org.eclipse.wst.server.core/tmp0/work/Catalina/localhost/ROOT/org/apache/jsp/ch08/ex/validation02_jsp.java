/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-10-07 06:39:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch08.ex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class validation02_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/4.MiddleProject/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/JSPBook1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1664350272687L));
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tlet pw_passed = true;//통과\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t// 핸들러 함수\r\n");
      out.write("\tfunction checkLogin(){\r\n");
      out.write("\t\t// 아이디\r\n");
      out.write("\t\tlet id = document.loginForm.id.value;\r\n");
      out.write("\t\t// 비밀번호\r\n");
      out.write("\t\tlet passwd = document.loginForm.passwd1.value;\r\n");
      out.write("\t\t// 비밀번호 확인\r\n");
      out.write("\t\tlet passwdConfirm = document.loginForm.passwd2.value;\r\n");
      out.write("\t\tpw_passwd = true; // 통과\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//아이디 입력확인\r\n");
      out.write("\t\tif(id.length == 0){\r\n");
      out.write("\t\t\talert(\"아이디를 입력해주세요\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 비밀번호 입력 체킹\r\n");
      out.write("\t\tif(passwd.length ==0){ // 빈칸\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력해주세요\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{ // 입력되었을시\r\n");
      out.write("\t\t\tif(passwd != passwdConfirm){ // 비밀번호 확인 실패\r\n");
      out.write("\t\t\t\talert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tlet sameChar = 0;\t// 동일 문자 카운트\r\n");
      out.write("\t\tlet sequenceCount1 = 0;\t// 연속성(+) 카운트\r\n");
      out.write("\t\tlet sequenceCount2 = 0; // 연속성(-) 카운트\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(\"passwd : \" + passwd);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(let i =0; i<passwd.length; i++){\r\n");
      out.write("\t\t\tlet char0;\r\n");
      out.write("\t\t\tlet char1;\r\n");
      out.write("\t\t\tlet char2;\r\n");
      out.write("\t\t\tif(i>=2){\r\n");
      out.write("\t\t\t\tchar0 = passwd.charCodeAt(i-2);\r\n");
      out.write("\t\t\t\tchar1 = passwd.charCodeAt(i-1);\r\n");
      out.write("\t\t\t\tchar2 = passwd.charCodeAt(i);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 동일문자 카운트\r\n");
      out.write("\t\t\t\tif((char0==char2)==(char1==char2)){\r\n");
      out.write("\t\t\t\t\tsameChar++;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tsameChar = 0;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tconsole.log(char0 + \" : \" \r\n");
      out.write("\t\t\t\t\t\t+char1 +\" : \"\r\n");
      out.write("\t\t\t\t\t\t+char2 +\" => \" \r\n");
      out.write("\t\t\t\t\t\t+ sameChar );\r\n");
      out.write("\t\t\tconsole.log(\"==============\");\r\n");
      out.write("\t\t\t//연속성(+) 카운트 c  b a\r\n");
      out.write("\t\t\tif(char0-char1==1&&char1-char2==1){\r\n");
      out.write("\t\t\t\tsequenceCount1++;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tsequenceCount1 = 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//연속성(-) 카운트 a b c\r\n");
      out.write("\t\t\tif(char0-char1==-1&&char1-char2==-1){\r\n");
      out.write("\t\t\t\tsequenceCount2++;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tsequenceCount2 = 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tconsole.log(sequenceCount1 + \":\"\r\n");
      out.write("\t\t\t\t\t\t+ sequenceCount2);\r\n");
      out.write("\t\t\tconsole.log(\"----------------\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(sameChar >0){ // 동일 문자 3개가 있으면\r\n");
      out.write("\t\t\t\talert(\"동일 문자 3자 이상 연속 입력할 수 없습니다.\");\r\n");
      out.write("\t\t\t\tpw_passwd = false; // 통과안됨\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(sequenceCount1 >0 || sequenceCount2>0){ // 연속문자가 있으면\r\n");
      out.write("\t\t\t\talert(\"영문, 숫자는 3자이상 연속 입력할 수 없습니다.\");\r\n");
      out.write("\t\t\t\tpw_passwd = false; // 통과안됨\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!pw_passwd){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t} // end for\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"loginForm\" method=\"post\" action=\"validation2_process.jsp\" >\r\n");
      out.write("\t      <p>아이디 : <input type=\"text\" name=\"id\" /></p>\r\n");
      out.write("\t      <p>비밀번호 : <input type=\"text\" name=\"passwd1\" /></p>\r\n");
      out.write("\t      <p>비밀번호 확인 : <input type=\"text\" name=\"passwd2\"/></p>\r\n");
      out.write("\t      <p><input type=\"button\" value=\"전송\" onclick=\"checkLogin()\"/></p>\r\n");
      out.write("   </form>\r\n");
      out.write("</body>\r\n");
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
