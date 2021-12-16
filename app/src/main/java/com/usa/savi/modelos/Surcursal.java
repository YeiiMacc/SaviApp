package com.usa.savi.modelos;

public class Surcursal {

    private int id;
    private String name;
    private String location;
    private byte[] image;

    public Surcursal(int id, String name, String location, byte[] image) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.image = image;
    }
    public Surcursal() {
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
