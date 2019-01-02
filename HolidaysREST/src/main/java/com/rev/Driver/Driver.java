package com.rev.Driver;

import dao.HolidayDao;
import dao.HolidayDaoImpl;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		HolidayDao holi = new HolidayDaoImpl();
		System.out.println(holi.viewHolidaybyDate(100));
	}
}
