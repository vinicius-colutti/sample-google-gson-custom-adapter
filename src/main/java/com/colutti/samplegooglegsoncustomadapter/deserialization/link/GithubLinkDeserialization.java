package com.colutti.samplegooglegsoncustomadapter.deserialization.link;

import com.colutti.samplegooglegsoncustomadapter.model.link.GithubLink;
import com.colutti.samplegooglegsoncustomadapter.model.link.Link;
import com.colutti.samplegooglegsoncustomadapter.model.link.LinkType;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;

public class GithubLinkDeserialization extends ALinkTypeDeserialization {

    public GithubLinkDeserialization(ALinkTypeDeserialization next) {
        super(next);
    }

    @Override
    public Link getLinkImplementation(String type, JsonElement json, JsonDeserializationContext context) {
        if (type.equals(LinkType.GITHUB.getType())) {
            return context.deserialize(json, GithubLink.class);
        }

        return next.getLinkImplementation(type, json, context);
    }
}
