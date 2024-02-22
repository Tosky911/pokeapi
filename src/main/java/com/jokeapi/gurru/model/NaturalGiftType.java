
package com.jokeapi.gurru.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import jakarta.validation.Valid;

@Generated("jsonschema2pojo")
public class NaturalGiftType {

    public String name;
    public String url;
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
