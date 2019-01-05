package kal.service;

import java.util.List;
import java.util.Map;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import kal.BO.SearchSpec;

@Named("searchSpecService")
@Dependent
public class SearchSpecService {

	public List<SearchSpec> createSearchSpec(Map<String,String> paramMap){
		
		return null;
	}
	 
}
