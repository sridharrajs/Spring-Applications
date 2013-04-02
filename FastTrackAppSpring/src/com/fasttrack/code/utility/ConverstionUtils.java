package com.fasttrack.code.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public final class ConverstionUtils
{

	private static final Logger	LOG	= Logger.getLogger("ConverstionUtils.class");

	private ConverstionUtils()
	{
	}

	public static long getDateDiff(final String date) throws ParseException
	{
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"dd-MMM-yyyy");
		final Date currentDate = new Date();
		final Date inputDate = simpleDateFormat.parse(date);
		return (inputDate.getTime() - currentDate.getTime())
				/ (Constants.ONE_SEC_IN_MILLI_SEC * Constants.SIXTY
						* Constants.SIXTY * Constants.ONE_DAY_IN_HOURS);
	}

	public static int toInt(final String value)
	{
		int numValue = 0;
		if (value != null && value.isEmpty())
		{
			numValue = Integer.parseInt(value);
		}
		return numValue;
	}

	public static String toDBdate(final String value)
	{
		String finaldate = null;
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"dd-MMM-yyyy");
		try
		{
			finaldate = simpleDateFormat.format(simpleDateFormat.parse(value));
		}
		catch (ParseException e)
		{
			LOG.warning("Exception in ConverstionUtils::toDBdate()" + e);
		}
		return finaldate;
	}

	public static Date toDate(final String value)
	{
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"dd-MM-yyyy");
		Date date = null;
		try
		{
			date = simpleDateFormat.parse(value);
		}
		catch (ParseException e)
		{

			LOG.warning("Exception in ConverstionUtils::toDate()" + e);
		}
		return date;
	}

}
