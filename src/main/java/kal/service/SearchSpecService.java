package kal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import kal.BO.SearchSpec;

@Named("searchSpecService")
@Dependent
public class SearchSpecService {
//TODO Implement search recipe system
	public List<SearchSpec> createSearchSpec(Map<String,String[]> paramMap){
		List<SearchSpec> returnList = new ArrayList<SearchSpec>();
		paramMap.forEach((k,v) -> {
			if(v[0] != null && !v[0].isEmpty() && !v[0].equals("")){
			boolean isNumeric = v[0].chars().allMatch( Character::isDigit );
			if(isNumeric){
				returnList.add(new SearchSpec(Double.parseDouble(v[0]),""));
			} else {
				returnList.add(new SearchSpec(v[0]));
			}
			}
		});
		return returnList;
	}
	 
}
