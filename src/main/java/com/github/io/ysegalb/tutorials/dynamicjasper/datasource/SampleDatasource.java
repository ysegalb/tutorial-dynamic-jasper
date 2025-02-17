package com.github.io.ysegalb.tutorials.dynamicjasper.datasource;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import ar.com.fdvs.dj.domain.entities.columns.AbstractColumn;
import ar.com.fdvs.dj.util.SortUtils;

public class SampleDatasource {

    public static JRDataSource getDatasource(List<AbstractColumn> columns) {
        List<Employee> data = new ArrayList<Employee>();
        data.addAll(EmployeeHelper.getEmployees());
        data = SortUtils.sortCollection(data, columns);

        return new JRBeanCollectionDataSource(data); // here contains dummy hardcoded objects...
    }

}
