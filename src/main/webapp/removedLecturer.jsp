<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.acvt768.uni.domain.Lecturer" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
        <h1>All Lecturers</h1>
        
        <table>
            
        <%
        List<Lecturer> lecturers = (List<Lecturer>) request.getAttribute("lecturers");
        
        for(Lecturer lecturer : lecturers){
            out.println("<tr><td>" + lecturer + "</td></tr>");
        }
        %>    
            
        </table>
        
        <jsp:include page="footer.jsp"/>
</html>
