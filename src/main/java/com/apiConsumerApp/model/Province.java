package com.apiConsumerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Province {

    @JsonProperty("display-name")
    private String displayName;
    @JsonProperty("value")
    private String value;
}
