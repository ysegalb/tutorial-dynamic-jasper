package com.github.io.ysegalb.tutorials.dynamicjasper.exporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.*;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportExporter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReportExporter.class);

    public static void exportReport(JasperPrint jp, String path) throws JRException, FileNotFoundException {
        LOGGER.info("Exporting report to: " + path);
        JRPdfExporter exporter = new JRPdfExporter();

        File outputFile = new File(path);
        File parentFile = outputFile.getParentFile();
        if (parentFile != null) parentFile.mkdirs();
        FileOutputStream fos = new FileOutputStream(outputFile);

        exporter.setExporterInput(new SimpleExporterInput(jp));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(fos));

        exporter.exportReport();

        LOGGER.info("Report exported: " + path);
    }

}