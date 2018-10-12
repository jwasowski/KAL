package kal.command;

import java.io.IOException;

import javax.servlet.ServletException;

import kal.command.FrontCommandModel;
@FrontCommandModel(FrontCommandModel.Type.SEARCH)
public class SearchCommand extends FrontCommand{

	@Override
	public void process() throws ServletException, IOException {
		
		forward("search");
	}

}
