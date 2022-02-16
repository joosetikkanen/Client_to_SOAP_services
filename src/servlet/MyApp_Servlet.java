package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws_client.AppClient;


/**
 * Servlet implementation class Client_Servlet
 */
@WebServlet("/MyApp_Servlet")
public class MyApp_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyApp_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	    
	    doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 // TODO Auto-generated method stub
        // doGet(request, response);
        AppClient client = new AppClient();

        String method = request.getParameter("method").toString();
        String value = request.getParameter("value").toString();
        String value2 = request.getParameter("value2").toString();
        String type = request.getParameter("type").toString();
        PrintWriter out = response.getWriter();
        if(value.equals("") || value2.equals("")){
            out.write("error: Please, provide a value!");  
        }else{
            String result = "";
            if(method.equals("convertNum")) {
                
             result = type + ":" + client.convert2word(value);                
            

            }
            if(method.equals("add")){
                result = "add:" + client.add(value, value2);
            }
            else if(method.equals("sub")){
                result = "sub:" + client.subtract(value, value2);
            }
            else if(method.equals("mul")){
                result = "mul:" + client.multiply(value, value2);
            }
            else if(method.equals("div")){
                result = "div:" + client.divide(value, value2);
            }

            out.write(result);          
        }
                     
        out.flush();
        out.close();
	}

}
