<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%  request.setCharacterEncoding("euc-kr");  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Request Test</title>
</head>
<body>

<h4>Request ó�� �������Դϴ�.</h4>
<table border="1" width="400">
<tr><td>�̸�</td>
       <td><%=request.getParameter("name") %></td></tr>
<tr><td>����</td><td>
       <%=request.getParameter("gender") %>
</td></tr>

<tr><td>���</td><td>
<%
     String[] likes=request.getParameterValues("likes");  
               //�迭�� ó��
     for(int i=0;i<likes.length;i++)  {
%>
    <%=likes[i] %> &nbsp;&nbsp;
<%
    } 
%>
</td></tr> 

<tr><td>����</td><td>
        <%=request.getParameter("job") %>
</td></tr>

<tr><td>���ϼ��ſ���</td>
       <td> <%=request.getParameter("mail_yn") %>
       </td></tr>

<tr><td>�ڱ�Ұ�</td><td>
       <%=request.getParameter("intro") %>
</td></tr>

</body>
</html>