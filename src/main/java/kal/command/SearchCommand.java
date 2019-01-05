package kal.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;

import kal.command.FrontCommandModel;
import kal.service.SearchService;
import kal.service.SearchSpecService;
@FrontCommandModel(FrontCommandModel.Type.SEARCH)
public class SearchCommand extends FrontCommand{
	@Inject
	@Named("searchService")
	SearchService searchService;
	@Inject
	@Named("searchSpecService")
	SearchSpecService searchSpecService;
	@Override
	public void process() throws ServletException, IOException {
		Map<String, String[]> paramMap = request.getParameterMap();
		
		forward("search");
	}

}
