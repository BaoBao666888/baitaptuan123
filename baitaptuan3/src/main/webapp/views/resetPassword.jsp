<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đặt lại mật khẩu</title>
<script>
    function togglePasswordVisibility(fieldId, checkboxId) {
        var field = document.getElementById(fieldId);
        var checkbox = document.getElementById(checkboxId);
        field.type = checkbox.checked ? "text" : "password";
    }
</script>
</head>
<body>
    <div class="container">
        <h2>Đặt lại mật khẩu</h2>
        <form action="resetPassword" method="post">
            <div class="form-group">
                <label for="newPassword">Mật khẩu mới</label>
                <input type="password" id="newPassword" name="newPassword" required>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Xác nhận mật khẩu</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
            </div>
            <div>
                <input type="checkbox" id="showPassword" onclick="togglePasswordVisibility('newPassword', 'showPassword'); togglePasswordVisibility('confirmPassword', 'showPassword')">
                <label for="showPassword">Hiển thị mật khẩu</label>
            </div>
            <c:if test="${not empty mess}">
                <div style="color: green;">${mess}</div> <%-- Thông báo thành công --%>
            </c:if>
            <c:if test="${not empty error}">
                <div style="color: red;">${error}</div> <%-- Thông báo lỗi --%>
            </c:if>
            <button type="submit">Đổi mật khẩu</button>
        </form>
    </div>
</body>
</html>