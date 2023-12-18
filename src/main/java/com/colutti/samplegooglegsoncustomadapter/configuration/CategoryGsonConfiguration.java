package com.colutti.samplegooglegsoncustomadapter.configuration;

import com.colutti.samplegooglegsoncustomadapter.adapter.link.LinkAdapter;
import com.colutti.samplegooglegsoncustomadapter.model.link.Link;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryGsonConfiguration {

    @Bean
    public Gson categoryGsonBuilder() {
        return new GsonBuilder()
                .registerTypeAdapter(Link.class, new LinkAdapter())
                .setPrettyPrinting()
                .create();
    }
}
