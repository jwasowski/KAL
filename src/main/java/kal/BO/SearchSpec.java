package kal.BO;

public class SearchSpec {
	/** Html form parameter name */
	public String paramName;
	/** Numerical value for searching */
	public double value;
	/** String value for searching */
	public String string;
	/** Repository controller value (more / less) */
	public String controlValue;
	
	public SearchSpec(){
		
	}
	
	public SearchSpec(double value, String controlValue){
		this.value = value;
		this.controlValue = controlValue;
	}
	public SearchSpec(String string){
		this.string = string;
	}
	
}
