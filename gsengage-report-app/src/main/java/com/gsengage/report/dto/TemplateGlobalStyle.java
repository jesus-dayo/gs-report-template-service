package com.gsengage.report.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateGlobalStyle {
    private String fontSize;
}
