<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
        <h1>Add Module</h1>
        
        <form action="addModule.html" method="POST">
            
            <label>Module Code: <input type="text" name="moduleCode" /></label><br />
            <label>Title: <input type="text" name="title" /></label><br />
            <label>Credit: <input type="text" name="credit" /></label><br />
            <label>Staff Id: <input type="text" name="staffId" /></label><br />
            <input type="submit" value="Add Module"/>
        </form>
        <jsp:include page="footer.jsp"/>
</html>
