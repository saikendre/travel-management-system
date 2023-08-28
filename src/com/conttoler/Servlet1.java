package com.conttoler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TravelDao;
import com.model.Travel;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		if (req.getParameter("b1").equalsIgnoreCase("add")) 
		{
			Travel t = new Travel();
			t.setUsername(req.getParameter("username"));
			t.setEmail(req.getParameter("email"));
			t.setPhone(Integer.parseInt(req.getParameter("phone")));
			t.setMessage(req.getParameter("message"));
			if (new TravelDao().insertTravel(t) > 0)
				res.sendRedirect("contact.jsp");
			else
				res.sendRedirect("error.jsp");
		}
	}
}
