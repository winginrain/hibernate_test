package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityjsp;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityjsp.
 * @see com.winginrian.hibernate.dao.Workflowactivityjsp
 * @author Hibernate Tools
 */
public class WorkflowactivityjspHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityjspHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityjsp transientInstance) {
		log.debug("persisting Workflowactivityjsp instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityjsp instance) {
		log.debug("attaching dirty Workflowactivityjsp instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityjsp instance) {
		log.debug("attaching clean Workflowactivityjsp instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityjsp persistentInstance) {
		log.debug("deleting Workflowactivityjsp instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityjsp merge(Workflowactivityjsp detachedInstance) {
		log.debug("merging Workflowactivityjsp instance");
		try {
			Workflowactivityjsp result = (Workflowactivityjsp) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityjsp findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityjsp instance with id: " + id);
		try {
			Workflowactivityjsp instance = (Workflowactivityjsp) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityjsp", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Workflowactivityjsp> findByExample(Workflowactivityjsp instance) {
		log.debug("finding Workflowactivityjsp instance by example");
		try {
			List<Workflowactivityjsp> results = (List<Workflowactivityjsp>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivityjsp").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
