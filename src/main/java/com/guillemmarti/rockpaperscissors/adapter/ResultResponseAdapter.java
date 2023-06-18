package com.guillemmarti.rockpaperscissors.adapter;

import com.guillemmarti.rockpaperscissors.model.Decision;
import com.guillemmarti.rockpaperscissors.model.Result;
import com.guillemmarti.rockpaperscissors.model.ResultResponse;

public final class ResultResponseAdapter {

    private ResultResponseAdapter() {}

    public static ResultResponse adapt(final Decision playerDecision, final Decision cpuDecision, final Result result) {
        return ResultResponse.builder()
                .playerDecision(playerDecision.getDescription())
                .cpuDecision(cpuDecision.getDescription())
                .result(result.getDescription())
                .build();
    }
}
