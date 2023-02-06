package com.geekster.Restaurant.model;

public class restaurant {
    private String name ;
    private String address;
    private String number;
    private String special;
    private int totalStaff;
    private int totalBranches;
    private String headQuaters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public int getTotalBranches() {
        return totalBranches;
    }

    public void setTotalBranches(int totalBranches) {
        this.totalBranches = totalBranches;
    }

    public String getHeadQuaters() {
        return headQuaters;
    }

    public void setHeadQuaters(String headQuaters) {
        this.headQuaters = headQuaters;
    }

    public String toString() {
        return "restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", special='" + special + '\'' +
                ", totalStaff=" + totalStaff +
                ", totalBranches=" + totalBranches +
                ", headQuaters='" + headQuaters + '\'' +
                '}';
    }
}
