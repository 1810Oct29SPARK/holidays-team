package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import beans.Holiday;

public class HolidayDaoImpl implements HolidayDao {

	public static void main(String[] args) {
		
	}

	List<Holiday> holidays = new ArrayList<Holiday>();

	public List<Holiday> listOfHolidays() {

		LocalDate ChristmasDate = LocalDate.parse("2018-12-25");
		Holiday Christmas = new Holiday("Christmas", ChristmasDate);
		holidays.add(Christmas);

		LocalDate NewYearsDate = LocalDate.parse("2018-01-01");
		Holiday NewYears = new Holiday("New Years", NewYearsDate);
		holidays.add(NewYears);

		LocalDate ValentinesDayDate = LocalDate.parse("2018-02-14");
		Holiday ValentinesDay = new Holiday("Valentine's Day", ValentinesDayDate);
		holidays.add(ValentinesDay);

		LocalDate SPDayDate = LocalDate.parse("2018-03-17");
		Holiday SPDay = new Holiday("Saint Patrick's Day", SPDayDate);
		holidays.add(SPDay);

		return holidays;
	}

	@Override
	public Holiday viewHolidaybyDate(LocalDate date) {
		List<Holiday> holidays = listOfHolidays();

		for (Holiday i : holidays) {
			if (i.getDate().equals(date)) {
				return i;
			}
		}
		return null;
	}

	@Override
	public List<Holiday> viewAllHolidays() {
			List<Holiday> holidays = listOfHolidays();	
			System.out.println(holidays);
			return holidays;
	}

	@Override
	public List<Holiday> viewMonthHoliday(LocalDate date) {
		List<Holiday> holidays = listOfHolidays();
		List<Holiday> holi = new ArrayList<>();
		for (Holiday i : holidays) {
			if (i.getDate().getMonth().equals(date.getMonth())) {
				holi.add(i);
			}
		}
		return holi;
	}

	@Override
	public void deleteHoliday(Holiday holiday) {
		List<Holiday> holidays = listOfHolidays();
		holidays.remove(holiday);
	}

	@Override
	public void addHoliday(Holiday holiday) {
		List<Holiday> holidays = listOfHolidays();
		holidays.add(holiday);
	}

	@Override
	public void update(Holiday holiday,Holiday holi) {
		List<Holiday> holidays = listOfHolidays();
		for (Holiday i : holidays) {
			if (i.equals(holiday)) {
				i = holi;
			}
		}
		
	}

}
