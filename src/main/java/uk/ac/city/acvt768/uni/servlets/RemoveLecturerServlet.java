

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
import uk.ac.city.acvt768.uni.domain.Lecturer;


@WebServlet("/removeLecturer.html")
public class RemoveLecturerServlet extends HttpServlet {
    
    private UniRepository ur;
    
    @Inject
    public RemoveLecturerServlet(UniRepository ur){
        this.ur = ur;
    }
    
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException{
        
       String staffId  = request.getParameter("staffId");
        ur.removeLecturer(staffId);
        List<Lecturer> lecturers = ur.findAllLecturers();
        
        request.setAttribute("lecturers", lecturers);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher =
                servletContext.getRequestDispatcher("/removedLecturer.jsp");
        requestDispatcher.forward(request, response);
    }
    
    
}
