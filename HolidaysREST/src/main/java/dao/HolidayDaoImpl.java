package dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rev.Hibernate.HibernateUtil;

import beans.Holiday;

public class HolidayDaoImpl implements HolidayDao {

	public static void main(String[] args) {

	}

	@Override
	public Holiday viewHolidaybyId(int id) {
		Holiday holiday = null;
		try (SessionFactory sf = HibernateUtil.getSession()) {
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			holiday = (Holiday) s.get(Holiday.class, id);
			System.out.println("Holiday" + holiday);
			tx.commit();
			s.close();
			System.out.println("Ran through the try loop");
		}
		return holiday;
	}

	@Override
	public List<Holiday> viewAllHolidays() {
		List<Holiday> holidays = new ArrayList<>();
		try (SessionFactory sf = HibernateUtil.getSession()) {
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			holidays = s.createQuery("from Holiday").getResultList();
			tx.commit();
			s.close();
		}
		return holidays;

	}

	@Override
	public List<Holiday> viewMonthHoliday(LocalDate date) {
		return null;
	}

	@Override
	public void deleteHoliday(Holiday holiday) {

	}

	@Override
	public void addHoliday(Holiday holiday) {

	}

	@Override
	public void update(Holiday holiday, Holiday holi) {

	}

}
