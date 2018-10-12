package kal.command;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import kal.service.CommandList;
@Dependent
public class CommandFactory {
	@Inject
	@Any
	private Instance<IFrontCommand> frontCommand;
	
	public IFrontCommand getCommand(String commandString){
		FrontCommandModel.Type type = CommandList.getCommandMap().get(commandString);
		FrontCommandLiteral literal = new FrontCommandLiteral(type);
		Instance<IFrontCommand> commandInstance = frontCommand.select(literal);
		return commandInstance.get();
	}
}
