package com.oyo.acp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Movie")
public class Movie {

    @Id
    private String id;
    private String name;
    private String theatreName;

    public Movie(){
    }

    public Movie(String name,String theatreName){
        super();
        //this.id = id;
        this.setName(name);
        this.setTheatreName(theatreName);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
}
