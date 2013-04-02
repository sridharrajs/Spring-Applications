package com.fasttrack.code.service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasttrack.code.dao.FasttrackDAO;
import com.fasttrack.code.viewobjects.BookingStatus;

@Service
public class FasttrackServiceImpl implements FasttrackService
{
	@Autowired
	private FasttrackDAO fasttrackDAO;


	public Map<Integer, BookingStatus> listReservationDetails()
	{		
		Map<Integer, BookingStatus> bookingStatus=fasttrackDAO.getReservationStatusHash();		
		return bookingStatus;
	}
	
}
