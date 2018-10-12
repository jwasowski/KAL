package kal.command;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IFrontCommand {

	void process() throws ServletException, IOException;

	void init(ServletContext servletContext, HttpServletRequest servletRequest, HttpServletResponse servletResponse);

}