<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<h1>������Ʒ��ҳ��</h1>
<s:form action="product-save.action" method="post" theme="simple">
	<table border="1" width="400">
		<tr>
			<td>��Ʒ����</td>
			<td><s:textfield name="pname"></s:textfield></td>
		</tr>
		<tr>
			<td>��Ʒ�۸�</td>
			<td><s:textfield name="price"></s:textfield></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="���"/></td>
		</tr>
	</table>
</s:form>	
</body>
</html>