package com.idealoop.busseek.model;

import java.util.ArrayList;

public class Bus {
    String bustype; //Time selecting Variables
    String vehicleno,regno,drivername,drivercontact,routeno,from,to,username,busID;
    ArrayList <String> TimeSlots;
    String[] timeslot1 = new String[2];
    String[] timeslot2 = new String[2];
    String[] timeslot3 = new String[2];
    String[] timeslot4 = new String[2];


    public Bus(String bustype, String vehicleno, String regno, String drivername, String drivercontact, String routeno, String from, String to, String username, String busID) {
        this.bustype = bustype;
        this.vehicleno = vehicleno;
        this.regno = regno;
        this.drivername = drivername;
        this.drivercontact = drivercontact;
        this.routeno = routeno;
        this.from = from;
        this.to = to;
        this.username = username;
        this.busID = busID;
    }

    public Bus(String bustype, String vehicleno, String regno, String drivername, String drivercontact, String routeno, String from, String to, String username, String busID, String[] timeslot1, String[] timeslot2, String[] timeslot3, String[] timeslot4) {
        this.bustype = bustype;
        this.vehicleno = vehicleno;
        this.regno = regno;
        this.drivername = drivername;
        this.drivercontact = drivercontact;
        this.routeno = routeno;
        this.from = from;
        this.to = to;
        this.username = username;
        this.busID = busID;
        this.timeslot1 = timeslot1;
        this.timeslot2 = timeslot2;
        this.timeslot3 = timeslot3;
        this.timeslot4 = timeslot4;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getDrivercontact() {
        return drivercontact;
    }

    public void setDrivercontact(String drivercontact) {
        this.drivercontact = drivercontact;
    }

    public String getRouteno() {
        return routeno;
    }

    public void setRouteno(String routeno) {
        this.routeno = routeno;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBusID() {
        return busID;
    }

    public void setBusID(String busID) {
        this.busID = busID;
    }

    public ArrayList<String> getTimeSlots() {
        return TimeSlots;
    }

    public void setTimeSlots(ArrayList<String> timeSlots) {
        TimeSlots = timeSlots;
    }

    public String[] getTimeslot1() {
        return timeslot1;
    }

    public void setTimeslot1(String[] timeslot1) {
        this.timeslot1 = timeslot1;
    }

    public String[] getTimeslot2() {
        return timeslot2;
    }

    public void setTimeslot2(String[] timeslot2) {
        this.timeslot2 = timeslot2;
    }

    public String[] getTimeslot3() {
        return timeslot3;
    }

    public void setTimeslot3(String[] timeslot3) {
        this.timeslot3 = timeslot3;
    }

    public String[] getTimeslot4() {
        return timeslot4;
    }

    public void setTimeslot4(String[] timeslot4) {
        this.timeslot4 = timeslot4;
    }
}
