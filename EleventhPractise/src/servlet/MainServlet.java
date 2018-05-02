package servlet;

import businesslogic.MainAction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainServlet", urlPatterns = "/MainServlet.do")
public class MainServlet extends javax.servlet.http.HttpServlet {

    private MainAction mainAction = new MainAction();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String function = request.getParameter("function");
        double value = Double.parseDouble(request.getParameter("var"));
        String param = request.getParameter("type");
        String point = request.getParameter("precision");

        String result = mainAction.calculate(param,function,value,point);

        request.setAttribute("result",result);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }


}
