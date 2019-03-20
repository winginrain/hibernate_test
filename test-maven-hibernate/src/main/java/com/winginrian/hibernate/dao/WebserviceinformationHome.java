package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Webserviceinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Webserviceinformation.
 * @see com.winginrian.hibernate.dao.Webserviceinformation
 * @author Hibernate Tools
 */
public class WebserviceinformationHome {

	private static final Log log = LogFactory.getLog(WebserviceinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Webserviceinformation transientInstance) {
		log.debug("persisting Webserviceinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Webserviceinformation instance) {
		log.debug("attaching dirty Webserviceinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Webserviceinformation instance) {
		log.debug("attaching clean Webserviceinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Webserviceinformation persistentInstance) {
		log.debug("deleting Webserviceinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Webserviceinformation merge(Webserviceinformation detachedInstance) {
		log.debug("merging Webserviceinformation instance");
		try {
			Webserviceinformation result = (Webserviceinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Webserviceinformation findById(java.lang.Integer id) {
		log.debug("getting Webserviceinformation instance with id: " + id);
		try {
			Webserviceinformation instance = (Webserviceinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Webserviceinformation", id);
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

	public List<Webserviceinformation> findByExample(Webserviceinformation instance) {
		log.debug("finding Webserviceinformation instance by example");
		try {
			List<Webserviceinformation> results = (List<Webserviceinformation>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Webserviceinformation").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
