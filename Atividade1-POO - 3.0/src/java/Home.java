/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prika
 */
@WebServlet(urlPatterns = {"/home"})
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>HOME</title>");            
            out.println("</head>");
            out.println("<body  bgcolor=\"#E6E6FA\">");
            out.println("<header><center><p>Programação Orientada a Objetos</p></header></center>");
            out.println("<br>");
            out.println("<hr>");
            out.println("<br>");
            out.println("<center><font size=\"50\" color=\"blue\">Primeiro Trabalho</font></center>");
            out.println("<br>");
            out.println("<br>");
                 out.println("<center><main>");
            out.println("<h2>Proposta</h2>");
            out.println("<p>Cálculos para juros <strong> <a href='js'> simples</a> e <a href='jc'>composto</a></strong> </P>");
            out.println("</main></center>");
             out.println("<br>");
            out.println("<br>");
             out.println("<br>");
            out.println("<hr>");
            out.println("<br>");
            out.println("<br>");
            out.println("<p>Integrantes:</p>");
            //out.println("<br>");
            out.println("<ul>");
            out.println("<li>Luciana Machado</li>");
            out.println("<li>Priscila Maioral</li>");
            out.println("<li>Rodrigo Augusto</li>");
            out.println("</ul>");
            out.println("<br>");
       
            out.println("<footer>");
            out.println("<small>Desenvolvido pelo grupo 3 vespertino</small>");
            out.println("</footer>");
            out.println("<br>");
            out.println("</body>");
            out.println("</html>");
            //out.println("");
            // out.println("");
            
            
                    
            //out.println("<h1>Servlet Home at " + request.getContextPath() + "</h1>");
            
           
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
