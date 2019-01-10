package kal.rest;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import kal.BO.SearchSpec;
import kal.service.SearchService;
import kal.service.SearchSpecService;

@Path("/search")
@Stateless
public class SearchResources {
	@Inject
	@Named("searchService")
	SearchService searchService;
	@Inject
	@Named("searchSpecService")
	SearchSpecService searchSpecService;

	public Response searchResources(@Context UriInfo ui) {
		Map<String, List<String>> paramMap = ui.getQueryParameters();
		List<SearchSpec> searchSpec = searchSpecService.createSearchSpec(paramMap);
		
		return Response.ok("yolo").build();
	}

	private boolean nullCheck(String value) {
		if (value != null && !value.isEmpty() && !value.equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
