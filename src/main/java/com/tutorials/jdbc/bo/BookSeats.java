package com.tutorials.jdbc.bo;

public class BookSeats {
	private int bookid;

	private String theatrename;
	
	private String movie_name;
	private int showsid;
	private String showtime;
	private String showdate;

	private int total_no_seat;
	private int no_of_tickets;
	
	
	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	

	public String getTheatrename() {
		return theatrename;
	}


	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}


	public String getMovie_name() {
		return movie_name;
	}


	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public int getShowsid() {
		return showsid;
	}


	public void setShowsid(int showsid) {
		this.showsid = showsid;
	}
	public String getShowtime() {
		return showtime;
	}


	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}


	public String getShowdate() {
		return showdate;
	}


	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}


	public int getTotal_no_seat() {
		return total_no_seat;
	}


	public void setTotal_no_seat(int total_no_seat) {
		this.total_no_seat = total_no_seat;
	}


	public int getNo_of_tickets() {
		return no_of_tickets;
	}


	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	
	
	public BookSeats() {
		System.out.println("BookSeat() - instantiated..");
	}
	public BookSeats(int bookid,String theatrename,String movie_name,int showsid,String showtime,String showdate,int total_no_seat,int no_of_tickets ) {
		System.out.println("BookSeats(bookid, theatrename, movie_name,showsid,showtime, showdate, total_no_seat, no_of_tickets ) - instantiated..");
		this.bookid=bookid;
		this.theatrename=theatrename;
		this. movie_name=movie_name;
		this.showsid=showsid;
		this.showtime = showtime;
		this.showdate = showdate ;
		this.total_no_seat = total_no_seat;
		this.no_of_tickets  =no_of_tickets ;
	
	}
	public String toString() {
		return "[BookSeats] hashCode=" + this.hashCode()
		+",bookid ="+bookid
		+ ",theatrename= " + theatrename 
		+ ", movie_name= " + movie_name
		+",showsid ="+showsid
		+",showtime ="+ showtime
		+ ",showdate   = " +showdate  
		+ ",total_no_seat  = " +total_no_seat
		+ ",no_of_tickets   = " +no_of_tickets;
	}


	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


