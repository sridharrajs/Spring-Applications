package com.fasttrack.code.viewobjects;

public class User
{
	private String	userName;
	private String	gender;
	private String	phoneNumber;
	private String	panNumber;

	public User()
	{
		 super();
	}

	public User(final String userName, final String gender,
			final String phoneNumber, final String panNumber)
	{
		this.userName = userName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.panNumber = panNumber;

	}

	public final String getUserName()
	{
		return userName.trim();
	}

	public final void setUserName(final String userName)
	{
		this.userName = userName;
	}

	public final String getGender()
	{
		return gender.trim();
	}

	public final void setGender(final String gender)
	{
		this.gender = gender;
	}

	public final String getPhoneNumber()
	{
		return phoneNumber.trim();
	}

	public final void setPhoneNumber(final String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public final String getPanNumber()
	{
		return panNumber.trim();
	}

	public final void setPanNumber(final String panNumber)
	{
		this.panNumber = panNumber;
	}

}
