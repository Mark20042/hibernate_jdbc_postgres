package com.mark;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "alien_table")
public class Alien
{
    @Id
    private int aid;

    // change the column name in database
    @Column(name = "alien_name")
    private String aname;


    // not store in database
//    @Transient
    private String tech;

    @OneToMany
    private List<Laptop> laptops;




    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }



    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
