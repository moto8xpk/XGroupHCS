<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="" ></a>


		<c:forEach var="role" items="${roles}">
					${role.roleName}
		</c:forEach>
</body>
</html>
