package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processflowobjects;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processflowobjects.
 * @see com.winginrian.hibernate.dao.Processflowobjects
 * @author Hibernate Tools
 */
public class ProcessflowobjectsHome {

	private static final Log log = LogFactory.getLog(ProcessflowobjectsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processflowobjects transientInstance) {
		log.debug("persisting Processflowobjects instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processflowobjects instance) {
		log.debug("attaching dirty Processflowobjects instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processflowobjects instance) {
		log.debug("attaching clean Processflowobjects instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processflowobjects persistentInstance) {
		log.debug("deleting Processflowobjects instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processflowobjects merge(Processflowobjects detachedInstance) {
		log.debug("merging Processflowobjects instance");
		try {
			Processflowobjects result = (Processflowobjects) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processflowobjects findById(java.lang.Integer id) {
		log.debug("getting Processflowobjects instance with id: " + id);
		try {
			Processflowobjects instance = (Processflowobjects) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processflowobjects", id);
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

	public List<Processflowobjects> findByExample(Processflowobjects instance) {
		log.debug("finding Processflowobjects instance by example");
		try {
			List<Processflowobjects> results = (List<Processflowobjects>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processflowobjects").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
