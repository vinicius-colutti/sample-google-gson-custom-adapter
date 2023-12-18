package com.colutti.samplegooglegsoncustomadapter.model.link;

public enum LinkType {

    GOOGLE("GOOGLE"), GITHUB("GITHUB");

    private String type;

    LinkType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
