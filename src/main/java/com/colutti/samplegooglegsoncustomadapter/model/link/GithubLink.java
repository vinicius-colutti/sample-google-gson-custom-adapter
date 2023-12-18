package com.colutti.samplegooglegsoncustomadapter.model.link;

public class GithubLink implements Link {

    private LinkType linkType;

    private String url;
    private String user;
    private String branch;

    public GithubLink() {
    }

    public GithubLink(LinkType linkType, String url, String user, String branch) {
        this.linkType = linkType;
        this.url = url;
        this.user = user;
        this.branch = branch;
    }

    public LinkType getLinkType() {
        return linkType;
    }

    public void setLinkType(LinkType linkType) {
        this.linkType = linkType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
