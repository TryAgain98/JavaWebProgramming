/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.demo.dto;

import java.sql.Struct;

/**
 *
 * @author Toan
 */
public class Products {
    private int id;
    private String name;
    private String description;
    private int author_id;
    private String images;
    private String author_name;
    private String created_at;
    private String updated_at;

    public Products() {
    }

    public Products(int id, String name, String description, int author_id, String images, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author_id = author_id;
        this.images = images;
      
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }



    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

   
    
}
