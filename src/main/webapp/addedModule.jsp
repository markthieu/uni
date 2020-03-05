<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.acvt768.uni.domain.Module" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
        <h1>All Modules</h1>
        <table>
          <%
        List<Module> modules = (List<Module>) request.getAttribute("modules");
        
        for(Module module : modules){
            out.println("<tr><td>" + module + "</td></tr>");
        }
        %>  
        </table>
        <jsp:include page="footer.jsp"/>
</html>
 