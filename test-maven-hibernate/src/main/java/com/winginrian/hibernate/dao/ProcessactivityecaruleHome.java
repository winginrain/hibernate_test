package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityecarule;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityecarule.
 * @see com.winginrian.hibernate.dao.Processactivityecarule
 * @author Hibernate Tools
 */
public class ProcessactivityecaruleHome {

	private static final Log log = LogFactory.getLog(ProcessactivityecaruleHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityecarule transientInstance) {
		log.debug("persisting Processactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityecarule instance) {
		log.debug("attaching dirty Processactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityecarule instance) {
		log.debug("attaching clean Processactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityecarule persistentInstance) {
		log.debug("deleting Processactivityecarule instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityecarule merge(Processactivityecarule detachedInstance) {
		log.debug("merging Processactivityecarule instance");
		try {
			Processactivityecarule result = (Processactivityecarule) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityecarule findById(java.lang.Integer id) {
		log.debug("getting Processactivityecarule instance with id: " + id);
		try {
			Processactivityecarule instance = (Processactivityecarule) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityecarule", id);
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

	public List<Processactivityecarule> findByExample(Processactivityecarule instance) {
		log.debug("finding Processactivityecarule instance by example");
		try {
			List<Processactivityecarule> results = (List<Processactivityecarule>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processactivityecarule").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
