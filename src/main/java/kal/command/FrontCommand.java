package kal.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class FrontCommand implements IFrontCommand {
	protected ServletContext context;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
 
    public void init(
      ServletContext servletContext,
      HttpServletRequest servletRequest,
      HttpServletResponse servletResponse) {
        this.context = servletContext;
        this.request = servletRequest;
        this.response = servletResponse;
    }
 
    /* (non-Javadoc)
	 * @see kal.command.IFrontCommand#process()
	 */
    @Override
	public abstract void process() throws ServletException, IOException;
 
    protected void forward(String target) throws ServletException, IOException {
        target = String.format("/jsp/%s.jsp", target);
        RequestDispatcher dispatcher = context.getRequestDispatcher(target);
        dispatcher.forward(request, response);
    }
}
