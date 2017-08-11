<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>餐桌更新</title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="view"><a href="#" onclick="formSubmit('update','_self');this.blur();">更新</a></li>
	<li id="new"><a href="#" onclick="window.history.go(-1);">返回</a></li>
</ul>
  </div>
</div>
</div>


</div>
   <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    餐桌更新
  </div> 

  
<div>
<div class="eXtremeTable" >

<table id="ec_table" class="tableRegion" width="98%" >
<tr hidden="hidden">
  <td>
    <input type="text" name="id" value="${table.id }">
  </td>
</tr>

<tr class="odd"> 
    <td>餐桌编号</td>
    <td>
    <input type="text" name="name" value="${table.id }" readonly="readonly"/>
    </td>
</tr>
<tr>
   <td>餐桌状态</td>
   <td>
     <input type="radio" name="state" value="1" <c:if test="${table.state==1 }">checked="checked"</c:if>/>启用
     <input type="radio" name="state" value="0" <c:if test="${table.state==0 }">checked="checked"</c:if>/>停用
   </td>
</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

