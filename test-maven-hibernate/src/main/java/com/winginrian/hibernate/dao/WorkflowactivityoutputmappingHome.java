package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityoutputmapping;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityoutputmapping.
 * @see com.winginrian.hibernate.dao.Workflowactivityoutputmapping
 * @author Hibernate Tools
 */
public class WorkflowactivityoutputmappingHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityoutputmappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityoutputmapping transientInstance) {
		log.debug("persisting Workflowactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityoutputmapping instance) {
		log.debug("attaching dirty Workflowactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityoutputmapping instance) {
		log.debug("attaching clean Workflowactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityoutputmapping persistentInstance) {
		log.debug("deleting Workflowactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityoutputmapping merge(Workflowactivityoutputmapping detachedInstance) {
		log.debug("merging Workflowactivityoutputmapping instance");
		try {
			Workflowactivityoutputmapping result = (Workflowactivityoutputmapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityoutputmapping findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityoutputmapping instance with id: " + id);
		try {
			Workflowactivityoutputmapping instance = (Workflowactivityoutputmapping) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityoutputmapping", id);
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

	public List<Workflowactivityoutputmapping> findByExample(Workflowactivityoutputmapping instance) {
		log.debug("finding Workflowactivityoutputmapping instance by example");
		try {
			List<Workflowactivityoutputmapping> results = (List<Workflowactivityoutputmapping>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowactivityoutputmapping")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
