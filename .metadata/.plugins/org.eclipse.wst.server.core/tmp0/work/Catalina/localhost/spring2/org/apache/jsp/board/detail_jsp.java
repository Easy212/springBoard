/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.65
 * Generated at: 2023-07-11 02:13:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\tth, td { width: 500px;}\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>상세보기</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>상세보기</h1>\r\n");
      out.write("\t<table align=\"center\" width=\"500\">\r\n");
      out.write("\t\t<tr width=\"500\">\r\n");
      out.write("\t\t\t<td>제목: </td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" readonly=\"readonly\"\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr width=\"500\">\r\n");
      out.write("\t\t\t<td>이름: </td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" readonly=\"readonly\"\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>내용: </td>\r\n");
      out.write("\t\t\t<td> <textarea rows=\"5\" cols=\"50\" readonly=\"readonly\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</textarea> </td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("    <td>첨부파일:</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t<button onclick=\"updateBoard()\">수정</button>\r\n");
      out.write("\t\t\t\t<button onclick=\"deleteBoard()\">삭제</button>\r\n");
      out.write("\t\t\t\t<button onclick=\"location.href='list.do'\">목록</button>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<button onclick=\"writeReply()\">답글쓰기</button>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(\"#downloadFile\").on(\"click\", function (event) {\r\n");
      out.write("\t  event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("\t  var form = $(\"<form>\");\r\n");
      out.write("\t  form.attr(\"method\", \"POST\");\r\n");
      out.write("\t  form.attr(\"action\", \"download.do\");\r\n");
      out.write("\r\n");
      out.write("\t  var fileNameInput = $(\"<input>\");\r\n");
      out.write("\t  fileNameInput.attr(\"type\", \"hidden\");\r\n");
      out.write("\t  fileNameInput.attr(\"name\", \"fileName\");\r\n");
      out.write("\t  fileNameInput.attr(\"value\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.uploadedFile}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\r\n");
      out.write("\t  var originalFilenameInput = $(\"<input>\");\r\n");
      out.write("\t  originalFilenameInput.attr(\"type\", \"hidden\");\r\n");
      out.write("\t  originalFilenameInput.attr(\"name\", \"originalFilename\");\r\n");
      out.write("\t  originalFilenameInput.attr(\"value\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.originalFilename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\r\n");
      out.write("\t  form.append(fileNameInput);\r\n");
      out.write("\t  form.append(originalFilenameInput);\r\n");
      out.write("\t  $(\"body\").append(form);\r\n");
      out.write("\r\n");
      out.write("\t  form.submit();\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction updateBoard() {\r\n");
      out.write("\t    const form = document.createElement('form');\r\n");
      out.write("\t    form.method = 'POST';\r\n");
      out.write("\t    form.action = 'updateForm.do';\r\n");
      out.write("\t    const input = document.createElement('input');\r\n");
      out.write("\t    input.type = 'hidden';\r\n");
      out.write("\t    input.name = 'seq';\r\n");
      out.write("\t    input.value = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t    form.appendChild(input);\r\n");
      out.write("\t    document.body.appendChild(form);\r\n");
      out.write("\t    form.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction writeReply() {\r\n");
      out.write("\t    const form = document.createElement('form');\r\n");
      out.write("\t    form.method = 'POST';\r\n");
      out.write("\t    form.action = 'writeReply.do';\r\n");
      out.write("\t    const input = document.createElement('input');\r\n");
      out.write("\t    input.type = 'hidden';\r\n");
      out.write("\t    input.name = 'seq';\r\n");
      out.write("\t    input.value = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t    form.appendChild(input);\r\n");
      out.write("\t    document.body.appendChild(form);\r\n");
      out.write("\t    form.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("  \tfunction deleteBoard() {\r\n");
      out.write("\t    var password = prompt(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("\t    if (password) {\r\n");
      out.write("\t        $.ajax({\r\n");
      out.write("\t            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkPassword.do\",\r\n");
      out.write("\t            type: \"POST\",\r\n");
      out.write("\t            data: {\r\n");
      out.write("\t                seq: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t                pass: password\r\n");
      out.write("\t            },\r\n");
      out.write("\t            contentType: \"application/x-www-form-urlencoded; charset=utf-8\",\r\n");
      out.write("\t            success: function (response) {\r\n");
      out.write("\t                if (response === \"success\") {\r\n");
      out.write("\t                    if (confirm(\"정말 삭제하시겠습니까?\")) {\r\n");
      out.write("\t                        $.ajax({\r\n");
      out.write("\t                            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/board/delete.do\",\r\n");
      out.write("\t                            type: \"POST\",\r\n");
      out.write("\t                            data: {\r\n");
      out.write("\t                                seq: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t                            },\r\n");
      out.write("\t                            contentType: \"application/x-www-form-urlencoded; charset=utf-8\",\r\n");
      out.write("\t                            success: function (response) {\r\n");
      out.write("\t                                if (response === \"success\") {\r\n");
      out.write("\t                                    alert(\"게시물이 성공적으로 삭제되었습니다.\");\r\n");
      out.write("\t                                    location.href = \"list.do\";\r\n");
      out.write("\t                                } else {\r\n");
      out.write("\t                                    alert(\"게시물 삭제에 실패했습니다.\");\r\n");
      out.write("\t                                }\r\n");
      out.write("\t                            },\r\n");
      out.write("\t                            error: function (err) {\r\n");
      out.write("\t                                console.log(err);\r\n");
      out.write("\t                            }\r\n");
      out.write("\t                        });\r\n");
      out.write("\t                    }\r\n");
      out.write("\t                } else {\r\n");
      out.write("\t                    alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t                }\r\n");
      out.write("\t            },\r\n");
      out.write("\t            error: function (err) {\r\n");
      out.write("\t                console.log(err);\r\n");
      out.write("\t            }\r\n");
      out.write("\t        });\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("\t</script>\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /board/detail.jsp(35,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty board.uploadedFile}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("           <a href=\"#\" id=\"downloadFile\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.originalFilename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t<span> 파일이 없습니다.</span>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
