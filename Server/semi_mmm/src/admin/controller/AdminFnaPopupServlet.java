package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import fna.model.vo.Fna;

/**
 * Servlet implementation class AdminFnaPopupServlet
 */
@WebServlet(name = "AdminFnaPopup", urlPatterns = { "/adminFnaPopup" })
public class AdminFnaPopupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminFnaPopupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/admin/adminFnaPopup.jsp");
		request.setAttribute("type", type);
		
		if (!type.equals("insert")) {
			int qnaNo = Integer.parseInt(request.getParameter("qnaNo"));
			Fna fna = new AdminService().fnaSelect(qnaNo);
			request.setAttribute("fna", fna);
		}
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
