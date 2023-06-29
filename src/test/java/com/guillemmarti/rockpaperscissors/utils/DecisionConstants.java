package com.guillemmarti.rockpaperscissors.utils;

import com.guillemmarti.rockpaperscissors.model.Decision;
import com.guillemmarti.rockpaperscissors.model.Result;
import com.guillemmarti.rockpaperscissors.model.ResultResponse;

public final class DecisionConstants {

    private DecisionConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static ResultResponse sampleRockvsScissorsWinResultResponse() {
        return new ResultResponse(
                Decision.ROCK,
                Decision.SCISSORS,
                Result.WIN);
    }

    public static ResultResponse samplePapervsRocksWinResultResponse() {
        return new ResultResponse(
                Decision.PAPER,
                Decision.ROCK,
                Result.WIN);
    }

    public static ResultResponse sampleScissorsvsPaperWinResultResponse() {
        return new ResultResponse(
                Decision.SCISSORS,
                Decision.PAPER,
                Result.WIN);
    }

    public static ResultResponse sampleRockDrawResultResponse() {
        return new ResultResponse(
                Decision.ROCK,
                Decision.ROCK,
                Result.DRAW);
    }

    public static ResultResponse samplePaperDrawResultResponse() {
        return new ResultResponse(
                Decision.PAPER,
                Decision.PAPER,
                Result.DRAW);
    }

    public static ResultResponse sampleScissorsDrawResultResponse() {
        return new ResultResponse(
                Decision.SCISSORS,
                Decision.SCISSORS,
                Result.DRAW);
    }

    public static ResultResponse sampleScissorsvsRockLoseResultResponse() {
        return new ResultResponse(
                Decision.SCISSORS,
                Decision.ROCK,
                Result.LOSE);
    }

    public static ResultResponse sampleRockvsPaperLoseResultResponse() {
        return new ResultResponse(
                Decision.ROCK,
                Decision.PAPER,
                Result.LOSE);
    }

    public static ResultResponse samplePapervsScissorsLoseResultResponse() {
        return new ResultResponse(
                Decision.PAPER,
                Decision.SCISSORS,
                Result.LOSE);
    }


}
