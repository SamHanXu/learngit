/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-10 02:17:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/pages/home/../base.jsp", Long.valueOf(1502330414153L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" rev=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/skin/default/css/default.css\" media=\"all\"/>\r\n");
      out.write("<link rel=\"stylesheet\" rev=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/skin/default/css/button.css\" media=\"all\"/>\r\n");
      out.write("<link rel=\"stylesheet\" rev=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/skin/default/css/table.css\" media=\"all\"/>\r\n");
      out.write("<script language=\"javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/js/common.js\"></script>");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/components/jquery-ui/jquery-1.2.6.js\"></script>\r\n");
      out.write("<style> \r\n");
      out.write("\t.curbody{ CURSOR: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/shubiao.ani);background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/pic738x571.jpg); }\r\n");
      out.write("\t.msgcontent{ width:218px;overflow:hidden;word-break:break-all;padding:10px;font-size:14px;color:#339966;font-family:Tahoma;line-height:180%; }\r\n");
      out.write("\t.msgcontent p{ text-indent:0px;}\r\n");
      out.write("\t.msgcontent ul( margin:0px;}\r\n");
      out.write("\t.msgbackcontent{ width:218px;overflow:hidden;word-break:break-all;padding:10px;font-size:14px;color:#339966;font-family:Tahoma;line-height:180%; }\r\n");
      out.write("\t.msgbackcontent p{ text-indent:0px;}\r\n");
      out.write("\t.msgbackcontent ul( margin:0px;}\r\n");
      out.write("\tli{ text-indent:0px;margin:0px;list-style:default; }\r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"javascript\"> \r\n");
      out.write("//-- 控制层移动start of script -->\r\n");
      out.write("var Obj='';\r\n");
      out.write("var index=10000;//z-index;\r\n");
      out.write("var color='';\r\n");
      out.write("var str='';\r\n");
      out.write("document.onmouseup=MUp\r\n");
      out.write("document.onmousemove=MMove\r\n");
      out.write(" \r\n");
      out.write("function MMove(){\r\n");
      out.write("\tif(Obj!=''){\r\n");
      out.write("\t\tdocument.all(Obj).style.left=event.x-pX;\r\n");
      out.write("\t\tdocument.all(Obj).style.top=event.y-pY;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function MUp(){\r\n");
      out.write("\tif(Obj!=''){\r\n");
      out.write("\t\tdocument.all(Obj).releaseCapture();\r\n");
      out.write("\t\tObj='';\r\n");
      out.write("\t}\r\n");
      out.write("\tvar srcEle = event.srcElement;\r\n");
      out.write("\t\r\n");
      out.write("\tvar children = srcEle.children;\r\n");
      out.write("\tif(children.length>0){\r\n");
      out.write("\t\tchildren[1].value = \"1\";\t\t//isChange\r\n");
      out.write("\t\tchildren[2].value = event.x-pX;\r\n");
      out.write("\t\tchildren[3].value = event.y-pY;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function MDown(objtd,id){\r\n");
      out.write("\tObj=id\r\n");
      out.write("\tdocument.all(Obj).setCapture()\r\n");
      out.write("\tpX = event.x-document.all(Obj).style.pixelLeft;\r\n");
      out.write("\tpY = event.y-document.all(Obj).style.pixelTop;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("//-- 控制层移动end of script -->\r\n");
      out.write("//获得焦点;\r\n");
      out.write("function getFocus(obj)\r\n");
      out.write("{\r\n");
      out.write("       if(obj.style.zIndex!=index)\r\n");
      out.write("       {\r\n");
      out.write("               index = index + 2;\r\n");
      out.write("               var idx = index;\r\n");
      out.write("               obj.style.zIndex=idx;\r\n");
      out.write("               //obj.nextSibling.style.zIndex=idx-1;\r\n");
      out.write("       }\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("//针对未已阅的、未回复的、工作任务\r\n");
      out.write("function msgrevoke( id ){\r\n");
      out.write("\tif(confirm(\"是否确定要撤销此条信息?\")){\r\n");
      out.write("\t\t//_Submit(\"/home/olmsgRevokeAction.do?flag=revoke&id=\"+id,null,\"撤销\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("//需回复的留言\r\n");
      out.write("function msgback( id ){\r\n");
      out.write("\t//_Submit(\"/home/olmsgUpdateAction.do?flag=back&id=\"+id,null,\"回复\");\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function msgupdate( id , flag ){\r\n");
      out.write("\tif(flag==\"read\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定已阅此条信息?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"accept\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定接受此任务?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"fail\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定此任务未完成?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"success\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定此任务已完成?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"finished\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定完成?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//_Submit(\"/home/olmsgUpdateAction.do?flag=\"+flag+\"&id=\"+id,null,\"修改\");\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function msgdel( id ){\r\n");
      out.write("\tif(confirm(\"是否确定要删除此条信息?\")){\r\n");
      out.write("\t\t//_Submit(\"/home/olmsgDeleteAction.do?delId=\"+id,null,\"删除\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function msgstate( id , flag ){\r\n");
      out.write("\tif(flag==\"read\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定已阅此条信息?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"accept\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定接受此任务?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"fail\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定此任务未完成?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"success\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定此任务已完成?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(flag==\"finished\"){\r\n");
      out.write("\t\tif(!confirm(\"是否确定完成?\")){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//_Submit(\"/home/olmsgStateAction.do?flag=\"+flag+\"&delId=\"+id,null,\"已阅\");\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function changRowColor(obj){\r\n");
      out.write("\t//obj.removeAttribute(\"className\");\r\n");
      out.write("\t//alert(obj.className);\r\n");
      out.write("\t//obj.setAttribute(\"bgcolor\",\"#FFECB0\");\r\n");
      out.write("\t//obj.sytle.backgroundColor = \"#FFECB0\";\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function removeOverRowColor(obj){\r\n");
      out.write("\t//alert(obj.getAttribute(\"style\"));\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("function killErrors() {\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("window.onerror = killErrors;\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("<body class=\"curbody\">\r\n");
      out.write(" \r\n");
      out.write("<form name=\"form2\">\r\n");
      out.write("<!-- 工具栏部分 ToolBar -->\r\n");
      out.write("<div id=\"menubar\">\r\n");
      out.write("<div id=\"middleMenubar\">\r\n");
      out.write("<div id=\"innerMenubar\">\r\n");
      out.write("    <div id=\"navMenubar\">\r\n");
      out.write("<ul>\r\n");
      out.write(" \r\n");
      out.write("<li id=\"new\"><a href=\"#\">新建</a></li>\r\n");
      out.write("<li id=\"save\"><a href=\"#\" title=\"保存留言窗口的位置信息\">位置</a></li>\r\n");
      out.write(" \r\n");
      out.write("<li id=\"stat\"><a href=\"#\">历史</a></li>\r\n");
      out.write(" \r\n");
      out.write("</ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("<logic:notEmpty name=\"olmsgList\">\r\n");
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id='ff8080813d00613e013d0067909e0009' style='position:absolute;left:122px;top:97px;z-index:1001; height:164px;background:none;' onmousedown='getFocus(this)'>\r\n");
      out.write("\t\t\t<table border=0 cellspacing=\"0\" cellpadding=\"0\" width=\"220\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style='cursor:move;' onmousedown=\"MDown(this,'ff8080813d00613e013d0067909e0009')\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/C0FFE51.gif\" height=\"45\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" class=\"input\" value=\"ff8080813d00613e013d0067909e0009\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"isChange\" class=\"input\" value=\"0\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"posX\" class=\"input\" value=\"122\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"posY\" class=\"input\" value=\"97\" />\r\n");
      out.write("\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style='cursor:move;white-space:nowrap;' width='100%' onmousedown=\"MDown('ff8080813d00613e013d0067909e0009')\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/C0FFE52.gif\" >\r\n");
      out.write("\t\t\t\t\t\t<div style=\"float:left;width:130px;padding-left:7px;font-family:Tahoma;color:gray;font-style : oblique;\">\r\n");
      out.write("\t\t\t\t\t\t\t2013-02-22 13:37\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"float:right;width:80px;text-align:right;padding-right:7px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<a style='cursor:pointer;' title=\"编辑\" onclick=\"msgupdate('ff8080813d00613e013d0067909e0009','edit')\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/doc_edit.gif\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<a style='cursor:pointer;' title=\"删除\" onclick=\"msgdel('ff8080813d00613e013d0067909e0009')\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/doc_del.gif\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/C0FFE52.gif\">\r\n");
      out.write("\t\t\t\t\t<div class=\"msgcontent\">\r\n");
      out.write("\t\t\t\t\t欢迎使用杰管理平台\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"tagBPic\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/C0FFE53.gif\" height=\"63\">\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/2.gif\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"text-align:right;padding-right:8px;\" nowrap>\r\n");
      out.write("\t\t\t\t\t\t\t\t[备忘]\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t <!-- [回复] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- [回执] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- [撤销原因] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- state==99[完成] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id='ff8080813d00613e013d00681494000a' style='position:absolute;left:442px;top:91px;z-index:1002; height:164px;background:none;' onmousedown='getFocus(this)'>\r\n");
      out.write("\t\t\t<table border=0 cellspacing=\"0\" cellpadding=\"0\" width=\"220\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style='cursor:move;' onmousedown=\"MDown(this,'ff8080813d00613e013d00681494000a')\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/FFE7E81.gif\" height=\"45\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" class=\"input\" value=\"ff8080813d00613e013d00681494000a\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"isChange\" class=\"input\" value=\"0\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"posX\" class=\"input\" value=\"442\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"posY\" class=\"input\" value=\"91\" />\r\n");
      out.write("\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style='cursor:move;white-space:nowrap;' width='100%' onmousedown=\"MDown('ff8080813d00613e013d00681494000a')\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/FFE7E82.gif\" >\r\n");
      out.write("\t\t\t\t\t\t<div style=\"float:left;width:130px;padding-left:7px;font-family:Tahoma;color:gray;font-style : oblique;\">\r\n");
      out.write("\t\t\t\t\t\t\t2013-02-22 13:37\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"float:right;width:80px;text-align:right;padding-right:7px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<a style='cursor:pointer;' title=\"编辑\" onclick=\"msgupdate('ff8080813d00613e013d00681494000a','edit')\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/doc_edit.gif\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<a style='cursor:pointer;' title=\"删除\" onclick=\"msgdel('ff8080813d00613e013d00681494000a')\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/doc_del.gif\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/FFE7E82.gif\">\r\n");
      out.write("\t\t\t\t\t<div class=\"msgcontent\">\r\n");
      out.write("\t\t\t\t\t本系统实现货运企业日常管理<br />\r\n");
      out.write("包括合同、报运、装箱、委托、发票等业务\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"tagBPic\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/FFE7E83.gif\" height=\"63\">\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"50\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticfile/images/olmsg/0.gif\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"text-align:right;padding-right:8px;\" nowrap>\r\n");
      out.write("\t\t\t\t\t\t\t\t[备忘]\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t <!-- [回复] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- [回执] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- [撤销原因] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- state==99[完成] -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</logic:notEmpty>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
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
    // /WEB-INF/pages/home/../base.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/pages/home/../base.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/home/../base.jsp(3,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
