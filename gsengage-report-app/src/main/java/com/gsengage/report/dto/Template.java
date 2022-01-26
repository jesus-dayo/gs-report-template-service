package com.gsengage.report.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Template {

    private String templateId;
    private String templateName;
    private TemplateRow templateRow;
}
