package com.fasttrack.code.utility;

public final class Constants
{

	private Constants()
	{

	}

	public static final String	FETCH_QUERY_RESERVATION_STATUS					="select\n" +
					"    route.id as routeid,\n" + 
					"    route.sourcedepo as Source,\n" + 
					"    route.destinationdepo as Destination,\n" + 
					"    booking_status.seats,\n" + 
					"    booking_status.booked as Booked,\n" + 
					"    booking_status.waitinglist as Waiting\n" + 
					"from\n" + 
					"    mv_route route,\n" + 
					"    tbl_booking_status booking_status\n" + 
					"where\n" + 
					"    booking_status.route_id = route.id";
	
	public static final  String ts="select * from  TBL_BOOKING_STATUS,tbl_tickets";



	public static final String	SYSTEM											= "system";

	public static final String	TICKET_CONFIRMATION								= "Select user_detail.username as username,\n"
																						+ "       tickets.doj          as dateOfjourney,\n"
																						+ "       tickets.amount       as travelAmount,\n"
																						+ "       tickets.status       as status,\n"
																						+ "       tickets.nooftickets  as nooftickets,\n"
																						+ "       route.sourcedepo as sourcedepo,\n"
																						+ "       route.destinationdepo as destinationdepo\n"
																						+ "  from tbl_user_detail    user_detail,\n"
																						+ "       tbl_tickets        tickets,\n"
																						+ "       tbl_booking_status booking_status,\n"
																						+ "       mv_route route\n"
																						+ " where tickets.id = ?\n"
																						+ "   and user_detail.id = ?\n"
																						+ "   and route.id=tickets.route_id";

	public static final int		TICKET_COST										= 500;
	public static final int		SIXTY											= 60;
	public static final int		ONE_SEC_IN_MILLI_SEC							= 60;
	public static final int		ONE_DAY_IN_HOURS								= 24;
	public static final String	DRIVER											= "sun.jdbc.odbc.JdbcOdbcDriver";
	public static final String	MY_DSN											= "jdbc:odbc:MyDataSource";
	public static final String	EXCEPTION_INIT_MAIN								= "Exception in Init::main()";
	public static final String	EXCEPTION_CONNECTION_MANAGER_GETRESERVATIONHASH	= "Exception in ConnectionManager::getReservationStatusHash()";
	public static final String	EXCEPTION_CONNECTION_MANAGER_INSERTUSER			= "Exception in ConnectionManager::insertUser()";
	public static final String	EXCEPTION_CONNECTION_MANAGER_INSERTTICKET		= "Exception in ConnectionManager::inserTicket()";
	public static final String	EXCEPTION_CONNECTION_MANAGER_GET_TICKET_DETAILS	= "Exception in ConnectionManager::getTicketDetails()";

}
