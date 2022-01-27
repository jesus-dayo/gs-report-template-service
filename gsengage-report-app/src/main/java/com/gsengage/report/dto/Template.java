package com.gsengage.report.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Template {

    private String templateId;
    private String templateName;
    private List<TemplateRow> templateRows;
    private TemplateGlobalStyle templateGlobalStyle;
    private String createdBy;
    private String updatedBy;

}
