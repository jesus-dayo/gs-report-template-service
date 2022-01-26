package com.gsengage.report.resource;

import com.gsengage.report.dto.Template;
import com.gsengage.report.service.ReportService;
import jdk.jfr.ContentType;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/report")
public class ReportResource {

    @Inject
    ReportService reportService;

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/add")
    public Response addReportTemplate(Template template) {
        String reportId = reportService.addReportTemplate(template);
        return Response.ok(reportId).status(201).build();
    }
}