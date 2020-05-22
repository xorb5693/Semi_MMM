<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
<title>F&A</title>
<style>
</style>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/views/common/header.jsp" />
		<div class="container">
			<h2>F&A</h2>
			<table class="table table-hover">
				<tr>
					<th>번호</th>
					<th>자주묻는 질문</th><th>친절한 답변</th>
				</tr>
				<c:forEach items="${fna }" var="f">
					<tr>
						<td>${f.qnaNo }</td>
						<td>${f.question }</td>	<td>${f.answer }</td>
					</tr>
				</c:forEach>

			</table>
			
		</div>
		
</body>
</html>