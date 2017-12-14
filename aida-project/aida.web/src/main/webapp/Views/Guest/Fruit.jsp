<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<html>
<head>
	<title>My HTML View</title>
</head>
<body>
<div class="success">
	<h3>foo:"${foo}"</h3>
	<h3>fruit:"${fruit}"</h3>
	<h3>config:"${config}"</h3>
</div>
</body>
</html>