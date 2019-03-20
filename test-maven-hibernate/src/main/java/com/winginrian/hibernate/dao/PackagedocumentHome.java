package com.winginrian.hibernate.dao;
// Generated 2019-3-20 0:38:01 by Hibernate Tools 5.2.11.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.winginrian.hibernate.dto.Packagedocument;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Packagedocument.
 * @see com.winginrian.hibernate.dao.Packagedocument
 * @author Hibernate Tools
 */
public class PackagedocumentHome {

	private static final Log log = LogFactory.getLog(PackagedocumentHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Packagedocument transientInstance) {
		log.debug("persisting Packagedocument instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Packagedocument instance) {
		log.debug("attaching dirty Packagedocument instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Packagedocument instance) {
		log.debug("attaching clean Packagedocument instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Packagedocument persistentInstance) {
		log.debug("deleting Packagedocument instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Packagedocument merge(Packagedocument detachedInstance) {
		log.debug("merging Packagedocument instance");
		try {
			Packagedocument result = (Packagedocument) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Packagedocument findById(java.lang.Integer id) {
		log.debug("getting Packagedocument instance with id: " + id);
		try {
			Packagedocument instance = (Packagedocument) sessionFactory.getCurrentSession()
					.get("com.winginrian.hibernate.dao.Packagedocument", id);
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

	public List<Packagedocument> findByExample(Packagedocument instance) {
		log.debug("finding Packagedocument instance by example");
		try {
			List<Packagedocument> results = (List<Packagedocument>) sessionFactory.getCurrentSession()
					.createCriteria("com.winginrian.hibernate.dao.Packagedocument").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
