<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>菜品信息</title>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="new"><a href="#" onclick="window.history.go(-1);">返回</a></li>
</ul>
  </div>
</div>
</div>


</div>
   <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    菜品信息
  </div> 

  
<div>
<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
<tr class="odd" >
    <td>菜品序号</td>
    <td>${food.orderNo}</td>
</tr>

<tr class="odd">
    <td>菜品名称</td>
    <td>${food.name}"</td>
</tr>

<tr class="odd">
    <td>菜品类型</td>
    <td>${food.foodType.name}</td>
</tr>

<tr class="odd">
    <td>价格</td>
    <td>${food.price }</td>
</tr>
<tr class="odd">
    <td>图片</td>
    <td >
      <img alt="foodPicture" src="${ctx }/${food.picture}">
    </td>
</tr>	
<tr class="odd">
    <td>描述信息</td>
    <td >${food.des}</td>
</tr>	

	
</table>
</div>
 <textarea rows="" cols=""></textarea>
</div>
 
 
</form>
</body>
</html>

