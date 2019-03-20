package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Processactivityoutputmapping;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Processactivityoutputmapping.
 * @see com.winginrian.hibernate.dao.Processactivityoutputmapping
 * @author Hibernate Tools
 */
public class ProcessactivityoutputmappingHome {

	private static final Log log = LogFactory.getLog(ProcessactivityoutputmappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Processactivityoutputmapping transientInstance) {
		log.debug("persisting Processactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Processactivityoutputmapping instance) {
		log.debug("attaching dirty Processactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Processactivityoutputmapping instance) {
		log.debug("attaching clean Processactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Processactivityoutputmapping persistentInstance) {
		log.debug("deleting Processactivityoutputmapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Processactivityoutputmapping merge(Processactivityoutputmapping detachedInstance) {
		log.debug("merging Processactivityoutputmapping instance");
		try {
			Processactivityoutputmapping result = (Processactivityoutputmapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Processactivityoutputmapping findById(java.lang.Integer id) {
		log.debug("getting Processactivityoutputmapping instance with id: " + id);
		try {
			Processactivityoutputmapping instance = (Processactivityoutputmapping) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Processactivityoutputmapping", id);
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

	public List<Processactivityoutputmapping> findByExample(Processactivityoutputmapping instance) {
		log.debug("finding Processactivityoutputmapping instance by example");
		try {
			List<Processactivityoutputmapping> results = (List<Processactivityoutputmapping>) sessionFactory
					.getCurrentSession().createCriteria("com.winginrian.hibernate.dao.Processactivityoutputmapping")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
