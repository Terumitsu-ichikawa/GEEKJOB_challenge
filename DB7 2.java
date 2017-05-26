/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author ichikawaterumitsu
 */
public class DB4 extends HttpServlet {

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
        PrintWriter out = response.getWriter(); 
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/terufoi1","teru","teru2580");
            db_st = db_con.prepareStatement("update user set name='松岡 修造',age=48,birthday='1967-11-06'where userID=1");
            db_st.executeUpdate();
            db_st = db_con.prepareStatement("select * from user");
        
        db_data = db_st.executeQuery();
            while(db_data.next()){
                out.println("ID:"+db_data.getInt("userID")+"<br>");
                out.println("名前:"+db_data.getString("name")+"<br>");
                out.println("電話番号:"+db_data.getString("tell")+"<br>");
                out.println("年齢:"+db_data.getInt("age")+"<br>");
                out.println("誕生日:"+db_data.getString("birthday")+"<br>");
                out.println("所属ID:"+db_data.getInt("departmentID")+"<br>");
                out.println("勤務地"+db_data.getInt("stationID")+"<br>");
            }
        
            db_con.close();
            db_st.close();
            db_data.close();
            
            
        }catch(SQLException e_sql){
            out.println("DB接続次にエラーが発生しました。" + e_sql.toString());
        }catch(Exception c){
            out.println("接続次にエラーが発生しました。" + c.toString());
        }finally{
            if(db_con != null){
                try{
                    db_con.close();
                }catch(Exception e_con){
                    System.out.print(e_con.getMessage());
                }
            }
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
