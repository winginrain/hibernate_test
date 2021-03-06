package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packageresource;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packageresource.
 * @see com.winginrian.hibernate.dao.Packageresource
 * @author Hibernate Tools
 */
public class PackageresourceHome {

	private static final Log log = LogFactory.getLog(PackageresourceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packageresource transientInstance) {
		log.debug("persisting Packageresource instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packageresource instance) {
		log.debug("attaching dirty Packageresource instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packageresource instance) {
		log.debug("attaching clean Packageresource instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packageresource persistentInstance) {
		log.debug("deleting Packageresource instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packageresource merge(Packageresource detachedInstance) {
		log.debug("merging Packageresource instance");
		try {
			Packageresource result = (Packageresource) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packageresource findById(java.lang.Integer id) {
		log.debug("getting Packageresource instance with id: " + id);
		try {
			Packageresource instance = (Packageresource) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packageresource", id);
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

	public List<Packageresource> findByExample(Packageresource instance) {
		log.debug("finding Packageresource instance by example");
		try {
			List<Packageresource> results = (List<Packageresource>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packageresource").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
