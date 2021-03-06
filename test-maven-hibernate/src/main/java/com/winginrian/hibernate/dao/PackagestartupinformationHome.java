package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packagestartupinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packagestartupinformation.
 * @see com.winginrian.hibernate.dao.Packagestartupinformation
 * @author Hibernate Tools
 */
public class PackagestartupinformationHome {

	private static final Log log = LogFactory.getLog(PackagestartupinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packagestartupinformation transientInstance) {
		log.debug("persisting Packagestartupinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packagestartupinformation instance) {
		log.debug("attaching dirty Packagestartupinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packagestartupinformation instance) {
		log.debug("attaching clean Packagestartupinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packagestartupinformation persistentInstance) {
		log.debug("deleting Packagestartupinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packagestartupinformation merge(Packagestartupinformation detachedInstance) {
		log.debug("merging Packagestartupinformation instance");
		try {
			Packagestartupinformation result = (Packagestartupinformation) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packagestartupinformation findById(java.lang.Integer id) {
		log.debug("getting Packagestartupinformation instance with id: " + id);
		try {
			Packagestartupinformation instance = (Packagestartupinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packagestartupinformation", id);
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

	public List<Packagestartupinformation> findByExample(Packagestartupinformation instance) {
		log.debug("finding Packagestartupinformation instance by example");
		try {
			List<Packagestartupinformation> results = (List<Packagestartupinformation>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Packagestartupinformation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
