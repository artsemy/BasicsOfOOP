package com.company.calendar;

import java.util.Arrays;

public class Calendar {

    private Data[] holidays;

    //constructor
    public Calendar() {
        holidays = new Data[0];
    }

    //add holiday
    public void addHoliday(Data data){
        holidays = Arrays.copyOf(holidays, holidays.length+1);
        holidays[holidays.length-1] = data;
    }

    //print day info
    public void printDay(int year, int month, int day){
        Data data = new Data(year, month, day);
        data.setHoliday(checkForHoliday(data));
        System.out.println(data.toString());
    }

    //check for holiday
    public boolean checkForHoliday(Data data){
        for (Data d: holidays) {
            if (data.year == d.year && data.month == d.month && data.day == d.day){
                return true;
            }
        }
        return false;
    }

    public class Data{

        private int year;
        private int month;
        private int day;
        private boolean isHoliday;
        private boolean isWeekend;

        //constructor
        public Data() {
            year = 2019;
            month = 1;
            day = 1;
            isHoliday = true;
            isWeekend = true;
        }

        //constructor
        public Data(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
            isWeekend = isWeekend(day);
            isHoliday = false;
        }

        //set weekend
        public boolean isWeekend(int day){
            if (day%7 == 6 || day%7 == 0) {
                return true;
            } else {
                return false;
            }
        }

        //get method
        public boolean isHoliday() {
            return isHoliday;
        }

        //set method
        public void setHoliday(boolean holiday) {
            isHoliday = holiday;
        }

        //get method
        public boolean isWeekend() {
            return isWeekend;
        }

        //set method
        public void setWeekend(boolean weekend) {
            isWeekend = weekend;
        }

        //to string
        @Override
        public String toString() {
            return year + "." + month +"." + day +
                    ", isHoliday=" + isHoliday +
                    ", isWeekend=" + isWeekend;
        }
    }

}
