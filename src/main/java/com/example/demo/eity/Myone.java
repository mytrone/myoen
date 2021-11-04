package com.example.demo.eity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Myone {
    private Integer myid;
    private String myname;
	private Integer age;

    public Myone() {
    }

    @Override
    public String toString() {
        return "Myone{" +
                "myid=" + myid +
                ", myname='" + myname + '\'' +
                '}';
    }

    @Id
    @Column(name = "myid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getMyid() {
        return myid;
    }

    public void setMyid(Integer myid) {
        this.myid = myid;
    }

    @Basic
    @Column(name = "myname", nullable = true, length = 255)
    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Myone myone = (Myone) o;
        return Objects.equals(myid, myone.myid) &&
                Objects.equals(myname, myone.myname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(myid, myname);
    }

    public Myone(Integer myid, String myname) {
        this.myid = myid;
        this.myname = myname;
    }
}
