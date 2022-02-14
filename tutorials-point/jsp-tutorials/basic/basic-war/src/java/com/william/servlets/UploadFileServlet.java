package com.william.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author william
 */

@MultipartConfig
@WebServlet(name = "UploadFileServlet", urlPatterns = { "/UploadFileServlet" })
public class UploadFileServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contentType = request.getContentType();

        StringBuilder output = new StringBuilder();
        if (contentType != null && contentType.contains("multipart/form-data")) {

            List<Part> parts = (List) request.getParts();
            parts.forEach(part -> {
                // deal with part content: insert into data base, upload on file, etc...

                output.append("<div class=\"file-info\">");
                output.append("<p> Submitted File Name: ").append(part.getSubmittedFileName()).append("</p>");
                output.append("<p> Size (kb): ").append(part.getSize()).append("</p>");
                output.append("<p> Content Type: ").append(part.getContentType()).append("</p>");
                output.append("</div>");
            });
        } else {
            output.append("<p> Invalid content type! </p>");
        }

        request.setAttribute("uploadedFiles", output);
        request.getRequestDispatcher("upload-file.jsp").forward(request, response);
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
