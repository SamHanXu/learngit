<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>订单新增</title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="view"><a href="#" onclick="formSubmit('tosave','_self');this.blur();">保存</a></li>
	<li id="new"><a href="#" onclick="window.history.go(-1);">返回</a></li>
</ul>
  </div>
</div>
</div>


</div>
   <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    订单新增
  </div> 

  
<div>
<div class="eXtremeTable" >

<table id="ec_table" class="tableRegion" width="98%" >

<tr class="odd"> 
    <td>订单编号</td>
    <td>
    <input type="text" name="id"/>
    </td>
</tr>
<tr class="odd"> 
    <td>订单金额</td>
    <td>
    <input type="text" name="money"/>
    </td>
</tr>
<tr class="odd"> 
    <td>创建时间</td>
    <td>
    <input type="date" name="createTime"/>
    </td>
</tr>
<tr class="odd"> 
    <td>桌号</td>
    <td>
    <select name="tableId">
       <option>请选择桌号</option>
       <c:forEach items="${tableList }" var="t">
         <option>${t.id }</option>
       </c:forEach>
       
    </select>
    </td>
</tr>

</table>
</div>
 
 <div class="eXtremeTable" >

<table id="ec_table" class="tableRegion" width="98%" >

<tr class="odd"> 
    <td>订单编号</td>
    <td>
    <input type="text" name="id"/>
    </td>
</tr>
<tr class="odd"> 
    <td>订单金额</td>
    <td>
    <input type="text" name="money"/>
    </td>
</tr>
<tr class="odd"> 
    <td>创建时间</td>
    <td>
    <input type="date" name="createTime"/>
    </td>
</tr>
<tr class="odd"> 
    <td>桌号</td>
    <td>
    <select name="tableId">
       <option>请选择桌号</option>
       <c:forEach items="${tableList }" var="t">
         <option>${t.id }</option>
       </c:forEach>
       
    </select>
    </td>
</tr>
</table>
</div>
</div>
</form>
</body>
</html>

