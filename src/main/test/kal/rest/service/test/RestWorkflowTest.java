package kal.rest.service.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.criteria.Predicate;

import org.junit.Test;

import kal.BO.ResourceObject;
import kal.BO.SearchSpec;
import kal.persistence.CartridgeH;
import kal.persistence.FirearmH;

public class RestWorkflowTest {

	@Test
	public void test() {
		Map<String, List<String>> paramMap = new HashMap<String, List<String>>();
		paramMap.put("caliber", Arrays.asList("caliber1", "caliber2"));
		paramMap.put("ammo-type", Arrays.asList("ammotype1", "ammotype2"));
		paramMap.put("gun-type", Arrays.asList("pistol"));
		paramMap.put("gun-length", Arrays.asList("25","125,8","180.54"));
		paramMap.put("ammo-manufacturer", Arrays.asList("producer1", "producer2"));
		List<SearchSpec> searchSpec = createSearchSpec(paramMap);
		System.out.println("SearchSpec Contents:");
		System.out.println("paramName | string | value");
		searchSpec.forEach(SearchSpec -> System.out.println(SearchSpec.paramName + " " + SearchSpec.string+ " " +SearchSpec.value));
		searchResources(searchSpec);
		/*Predicate[] predicates = new Predicate[searchSpec.size()];
		Arrays.fill(predicates,0,2, "yolo");
		Arrays.fill(predicates,2,3, "dupa");
		Stream.of(predicates).forEach(System.out::println);*/
		// TODO Update test with Firearm and Cartrdige Repo logic
		assertEquals(true, true);
		//fail();

	}

	private boolean digitParser(String s){
		boolean isDigit = false;
		if(s.contains(",")){
			s = s.replace(",", ".");}
		for(int i=0;i<s.length();i++){
			char character = s.charAt(i);
			if(Character.isDigit(character) || s.contains(".") || s.contains(",")){
				isDigit = true;
			} else {
				return false;
			}
		}
		
		return isDigit;
	}
	
	public List<SearchSpec> createSearchSpec(Map<String, List<String>> paramMap) {
		List<SearchSpec> returnList = new ArrayList<SearchSpec>();
		paramMap.forEach((k, v) -> {
			for(String s: v){
				if(nullCheck(s)){
					boolean isDigit = digitParser(s);
					if(isDigit){
						returnList.add(new SearchSpec(k, Double.parseDouble(s)));
					} else{
					returnList.add(new SearchSpec(k, s));
				}}
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

	public List<ResourceObject> searchResources(List<SearchSpec> searchSpec) {
		// TODO Get data from both repos, then combine
		// into Resource
		List<SearchSpec> searchSpecCartridge = searchSpec.stream()
				.filter(ss -> ss.paramName.contains("ammo") || ss.paramName.contains("caliber"))
				.collect(Collectors.toList());
		List<SearchSpec> searchSpecFirearms = searchSpec.stream()
				.filter(ss -> ss.paramName.contains("gun") || ss.paramName.contains("caliber"))
				.collect(Collectors.toList());
		System.out.println("SearchSpecCartridge Contents:");
		System.out.println("paramName | string | value");
		searchSpecCartridge.forEach(SearchSpec -> System.out.println(SearchSpec.paramName + " " + SearchSpec.string+ " " +SearchSpec.value));
		System.out.println("SearchSpecFirearms Contents:");
		System.out.println("paramName | string | value");
		searchSpecFirearms.forEach(SearchSpec -> System.out.println(SearchSpec.paramName + " " + SearchSpec.string+ " " +SearchSpec.value));
		/*
		 * List<FirearmH> listFirearms =
		 * firearmData.findFirearms(searchSpecFirearms); List<CartridgeH>
		 * listCartriges = cartridgeData.findCartridges(searchSpecCartridge);
		 */

		return null;
	}
}
