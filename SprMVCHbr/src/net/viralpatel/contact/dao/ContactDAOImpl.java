package net.viralpatel.contact.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import net.viralpatel.contact.form.Contact;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ContactDAOImpl implements ContactDAO
{

	/* private SessionFactory sessionFactory; */

	AnnotationConfiguration	c		= new AnnotationConfiguration()
											.addAnnotatedClass(Contact.class)
											.configure("hibernate.cfg.xml");

	SessionFactory			factory	= c.buildSessionFactory();

	public void addContact(Contact contact)
	{
		try
		{
			/*
			 * AnnotationConfiguration c = new
			 * AnnotationConfiguration().addAnnotatedClass
			 * (Contact.class).configure("hibernate.cfg.xml");
			 * c.addAnnotatedClass(); c.configure(); SessionFactory factory =
			 * c.buildSessionFactory();
			 */

			Session session = factory.getCurrentSession();
			session.beginTransaction();
			session.save(contact);
			session.getTransaction().commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	// @Transactional
	public List<Contact> listContact()
	{
		List<Contact> sample = new ArrayList<Contact>(0);
		Contact contact = new Contact();
		contact.setId(2);
		contact.setFirstname("saravanan");
		contact.setLastname("Sampath kumar");
		contact.setTelephone(null);
		sample.add(contact);

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List sample12 = session.createQuery("from Contact").list();
		session.getTransaction().commit();

		return sample12;
	}

	public void removeContact(Integer id)
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Contact contact = (Contact) session.load(Contact.class, id);
		if (null != contact)
		{
			session.delete(contact);
		}
		session.getTransaction().commit();
	}
}