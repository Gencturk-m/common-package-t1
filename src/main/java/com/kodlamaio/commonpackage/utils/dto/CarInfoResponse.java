package com.kodlamaio.commonpackage.utils.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarInfoResponse {

    private String modelName;
    private String brandName;
    private String plate;
    private int modelYear;
}
