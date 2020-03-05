<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Find Students Taking Modules</h1>
        
        <form action="studentsByModule.html" method="GET" >
            <label>Enter Module Code: <input type="text" name="moduleCode" /></label>
            <br />
            <input type="submit" value="Find Students" />
        </form>
        
        <jsp:include page="footer.jsp" />
</html>


