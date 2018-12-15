package kal.hibernate;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {
	@PersistenceContext(unitName="kal")
	private EntityManager em;
	
	@Produces
	@EManager
    public EntityManager getEntityManager() {
        return em;
}
}
