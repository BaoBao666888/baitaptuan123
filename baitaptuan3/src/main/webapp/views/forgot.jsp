<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quên Mật Khẩu</title>
</head>
<body>
	<div class="container">
		<h2>Quên Mật Khẩu</h2>
		<form action="${pageContext.request.contextPath}/forgot" method="post">
			<div class="form-group">
				<label for="email">Email</label>
				<input type="email" id="email" name="email" placeholder="Nhập email của bạn" required>
			</div>
			<button type="submit">Gửi yêu cầu</button>
		</form>
		<div class="bottom-text">
			Bạn đã nhớ mật khẩu? <a href="${pageContext.request.contextPath}/login">Đăng nhập</a>
		</div>
	</div>
</body>
</html>
