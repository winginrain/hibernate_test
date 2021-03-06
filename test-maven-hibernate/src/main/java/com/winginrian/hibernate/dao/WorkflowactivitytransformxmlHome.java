package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivitytransformxml;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivitytransformxml.
 * @see com.winginrian.hibernate.dao.Workflowactivitytransformxml
 * @author Hibernate Tools
 */
public class WorkflowactivitytransformxmlHome {

	private static final Log log = LogFactory.getLog(WorkflowactivitytransformxmlHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivitytransformxml transientInstance) {
		log.debug("persisting Workflowactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivitytransformxml instance) {
		log.debug("attaching dirty Workflowactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivitytransformxml instance) {
		log.debug("attaching clean Workflowactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivitytransformxml persistentInstance) {
		log.debug("deleting Workflowactivitytransformxml instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivitytransformxml merge(Workflowactivitytransformxml detachedInstance) {
		log.debug("merging Workflowactivitytransformxml instance");
		try {
			Workflowactivitytransformxml result = (Workflowactivitytransformxml) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivitytransformxml findById(java.lang.Integer id) {
		log.debug("getting Workflowactivitytransformxml instance with id: " + id);
		try {
			Workflowactivitytransformxml instance = (Workflowactivitytransformxml) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivitytransformxml", id);
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

	public List<Workflowactivitytransformxml> findByExample(Workflowactivitytransformxml instance) {
		log.debug("finding Workflowactivitytransformxml instance by example");
		try {
			List<Workflowactivitytransformxml> results = (List<Workflowactivitytransformxml>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowactivitytransformxml")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
