<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
        <h1>Module Count</h1>

        <p>The University offers
            <%
              
            int moduleCount = (Integer) request.getAttribute("moduleCount");
            out.print(moduleCount + " ");

            %>
            modules.
        </p>
        
        <jsp:include page="footer.jsp"/>
</html>
