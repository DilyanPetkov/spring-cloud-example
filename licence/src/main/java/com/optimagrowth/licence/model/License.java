package com.optimagrowth.licence.model;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class License {
    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
