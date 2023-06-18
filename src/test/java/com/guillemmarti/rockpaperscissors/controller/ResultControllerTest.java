package com.guillemmarti.rockpaperscissors.controller;

import com.guillemmarti.rockpaperscissors.model.Decision;
import com.guillemmarti.rockpaperscissors.service.DecisionService;
import com.guillemmarti.rockpaperscissors.service.RandomGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class ResultControllerTest {

    @Mock
    RandomGenerator randomGenerator;

    @Mock
    DecisionService decisionService;

    ResultController resultController;

    @BeforeEach
    void setup() {
        resultController = new ResultController(decisionService);
    }

    @Test
    void shouldGetCpuDecision() {
        Assertions.assertDoesNotThrow(() -> resultController.getCpuDecision());
        Mockito.verify(decisionService, Mockito.times(1)).getCpuDecision();
    }

    @Test
    void shouldGetMatchResult() {
        Assertions.assertDoesNotThrow(() -> resultController.getResult(Decision.ROCK));
        Mockito.verify(decisionService, Mockito.times(1)).getResult(any());
    }

}
