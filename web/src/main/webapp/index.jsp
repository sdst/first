<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>  
	
	<script type="text/javascript">
	$(function(){ 
	//alert($("table td").children().length); 
	var length = $("table").children().length;
	
}) 

			
		
	</script>
  </head>
  
 <body>   
<script language="JavaScript" type="text/JavaScript">   
/* 是否全选标记 */   
var checkedAll = false;  
/* 全选/取消全选   
11.* formName 所在form的name值   
12.* checkboxName checkbox的name值   
13.* 注意：所有checkbox的name值都必须一样，这样才能达到全选的效果   
14.*/   
function selectAll(formName,checkboxName){   
	var form = document.all.item(formName);   
	var elements = form.elements[checkboxName];   
	for (var i=0;i<elements.length;i++){    
	var e = elements[i];   
	if(checkedAll){   
		e.checked = false;   
		form.alls.checked = false;   
	} else {   
	e.checked = true;   
	form.alls.checked = true;   
		}   
	}   
	if(checkedAll){   
		checkedAll = false;   
	} else {   
		checkedAll = true;   
	}   
	
}    
/* 检查是否有checkbox被选中   
35.* formName 所在form的name值   
36.* checkboxName checkbox的name值   
37.* 注意：所有checkbox的name值都必须一样，这样才能达到全选的效果   
38.*/   
function checkAll(formName,checkboxName){   
	var hasCheck = false;   
	var form = document.all.item(formName);   
	var elements = form.elements[checkboxName];   
	for (var i=0;i<elements.length;i++){   
		var e = elements[i];   
		if(e.checked){   
		hasCheck = true;   
	}   
}   
return hasCheck;   
}  
/* 执行操作 */   
function do_action(){   
if (!checkAll("formName","no")){   
alert("没有checkbox被选中，提示用户至少选择一个！");   
} else {   
alert("已有checkbox被选中，可以继续后续操作！");   
}   
}   
</script>  
<form action="upLoad.do" method="post" enctype="multipart/form-data">
    	上传文件：<input type="file" name="file"/> <br>
		<input type="submit" value="提交"/>
</form> 
<!--  
<form name="formName" method="get">  
<table id="dataList" width="200" align="center" border="1">  
<tr id="ok">   
<td><input type="checkbox" name="alls" onClick="selectAll('formName','no')" title="全选/取消全选">   
</td>  
<td align="center"> 序号 </td> 
<td align="center"> 学号 </td>   
<td align="center"> 姓名 </td>   
</tr>  
<tr>   
<td><input type="checkbox" name="no" value="001" title="选择/不选择">   
</td> 
<td>1 </td>  
<td> 001 </td>   
<td> 张三 </td>   
</tr>   
<tr>   
<td><input type="checkbox" name="no" value="002" title="选择/不选择">   
</td>   
<td> 2 </td> 
<td> 002 </td>   
<td> 李四 </td>   
</tr>   
</table>   
<p align="center"><input type="button" name="actionButton" value="操作" onClick="do_action()"></p>   
</form>   -->
</body> 

</html>
