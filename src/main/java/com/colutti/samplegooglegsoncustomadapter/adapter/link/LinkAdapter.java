package com.colutti.samplegooglegsoncustomadapter.adapter.link;

import com.colutti.samplegooglegsoncustomadapter.deserialization.link.ALinkTypeDeserialization;
import com.colutti.samplegooglegsoncustomadapter.deserialization.link.GithubLinkDeserialization;
import com.colutti.samplegooglegsoncustomadapter.deserialization.link.GoogleLinkDeserialization;
import com.colutti.samplegooglegsoncustomadapter.deserialization.link.WithoutDeserialization;
import com.colutti.samplegooglegsoncustomadapter.model.link.Link;
import com.google.gson.*;
import java.lang.reflect.Type;

public class LinkAdapter implements JsonSerializer<Link>, JsonDeserializer<Link> {

    private static final String LINK_TYPE_KEY = "linkType";

    private ALinkTypeDeserialization linkTypeDeserialization;

    public LinkAdapter() {
        this.linkTypeDeserialization = new GoogleLinkDeserialization(
                new GithubLinkDeserialization(
                        new WithoutDeserialization()
                )
        );
    }

    @Override
    public JsonElement serialize(Link src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }

    @Override
    public Link deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String linkType = jsonObject.getAsJsonPrimitive(LINK_TYPE_KEY).getAsString();
        return this.linkTypeDeserialization.getLinkImplementation(linkType, json, context);
    }
}
