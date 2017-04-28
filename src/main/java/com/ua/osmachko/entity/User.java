package com.ua.osmachko.entity;

import java.util.*;

/**
 * Created by Valerii_Osmachko on 4/28/2017.
 */
public class User {

    private int id;
    private String name;
    private Set<UserHistory> history = new HashSet<>();
    private List<UserHistory> listHistory = new ArrayList<>();
    private Map<String,UserHistory> mapHistory = new HashMap<>();
    private Collection<UserHistory> collectionHistory = new ArrayList<>();
    private List<UserHistory> listUserHistroy = new ArrayList<>();


    private ProteinData proteinData = new ProteinData();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProteinData getProteinData() {
        return proteinData;
    }

    public void setProteinData(ProteinData proteinData) {
        this.proteinData = proteinData;
    }

    public Set<UserHistory> getHistory() {
        return history;
    }

    public void setHistory(Set<UserHistory> history) {
        this.history = history;
    }

    public List<UserHistory> getListHistory() {
        return listHistory;
    }

    public void setListHistory(List<UserHistory> listHistory) {
        this.listHistory = listHistory;
    }

    public Map<String, UserHistory> getMapHistory() {
        return mapHistory;
    }

    public void setMapHistory(Map<String, UserHistory> mapHistory) {
        this.mapHistory = mapHistory;
    }

    public Collection<UserHistory> getCollectionHistory() {
        return collectionHistory;
    }

    public void setCollectionHistory(Collection<UserHistory> collectionHistory) {
        this.collectionHistory = collectionHistory;
    }

    public List<UserHistory> getListUserHistroy() {
        return listUserHistroy;
    }

    public void setListUserHistroy(List<UserHistory> listUserHistroy) {
        this.listUserHistroy = listUserHistroy;
    }

    public void addHistory(UserHistory historyItem) {
        historyItem.setUser(this);
        listUserHistroy.add(historyItem);
    }

}
