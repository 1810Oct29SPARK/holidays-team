package service;

import java.time.LocalDate;
import java.util.List;

import beans.Holiday;
import dao.HolidayDao;
import dao.HolidayDaoImpl;

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
	
	
}
