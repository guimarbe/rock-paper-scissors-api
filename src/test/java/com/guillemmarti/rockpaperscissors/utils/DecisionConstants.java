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
                Decision.ROCK.getDescription(),
                Decision.SCISSORS.getDescription(),
                Result.WIN.getDescription());
    }

    public static ResultResponse samplePapervsRocksWinResultResponse() {
        return new ResultResponse(
                Decision.PAPER.getDescription(),
                Decision.ROCK.getDescription(),
                Result.WIN.getDescription());
    }

    public static ResultResponse sampleScissorsvsPaperWinResultResponse() {
        return new ResultResponse(
                Decision.SCISSORS.getDescription(),
                Decision.PAPER.getDescription(),
                Result.WIN.getDescription());
    }

    public static ResultResponse sampleRockDrawResultResponse() {
        return new ResultResponse(
                Decision.ROCK.getDescription(),
                Decision.ROCK.getDescription(),
                Result.DRAW.getDescription());
    }

    public static ResultResponse samplePaperDrawResultResponse() {
        return new ResultResponse(
                Decision.PAPER.getDescription(),
                Decision.PAPER.getDescription(),
                Result.DRAW.getDescription());
    }

    public static ResultResponse sampleScissorsDrawResultResponse() {
        return new ResultResponse(
                Decision.SCISSORS.getDescription(),
                Decision.SCISSORS.getDescription(),
                Result.DRAW.getDescription());
    }

    public static ResultResponse sampleScissorsvsRockLoseResultResponse() {
        return new ResultResponse(
                Decision.SCISSORS.getDescription(),
                Decision.ROCK.getDescription(),
                Result.LOSE.getDescription());
    }

    public static ResultResponse sampleRockvsPaperLoseResultResponse() {
        return new ResultResponse(
                Decision.ROCK.getDescription(),
                Decision.PAPER.getDescription(),
                Result.LOSE.getDescription());
    }

    public static ResultResponse samplePapervsScissorsLoseResultResponse() {
        return new ResultResponse(
                Decision.PAPER.getDescription(),
                Decision.SCISSORS.getDescription(),
                Result.LOSE.getDescription());
    }


}
