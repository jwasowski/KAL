package kal.command;

import javax.enterprise.util.AnnotationLiteral;

public class FrontCommandLiteral extends AnnotationLiteral<FrontCommandModel> implements FrontCommandModel  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2297790599363318793L;
	private Type type;
	public FrontCommandLiteral(Type type){
		this.type=type;
	}
	@Override
	public Type value() {
		return type;
	}

}
