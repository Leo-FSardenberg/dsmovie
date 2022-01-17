package com.devsuperior.dsmovie.entities;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name = "tb_score")
public class score {
    @EmbeddedId
     private scorePK id = new scorePK();
     private Double value; 


    public score(){}

    public void setMovie(movie movie){
        id.setMovie(movie);
    }
    public void setUser(user user){
        id.setUser(user);
    }

    public score(scorePK id, Double value) {
        this.id = id;
        this.value = value;
    }

    

}
