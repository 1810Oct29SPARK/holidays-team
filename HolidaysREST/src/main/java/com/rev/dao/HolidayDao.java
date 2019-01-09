package com.rev.dao;

import java.time.LocalDate;
import java.util.List;

import com.rev.beans.Holiday;

public interface HolidayDao {
	public Holiday viewHolidaybyId(int id);
	public List<Holiday> viewAllHolidays();
	public List<Holiday> viewMonthHoliday(LocalDate date);
	public void deleteHoliday(Holiday holiday);
	public void addHoliday(Holiday holiday);
	public void update(Holiday holiday,Holiday holi);	
}
