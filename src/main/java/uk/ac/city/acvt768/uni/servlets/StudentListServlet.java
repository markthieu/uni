
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
import uk.ac.city.acvt768.uni.domain.Student;

@WebServlet ("/studentList.html")
public class StudentListServlet extends HttpServlet{
    
    private UniRepository ur;
            
    @Inject
    public StudentListServlet(UniRepository ur){
        this.ur = ur;
    }
    
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException{
        
        List<Student> students = ur.findAllStudents();
        
        request.setAttribute("students", students);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher =
                servletContext.getRequestDispatcher("/studentList.jsp");
        requestDispatcher.forward(request, response);
    }
}
