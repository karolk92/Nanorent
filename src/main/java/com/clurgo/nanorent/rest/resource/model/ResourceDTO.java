package com.clurgo.nanorent.rest.resource.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ResourceDTO {

    private Long reservationId;
    private Long recourseId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String nameAndSurname;
}
