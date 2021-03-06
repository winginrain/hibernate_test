package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processobjectvariable;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processobjectvariable.
 * @see com.winginrian.hibernate.dao.Processobjectvariable
 * @author Hibernate Tools
 */
public class ProcessobjectvariableHome {

	private static final Log log = LogFactory.getLog(ProcessobjectvariableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processobjectvariable transientInstance) {
		log.debug("persisting Processobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processobjectvariable instance) {
		log.debug("attaching dirty Processobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processobjectvariable instance) {
		log.debug("attaching clean Processobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processobjectvariable persistentInstance) {
		log.debug("deleting Processobjectvariable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processobjectvariable merge(Processobjectvariable detachedInstance) {
		log.debug("merging Processobjectvariable instance");
		try {
			Processobjectvariable result = (Processobjectvariable) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processobjectvariable findById(java.lang.Integer id) {
		log.debug("getting Processobjectvariable instance with id: " + id);
		try {
			Processobjectvariable instance = (Processobjectvariable) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processobjectvariable", id);
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

	public List<Processobjectvariable> findByExample(Processobjectvariable instance) {
		log.debug("finding Processobjectvariable instance by example");
		try {
			List<Processobjectvariable> results = (List<Processobjectvariable>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processobjectvariable").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
