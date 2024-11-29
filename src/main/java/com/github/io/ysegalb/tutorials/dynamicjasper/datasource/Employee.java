package com.github.io.ysegalb.tutorials.dynamicjasper.datasource;

import lombok.Getter;

public record Employee(
    @Getter
    Long id,
    @Getter
    String firstname,
    @Getter
    String surname,
    @Getter
    String startDate,
    @Getter
    String salary,
    @Getter
    String department
) {}

