<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" href="${ctxStatic}/static/css/welcome.css">
<body>
    Message: ${message}
    <script src="${ctxStatic}/static/js/welcome.js"></script>
</body>

</html>
