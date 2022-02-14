package com.williamdsw.servlet;

import com.williamdsw.models.Product;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author William
 */
@WebServlet(name = "ProductServlet", urlPatterns = { "/ProductServlet" })
public class ProductServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Product product = new Product();
        product.setId(1);
        product.setName("Black Hat");
        product.setDescription("Black Hat");
        product.setPrice(10.99);
        product.setManufacturedDate(Date.valueOf("2020-01-01"));
        product.setExpirationDate(Date.valueOf("2020-06-01"));
        product.setCreatedAt(Timestamp.valueOf("2020-01-01 00:00:00"));
        product.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

        List<Product> products = new ArrayList<>();
        products.add(product);

        request.setAttribute("products", products);
        request.getRequestDispatcher("products.jsp").forward(request, response);
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
