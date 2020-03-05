
package uk.ac.city.acvt768.uni.servlets;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uk.ac.city.acvt768.uni.dao.UniRepository;

@WebServlet("/moduleCount.html")
public class ModuleCountServlet extends HttpServlet {
    
    private UniRepository ur;
    
    @Inject
    public ModuleCountServlet(UniRepository ur){
        this.ur = ur;
    }
    
    public void doGet(HttpServletRequest request,
             HttpServletResponse response)
            throws IOException, ServletException {
        
        int moduleCount = ur.moduleCount();
        
        request.setAttribute("moduleCount", moduleCount);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher =
                servletContext.getRequestDispatcher("/moduleCount.jsp");
        requestDispatcher.forward(request, response);
    }
    
}
