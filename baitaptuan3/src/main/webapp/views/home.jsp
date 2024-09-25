<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty sessionScope.user}">
			<!-- Nếu chưa đăng nhập, hiển thị liên kết Đăng nhập/Đăng ký -->
			<ul>
				<li><a href="login">Đăng nhập</a></li>
				<li><a href="register">Đăng ký</a></li>
			</ul>
		</c:when>
		<c:otherwise>
			<!-- Nếu đã đăng nhập, hiển thị liên kết Đăng xuất -->
			<ul>
				<li><a href="logout">Đăng xuất</a></li>
			</ul>
		</c:otherwise>
	</c:choose>

	<h1>Chào mừng đến trang chủ!</h1>
	<!-- Nội dung trang chủ -->
</body>
</html>