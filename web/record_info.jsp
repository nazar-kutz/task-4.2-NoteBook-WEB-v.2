<%@ page import="languages.*" %>
<%@ page import="view.constants.str.UserDataStringGlobalConstants" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.08.2017
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        Language language = CurrentLanguage.language;
    %>
    <title>Show record info</title>
    <link rel="stylesheet" type="text/css" href="InputStyle.css">
</head>
<body>
    <div align="center">
        <h1>${record.getShortName()}</h1>
    </div>
    <hr size="3" width="50%" color="orange">
    <br>
    <table align="center">
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.FIRST_NAME)%></td>
            <td>${record.getFirstName()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.LAST_NAME)%></td>
            <td>${record.getLastName()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.PATRONYMIC)%></td>
            <td>${record.getPatronymic()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.NICKNAME)%></td>
            <td>${record.getNickname()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.EMAIL)%></td>
            <td>${record.getEmail()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.SKYPE)%></td>
            <td>${record.getSkype()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.HOME_PHONE)%></td>
            <td>${record.getHomePhone()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.MOBILE_PHONE)%></td>
            <td>${record.getMobilePhone()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.SPARE_MOBILE_PHONE)%></td>
            <td>${record.getSpareMobilePhone()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.GROUPS)%></td>
            <td>${record.getGroups()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.FULL_ADDRESS)%></td>
            <td>${record.getFullAddress()}</td>
        </tr>
        <tr>
            <td><%=language.getString(UserDataStringGlobalConstants.COMMENT)%></td>
            <td><cite>${record.getComment()}</cite></td>
        </tr>
    </table>
</body>
</html>
