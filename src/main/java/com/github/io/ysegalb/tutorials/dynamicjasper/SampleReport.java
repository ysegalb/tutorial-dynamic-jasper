package com.github.io.ysegalb.tutorials.dynamicjasper;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.*;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.DynamicReport;

import com.github.io.ysegalb.tutorials.dynamicjasper.datasource.SampleDatasource;
import com.github.io.ysegalb.tutorials.dynamicjasper.exporter.ReportExporter;

public class SampleReport {

    private static Report report;

    private static JasperPrint jasperPrint;

    private static JasperReport jasperReport;

    private static Map<String, Object> parameters = new HashMap<>();

    private static DynamicReport dynamicReport;

    public static void main(String[] args) throws Exception {
        report = new Report();
        dynamicReport = report.buildReport();

        JRDataSource dataSource = SampleDatasource.getDatasource(dynamicReport.getColumns());

        jasperReport = DynamicJasperHelper.generateJasperReport(dynamicReport, new ClassicLayoutManager(), parameters);

        jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

        ReportExporter.exportReport(jasperPrint, "./report.pdf");

        DynamicJasperHelper.generateJRXML(
            dynamicReport, 
            new ClassicLayoutManager(), 
            parameters, 
            "UTF-8",
            "./report.jrxml"
        );

    }

}
