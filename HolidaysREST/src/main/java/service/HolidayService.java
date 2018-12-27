package service;

import java.time.LocalDate;
import java.util.List;

import beans.Holiday;
import dao.HolidayDao;
import dao.HolidayDaoImpl;

public class HolidayService {
	
	HolidayDao hd = new HolidayDaoImpl();
	
	public void addHolidayToList(String name, LocalDate date) {
		hd.addHoliday(new Holiday(name, date));
	}
	
	public Holiday viewHBD(LocalDate date) {
		return hd.viewHolidaybyDate(date);
		
	}
	
	public List<Holiday> viewAllHol() {
		return hd.viewAllHolidays();
		
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
	
	
}
