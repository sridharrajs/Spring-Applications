package com.fasttrack.code.viewobjects;

import java.util.Date;

public class Ticket
{

	private String	sourceDepo;
	private String	destionationDepo;
	private String	noOfSeats;
	private String	bookedSeats;
	private String	seatsOnHold;
	private Date	bookingDate;

	public Ticket()
	{
		 super();
	}

	public Ticket(final String sourceDepo, final String destionationDepo,
			final String noOfSeats, final String bookedSeats,
			final String seatsOnHold, final Date bookingDate)
	{
		this.sourceDepo = sourceDepo;
		this.destionationDepo = destionationDepo;
		this.noOfSeats = noOfSeats;
		this.bookedSeats = bookedSeats;
		this.seatsOnHold = seatsOnHold;
		this.bookingDate = bookingDate;

	}

	public final Date getBookingDate()
	{
		return bookingDate;
	}

	public final void setBookingDate(final Date bookingDate)
	{
		this.bookingDate = bookingDate;
	}

	public final String getSourceDepo()
	{
		return sourceDepo.trim();
	}

	public final void setSourceDepo(final String sourceDepo)
	{
		this.sourceDepo = sourceDepo;
	}

	public final String getDestionationDepo()
	{
		return destionationDepo.trim();
	}

	public final void setDestionationDepo(final String destionationDepo)
	{
		this.destionationDepo = destionationDepo;
	}

	public final String getNoOfSeats()
	{
		return noOfSeats.trim();
	}

	public final void setNoOfSeats(final String noOfSeats)
	{
		this.noOfSeats = noOfSeats;
	}

	public final String getBookedSeats()
	{
		return bookedSeats.trim();
	}

	public final void setBookedSeats(final String bookedSeats)
	{
		this.bookedSeats = bookedSeats;
	}

	public final String getSeatsOnHold()
	{
		return seatsOnHold.trim();
	}

	public final void setSeatsOnHold(final String seatsOnHold)
	{
		this.seatsOnHold = seatsOnHold;
	}

}
