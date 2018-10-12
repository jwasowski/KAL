package kal.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kal.command.CommandFactory;
import kal.command.IFrontCommand;
import kal.command.UnknownCommand;

@WebServlet("/pages/*")
public class FrontController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5770062453868579286L;
	/**
	 * 
	 */
	@Inject
	private CommandFactory commandFactory;
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IFrontCommand command = getCommand(request);
		command.init(getServletContext(), request, response);
		command.process();
	}

	private IFrontCommand getCommand(HttpServletRequest request) {
		try {
			String commandKey = request.getMethod() + request.getPathInfo();
			return commandFactory.getCommand(commandKey);
		} catch (Exception e) {
			return new UnknownCommand();
		}
	}
	
}
