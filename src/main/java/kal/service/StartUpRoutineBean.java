package kal.service;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

import kal.command.FrontCommandModel;


@Singleton
@Startup
@ApplicationScoped
public class StartUpRoutineBean {
	

	@PostConstruct
	private void startup() {
		//List<Config> result = em.createNamedQuery("config.check", Config.class).getResultList();
		Map<String, FrontCommandModel.Type> commandMap = CommandList.getCommandMap();

		commandMap.put("GET/search", FrontCommandModel.Type.SEARCH);
		

		
	}

	@PreDestroy
	private void shutdown() {
		//TODO Some DB logic
	}

}
