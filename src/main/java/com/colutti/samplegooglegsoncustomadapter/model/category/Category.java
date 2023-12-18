package com.colutti.samplegooglegsoncustomadapter.model.category;

import com.colutti.samplegooglegsoncustomadapter.model.link.Link;

import java.util.List;

public class Category {

    private String title;
    private String description;
    private Boolean active;
    private List<Category> subCategories;

    // A interface to represent many types of Links
    private Link link;

    public Category(){}

    public Category(String title, String description, Boolean active, List<Category> subCategories, Link link) {
        this.title = title;
        this.description = description;
        this.active = active;
        this.subCategories = subCategories;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
