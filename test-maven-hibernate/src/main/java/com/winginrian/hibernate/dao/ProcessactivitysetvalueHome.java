package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivitysetvalue;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivitysetvalue.
 * @see com.winginrian.hibernate.dao.Processactivitysetvalue
 * @author Hibernate Tools
 */
public class ProcessactivitysetvalueHome {

	private static final Log log = LogFactory.getLog(ProcessactivitysetvalueHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivitysetvalue transientInstance) {
		log.debug("persisting Processactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivitysetvalue instance) {
		log.debug("attaching dirty Processactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivitysetvalue instance) {
		log.debug("attaching clean Processactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivitysetvalue persistentInstance) {
		log.debug("deleting Processactivitysetvalue instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivitysetvalue merge(Processactivitysetvalue detachedInstance) {
		log.debug("merging Processactivitysetvalue instance");
		try {
			Processactivitysetvalue result = (Processactivitysetvalue) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivitysetvalue findById(java.lang.Integer id) {
		log.debug("getting Processactivitysetvalue instance with id: " + id);
		try {
			Processactivitysetvalue instance = (Processactivitysetvalue) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivitysetvalue", id);
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

	public List<Processactivitysetvalue> findByExample(Processactivitysetvalue instance) {
		log.debug("finding Processactivitysetvalue instance by example");
		try {
			List<Processactivitysetvalue> results = (List<Processactivitysetvalue>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processactivitysetvalue").add(create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
