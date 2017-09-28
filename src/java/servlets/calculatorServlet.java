
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 718205
 */
public class calculatorServlet extends HttpServlet {

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
            //getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
            
            String fVal=request.getParameter("first");
            String sVal=request.getParameter("second");
            String ops=request.getParameter("operation");
            //request.setAttribute("result", "");
            
            int result=0;
            
            boolean calcPerformed=false;
            
            if(ops!=null){
                if(fVal!=null && sVal!=null && !fVal.equals("")&& !sVal.equals("")){
                      int first=Integer.parseInt(fVal);
                      int second=Integer.parseInt(sVal);
                      char opType=ops.charAt(0);
                      
                      if(opType=='+'){
                      result=first+second;
                      }
                      if(opType=='-'){
                      result=first-second;
                      }
                      if(opType=='*'){
                      result=first*second;
                      }
                      if(opType=='%'){
                      result=first%second;
                      }
                calcPerformed=true;
                }
            }
            request.setAttribute("result",calcPerformed+" "+result);
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);

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
       
    }

   

}
