package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Webserviceparam;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Webserviceparam.
 * @see com.winginrian.hibernate.dao.Webserviceparam
 * @author Hibernate Tools
 */
public class WebserviceparamHome {

	private static final Log log = LogFactory.getLog(WebserviceparamHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Webserviceparam transientInstance) {
		log.debug("persisting Webserviceparam instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Webserviceparam instance) {
		log.debug("attaching dirty Webserviceparam instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Webserviceparam instance) {
		log.debug("attaching clean Webserviceparam instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Webserviceparam persistentInstance) {
		log.debug("deleting Webserviceparam instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Webserviceparam merge(Webserviceparam detachedInstance) {
		log.debug("merging Webserviceparam instance");
		try {
			Webserviceparam result = (Webserviceparam) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Webserviceparam findById(java.lang.Integer id) {
		log.debug("getting Webserviceparam instance with id: " + id);
		try {
			Webserviceparam instance = (Webserviceparam) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Webserviceparam", id);
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

	public List<Webserviceparam> findByExample(Webserviceparam instance) {
		log.debug("finding Webserviceparam instance by example");
		try {
			List<Webserviceparam> results = (List<Webserviceparam>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Webserviceparam").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
