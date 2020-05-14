package service;

import java.time.LocalDate;
import java.time.Month;

import model.User;

public class AstroCalculator 
{


	public String findSign(User user) {
		
		
		  LocalDate currentDate=user.getDob();  //Here We get "12-01-1991" from LocalDate of User
	      int dayOfMonth = currentDate.getDayOfMonth();// Here we get  date of the month :12
         Month month = currentDate.getMonth();// Here we get month in String format
  
     //java 1.8  month names(Strings) below 1 .7 numericals   1-12
    String jan="JANUARY";
	String feb="FEBRUARY";
	String mar="MARCH";
	String apr="APRIL";
	String may="MAY";
	String jun="JUNE";
	String jul="JULY";
	String aug="AUGUST";
	String sept="SEPTEMBER";
	String oct="OCTOBER";
	String nov="NOVEMBER";
	String dec= "DECEMBER";
	
		if(month.equals(dec))

	{
		if(dayOfMonth <22) {
			return "Sagitarius";
		}
		else {
			return "capricorn";
		}
		 
	}else if (month.equals(jan)){
        if (dayOfMonth < 20)
        	return "Capricorn";
        else
        	return "Aquarius";
    }else if (month.equals(feb)){
        if (dayOfMonth< 19)
        	return "Aquarius";
        else
        	return "Pisces";
    }else if(month.equals(mar)){
        if (dayOfMonth < 21)
        	return "Pisces";
        else
        	return "Aries";
    }else if (month.equals(apr)){
        if (dayOfMonth < 20)
        	return "Aries";
        else
        	return "Taurus";
    }
    else if (month.equals(may)){
        if (dayOfMonth < 21)
        	return "Taurus";
        else
        	return "Gemini";
    }
    else if(month.equals(jun)){
        if (dayOfMonth < 21)
        	return "Gemini";
        else
        	return "Cancer";
    }
    else if (month.equals(jul)){
        if (dayOfMonth < 23)
        	return "Cancer";
        else
        	return "Leo";
    }
    else if(month.equals(aug)){
        if (dayOfMonth< 23)
        	return "Leo";
        else
        	return "Virgo";
    }
    else if (month.equals(sept)){
        if (dayOfMonth < 23)
        	return "Virgo";
        else
        	return "Libra";
    }
    else if (month.equals(oct)){
        if (dayOfMonth < 23)
        	return "Libra";
        else
        	return "Scorpio";
    }
    else if (month.equals(nov)){
        if (dayOfMonth< 22)
        	return "Scorpio";
        else
        	return "Sagittarius";
	}
		
		
		
		
		return null;
		
		
	}
	

 }
 