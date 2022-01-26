package com.gsengage.report.service;

import com.gsengage.report.dto.Template;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ReportService {

    @Inject
    MongoClient mongoClient;

    public String addReportTemplate(Template template){
        Document document = new Document();
        document.append("templateId", template.getTemplateId());
        document.append("templateName", template.getTemplateName());
        getCollection().insertOne(document);
        return "reportId";
    }

    private MongoCollection getCollection(){
        return mongoClient.getDatabase("report").getCollection("template");
    }
}
