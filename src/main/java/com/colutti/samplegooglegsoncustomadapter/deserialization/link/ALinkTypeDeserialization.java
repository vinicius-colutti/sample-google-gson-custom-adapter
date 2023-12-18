package com.colutti.samplegooglegsoncustomadapter.deserialization.link;

import com.colutti.samplegooglegsoncustomadapter.model.link.Link;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;

public abstract class ALinkTypeDeserialization {
    protected ALinkTypeDeserialization next;

    public ALinkTypeDeserialization(ALinkTypeDeserialization next) {
        this.next = next;
    }

    public abstract Link getLinkImplementation(String type, JsonElement json, JsonDeserializationContext context);
}
