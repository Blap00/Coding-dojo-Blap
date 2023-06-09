package com.fabianpalma.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fabianpalma.web.models.Roster;
import com.fabianpalma.web.models.Team;


@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Teams() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (request.getParameter("id") == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewTeam.jsp");
		    view.forward(request, response);
		}
		else {
			int index = Integer.parseInt(request.getParameter("id"));
			System.out.println(index);
			session.setAttribute("id", index);
			
			Roster roster = (Roster) session.getAttribute("roster");
			Team t = roster.getTeam(index);
			session.setAttribute("team", t);
			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/TeamInfo.jsp");
		    view.forward(request, response);
		}
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String team = request.getParameter("team");
		session.setAttribute("team", team);
		
		Team t = new Team(team);
		System.out.println(t.getTeam_name());
		
		Roster roster = (Roster) session.getAttribute("roster");
		roster.addteam(t);
		System.out.println("Team added");
		response.sendRedirect("/ListaEquiposI/Home");
	}

}
