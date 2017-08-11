<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>新增菜品</title>
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
   菜品新增
  </div> 

  
<div>
<div class="eXtremeTable" >

<table id="ec_table" class="tableRegion" width="98%" >
<tr class="odd"> 
    <td>菜品序号</td>
    <td><input type="text" name="orderNo"/></td>
</tr>

<tr class="odd">
    <td>菜品名称</td>
    <td><input type="text" name="name"/></td>
</tr>

<tr class="odd">
    <td>菜品种类</td>
    <td>
    <select name="foodType.id">
      <c:forEach items="${fTypeList }" var="ft">
         <option value="${ft.id}">
            ${ft.name}
         </option>
      </c:forEach>
        
    </select>
    </td>
</tr>

<tr class="odd">
    <td>价格</td>
    <td><input type="text" name="price"/></td>
</tr>

<tr class="odd">
    <td>描述信息</td>
    <td><input type="text" name="des"/></td>
</tr>


<tr class="odd" >
    <td>上传照片</td>
    <td ><input type="text" name="picture"/>
		
    </td>
</tr>

</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

