package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Workflowactivityschedule;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Workflowactivityschedule.
 * @see com.winginrian.hibernate.dao.Workflowactivityschedule
 * @author Hibernate Tools
 */
public class WorkflowactivityscheduleHome {

	private static final Log log = LogFactory.getLog(WorkflowactivityscheduleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Workflowactivityschedule transientInstance) {
		log.debug("persisting Workflowactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Workflowactivityschedule instance) {
		log.debug("attaching dirty Workflowactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Workflowactivityschedule instance) {
		log.debug("attaching clean Workflowactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Workflowactivityschedule persistentInstance) {
		log.debug("deleting Workflowactivityschedule instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Workflowactivityschedule merge(Workflowactivityschedule detachedInstance) {
		log.debug("merging Workflowactivityschedule instance");
		try {
			Workflowactivityschedule result = (Workflowactivityschedule) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Workflowactivityschedule findById(java.lang.Integer id) {
		log.debug("getting Workflowactivityschedule instance with id: " + id);
		try {
			Workflowactivityschedule instance = (Workflowactivityschedule) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Workflowactivityschedule", id);
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

	public List<Workflowactivityschedule> findByExample(Workflowactivityschedule instance) {
		log.debug("finding Workflowactivityschedule instance by example");
		try {
			List<Workflowactivityschedule> results = (List<Workflowactivityschedule>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Workflowactivityschedule").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
