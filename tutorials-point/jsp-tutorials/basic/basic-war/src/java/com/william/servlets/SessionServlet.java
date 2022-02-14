package com.william.servlets;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author william
 */
@WebServlet(name = "SessionServlet", urlPatterns = { "/SessionServlet" })
public class SessionServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Data about session
        HttpSession session = request.getSession();
        String sessionId = session.getId();
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessedTime = new Date(session.getLastAccessedTime());
        int maxInactiveInterval = session.getMaxInactiveInterval();

        String title = "Welcome back, Jojo!";
        String numberOfVisitsKey = "numberOfVisits";
        Integer numberOfVisits = 0;
        String userIdKey = "userId";
        String userId = "123-ABC";

        // New session data
        if (session.isNew()) {
            title = "You are new here, right? Be welcomed!";
            session.setAttribute(userIdKey, userId);
            session.setAttribute(numberOfVisitsKey, numberOfVisits);
        }

        Object attr = session.getAttribute(numberOfVisitsKey);
        numberOfVisits = (attr != null ? Integer.parseInt(attr.toString()) : 0);
        numberOfVisits++;
        userId = (String) session.getAttribute(userIdKey);
        session.setAttribute(numberOfVisitsKey, numberOfVisits);

        // Output
        StringBuilder output = new StringBuilder();
        output.append("<p> Id: ").append(sessionId).append("</p>");
        output.append("<p> Title: ").append(title).append("</p>");
        output.append("<p> User Id: ").append(userId).append("</p>");
        output.append("<p> Number of Visits: ").append(numberOfVisits).append("</p>");
        output.append("<p> Creation Time: ").append(creationTime).append("</p>");
        output.append("<p> Last Accessed Time: ").append(lastAccessedTime).append("</p>");
        output.append("<p> Max Inactive Interval: ").append(maxInactiveInterval).append("</p>");

        request.setAttribute("sessionInfo", output);
        request.getRequestDispatcher("session-servlet.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
