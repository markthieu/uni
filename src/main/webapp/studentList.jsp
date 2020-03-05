<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.acvt768.uni.domain.Student" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
        <h1>All Students</h1>
        <table>
            
        <%
        List<Student> students = (List<Student>) request.getAttribute("students");
        
        for(Student student : students){
            out.println("<tr><td>" + student + "</td></tr>");
        }
        %>    
            
        </table>
        <jsp:include page="footer.jsp"/>
</html>
