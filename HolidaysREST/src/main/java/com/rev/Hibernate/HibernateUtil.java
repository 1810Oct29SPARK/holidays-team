package com.rev.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sesFac;

	public static SessionFactory getSession() {
		if (HibernateUtil.sesFac == null) {
			Configuration config = new Configuration();
			config.configure();
			HibernateUtil.sesFac = config.buildSessionFactory();
		}
		return HibernateUtil.sesFac;
	}
}
