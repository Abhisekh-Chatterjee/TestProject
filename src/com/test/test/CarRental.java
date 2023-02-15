package com.test.test;
import java.util.*;
import java.text.SimpleDateFormat;

public class CarRental {
    public static Boolean canScheduleAll(ArrayList<RentalTime> rentalTimes) {
        for(int i = 0; i < rentalTimes.size(); i++) {
        	if(rentalTimes.get(i).getStart().before(rentalTimes.get(i).getEnd())){
        		return false;
        	}
        	for(int j = i; j < rentalTimes.size(); j++) {
        		/*if(rentalTimes.get(i).getEnd().
            		return false;
            	}*/
        	}
        }
    	for(RentalTime r : rentalTimes){
          if(r.getStart().before(r.getEnd())){
              return false;
          }
          //for()
        }
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	return false;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), 
                                       sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), 
                                       sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), 
                                       sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));
    }
}

class RentalTime {
    private Date start, end;
    
    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    
    public Date getStart() {
        return this.start;
    }
    
    public Date getEnd() {
        return this.end;
    } 
}