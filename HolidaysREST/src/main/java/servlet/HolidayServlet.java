package servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import beans.Holiday;
import service.HolidayService;

@WebServlet("/holiday")
public class HolidayServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5558630745938230994L;
	private HolidayService holidayservice;
	private ObjectMapper om;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		holidayservice.viewAllHol();
		LocalDate date = LocalDate.parse(req.getParameter("date"));
		holidayservice.viewHBD(date);
		holidayservice.viewMonthHol(date);
		
		resp.getWriter().write(om.writeValueAsString(holidayservice.viewAllHol()));
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		LocalDate date = LocalDate.parse(req.getParameter("date"));
		holidayservice.addHolidayToList(req.getParameter("name"), date);
	}
	
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		LocalDate date = LocalDate.parse(req.getParameter("date"));
		Holiday holiday = new Holiday(req.getParameter("name"),date);
		holidayservice.deleteHol(holiday);
	}
	
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		LocalDate date = LocalDate.parse(req.getParameter("date"));
		LocalDate date2 = LocalDate.parse(req.getParameter("date2"));
		Holiday holiday = new Holiday(req.getParameter("name"),date);
		Holiday holi = new Holiday(req.getParameter("name"), date2);
		holidayservice.updateHoliday(holiday, holi);
	}
}
