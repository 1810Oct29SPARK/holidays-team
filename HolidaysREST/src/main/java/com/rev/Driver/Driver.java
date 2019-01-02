package com.rev.Driver;

import java.util.List;

import beans.Holiday;
import dao.HolidayDao;
import dao.HolidayDaoImpl;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HolidayDao holi = new HolidayDaoImpl();
//		System.out.println("View Holiday by Id 100: " + holi.viewHolidaybyId(100));

		List<Holiday> holidaysList = holi.viewAllHolidays();
		for (Holiday h : holidaysList) {
			System.out.println(h);
		}

	}
}
