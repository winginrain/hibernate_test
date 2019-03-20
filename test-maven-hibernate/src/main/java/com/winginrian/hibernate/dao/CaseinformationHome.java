package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Caseinformation;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Caseinformation.
 * @see com.winginrian.hibernate.dao.Caseinformation
 * @author Hibernate Tools
 */
public class CaseinformationHome {

	private static final Log log = LogFactory.getLog(CaseinformationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Caseinformation transientInstance) {
		log.debug("persisting Caseinformation instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Caseinformation instance) {
		log.debug("attaching dirty Caseinformation instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caseinformation instance) {
		log.debug("attaching clean Caseinformation instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Caseinformation persistentInstance) {
		log.debug("deleting Caseinformation instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caseinformation merge(Caseinformation detachedInstance) {
		log.debug("merging Caseinformation instance");
		try {
			Caseinformation result = (Caseinformation) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Caseinformation findById(java.lang.Integer id) {
		log.debug("getting Caseinformation instance with id: " + id);
		try {
			Caseinformation instance = (Caseinformation) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Caseinformation", id);
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

	public List<Caseinformation> findByExample(Caseinformation instance) {
		log.debug("finding Caseinformation instance by example");
		try {
			List<Caseinformation> results = (List<Caseinformation>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Caseinformation").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}