package com.colutti.samplegooglegsoncustomadapter.model.link;

import java.util.List;

public class GoogleLink implements Link {

    private LinkType linkType;

    private String link;
    private String websiteOwner;
    private List<String> metadata;

    public GoogleLink() {
    }

    public GoogleLink(LinkType linkType, String link, String websiteOwner, List<String> metadata) {
        this.linkType = linkType;
        this.link = link;
        this.websiteOwner = websiteOwner;
        this.metadata = metadata;
    }

    public LinkType getLinkType() {
        return linkType;
    }

    public void setLinkType(LinkType linkType) {
        this.linkType = linkType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getWebsiteOwner() {
        return websiteOwner;
    }

    public void setWebsiteOwner(String websiteOwner) {
        this.websiteOwner = websiteOwner;
    }

    public List<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<String> metadata) {
        this.metadata = metadata;
    }
}
