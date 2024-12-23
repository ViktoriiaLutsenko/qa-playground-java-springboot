package com.vlutsenko.qaplaygroundjavaspring.page.multileveldropdown.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Submenu {

    @Id
    private Integer id;
    private String menu;
    private String title;
    private String link;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
