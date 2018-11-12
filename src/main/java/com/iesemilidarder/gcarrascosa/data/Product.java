package com.iesemilidarder.gcarrascosa.data;

public abstract class Product {

    private String area;
    private String name;
    private Double price;
    private String activityKind;
    private String company;
    private String geographically;


    public String getGeographically() {
        return geographically;
    }

    public void setGeographically(String geographically) {
        this.geographically = geographically;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getActivityKind() {
        return activityKind;
    }

    public void setActivityKind(String activityKind) {
        this.activityKind = activityKind;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
