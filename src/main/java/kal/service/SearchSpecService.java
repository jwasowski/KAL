package kal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

import kal.BO.SearchSpec;

@Named("searchSpecService")
@Dependent
public class SearchSpecService {
	/**  CUrrently used */
	public List<SearchSpec> createSearchSpec(Map<String, List<String>> paramMap) {
		List<SearchSpec> returnList = new ArrayList<SearchSpec>();
		paramMap.forEach((k, v) -> {
			for(String s: v){
				if(nullCheck(s)){
					returnList.add(new SearchSpec(k, s));
				}
			}
		});
		return returnList;
	}
	
	
	private boolean nullCheck(String value) {
		if (value != null && !value.isEmpty() && !value.equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
