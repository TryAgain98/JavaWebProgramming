/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.servlet;

import com.java.demo.model.News;
import com.java.demo.model.NewsModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
@WebServlet(name = "NewsServlet", urlPatterns = {"/News"})
public class NewServlet extends HttpServlet {

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
            NewsModel model = new NewsModel();
            
            int totalPage = 0;
            int recordPerPage = 2;//số bản mỗi trang
            int currPage = 1;//hiện tại đang ở trang nào
            int count = model.countNews();//tổng số trang
            String paramPage = request.getParameter("page");//hiện tại đang ở trang nào
            if (paramPage != null) {
                currPage = Integer.parseInt(paramPage);
            }
            
            
            if(count%2!=0){
            totalPage = (int) Math.floor(count / recordPerPage) + 1;}
            else{
               totalPage = (int) Math.floor(count / recordPerPage); 
            }
            List<News> news = model.showNews(recordPerPage, recordPerPage * (currPage - 1));
            boolean check=false;
           if(request.getParameter("title")!=null){
               news=model.search(request.getParameter("title"));
               check=true;
             
           }
            request.setAttribute("news", news);
            request.setAttribute("check", check);
            request.setAttribute("total", totalPage);
            request.setAttribute("curr", currPage);
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            
        } catch(Exception e) {
            e.printStackTrace();
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