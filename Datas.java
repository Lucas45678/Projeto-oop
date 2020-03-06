package poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	public static void main(String[] args) throws ParseException {
    
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
		Date data = new Date();
		System.out.println(formato.format(data));
		

	}
}
