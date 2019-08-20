package com.mongant.analytics.servlets;

import com.mongant.analytics.dao.SqlResult;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/filter")
public class FilterServlet extends HttpServlet {

    private final String URL_PATTERN = "analytic.jsp";

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlResult sqlResult = new SqlResult();
        String positionParameters[] = req.getParameterValues("position");
        String gender = req.getParameter("gender");
        if(positionParameters != null) {
            req.setAttribute("resultList", sqlResult.getResult(Arrays.asList(req.getParameterValues("position")), gender));
        } else {
            req.setAttribute("resultList", sqlResult.getResult(null, null));
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher(URL_PATTERN);
        dispatcher.forward(req, resp);
    }
}
