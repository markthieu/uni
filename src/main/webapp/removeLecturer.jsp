<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
        <h1>Remove Lecturer</h1>
        <form action="removeLecturer.html" method="GET">
            <label>Staff Id: <input type="text" name="staffId"/></label>
            <br/>
            <input type="submit" value="Remove Lecturer" />
            
        </form>
        <jsp:include page="footer.jsp"/>
</html>
 