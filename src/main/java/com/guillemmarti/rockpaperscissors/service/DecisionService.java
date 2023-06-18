package com.guillemmarti.rockpaperscissors.service;

import com.guillemmarti.rockpaperscissors.adapter.ResultResponseAdapter;
import com.guillemmarti.rockpaperscissors.model.Decision;
import com.guillemmarti.rockpaperscissors.model.Result;
import com.guillemmarti.rockpaperscissors.model.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DecisionService {

    RandomGenerator random;

    @Autowired
    public DecisionService(RandomGenerator random) {
        this.random = random;
    }

    public Decision getCpuDecision() {
        final var randomNumber = random.nextInt(3);

        return Decision.getDecisionByCode(randomNumber);
    }

    public ResultResponse getResult(final Decision playerDecision) {
        final var cpuDecision = getCpuDecision();
        Result result;

        if (playerDecision.equals(cpuDecision)) {
            result = Result.DRAW;
        } else if (isPlayerWinner(playerDecision, cpuDecision)) {
            result = Result.WIN;
        } else {
            result = Result.LOSE;
        }

        return ResultResponseAdapter.adapt(playerDecision, cpuDecision, result);
    }

    private Boolean isPlayerWinner(final Decision playerDecision, final Decision cpuDecision) {
        var isAWin = false;

        switch (playerDecision) {
            case ROCK:
                isAWin = Decision.SCISSORS.equals(cpuDecision);
                break;
            case PAPER:
                isAWin = Decision.ROCK.equals(cpuDecision);
                break;
            case SCISSORS:
                isAWin = Decision.PAPER.equals(cpuDecision);
                break;
        }

        return isAWin;
    }

}
