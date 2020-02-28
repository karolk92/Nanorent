package com.clurgo.nanorent.rest.category.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CategoryDTO {

    private Long reservationId;
    private Long recourseId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String nameAndSurname;
}
