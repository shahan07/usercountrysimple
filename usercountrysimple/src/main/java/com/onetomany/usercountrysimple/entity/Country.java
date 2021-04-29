package com.onetomany.usercountrysimple.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "country")
public class Country {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "cid")
    private int cid;
    private int code;
    private String countryName;
   // @OneToMany(targetEntity = Users.class,cascade = CascadeType.ALL)
    //@JoinColumn(name ="cp_fk",referencedColumnName = "id")
    //private List<Users> users;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    //public List<Users> getUsers() {return users;}

    //public void setUsers(List<Users> users) {this.users = users;}
}
