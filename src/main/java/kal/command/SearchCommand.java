package kal.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;

import kal.BO.SearchSpec;
import kal.command.FrontCommandModel;
import kal.persistence.CartridgeH;
import kal.persistence.FirearmH;
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
		int controlValue = checkSearchControlValues();
		Map<String, String[]> paramMap = request.getParameterMap();
		List<SearchSpec> searchData = searchSpecService.createSearchSpec(paramMap);
		switch(controlValue){
		case -1: response.sendError(400, "Bad request, dont try that!"); break;
		case 0: List<FirearmH> firearms =  searchService.findFirearms(searchData);
		request.setAttribute("response", firearms.size());
		break;
		case 1: List<CartridgeH> cartridges = searchService.findCartridges(searchData);
		request.setAttribute("response", cartridges.size());
		break;
		}
		forward("search");
	}
	//TODO Test this method
	private int checkSearchControlValues(){
		if(("0").matches(request.getParameter("gun-control"))){
			return 0;
		} else if(("1").matches(request.getParameter("ammo-control"))){
			return 1;
		}
		return -1;
	}

}
