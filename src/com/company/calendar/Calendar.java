package com.company.calendar;

public class Calendar {

    private Data data;
    private Time time;

    public Calendar() {
        data = new Data();
        time = new Time();
    }

    public Calendar(Data data, Time time) {
        this.data = data;
        this.time = time;
    }

    public void setData(int year, int month, int day, boolean isHoliday){
        data = new Data(year, month, day, isHoliday);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setTime(int hour, int minute, int second){
        time = new Time(hour, minute, second);
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void printData(){
        System.out.println(data);
    }

    public void printTime(){
        System.out.println(time);
    }

    public void printAll(){
        System.out.println(data + " " + time);
    }

    public class Data{

        private int year;
        private int month;
        private int day;
        private boolean isHoliday;
        private boolean isWeekend;

        public Data() {
            year = 2019;
            month = 1;
            day = 1;
            isHoliday = true;
            isWeekend = true;
        }

        public Data(int year, int month, int day, boolean isHoliday) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.isHoliday = isHoliday;
            isWeekend = isWeekend(day);
        }

        public boolean isWeekend(int day){
            if (day%7 == 6 || day%7 == 0) {
                return true;
            } else {
                return false;
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public boolean isHoliday() {
            return isHoliday;
        }

        public void setHoliday(boolean holiday) {
            isHoliday = holiday;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public void setWeekend(boolean weekend) {
            isWeekend = weekend;
        }

        @Override
        public String toString() {
            return year + "." + month +"." + day +
                    ", isHoliday=" + isHoliday +
                    ", isWeekend=" + isWeekend;
        }
    }

    public class Time{

        private int hour;
        private int minute;
        private int second;

        public Time() {
            hour = 0;
            minute = 0;
            second = 0;
        }

        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", hour, minute, second);
        }
    }
}
