<html>
<body>
<h2>Hello World!</h2>
<table>
		<c:forEach var="role" items="${roles}">
			<tr>
				<td>
					<c:out value="${role.roleName}"/>
				</td>
				<%-- <td>
					<a href="<c:url value="/delete/${user.id}"/>" >Delete user</a>
				</td> --%>
			</tr>
		</c:forEach>
		<c:if test="${empty roles}">
			no users added yet.
		</c:if>
	</table>
</body>
</html>
