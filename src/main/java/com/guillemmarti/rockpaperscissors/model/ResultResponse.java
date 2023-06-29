package com.guillemmarti.rockpaperscissors.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ResultResponse {

    private final Decision playerDecision;

    private final Decision cpuDecision;

    private final Result result;

}
