package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processcondition;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processcondition.
 * @see com.winginrian.hibernate.dao.Processcondition
 * @author Hibernate Tools
 */
public class ProcessconditionHome {

	private static final Log log = LogFactory.getLog(ProcessconditionHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processcondition transientInstance) {
		log.debug("persisting Processcondition instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processcondition instance) {
		log.debug("attaching dirty Processcondition instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processcondition instance) {
		log.debug("attaching clean Processcondition instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processcondition persistentInstance) {
		log.debug("deleting Processcondition instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processcondition merge(Processcondition detachedInstance) {
		log.debug("merging Processcondition instance");
		try {
			Processcondition result = (Processcondition) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processcondition findById(java.lang.Integer id) {
		log.debug("getting Processcondition instance with id: " + id);
		try {
			Processcondition instance = (Processcondition) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processcondition", id);
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

	public List<Processcondition> findByExample(Processcondition instance) {
		log.debug("finding Processcondition instance by example");
		try {
			List<Processcondition> results = (List<Processcondition>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Processcondition").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
