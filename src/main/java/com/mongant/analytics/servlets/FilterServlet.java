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
import java.util.List;

@WebServlet("/filter")
public class FilterServlet extends HttpServlet {

    private final String URL_PATTERN = "analytic.jsp";

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlResult sqlResult = new SqlResult();
        List<String> parameters = Arrays.asList(req.getParameterValues("position"));
        req.setAttribute("resultList", sqlResult.getResult(parameters));
        RequestDispatcher dispatcher = req.getRequestDispatcher(URL_PATTERN);
        dispatcher.forward(req, resp);
    }
}
