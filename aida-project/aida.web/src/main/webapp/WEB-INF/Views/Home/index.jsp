<%@ page session="false" pageEncoding="utf-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="myVersion" uri="http://com.aida.web.code.AssetsVersion/el" %>
<html>
<head>
    <script src="<c:url value="/js/hello.js?${myVersion:getVersion()}"></c:url>"></script>
    <link rel="stylesheet" type="text/css" href="<c:url  value="/css/index.css?${myVersion:getVersion()}"/>">
</head>
<body>
<h2>Welcome ,This is Spring boot project!</h2>
</body>
</html>
