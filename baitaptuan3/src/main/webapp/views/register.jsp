<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tạo tài khoản mới</title>
</head>
<body>

	<div class="container">
		<h2>Tạo tài khoản mới</h2>
		<form action="register" method="post">
			<div class="input-group">
				<i class="fas fa-user"></i> <label for="username">Username</label> <input
					type="text" id="username" name="username" placeholder="trungnh"
					required>
			</div>
			<div class="input-group">
				<i class="fas fa-user"></i> <label for="fullname">Họ tên</label> <input
					type="text" id="fullname" name="fullname" placeholder="Họ tên"
					required>
			</div>
			<div class="input-group">
				<i class="fas fa-envelope"></i> <label for="email">Nhập
					Email</label> <input type="email" id="email" name="email"
					placeholder="Nhập Email" required>
			</div>
			<div class="input-group">
				<i class="fas fa-phone"></i> <label for="phone">Số điện
					thoại</label> <input type="text" id="phone" name="phone"
					placeholder="0345897657" required>
			</div>
			<div class="input-group">
				<i class="fas fa-lock"></i> <label for="password">Mật khẩu</label> <input
					type="password" id="password" name="password"
					placeholder="Mật khẩu" required>
			</div>
			<div class="input-group">
				<i class="fas fa-lock"></i> <label for="repassword">Nhập lại
					mật khẩu</label> <input type="password" id="repassword" name="repassword"
					placeholder="Nhập lại mật khẩu" required>
			</div>

			<button type="submit">Tạo tài khoản</button>

		</form>
		<div class="bottom-text">
			Nếu bạn đã có tài khoản? <a href="/baitaptuan3/login">Đăng nhập</a>
		</div>
	</div>

</body>
</html>