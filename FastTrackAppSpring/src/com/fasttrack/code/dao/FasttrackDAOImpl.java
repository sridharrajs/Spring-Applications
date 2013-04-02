package com.fasttrack.code.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Repository;

import com.fasttrack.code.form.BookingStatusEO;
import com.fasttrack.code.form.RotesEO;
import com.fasttrack.code.form.TicketDetailsEO;
import com.fasttrack.code.form.UserDetailEO;
import com.fasttrack.code.utility.Constants;
import com.fasttrack.code.utility.ConverstionUtils;
import com.fasttrack.code.viewobjects.BookingStatus;
import com.fasttrack.code.viewobjects.TicketConfiramtion;
import com.fasttrack.code.viewobjects.User;

@Repository
public class FasttrackDAOImpl implements FasttrackDAO
{

private AnnotationConfiguration	config		= new AnnotationConfiguration().addAnnotatedClass(UserDetailEO.class).configure("/resources/hibernate.cfg.xml");

private SessionFactory 	factory	= config.buildSessionFactory();

	@Override
	public Map<Integer, BookingStatus> getReservationStatusHash()
	{
		Map<Integer, BookingStatus> bookStatusHash = new HashMap<Integer, BookingStatus>();
		Session session =factory.getCurrentSession();
		session.beginTransaction();
		//List<BookingStatus> lst= session.createQuery(Constants.ts).list();
	
		//Query q=  session.createSQLQuery("select * from TBL_BOOKING_STATUS").addEntity(BookingStatusEO.class);
		SQLQuery query=session.createSQLQuery(Constants.ts);	
		
		//List myList=session.createSQLQuery(Constants.FETCH_QUERY_RESERVATION_STATUS).addEntity(BookingStatusEO.class).addEntity(TicketDetailsEO.class).list();
		List<BookingStatus> myList=session.createSQLQuery(Constants.FETCH_QUERY_RESERVATION_STATUS).addEntity(BookingStatusEO.class).addEntity(RotesEO.class).list();
		System.out.println("query "+myList.get(0).getBookedSeats());
		session.getTransaction().commit();
		return bookStatusHash;
	}


	@Override
	public String insertUser(User user)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inserTicket(String userId, String routeid, int amount,
								String date, int tickets)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketConfiramtion getTicketDetails(String userId, String ticketId)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
