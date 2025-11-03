<%@ page import="java.util.HashMap" %>
<html>
<h1>Registration done successfully</h1>
<a href=<%="/support?id="+request.getParameter("id")%>>Contact support</a>
<br>
<%--<% HashMap <String, Object> attendent = (HashMap <String, Object>) request.getAttribute("attendent"); %>--%>
<a href="<%= "/attendent/" + request.getParameter("id") %>">Attendant</a>
</html>