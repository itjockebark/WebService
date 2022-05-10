
package com.example.webservicelabb3.SMHI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "levelType",
    "level",
    "unit",
    "values"
})
@Generated("jsonschema2pojo")
public class Parameter {

    @JsonProperty("name")
    private String name;
    @JsonProperty("levelType")
    private String levelType;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("values")
    private List<Double> values = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("levelType")
    public String getLevelType() {
        return levelType;
    }

    @JsonProperty("levelType")
    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("values")
    public List<Double> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<Double> values) {
        this.values = values;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
