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
 * @author ichikawaterumitsu
 */
@WebServlet(urlPatterns = {"/sevlet2_7"})
public class sevlet2_7 extends HttpServlet {
    
    //一つのidを引数として置く。
    
    String getPro(int id){
    
    //三人分のプロフィールをメソッド内に定義しておく。    
           
           String aa=("名前:フレイヤ・ヴィオン "+"生年月日:2052/11/03 "+"出身:ウィンダミア王国");
           
           String bb=("名前:カナメ・バッカニア "+"生年月日:2045/06/08 "+"出身:惑星ディバイド");
           
           String cc=("名前:レイナ・プラウラー "+"生年月日:2052/07/23 "+"出身:東京都");
    
    //switchで返すprofileの文を設置。       
           
           String profile="";
           
    //switch(id){case ~:~;break;}で返すプロフィールのidを振り当てる。
    
    switch (id){
    
        case 154:
            profile=aa;
            break;
        case 168:
            profile=bb;
            break;
        case 147:
            profile=cc;
            break;
    
    }
    
    //switchで選別されたプロフィールを↑のString profile="~";に返す。
    
    return profile;        
            
    }
    
    

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
            out.println("<title>Servlet sevlet2_7</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String x=getPro(154);
            out.println(x);
            
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
