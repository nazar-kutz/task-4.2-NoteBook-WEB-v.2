<%@ page import="languages.*" %>
<%@ page import="view.constants.str.*" %>
<%@ page import="controller.checker.CheckPatterns" %>
<%@ page import="view.constants.str.InputStringGlobalConstants" %>
<%@ page import="view.constants.str.UserDataStringGlobalConstants" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.08.2017
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        Language language = CurrentLanguage.language;
    %>
    <title>Input record info</title>
    <link rel="stylesheet" type="text/css" href="InputStyle.css">
</head>
<body>
    <form action="chose language" id="langFormId">
        <select name="lang">
            <option name="ua">UA</option>
            <option name="en">EN</option>
        </select>
        <input type="submit" value="change">
    </form>
    <div align="center">
        <h1><%=language.getString(InputStringGlobalConstants.INPUT_DATA)%></h1>
    </div>
    <hr size="3" width="50%" color="orange">
    <br>
    <form action="user process">
        <table align="center">
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.FIRST_NAME)%></td>
                <td><input type="text" name="first name" size="30" required
                           pattern="(^[a-zA-Z]+(([\'\,\.\- ][a-zA-Z ])?[a-zA-Z]*)*$)|
                           (^[а-яіїьєА-ЯІЄ]+(([\'\,\.\- ][а-яіїьєА-ЯІЄ])?[a-zA-Z]*)*$)"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.LAST_NAME)%></td>
                <td><input type="text" name="last name" size="30" required
                           pattern="(^[a-zA-Z]+(([\'\,\.\- ][a-zA-Z ])?[a-zA-Z]*)*$)|
                           (^[а-яіїьєА-ЯІЄ]+(([\'\,\.\- ][а-яіїьєА-ЯІЄ])?[a-zA-Z]*)*$)"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.PATRONYMIC)%></td>
                <td><input type="text" name="patronymic" size="30" required
                           pattern="(^[a-zA-Z]+(([\'\,\.\- ][a-zA-Z ])?[a-zA-Z]*)*$)|
                           (^[а-яіїьєА-ЯІЄ]+(([\'\,\.\- ][а-яіїьєА-ЯІЄ])?[a-zA-Z]*)*$)"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.NICKNAME)%></td>
                <td><input type="text" name="nickname" size="30" required
                           pattern="^[a-zA-Z][a-zA-z0-9\\.,\\-_]{5,31}$"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.EMAIL)%></td>
                <td><input type="text" name="e-mail" size="30" required
                           pattern="^[a-zA-Z_]+@[a-zA-Z]+\.[a-z]{2,3}$"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.SKYPE)%></td>
                <td><input type="text" name="skype" size="30" required
                           pattern="[a-zA-Z0-9]+"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.HOME_PHONE)%></td>
                <td><input type="text" name="home phone" size="30"
                           pattern="^(\s*)?(\+)?([- _():=+]?\d[- _():=+]?){10,14}(\s*)?$"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.MOBILE_PHONE)%></td>
                <td><input type="text" name="mobile phone" size="30" required
                           pattern="^(\s*)?(\+)?([- _():=+]?\d[- _():=+]?){10,14}(\s*)?$"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.SPARE_MOBILE_PHONE)%></td>
                <td><input type="text" name="spare phone" size="30"
                           pattern="^(\s*)?(\+)?([- _():=+]?\d[- _():=+]?){10,14}(\s*)?$"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.CITY)%></td>
                <td><input type="text" name="city" size="30" required
                           pattern="([a-zA-Z]+([' -]?[-a-zA-Z]){2,50})|([а-яіїьєА-ЯІЄ]+([-\' ]?[а-яіїьєА-ЯІЄ]){2,50})"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.CITY_INDEX)%></td>
                <td><input type="text" name="city index" size="30" required
                           pattern="[0-9]{5}"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.STREET)%></td>
                <td><input type="text" name="street" size="30" required
                           pattern="([a-zA-Z]+([' -]?[-a-zA-Z]){2,50})|([а-яіїьєА-ЯІЄ]+([-\' ]?[а-яіїьєА-ЯІЄ]){2,50})"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.HOUSE_NUMBER)%></td>
                <td><input type="text" name="house number" size="30" required
                           pattern="[0-9]{1,3}"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.APARTMENT_NUMBER)%></td>
                <td><input type="text" name="flat number" size="30" required
                           pattern="[0-9]{1,3}"></td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.GROUPS)%></td>
                <td>
                    <select name="group" size="1">
                        <option value="friends"><%=language.getString(UserDataStringGlobalConstants.GROUP_FRIENDS)%></option>
                        <option value="relatives"><%=language.getString(UserDataStringGlobalConstants.GROUP_RELATIVES)%></option>
                        <option value="colleagues"><%=language.getString(UserDataStringGlobalConstants.GROUP_COLLEAGUES)%></option>
                        <option value="privates"><%=language.getString(UserDataStringGlobalConstants.GROUP_PRIVATES)%></option>
                        <option value="others" selected><%=language.getString(UserDataStringGlobalConstants.GROUP_OTHERS)%></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><%=language.getString(UserDataStringGlobalConstants.COMMENT)%></td>
                <td><textarea  name="comment" wrap="hard" cols="30" rows="7"></textarea></td>
            </tr>
            <tr>
                <td colspan="2" id="submitId">
                    <input type="submit" value="add">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
