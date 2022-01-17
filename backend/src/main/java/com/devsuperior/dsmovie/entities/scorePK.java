package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class scorePK implements Serializable{
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private movie movie;
 
    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;
    public scorePK(){}

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public movie getMovie() {
        return movie;
    }

    public void setMovie(movie movie) {
        this.movie = movie;
    }

    
}
