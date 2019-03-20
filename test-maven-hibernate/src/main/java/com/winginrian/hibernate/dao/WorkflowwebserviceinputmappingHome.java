package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowwebserviceinputmapping;

/**
 * Home object for domain model class Workflowwebserviceinputmapping.
 * @see com.winginrian.hibernate.dao.Workflowwebserviceinputmapping
 * @author Hibernate Tools
 */
public class WorkflowwebserviceinputmappingHome {

	private static final Log log = LogFactory.getLog(WorkflowwebserviceinputmappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowwebserviceinputmapping transientInstance) {
		log.debug("persisting Workflowwebserviceinputmapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowwebserviceinputmapping instance) {
		log.debug("attaching dirty Workflowwebserviceinputmapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowwebserviceinputmapping instance) {
		log.debug("attaching clean Workflowwebserviceinputmapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowwebserviceinputmapping persistentInstance) {
		log.debug("deleting Workflowwebserviceinputmapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowwebserviceinputmapping merge(Workflowwebserviceinputmapping detachedInstance) {
		log.debug("merging Workflowwebserviceinputmapping instance");
		try {
			Workflowwebserviceinputmapping result = (Workflowwebserviceinputmapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowwebserviceinputmapping findById(java.lang.Integer id) {
		log.debug("getting Workflowwebserviceinputmapping instance with id: " + id);
		try {
			Workflowwebserviceinputmapping instance = (Workflowwebserviceinputmapping) sessionFactory
					.getCurrentSession().get("com.winginrian.hibernate.dao.Workflowwebserviceinputmapping", id);
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

	public List<Workflowwebserviceinputmapping> findByExample(Workflowwebserviceinputmapping instance) {
		log.debug("finding Workflowwebserviceinputmapping instance by example");
		try {
			List<Workflowwebserviceinputmapping> results = (List<Workflowwebserviceinputmapping>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Workflowwebserviceinputmapping")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}