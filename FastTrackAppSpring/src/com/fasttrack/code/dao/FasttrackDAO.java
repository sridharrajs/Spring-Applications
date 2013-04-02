package com.fasttrack.code.dao;

import java.util.Map;

import com.fasttrack.code.viewobjects.BookingStatus;
import com.fasttrack.code.viewobjects.TicketConfiramtion;
import com.fasttrack.code.viewobjects.User;


public interface FasttrackDAO 
{
	
	public Map<Integer, BookingStatus> getReservationStatusHash();
	
	public String insertUser(final User user);
	
	public String inserTicket(final String userId, final String routeid,final int amount, final String date,final int tickets);
	
	public TicketConfiramtion getTicketDetails(final String userId,final String ticketId);

}
