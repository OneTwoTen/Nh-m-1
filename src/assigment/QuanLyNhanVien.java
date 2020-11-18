/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment;

public class QuanLyNhanVien{
    
    private String Manv,hoten;
    private int tuoi;
    private String email;
    private double luong;
    

    public QuanLyNhanVien() {
       this.Manv = "";
        this.hoten = "";
        this.tuoi = 19;
        this.email = "";
        this.luong = 650000;

    }
    public QuanLyNhanVien(String Manv, String hoten, int tuoi, String email, double luong) {
        this.Manv = Manv;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }
    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
       return this.Manv + "\t" + this.hoten + "\t" + this.tuoi + "\t" + this.email + "\t" + this.luong;
    }
}

    
