package com.idealoop.busseek;

public class BusOwner {
    String fname;
    String lname;
    String address;
    String contactno;
    String NIC;
    String nofBuses;
    String BusOwnerId;
    String CustomerType;
    String imgurl;
    String email;

    public BusOwner(String imgurl,String fname, String lname, String NIC, String address, String contactno, String email, String nofBuses, String busOwnerId, String customerType) {
        this.imgurl = imgurl;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.contactno = contactno;
        this.NIC = NIC;
        this.nofBuses = nofBuses;
        BusOwnerId = busOwnerId;
        CustomerType = customerType;
        this.email = email;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BusOwner() {

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getNofBuses() {
        return nofBuses;
    }

    public void setNofBuses(String nofBuses) {
        this.nofBuses = nofBuses;
    }

    public String getBusOwnerId() {
        return BusOwnerId;
    }

    public void setBusOwnerId(String busOwnerId) {
        BusOwnerId = busOwnerId;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    @Override
    public String toString() {
        return "BusOwner{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                ", contactno='" + contactno + '\'' +
                ", NIC='" + NIC + '\'' +
                ", nofBuses=" + nofBuses +
                ", BusOwnerId='" + BusOwnerId + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                '}';
    }
}
