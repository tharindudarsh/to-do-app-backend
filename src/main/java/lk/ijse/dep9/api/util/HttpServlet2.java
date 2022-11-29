package lk.ijse.dep9.api.util;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Date;

@WebServlet(name = "HttpServlet2", value = "/HttpServlet2")
public class HttpServlet2 extends HttpServlet {

    protected void doPatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            if (req.getMethod().equalsIgnoreCase("PATCH")) {
                doPatch(req, resp);
            } else {
                super.service(req, resp);
            }
        } catch (Throwable t) {
            throw new RuntimeException();
        }
    }
    
    


}
