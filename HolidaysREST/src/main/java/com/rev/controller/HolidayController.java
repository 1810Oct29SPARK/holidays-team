package com.rev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bea.core.repackaged.springframework.stereotype.Controller;
import com.rev.beans.Holiday;
import com.rev.service.HolidayService;

@Controller
@RequestMapping(value="/holidayspring")
public class HolidayController {

	@Autowired
	private HolidayService holidayService;
	
	@RequestMapping(value="/holidaysall", method=RequestMethod.GET) //RequestMethod is an enum
	@ResponseBody //returns just data
	public ResponseEntity<List<Holiday>> viewAllHolidays() {
		return new ResponseEntity<>(holidayService.viewAllHolidays(), HttpStatus.OK);
	}
	

}
