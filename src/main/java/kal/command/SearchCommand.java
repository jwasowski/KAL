package kal.command;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;

import kal.command.FrontCommandModel;
import kal.service.SearchService;
@FrontCommandModel(FrontCommandModel.Type.SEARCH)
public class SearchCommand extends FrontCommand{
	@Inject
	@Named("searchService")
	SearchService searchService;
	@Override
	public void process() throws ServletException, IOException {
		
		forward("search");
	}

}
