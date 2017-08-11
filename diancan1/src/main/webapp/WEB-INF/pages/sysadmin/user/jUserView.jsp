<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>用户查看</title>
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
    用户查看
  </div> 

  
<div>
<div class="eXtremeTable" >

<table id="ec_table" class="tableRegion" width="98%" >

<tr class="odd"> 
    <td>用户名</td>
    <td> ${user.userName }</td>
    
     <td>用户密码</td>
      <td>${user.password }</td>
</tr>

<tr class="odd">
    <td>真实姓名</td>
    <td>${user.userInfo.name }</td>
     
     <td>性别</td>
   <td>
     
     ${user.userInfo.gender }
   </td>
</tr>

<tr class="odd">
   
    <td>所属部门</td>
    <td>
     ${user.dept.deptName }
    </td>
     <td>上级领导</td>
    <td>
     ${user.userInfo.manager.name }
    </td>
</tr>
<tr class="odd">
   <td>岗位</td>
   <td>
     ${user.userInfo.station }
   </td>
   
    <td>用户等级</td>
    <td>
      ${user.userInfo.userLevel }
    </td>
   
</tr>

<tr class="odd">

    <td>入职日期</td>
   <td>
     <fmt:formatDate value="${user.userInfo.joinDate }" pattern="yyyy-MM-dd"/>
     
   </td>
   
   <td>排序号</td>
   <td>
     ${user.userInfo.orderNo }
   </td>
   
</tr>

<tr class="odd">
  
   <td>薪资</td>
   <td>
      ${user.userInfo.salary }
   </td>
   
    <td>身份证号</td>
    <td>${user.userInfo.cardNo }</td>
</tr>

<tr class="odd">
   <td>生日</td>
   <td>
     <fmt:formatDate value="${user.userInfo.birthday }" pattern="yyyy-MM-dd"/> 
   </td>
   
   <td>电话</td>
   <td>
    ${user.userInfo.telephone }
   </td>

</tr>

<tr class="odd">
   
    <td>状态</td>
    <td>
    ${user.state }
    </td>
    
</tr>
<tr class="odd">
  <td>备注</td>
  <td colspan="3">
    ${user.userInfo.remark }
  </td>
</tr>

</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

