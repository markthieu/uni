<%-- 
    Document   : index
    Created on : 15-Mar-2018, 19:10:54
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
        <h1>Links</h1>
        <p><a href="studentList.html">All Students </a></p>
        <p><a href="moduleCount.html">Module Count </a></p>
        <p><a href="studentsByModule.jsp">Find Students Taking Module </a></p>
        <p><a href="addModule.jsp"> Add Module </a></p>
        <p><a href="removeLecturer.jsp"> Remove Lecturer </a></p>
        <jsp:include page="footer.jsp"/>
</html>
 