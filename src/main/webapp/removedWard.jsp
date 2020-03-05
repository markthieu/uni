<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.sbbc662.clinic.domain.Ward" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <h1>All Patients</h1>

    <table>
        <%
            List<Ward> wards = 
                    (List<Ward>) request.getAttribute("wards");
            for (Ward ward : wards){
                out.println("<tr><td>"+ward+"</td></tr>");
            }
        %>
        
    </table>

    <jsp:include page="footer.jsp" />
</body>
</html>

