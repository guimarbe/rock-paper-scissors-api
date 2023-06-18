package com.guillemmarti.rockpaperscissors.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ResultResponse {

    private final String playerDecision;

    private final String cpuDecision;

    private final String result;

}
