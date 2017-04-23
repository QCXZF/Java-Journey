<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2入门案例</title>
  </head>
  
  <body>
  	<%-- 在Struts2中,控制器会默认拦截扩展名为.action的请求（以.action为后缀的url）。除此之外，什么都不写也可以 --%>
    <a href="${pageContext.request.contextPath}/hello.action">访问Struts2的第一个入门案例</a><br>
    <a href="${pageContext.request.contextPath}/hello">访问Struts2的第一个入门案例 没有.acion</a>
  </body>
</html>
