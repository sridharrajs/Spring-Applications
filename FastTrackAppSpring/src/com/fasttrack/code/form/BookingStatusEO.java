package com.fasttrack.code.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TBL_BOOKING_STATUS")
public class BookingStatusEO
{
	@GeneratedValue
	@Id
	@Column(name="ID")
	private int	bookStatusId;
	
	@Column(name="ROUTE_ID")
	private int	routeId;
	
	@Column(name="SEATS")
	private int	seats;	
	
	@Column(name="WAITINGLIST")
	private int	waitingList;
	
	@Column(name="BOOKED")
	private int	bookedSeats;
	
	public BookingStatusEO()
	{
		
	}
	
	public BookingStatusEO(int bookStatusId,int routeId,int seats,int waitingList,int bookedSeats)
	{		
		this.routeId=routeId;		
		this.seats=seats;	
		this.waitingList=waitingList;				
		this.bookedSeats=bookedSeats;
	}

	public int getBookStatusId()
	{
		return bookStatusId;
	}

	public void setBookStatusId(int bookStatusId)
	{
		this.bookStatusId = bookStatusId;
	}

	public int getRouteId()
	{
		return routeId;
	}

	public void setRouteId(int routeId)
	{
		this.routeId = routeId;
	}

	public int getSeats()
	{
		return seats;
	}

	public void setSeats(int seats)
	{
		this.seats = seats;
	}

	public int getWaitingList()
	{
		return waitingList;
	}

	public void setWaitingList(int waitingList)
	{
		this.waitingList = waitingList;
	}

	public int getBookedSeats()
	{
		return bookedSeats;
	}

	public void setBookedSeats(int bookedSeats)
	{
		this.bookedSeats = bookedSeats;
	}
	
	
			
}
