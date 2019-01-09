package kal.command;

import java.io.IOException;
import java.util.Arrays;
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
public class SearchCommand extends FrontCommand {
	@Inject
	@Named("searchService")
	SearchService searchService;
	@Inject
	@Named("searchSpecService")
	SearchSpecService searchSpecService;

	@Override
	public void process() throws ServletException, IOException {
		String gunControl = request.getParameter("gun-control");
		String ammoControl = request.getParameter("ammo-control");
		Map<String, String[]> paramMap = request.getParameterMap();
		int controlValue = checkSearchControlValues(gunControl,ammoControl);
		if (controlValue == -1) {
			response.sendError(400, "Bad request, dont try that!");
			return;
		} else if (controlValue == 0) {
			List<SearchSpec> searchData = searchSpecService.createGunSearchSpec(paramMap);
			List<FirearmH> firearms = searchService.findFirearms(searchData);
			//TODO generate data as JSON
			request.setAttribute("response", searchData.size());
			request.setAttribute("responseObject", firearms.size());
			forward("search");
			return;
		} else if (controlValue == 1) {
			List<SearchSpec> searchData = searchSpecService.createAmmoSearchSpec(paramMap);
			List<CartridgeH> cartridges = searchService.findCartridges(searchData);
			//TODO generate data as JSON
			request.setAttribute("response", searchData.size());
			request.setAttribute("responseObject", cartridges.size());
			forward("search");
			return;
		}
		forward("search");
		return;
	}

	private int checkSearchControlValues(String gun, String ammo) {
		if (gun != null && !gun.isEmpty() && !gun.equals("") && ("0").equals(gun)) {
			return 0;
		}
		if (ammo != null && !ammo.isEmpty() && !ammo.equals("") && ("1").equals(ammo)) {
			return 1;
		}
		return -1;
	}

}
