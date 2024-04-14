<%--
  Created by IntelliJ IDEA.
  User: hwan
  Date: 2024-03-18
  Time: 오후 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시글 목록화면</title>
</head>
<body>
<table  align="center">
    <tr>
        <td align="right">
            total :

        </td>
    </tr>
    <tr>
        <td>
            <table id="boardTable" border = "1">
                <tr>
                    <td width="100" align="center">
                        예약일
                    </td>
                    <td width="100" align="center">
                        고객명
                    </td>
                    <td width="70" align="center">
                        상품
                    </td>
                    <td width="70" align="center">
                        성별
                    </td>
                </tr>
                <c:forEach items="${memberList}" var="member">
                    <tr>
                        <td>${member.makeDt}</td>
                        <td>${member.memberName}</td>
                        <td>${member.productName}</td>
                        <td>${member.memberSex}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>
</body>
</html>

