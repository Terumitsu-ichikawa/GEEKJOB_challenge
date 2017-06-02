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
public class DB10 extends HttpServlet {

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
              
        request.setCharacterEncoding("UTF-8");
        
        //データベースの接続管理。
        //Connectionクラスの変数。データベースの結果をConnectionで受け取る。
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        
        //フォームから値を受け取るh変数。
        
        int userID = Integer.parseInt(request.getParameter("userID"));
//        String name = request.getParameter("name");
//        String tell = request.getParameter("tell");
//        int age = Integer.parseInt(request.getParameter("age"));
//        String birthday = request.getParameter("birthday");
//        int dID = Integer.parseInt(request.getParameter("departmentID"));
//        int sID = Integer.parseInt(request.getParameter("stationID"));
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/terufoi1","teru","teru2580");
            db_st = db_con.prepareStatement("delete from user where userID = ?");
            
            
            
            db_st.setInt(1,userID);
//            db_st.setString(2,name);
//            db_st.setString(3,tell);
//            db_st.setInt(4,age);
//            db_st.setString(5,birthday);
//            db_st.setInt(6,dID);
//            db_st.setInt(7,sID);
            db_st.executeUpdate();
           
           
            db_st = db_con.prepareStatement("select * from user");
            
            //mysqlから受け取ったa値をexecuteQueryで実行。
            db_data = db_st.executeQuery();
            
            while(db_data.next()){
                out.println("ID:"+db_data.getInt("userID"));
                out.println("名前:"+db_data.getString("name"));
                out.println("電話番号:"+db_data.getString("tell"));
                out.println("年齢:"+db_data.getInt("age"));
                out.println("誕生日:"+db_data.getString("birthday"));
                out.println("所属ID:"+db_data.getInt("departmentID"));
                out.println("勤務地:"+db_data.getInt("stationID")+"<br>");
            }
            
            db_con.close();
            db_st.close();
            db_data.close();
            
        }catch(SQLException e_sql){
            out.println("DB接続次にエラーが発生しました。"+e_sql.toString());
        }catch(Exception e){
            out.println("接続次にエラーが発生しました。"+e.toString());
        }finally{
            if(db_con != null){
                try{
                db_con.close();
                }catch(Exception fe){
                    out.println("最終兵器発動"+fe.getMessage());
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
