package com.william.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author william
 */
@WebServlet(name = "CookiesHandlingServlet", urlPatterns = { "/CookiesHandlingServlet" })
public class CookiesHandlingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String value = request.getParameter("value");
        String maxAge = request.getParameter("maxAge");
        String comment = request.getParameter("comment");
        String domain = request.getParameter("domain");
        String httpOnly = request.getParameter("httpOnly");
        String path = request.getParameter("path");
        String isSecure = request.getParameter("isSecure");
        String version = request.getParameter("version");

        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(Integer.parseInt(maxAge) * 60);

        if (comment != null && !comment.isEmpty()) {
            cookie.setComment(comment);
        }

        if (domain != null && !domain.isEmpty()) {
            cookie.setDomain(domain);
        }

        if (httpOnly != null) {
            cookie.setHttpOnly(Boolean.valueOf(httpOnly));
        }

        if (path != null && !path.isEmpty()) {
            cookie.setPath(comment);
        }

        if (isSecure != null) {
            cookie.setSecure(Boolean.valueOf(isSecure));
        }

        if (version != null && !version.isEmpty()) {
            cookie.setVersion(Integer.parseInt(version));
        }

        response.addCookie(cookie);
        request.getRequestDispatcher("cookies-handling.jsp").forward(request, response);
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