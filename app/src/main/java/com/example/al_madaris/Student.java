package com.example.al_madaris;

public class Student {
    private String stdName;
    private String StdRollno;
    private String StdFathercontact;
    private String paraNo;
    private String ayatFrom;
    private String ayatTo;
    private String Sabki;
    private String Manzil;

    public Student(String name, String rollno, String fathercontact, String parano, String ayatfrom, String ayatto, String sabki, String manzil)
    {
        this.stdName = name;
        this.StdRollno = rollno;
        this.StdFathercontact = fathercontact;
        this.paraNo = parano;
        this.ayatFrom = ayatfrom;
        this.ayatTo = ayatto;
        this.Sabki = sabki;
        this.Manzil = manzil;

    }

    public String getName() {
        return stdName;
    }

    public void setName(String name) {
        this.stdName = name;
    }

    public String getRollno() {
        return StdRollno;
    }

    public void setRollno(String rollno) {
        this.StdRollno = rollno;
    }

    public String getFather_contact() {
        return StdFathercontact;
    }

    public void setFathercontact(String fathercontact) {
        this.StdFathercontact = fathercontact;
    }

    public String getParano() {
        return paraNo;
    }

    public void setParano(String parano) {
        this.paraNo = parano;
    }

    public String getAyatfrom() {
        return ayatFrom;
    }

    public void setAyatfrom(String ayatfrom) {
        this.ayatFrom = ayatfrom;
    }

    public String getAyatto() {
        return ayatTo;
    }

    public void setAyat_to(String ayatto) {
        this.ayatTo = ayatto;
    }

    public String getSabki() {
        return Sabki;
    }

    public void setSabki(String sabki) {
        this.Sabki = sabki;
    }

    public String getManzil() {
        return Manzil;
    }

    public void setManzil(String manzil) {
        this.Manzil = manzil;
    }


}
