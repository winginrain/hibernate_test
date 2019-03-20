package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityinvokingworkflow;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityinvokingworkflow.
 * @see com.winginrian.hibernate.dao.Workflowactivityinvokingworkflow
 * @author Hibernate Tools
 */
public class WorkflowactivityinvokingworkflowHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityinvokingworkflowHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityinvokingworkflow transientInstance) {
		log.debug("persisting Workflowactivityinvokingworkflow instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityinvokingworkflow instance) {
		log.debug("attaching dirty Workflowactivityinvokingworkflow instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityinvokingworkflow instance) {
		log.debug("attaching clean Workflowactivityinvokingworkflow instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityinvokingworkflow persistentInstance) {
		log.debug("deleting Workflowactivityinvokingworkflow instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityinvokingworkflow merge(Workflowactivityinvokingworkflow detachedInstance) {
		log.debug("merging Workflowactivityinvokingworkflow instance");
		try {
			Workflowactivityinvokingworkflow result = (Workflowactivityinvokingworkflow) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityinvokingworkflow findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityinvokingworkflow instance with id: " + id);
		try {
			Workflowactivityinvokingworkflow instance = (Workflowactivityinvokingworkflow) sessionFactory
					.getCurrentSession().get("com.winginrian.hibernate.dao.Workflowactivityinvokingworkflow", id);
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

	public List<Workflowactivityinvokingworkflow> findByExample(Workflowactivityinvokingworkflow instance) {
		log.debug("finding Workflowactivityinvokingworkflow instance by example");
		try {
			List<Workflowactivityinvokingworkflow> results = (List<Workflowactivityinvokingworkflow>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowactivityinvokingworkflow")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
