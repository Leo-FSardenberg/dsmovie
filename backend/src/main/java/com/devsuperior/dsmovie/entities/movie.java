package com.devsuperior.dsmovie.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double value;
    private Integer count;
    private String image;

 public movie() {

 }
   
 
public movie(Long id, String title, Double value, Integer count, String image) {
    this.id = id;
    this.title = title;
    this.value = value;
    this.count = count;
    this.image = image;
}


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getTitle() {
    return title;
}


public void setTitle(String title) {
    this.title = title;
}


public Double getValue() {
    return value;
}


public void setValue(Double value) {
    this.value = value;
}


public Integer getCount() {
    return count;
}


public void setCount(Integer count) {
    this.count = count;
}


public String getImage() {
    return image;
}


public void setImage(String image) {
    this.image = image;
} 



}