package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivitysetvalue;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivitysetvalue.
 * @see com.winginrian.hibernate.dao.Workflowactivitysetvalue
 * @author Hibernate Tools
 */
public class WorkflowactivitysetvalueHome {

	private static final Log log = LogFactory.getLog(WorkflowactivitysetvalueHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivitysetvalue transientInstance) {
		log.debug("persisting Workflowactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivitysetvalue instance) {
		log.debug("attaching dirty Workflowactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivitysetvalue instance) {
		log.debug("attaching clean Workflowactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivitysetvalue persistentInstance) {
		log.debug("deleting Workflowactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivitysetvalue merge(Workflowactivitysetvalue detachedInstance) {
		log.debug("merging Workflowactivitysetvalue instance");
		try {
			Workflowactivitysetvalue result = (Workflowactivitysetvalue) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivitysetvalue findById(java.lang.Integer id) {
		log.debug("getting Workflowactivitysetvalue instance with id: " + id);
		try {
			Workflowactivitysetvalue instance = (Workflowactivitysetvalue) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivitysetvalue", id);
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

	public List<Workflowactivitysetvalue> findByExample(Workflowactivitysetvalue instance) {
		log.debug("finding Workflowactivitysetvalue instance by example");
		try {
			List<Workflowactivitysetvalue> results = (List<Workflowactivitysetvalue>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivitysetvalue").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
