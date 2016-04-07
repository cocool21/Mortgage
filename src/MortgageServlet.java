

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MortgageServlet
 */
@WebServlet("/MortgageServlet")
public class MortgageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MortgageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("principal");
		String s2=request.getParameter("rate");
		String s3=request.getParameter("term");
		String message="";
		
		if(s1 == null || s1.trim().isEmpty()){
			message="Please input principal";
		}else if(s2 == null || s2.trim().isEmpty()){
			message="Please input rate";
		}else if(s3 == null || s3.trim().isEmpty()){
			message="Please input years";
		}else{
			try{
			double principal=Double.parseDouble(s1);
			double rate=Double.parseDouble(s2);
			double d=Double.parseDouble(s3);
			
			if(d%1!=0){
				message="Please enter integer for number of years";
			}else{
			int term=Integer.parseInt(s3);
			Calculation c=new Calculation();
			Format f=new Format();
			c.setPrincipal(principal);
			c.setRate(rate);
			c.setTerm(term);
			c.Calculate();
			message="Your monthly payment will be: "+ f.FormatPayment(c.getPayment());}
			}catch(NumberFormatException e){
				message="Please enter numbers only";
			}
		}
		
		
		request.setAttribute("message", message);
		request.getRequestDispatcher("/Mortgage.jsp").forward(request, response);
	}

}
