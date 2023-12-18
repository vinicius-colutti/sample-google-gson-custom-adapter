package com.colutti.samplegooglegsoncustomadapter.deserialization.link;

import com.colutti.samplegooglegsoncustomadapter.model.link.Link;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;

public class WithoutDeserialization extends ALinkTypeDeserialization {

    public WithoutDeserialization() {
        super(null);
    }

    @Override
    public Link getLinkImplementation(String type, JsonElement json, JsonDeserializationContext context) {
        return null;
    }
}
