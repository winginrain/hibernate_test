package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Casecustomapplication;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Casecustomapplication.
 * @see com.winginrian.hibernate.dao.Casecustomapplication
 * @author Hibernate Tools
 */
public class CasecustomapplicationHome {

	private static final Log log = LogFactory.getLog(CasecustomapplicationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Casecustomapplication transientInstance) {
		log.debug("persisting Casecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Casecustomapplication instance) {
		log.debug("attaching dirty Casecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Casecustomapplication instance) {
		log.debug("attaching clean Casecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Casecustomapplication persistentInstance) {
		log.debug("deleting Casecustomapplication instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Casecustomapplication merge(Casecustomapplication detachedInstance) {
		log.debug("merging Casecustomapplication instance");
		try {
			Casecustomapplication result = (Casecustomapplication) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Casecustomapplication findById(java.lang.Integer id) {
		log.debug("getting Casecustomapplication instance with id: " + id);
		try {
			Casecustomapplication instance = (Casecustomapplication) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Casecustomapplication", id);
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

	public List<Casecustomapplication> findByExample(Casecustomapplication instance) {
		log.debug("finding Casecustomapplication instance by example");
		try {
			List<Casecustomapplication> results = (List<Casecustomapplication>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Casecustomapplication").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
