package com.colutti.samplegooglegsoncustomadapter.deserialization.link;

import com.colutti.samplegooglegsoncustomadapter.model.link.GoogleLink;
import com.colutti.samplegooglegsoncustomadapter.model.link.Link;
import com.colutti.samplegooglegsoncustomadapter.model.link.LinkType;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;

public class GoogleLinkDeserialization extends ALinkTypeDeserialization {

    public GoogleLinkDeserialization(ALinkTypeDeserialization next) {
        super(next);
    }

    @Override
    public Link getLinkImplementation(String type, JsonElement json, JsonDeserializationContext context) {
        if (type.equals(LinkType.GOOGLE.getType())) {
            return context.deserialize(json, GoogleLink.class);
        }

        return next.getLinkImplementation(type, json, context);
    }
}
