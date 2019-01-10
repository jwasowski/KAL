package kal.rest;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import kal.BO.ResourceObject;
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

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchResources(@Context UriInfo ui) {
		Map<String, List<String>> paramMap = ui.getQueryParameters();
		List<SearchSpec> searchSpec = searchSpecService.createSearchSpec(paramMap);
		List<ResourceObject> returnList = searchService.searchResources(searchSpec);
		return Response.ok(returnList).build();
	}
	// TODO Create endpoints for frontend selects to support AJAX calls
}
