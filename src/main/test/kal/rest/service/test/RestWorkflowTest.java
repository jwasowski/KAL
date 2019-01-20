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
		paramMap.put("caliber", Arrays.asList("caliber1", "9x19","919","5.19 x","5.56","x","x19"));
		paramMap.put("ammo-type", Arrays.asList("ammotype1", "ammotype2"));
		paramMap.put("gun-type", Arrays.asList("pistol"));
		paramMap.put("gun-length", Arrays.asList("25","1 25,8","180.54", ".14 55", ".54", "54.", " 5. 4 "));
		paramMap.put("ammo-manufacturer", Arrays.asList("producer1", "producer2"));
		List<SearchSpec> searchSpec = createSearchSpec(paramMap);
		System.out.println("SearchSpec Contents:");
		System.out.println("paramName | string | value");
		searchSpec.forEach(SearchSpec -> System.out.println(SearchSpec.paramName + " " + SearchSpec.string+ " " +SearchSpec.value));
		searchResources(searchSpec);
		List<String> paramList = new ArrayList<String>();
		for (SearchSpec ss: searchSpec){
			if(!paramList.contains(ss.paramName)){
			paramList.add(ss.paramName);}}
		System.out.println("StringName |");
		paramList.forEach(string -> System.out.println(string));
		// TODO Update test with Resource repo logic
		assertEquals(true, true);
		//fail();

	}

	private boolean digitParser(String s){
		boolean isDigit = false;
		int counter =0;
		char dot = '.';
		for(int i=0;i<s.length();i++){
			char character = s.charAt(i);
			if(Character.isDigit(character) || Character.compare(character, dot ) == 0 && counter<=1) {
				isDigit = true;
				/*if(Character.compare(character, dot ) == 0){*/
					counter++;
				//}
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
					s = s.replace(",", ".");
					s = s.replaceAll("\\s", "");
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
