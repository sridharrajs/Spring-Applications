package com.fasttrack.code.viewobjects;

public class TicketConfiramtion
{

	private String	passengerName;
	private String	sourceDepo;
	private String	destinationDepo;
	private String	dateOfJourney;
	private String	travelAmount;
	private String	status;
	private String	noOfTickets;

	public TicketConfiramtion(final String passengerName,
			final String sourceDepo, final String destinationDepo,
			final String dateOfJourney, final String travelAmount,
			final String status, final String noOfTickets)
	{
		this.passengerName = passengerName;
		this.sourceDepo = sourceDepo;
		this.destinationDepo = destinationDepo;
		this.dateOfJourney = dateOfJourney;
		this.travelAmount = travelAmount;
		this.status = status;
		this.noOfTickets = noOfTickets;
	}

	public TicketConfiramtion()
	{
		 super();
	}

	public String toString()
	{
		return "passenger name " + passengerName + " sourceDepo " + sourceDepo
				+ " destinationDepo " + destinationDepo + " dateOfJourney "
				+ dateOfJourney + " travelAmount " + travelAmount + " status "
				+ status + " noOfTickets " + noOfTickets;
	}

	public final String getPassengerName()
	{
		return passengerName;
	}

	public final void setPassengerName(final String passengerName)
	{
		this.passengerName = passengerName;
	}

	public final String getSourceDepo()
	{
		return sourceDepo;
	}

	public final void setSourceDepo(final String sourceDepo)
	{
		this.sourceDepo = sourceDepo;
	}

	public final String getDestinationDepo()
	{
		return destinationDepo;
	}

	public final void setDestinationDepo(final String destinationDepo)
	{
		this.destinationDepo = destinationDepo;
	}

	public final String getDateOfJourney()
	{
		return dateOfJourney;
	}

	public final void setDateOfJourney(final String dateOfJourney)
	{
		this.dateOfJourney = dateOfJourney;
	}

	public final String getTravelAmount()
	{
		return travelAmount;
	}

	public final void setTravelAmount(final String travelAmount)
	{
		this.travelAmount = travelAmount;
	}

	public final String getStatus()
	{
		return status;
	}

	public final void setStatus(final String status)
	{
		this.status = status;
	}

	public final String getNoOfTickets()
	{
		return noOfTickets;
	}

	public final void setNoOfTickets(final String noOfTickets)
	{
		this.noOfTickets = noOfTickets;
	}

}
