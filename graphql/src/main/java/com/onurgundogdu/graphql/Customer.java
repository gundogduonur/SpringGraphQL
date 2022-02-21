package com.onurgundogdu.graphql;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public record Customer(@Id @JsonProperty("id")Integer id, @JsonProperty("name") String name)
{

}

