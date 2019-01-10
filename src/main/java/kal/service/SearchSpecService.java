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

	/** @deprecated Needs to be refactored, possibly wont be used */
	public List<SearchSpec> createGunSearchSpec(Map<String, String[]> paramMap) {
		// TODO Stream map and check keys like select if values are < or > to
		// reduce checks
		List<SearchSpec> returnList = new ArrayList<SearchSpec>();
		if (paramMap.get("gun-name")[0] != null && !paramMap.get("gun-name")[0].isEmpty()
				&& !paramMap.get("gun-name")[0].equals("")) {
			returnList.add(new SearchSpec("gun-name", paramMap.get("gun-name")[0]));
		}
		if (paramMap.get("gun-type")[0] != null && !paramMap.get("gun-type")[0].isEmpty()
				&& !paramMap.get("gun-type")[0].equals("")) {
			returnList.add(new SearchSpec("gun-type", paramMap.get("gun-type")[0]));
		}
		if (paramMap.get("gun-caliber-value")[0] != null && !paramMap.get("gun-caliber-value")[0].isEmpty()
				&& !paramMap.get("gun-caliber-value")[0].equals("")) {
			returnList.add(new SearchSpec("gun-caliber-value", paramMap.get("gun-caliber-value")[0]));

		}
		if (paramMap.get("gun-manufacturer-name")[0] != null && !paramMap.get("gun-manufacturer-name")[0].isEmpty()
				&& !paramMap.get("gun-manufacturer-name")[0].equals("")) {
			returnList.add(new SearchSpec("gun-manufacturer-name", paramMap.get("gun-manufacturer-name")[0]));
		}
		if (paramMap.get("gun-magazine-capacity")[0] != null && !paramMap.get("gun-magazine-capacity")[0].isEmpty()
				&& !paramMap.get("gun-magazine-capacity")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-magazine-capacity")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-magazine-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("gun-magazine-capacity",
							Double.parseDouble(paramMap.get("gun-magazine-capacity")[0]), select));
				}
			}
		}
		if (paramMap.get("gun-muzzle-length")[0] != null && !paramMap.get("gun-muzzle-length")[0].isEmpty()
				&& !paramMap.get("gun-muzzle-length")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-muzzle-length")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-muzzle-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("gun-muzzle-length",
							Double.parseDouble(paramMap.get("gun-muzzle-length")[0]), select));
				}
			}
		}
		if (paramMap.get("gun-weight")[0] != null && !paramMap.get("gun-weight")[0].isEmpty()
				&& !paramMap.get("gun-weight")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-weight")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-weight-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(
							new SearchSpec("gun-weight", Double.parseDouble(paramMap.get("gun-weight")[0]), select));
				}
			}
		}
		if (paramMap.get("gun-bore-axis-offset")[0] != null && !paramMap.get("gun-bore-axis-offset")[0].isEmpty()
				&& !paramMap.get("gun-bore-axis-offset")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-bore-axis-offset")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-bore-axis-offset-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("gun-bore-axis-offset",
							Double.parseDouble(paramMap.get("gun-bore-axis-offset")[0]), select));
				}
			}
		}
		if (paramMap.get("gun-dimension-x")[0] != null && !paramMap.get("gun-dimension-x")[0].isEmpty()
				&& !paramMap.get("gun-dimension-x")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-dimension-x")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-dimension-x-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("gun-dimension-x",
							Double.parseDouble(paramMap.get("gun-dimension-x")[0]), select));
				}
			}
		}
		if (paramMap.get("gun-dimension-y")[0] != null && !paramMap.get("gun-dimension-y")[0].isEmpty()
				&& !paramMap.get("gun-dimension-y")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-dimension-y")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-dimension-y-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("gun-dimension-y",
							Double.parseDouble(paramMap.get("gun-dimension-y")[0]), select));
				}
			}
		}
		if (paramMap.get("gun-dimension-z")[0] != null && !paramMap.get("gun-dimension-z")[0].isEmpty()
				&& !paramMap.get("gun-dimension-z")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-dimension-z")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-dimension-z-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("gun-dimension-z",
							Double.parseDouble(paramMap.get("gun-dimension-z")[0]), select));
				}
			}
		}
		if (paramMap.get("gun-ccwbox")[0] != null && !paramMap.get("gun-ccwbox")[0].isEmpty()
				&& !paramMap.get("gun-ccwbox")[0].equals("")) {
			boolean isNumeric = paramMap.get("gun-ccwbox")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("gun-ccwbox-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(
							new SearchSpec("gun-ccwbox", Double.parseDouble(paramMap.get("gun-ccwbox")[0]), select));
				}
			}
		}
		return returnList;
	}

	/** @deprecated Needs to be refactored, possibly wont be used */
	public List<SearchSpec> createAmmoSearchSpec(Map<String, String[]> paramMap) {
		// TODO Stream map and check keys like select if values are < or > to
		// reduce checks
		List<SearchSpec> returnList = new ArrayList<SearchSpec>();
		if (paramMap.get("ammo-name")[0] != null && !paramMap.get("ammo-name")[0].isEmpty()
				&& !paramMap.get("ammo-name")[0].equals("")) {
			returnList.add(new SearchSpec("ammo-name", paramMap.get("ammo-name")[0]));
		}
		if (paramMap.get("ammo-caliber-value")[0] != null && !paramMap.get("ammo-caliber-value")[0].isEmpty()
				&& !paramMap.get("ammo-caliber-value")[0].equals("")) {
			returnList.add(new SearchSpec("ammo-caliber-value", paramMap.get("ammo-caliber-value")[0]));
		}
		if (paramMap.get("ammo-type-select")[0] != null && !paramMap.get("ammo-type-select")[0].isEmpty()
				&& !paramMap.get("ammo-type-select")[0].equals("")) {
			returnList.add(new SearchSpec("ammo-type-select", paramMap.get("ammo-type-select")[0]));
		}
		if (paramMap.get("ammo-mass-value")[0] != null && !paramMap.get("ammo-mass-value")[0].isEmpty()
				&& !paramMap.get("ammo-mass-value")[0].equals("")) {
			boolean isNumeric = paramMap.get("ammo-mass-value")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("ammo-mass-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("ammo-mass-value",
							Double.parseDouble(paramMap.get("ammo-mass-value")[0]), select));
				}
			}
		}
		if (paramMap.get("ammo-muzzle-velocity-value")[0] != null
				&& !paramMap.get("ammo-muzzle-velocity-value")[0].isEmpty()
				&& !paramMap.get("ammo-muzzle-velocity-value")[0].equals("")) {
			boolean isNumeric = paramMap.get("ammo-muzzle-velocity-value")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("ammo-muzzle-velocity-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("ammo-muzzle-velocity-value",
							Double.parseDouble(paramMap.get("ammo-muzzle-velocity-value")[0]), select));
				}
			}
		}
		if (paramMap.get("ammo-muzzle-energy-value")[0] != null
				&& !paramMap.get("ammo-muzzle-energy-value")[0].isEmpty()
				&& !paramMap.get("ammo-muzzle-energy-value")[0].equals("")) {
			boolean isNumeric = paramMap.get("ammo-muzzle-energy-value")[0].chars().allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("ammo-muzzle-energy-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("ammo-muzzle-energy-value",
							Double.parseDouble(paramMap.get("ammo-muzzle-energy-value")[0]), select));
				}
			}
		}
		if (paramMap.get("ammo-ballistic-coefficient-value")[0] != null
				&& !paramMap.get("ammo-ballistic-coefficient-value")[0].isEmpty()
				&& !paramMap.get("ammo-ballistic-coefficient-value")[0].equals("")) {
			boolean isNumeric = paramMap.get("ammo-ballistic-coefficient-value")[0].chars()
					.allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("ammo-ballistic-coefficient-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("ammo-ballistic-coefficient-value",
							Double.parseDouble(paramMap.get("ammo-ballistic-coefficient-value")[0]), select));
				}
			}
		}
		if (paramMap.get("ammo-muzzle-velocity-per-mm-value")[0] != null
				&& !paramMap.get("ammo-muzzle-velocity-per-mm-value")[0].isEmpty()
				&& !paramMap.get("ammo-muzzle-velocity-per-mm-value")[0].equals("")) {
			boolean isNumeric = paramMap.get("ammo-muzzle-velocity-per-mm-value")[0].chars()
					.allMatch(Character::isDigit);
			if (isNumeric) {
				String select = paramMap.get("ammo-muzzle-velocity-per-mm-select")[0];
				if (nullCheck(select) && select.equals(">") || select.equals("<")) {
					returnList.add(new SearchSpec("ammo-muzzle-velocity-per-mm-value",
							Double.parseDouble(paramMap.get("ammo-muzzle-velocity-per-mm-value")[0]), select));
				}
			}
		}
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
