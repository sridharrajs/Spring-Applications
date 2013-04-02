package com.fasttrack.code.viewobjects;



import com.fasttrack.code.utility.ConverstionUtils;



public class BookingStatus
{
	private String	routeId;
	private String	sourceDepo;
	private String	destinationDepo;	
	private String	noOfSeats;
	private String	waitingList;
	private String	bookedSeats;

	public BookingStatus()
	{
		 super();
	}

	public BookingStatus(final String routeId, final String sourceDepo,
			final String destinationDepo, final String noOfSeats,
			final String waitingList, final String bookedSeats)
	{
		this.routeId = routeId;
		this.sourceDepo = sourceDepo;
		this.destinationDepo = destinationDepo;
		this.noOfSeats = noOfSeats;
		this.waitingList = waitingList;
		this.bookedSeats = bookedSeats;

	}
	
	public BookingStatus(final String sourceDepo,
	         			final String destinationDepo, final String noOfSeats,
	         			final String waitingList, final String bookedSeats)
	         	{	         		
	         		this.sourceDepo = sourceDepo;
	         		this.destinationDepo = destinationDepo;
	         		this.noOfSeats = noOfSeats;
	         		this.waitingList = waitingList;
	         		this.bookedSeats = bookedSeats;

	         	}

	public String toString()
	{
		return "Route Id " + routeId + " Source Depo " + sourceDepo
				+ " Destination Depo " + destinationDepo + "Seats " + noOfSeats
				+ " Booked " + bookedSeats + " Waiting " + waitingList;
	}

	public int getFreeSeats()
	{
		return ConverstionUtils.toInt(this.getNoOfSeats())
				- ConverstionUtils.toInt(this.getBookedSeats());
	}

	public final String getRouteId()
	{
		return routeId.trim();
	}

	public final void setRouteId(final String routeId)
	{
		this.routeId = routeId;
	}

	public final String getSourceDepo()
	{
		return sourceDepo.trim();
	}

	public final void setSourceDepo(final String sourceDepo)
	{
		this.sourceDepo = sourceDepo;
	}

	public final String getDestinationDepo()
	{
		return destinationDepo.trim();
	}

	public final void setDestinationDepo(final String destinationDepo)
	{
		this.destinationDepo = destinationDepo;
	}

	public final String getNoOfSeats()
	{
		return noOfSeats.trim();
	}

	public final void setNoOfSeats(final String noOfSeats)
	{
		this.noOfSeats = noOfSeats;
	}

	public final String getWaitingList()
	{
		return waitingList.trim();
	}

	public final void setWaitingList(final String waitingList)
	{
		this.waitingList = waitingList;
	}

	public final String getBookedSeats()
	{
		return bookedSeats.trim();
	}

	public final void setBookedSeats(final String bookedSeats)
	{
		this.bookedSeats = bookedSeats;
	}

}
