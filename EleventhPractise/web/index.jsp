<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 01.05.2018
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Main Page</title>
  </head>
  <body>
  <form action="MainServlet.do" method="post">
    <select name="function">
      <option value="sin">sin(x)</option>
      <option value="cos">cos(x)</option>
      <option value="tg">tg(x)</option>
      <option value="ctg">ctg(x)</option>
    </select>
    <label>
      Input number:
      <input type="number" name="var">
    </label>
    <label>
      Input precision:
      <input type="number"  name="precision">
    </label>

    <p><input name="type" type="radio" value="Rad">Radian</p>
    <p><input name="type" type="radio" value="Deg">Degree</p>

    <input type="submit" value="Go!">

  </form>
  </body>
</html>
