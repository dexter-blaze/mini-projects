<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<h1>This is the signup page</h1>
    <form:form action="done" modelAttribute="vehicle">
        Car Number:  <form:input path="RegisterationNumber"/>
        <br/>
        <br/>
        Car Name:
        <form:select path="CarName">
                <form:option value="Syros"/>
                <form:option value="Seltos"/>
                <form:option value="Sonet"/>
                <form:option value="Carens Clavis"/>
        </form:select>
        <br/>
        <br/>
        Covered In Warranty:
        <form:select path="CarDetails">
            <form:option value="Yes"/>
            <form:option value="No"/>
        </form:select>
        <br/>
        <br/>
        Any remarks: <form:input path="CarWork"/>
        <br/>
        <br/>
        <input type="Submit"/>
    </form:form>
</html>
