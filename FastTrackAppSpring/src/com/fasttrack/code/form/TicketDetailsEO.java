package com.fasttrack.code.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_tickets")
public class TicketDetailsEO
{
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int ticketId;
	
	@Column(name="USER_ID")
	private int user_Id;
	
	@Column(name="ROUTE_ID")
	private int rouet_Id;
	
	@Column(name="DOJ")
	private Date doj;
	
	@Column(name="AMOUNT")
	private int amount;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="NOOFTICKETS")
	private int noOfTickets;

	public TicketDetailsEO()
	{
		 super();
	}
	
	public TicketDetailsEO(int user_Id,int rouet_Id,Date doj,int amount,String status,int noOfTickets)
	{
		 this.user_Id=user_Id;
		 this.rouet_Id=rouet_Id;
		 this.doj=doj;
		 this.amount=amount;
		 this.status=status;
		 this.noOfTickets=noOfTickets;
	}
	
	public int getTicketId()
	{
		return ticketId;
	}

	public void setTicketId(int ticketId)
	{
		this.ticketId = ticketId;
	}

	public int getUser_Id()
	{
		return user_Id;
	}

	public void setUser_Id(int user_Id)
	{
		this.user_Id = user_Id;
	}

	public int getRouet_Id()
	{
		return rouet_Id;
	}

	public void setRouet_Id(int rouet_Id)
	{
		this.rouet_Id = rouet_Id;
	}

	public Date getDoj()
	{
		return doj;
	}

	public void setDoj(Date doj)
	{
		this.doj = doj;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public int getNoOfTickets()
	{
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets)
	{
		this.noOfTickets = noOfTickets;
	}	

}
