package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

import java.awt.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelResponse(List<Choice> choices) {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Choice(Message message){ }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Message(String content){ }
}
