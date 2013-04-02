package com.fasttrack.code.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasttrack.code.service.FasttrackService;

@Controller
public class NavigationController
{
	@Autowired
	private FasttrackService fasttrackService;

	@RequestMapping("/index")
	public String loadVal(Map<String, Object> map)
	{	
		map.put("bookingList", fasttrackService.listReservationDetails());
		return "main";
	}
	
	
}
