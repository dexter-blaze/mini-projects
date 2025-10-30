<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- defines the namespace (prefix) you’ll use in your JSP page when referring to tags from this library --%>

<html>
    <div>
        <h1>Signup Page</h1>

        <%--action -> place where we process our data--%>
<%--        the form is submitting to registerUser--%>
        <%-- modelAttribute helps in binding that model to the form --%>
        <form:form action="/registerUser" modelAttribute="user">
<%--            path defines what attribute in user you want to bind this input form to--%>
            Name:  <form:input path="name"/>
            <br/>
            <br/>
            Gender:
            <br/>
            <form:radiobutton path="gender" value="male"/>Male
            <form:radiobutton path="gender" value="female"/>Female
            <br/>
            <br/>
            Location:
            <form:select path="location">
                <form:option value="India"/>
                <form:option value="NRI"/>
            </form:select>
            <br/>
            <br/>
            College:
            <form:select path="college">
                <form:option value="HITK"/>
                <form:option value="IISc"/>
                <form:option value="IIT Bombay"/>
            </form:select>
<%--            with this type input tag you are submitting the whole form--%>
            <input type="Submit">

        </form:form>
    </div>
</html>