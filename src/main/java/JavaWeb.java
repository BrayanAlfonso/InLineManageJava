import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;



public class JavaWeb extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enviar = req.getParameter("enviar");
        switch(enviar){
            case "user":
                req.getRequestDispatcher("indexUser.jsp").forward(req, resp);
            break;
            case "insertUser":
                req.getRequestDispatcher("insertUser.jsp").forward(req, resp);
            break;
            }

    }
    

}