package com.rev.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rev.beans.Holiday;
import com.rev.dao.HolidayDao;
import com.rev.dao.HolidayDaoImpl;

@Service(value="holidayService") //now a bean!
public class HolidayService {
	
	HolidayDao hd = new HolidayDaoImpl();
	
	public void addHolidayToList(String name, LocalDate date) {
		
	}
	
	public List<Holiday> viewMonthHol(LocalDate date) {	
		return hd.viewMonthHoliday(date);
		
	}
	public void deleteHol(Holiday holiday) {
		hd.deleteHoliday(holiday);
		
	}
	
	public void updateHoliday(Holiday holiday,Holiday holi) {
		hd.update(holiday, holi);		
	}
	
	public List<Holiday> viewAllHolidays () {
		return hd.viewAllHolidays();
	}
	
	
}
