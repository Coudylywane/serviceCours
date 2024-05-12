package com.example.servicecours.modile.dtos;

import com.example.servicecours.data.enums.CoursStatus;
import lombok.Value;

import java.io.Serializable;

@Value
public class CoursDto implements Serializable {
    Long id;
    String module;
    String professor;
    CoursStatus status;
}
