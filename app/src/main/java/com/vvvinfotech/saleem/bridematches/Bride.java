package com.vvvinfotech.saleem.bridematches;

public class Bride {

    private  int id;
    private String title;
    private String age;
    private String caste;
    private String location;
    private  int image;

    public Bride(int id, String title, String age, String caste,String location, int image) {
        this.id = id;
        this.title = title;
        this.age = age;
        this.caste = caste;
        this.location=location;

        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAge() {
        return age;
    }

    public String getCaste() {
        return caste;
    }

    public String getLocation() {
        return location;
    }
    public int getImage() {
        return image;
    }
}
