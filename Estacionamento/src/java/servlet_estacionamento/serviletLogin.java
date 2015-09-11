
package servlet_estacionamento;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "serviletLogin", urlPatterns = {"/Login"})
public class serviletLogin extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        
        // recebendo valores do formulario
        
         String usuario = request.getParameter("Login");
         String senha = request.getParameter("senha");
         
         // verificando login
         if ( usuario.equals("IGOR") && senha.equals("123456")){
             // criando variavel de link
              RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
             // disparando link
              redirecionar.forward(request, response);
         
         }
         else  if ( usuario.equals("PEDRO") && senha.equals("654321")){
             // criando variavel de link
              RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
             // disparando link
              redirecionar.forward(request, response);
         }else  if ( usuario.equals("JULIO") && senha.equals("654123")){
         // criando variavel de link
              RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
             // disparando link
              redirecionar.forward(request, response);
         }else {
             // criando variavel com mensagen de erro de login
               String falha = " <font color = red> Não foi possível fazer o login </font>";
               // disparando link e enviando mensagem de erro como parametro pela url
               RequestDispatcher redirecionar = request.getRequestDispatcher("login.jsp?mensagem="+falha);
              redirecionar.forward(request, response);
         
         }

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
