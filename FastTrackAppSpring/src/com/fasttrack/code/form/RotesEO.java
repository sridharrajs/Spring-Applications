package com.fasttrack.code.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="mv_route")
public class RotesEO
{
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int routes_Id;
	
	@Column(name="SOURCEDEPO")
	private String sourceDepo;
	
	@Column(name="DESTINATIONDEPO")
	private String destinationDepo;

	public int getRoutes_Id()
	{
		return routes_Id;
	}

	public void setRoutes_Id(int routes_Id)
	{
		this.routes_Id = routes_Id;
	}

	public String getSourceDepo()
	{
		return sourceDepo;
	}

	public void setSourceDepo(String sourceDepo)
	{
		this.sourceDepo = sourceDepo;
	}

	public String getDestinationDepo()
	{
		return destinationDepo;
	}

	public void setDestinationDepo(String destinationDepo)
	{
		this.destinationDepo = destinationDepo;
	}
	
	
	
}
