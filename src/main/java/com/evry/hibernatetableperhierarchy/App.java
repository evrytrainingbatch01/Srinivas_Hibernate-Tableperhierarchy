package com.evry.hibernatetableperhierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Patient c = new Patient();

		c.setAdmitedid(1001);
		c.setPatientname("Ramesh");

		InPatient ip = new InPatient();
		ip.setPatientname("Suresh");
		ip.setAdmitedid(1002);
		ip.setInpatid(301);
		ip.setInpatbills(30);
		ip.setInpatamount(500);
		ip.setInpatcheckuptype("General");

		OutPatient op = new OutPatient();
		op.setPatientname("Jagadeesh");
		op.setAdmitedid(1003);
		op.setOutpatid(401);
		op.setOutpatbills(40);
		op.setOutpatamount(1000);
		op.setOutpatcheckuptype("EyeTest");

		session.persist(c);
		session.persist(ip);
		session.persist(op);
		t.commit();

		factory.close();
		session.close();
	}
}
