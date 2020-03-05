package uk.ac.city.acvt768.uni.servlets;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uk.ac.city.acvt768.uni.dao.UniRepository;
import uk.ac.city.acvt768.uni.domain.Module;

@WebServlet("/addModule.html")
public class AddModuleServlet extends HttpServlet {
    
    private UniRepository ur;
    
    @Inject
    public AddModuleServlet(UniRepository ur){
        this.ur = ur;
    }
    
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        
        String moduleCode = request.getParameter("moduleCode");
        String title = request.getParameter("title");
        int credit = Integer.parseInt(request.getParameter("credit"));
        String staffId = request.getParameter("staffId");
        ur.addModule(moduleCode, title, credit, staffId);
        response.sendRedirect("addModule.html");
        
    }
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        
        List<Module> modules = ur.findAllModules();
        
        request.setAttribute("modules", modules);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/addedModule.jsp");
        requestDispatcher.forward(request, response);
        
    }
        
}
