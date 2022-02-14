package com.williamdsw.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author William
 */
@WebServlet(name = "InternationalizationServlet", urlPatterns = { "/InternationalizationServlet" })
public class InternationalizationServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Locale locale = request.getLocale();
        String language = locale.getLanguage();
        String displayLanguage = locale.getDisplayLanguage();
        String country = locale.getCountry();
        String displayCountry = locale.getDisplayCountry();
        String ISO3Country = locale.getISO3Country();
        String ISO3Language = locale.getISO3Language();

        Date now = new Date();
        String localDate = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, locale).format(now);

        Double price = 10932.99;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String formattedPrice = currencyFormat.format(price);

        Double percent = 32.56;
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        String formattedPercent = percentFormat.format(percent);

        response.setContentType("text/html");
        response.setHeader("Content-Language", "es");

        // OUTPUT
        request.setAttribute("language", language);
        request.setAttribute("displayLanguage", displayLanguage);
        request.setAttribute("country", country);
        request.setAttribute("displayCountry", displayCountry);
        request.setAttribute("ISO3Country", ISO3Country);
        request.setAttribute("ISO3Language", ISO3Language);
        request.setAttribute("localDate", localDate);
        request.setAttribute("formattedPrice", formattedPrice);
        request.setAttribute("formattedPercent", formattedPercent);
        request.getRequestDispatcher("internationalization.jsp").forward(request, response);
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
