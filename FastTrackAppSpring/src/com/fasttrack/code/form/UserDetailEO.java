package com.fasttrack.code.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user_detail")
public class UserDetailEO
{
	@Id
	@GeneratedValue	
	@Column(name="ID")
	private int	idNo;
	
	@Column(name="USERNAME")
	private String userName;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="PHONENO")
	private String phoneNumber;
	
	@Column(name="PANNO")
	private String panNo;
	
	public int getIdNo()
	{
		return idNo;
	}

	public void setIdNo(int idNo)
	{
		this.idNo = idNo;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getPanNo()
	{
		return panNo;
	}

	public void setPanNo(String panNo)
	{
		this.panNo = panNo;
	}
	

}
