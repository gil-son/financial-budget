<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<JavaBeans> list = (ArrayList<JavaBeans>) request.getAttribute("budgets");

/* Check that the list has been received


for (int i = 0; i < list.size(); i++){
	out.println(list.get(i).getId_budget());
	out.println(list.get(i).getDescription());
	out.println(list.get(i).getCategory());
	out.println(list.get(i).getValue());
	out.println(list.get(i).getStatus());
	out.println(list.get(i).getDate());
 */ 

%>
<!DOCTYPE html>
<html lang="pt-br">
<link rel="icon" href="images/budget02.png" />
<link rel="stylesheet" href="style.css">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous" />
</head>
<meta charset="ISO-8859-1">
<title>Financial Budget</title>
</head>
<body>
	<h1>Financial Budget</h1>
	<a href="new.html" class="button01">New Budget</a>
	<table id = "table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Category</th>
				<th>Value</th>
				<th>Status</th>
				<th>Period</th>
				<th>Options</th>
			</tr>
		</thead>
		<tbody>
			<% for (int i = 0; i < list.size(); i++){ %>
					<tr>
						<td><%= list.get(i).getId_budget() %></td>
						<td><%= list.get(i).getDescription() %></td>
						<td><%= list.get(i).getCategory() %></td>
						<td><%= list.get(i).getValue() %></td>
						<td><%= list.get(i).getStatus() %></td>
						<td><%= list.get(i).getDate() %></td>
						<td><a href="select?id_budget=<%=list.get(i).getId_budget()%>" class="button01">Edit</a></td>
					</tr> 					
				<%} %>
			
		</tbody>
	</table>
</body>
</html>