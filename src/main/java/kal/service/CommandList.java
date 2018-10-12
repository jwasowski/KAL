package kal.service;

import java.util.HashMap;
import java.util.Map;

import kal.command.FrontCommandModel;

/**
 * <h1>Command List class</h1>
 * <p>
 * This class is for the purpose of holding possible commands (Key: "http
 * method"+/+"requested command", value: "command for controller") in a map.
 * </p>
 * 
 * @author J.W¹sowski
 * 
 */
public class CommandList {
	private volatile static CommandList commandList;
	private static Map<String, FrontCommandModel.Type> commandMap = new HashMap<String, FrontCommandModel.Type>();

	public static Map<String, FrontCommandModel.Type> getCommandMap() {
		return commandMap;
	}

	public static void setCommandMap(Map<String, FrontCommandModel.Type> commandMap) {
		CommandList.commandMap = commandMap;
	}

	public static CommandList getCommandList() {
		if (commandList == null) {
			synchronized (CommandList.class) {
				if (commandList == null) {
					commandList = new CommandList();
				}
			}
		}
		return commandList;
	}

	private CommandList() {
	}
}
