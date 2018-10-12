package kal.command;

import java.io.IOException;

import javax.servlet.ServletException;

public class UnknownCommand extends FrontCommand{

	@Override
	public void process() throws ServletException, IOException {
		response.sendError(404, "There is no such page");
	}

}
