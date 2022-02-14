package com.williamdsw.filters;

import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author william
 */
public class LogFilter implements Filter {

    // HELPER FUNCTIONS

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String testParam = filterConfig.getInitParameter("test-param");
        System.out.println("Test Param: " + testParam);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        Date now = new Date();
        String remoteAddress = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        String localAddress = request.getLocalAddr();
        String localHost = request.getLocalName();

        String info = "%1s - %2s %3s";
        System.out.println(String.format(info, now, remoteAddress, remoteHost));
        System.out.println(String.format(info, now, localAddress, localHost));

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
