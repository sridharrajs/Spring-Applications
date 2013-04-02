package com.fasttrack.code.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

public final class ValidationUtil
{
	private static final Logger	LOG	= Logger.getLogger("ValidationUtil.class");

	private ValidationUtil()
	{
	}

	public static boolean isValidDateFormate(final String date)
	{
		boolean isValid;
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try
		{
			simpleDateFormat.parse(date);
			isValid = true;
		}
		catch (ParseException e)
		{
			isValid=false;
			LOG.warning("Exception in ValidationUtil::isValidDateFormate()" + e);
		}
		return isValid;
	}

	public static boolean isValidGender(final String value)
	{
		return "M".equalsIgnoreCase(value) || "F".equalsIgnoreCase(value);
	}

	public static boolean isValidPhoneNumber(final String value)
	{
		return value.matches("\\d{5}-\\d{5}");
	}

	public static boolean isNumber(final String value)
	{
		return value.matches("[0-100]");
	}

	public static boolean isEmptyorNull(final String value)
	{
		return (value == null || value.isEmpty());
	}

}
