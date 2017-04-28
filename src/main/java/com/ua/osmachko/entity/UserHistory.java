package com.ua.osmachko.entity;

import java.util.Date;

/**
 * Created by Valerii_Osmachko on 4/28/2017.
 */
public class UserHistory {

    private int id;
    private User user;

    private Date entryTime;
    private String entry;

    public UserHistory(){}

    public UserHistory(Date entryTime, String entry) {
        this.entryTime = entryTime;
        this.entry = entry;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
