<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.JavaBeans"%>
<%@page import="java.util.ArrayList"%>
<%
ArrayList<JavaBeans> list = (ArrayList<JavaBeans>) request.getAttribute("contacts");
%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>Agenda de contatos</title>
<link rel="stylesheet" href="style.css">
<link rel="icon" href="imagens/telefone_img.png">
</head>
<body>
	<div class="jspContainer">
		<h1 class="jspTitle">Agenda de Contatos</h1>
		<a class="button1 jspButton" href="new.html">Novo contato</a>
	</div>
	<ul class="contactsTable">
		<li id="tableHeader" class="tableItem">
			<p>Id</p>
			<p>Nome</p>
			<p>Celular</p>
			<p>Email</p>
		</li>
		<%
		for (int i = 0; i < list.size(); i++) {
		%>
		<li class="tableItem">
			<p><%=list.get(i).getIdcon()%></p>
			<p><%=list.get(i).getName()%></p>
			<p><%=list.get(i).getPhone()%></p>
			<p><%=list.get(i).getEmail()%></p>
		</li>
		<%
		}
		%>
	</ul>
</body>
</html>