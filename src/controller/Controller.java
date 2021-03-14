package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/select" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans jbeans = new JavaBeans();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			budgets(request, response);
		}else if(action.equals("/insert")) {
			newBudget(request, response);
		}else if(action.equals("/select")) {
			listBudget(request, response);
		}else {
			response.sendRedirect("index.html");
		}

		// Connection Test
		// dao.connectionTest();
	}

	// Budget List
	protected void budgets(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Creating an object that will receive JavaBeans data
		ArrayList<JavaBeans> list = dao.listBudgets();
		
		// Send list to file 'financial_budget.jsp'
		request.setAttribute("budgets", list);
		RequestDispatcher rd = request.getRequestDispatcher("financial_budget.jsp");
		rd.forward(request, response);
		
		// test to see if receive a list of budgets
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId_budget());
			System.out.println(list.get(i).getDescription());
			System.out.println(list.get(i).getCategory());
			System.out.println(list.get(i).getValue());
			System.out.println(list.get(i).getStatus());
			System.out.println(list.get(i).getDate());
		}
	}

	// New Budget
	protected void newBudget(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Test of receipt of form data
		System.out.println(request.getParameter("description"));
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("value"));
		System.out.println(request.getParameter("status"));
		
		// Set Variables 
		jbeans.setDescription(request.getParameter("description"));
		jbeans.setCategory(request.getParameter("category"));
		jbeans.setValue(request.getParameter("value"));
		jbeans.setStatus(request.getParameter("status"));
		
		// Invoke the 'insertBudget()' method by passing the contact object
		dao.insertBudget(jbeans);
		
		// Redirect to file 'financial_budget.jsp'. But set 'main'
		response.sendRedirect("main");
	}
	
	// Edit Budget
	protected void listBudget(HttpServletRequest request, HttpServletResponse response) {
		
		// Receipt of the budget id to be edited
		String id_budget = request.getParameter("id_budget");
		// System.out.println(id_budget);
		jbeans.setId_budget(id_budget);
		
	}
	
}
