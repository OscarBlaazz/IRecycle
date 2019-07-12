package com.oscarblas.irecycle;

public class LugaresPV {
    private String name;
    private String type;
    private double lng;
    private double lat;

    public LugaresPV(String name, String type, double lng, double lat) {
        this.name = name;
        this.type = type;
        this.lng = lng;
        this.lat = lat;
    }

    public LugaresPV() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
