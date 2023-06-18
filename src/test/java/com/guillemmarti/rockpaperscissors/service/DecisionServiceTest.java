package com.guillemmarti.rockpaperscissors.service;

import static com.guillemmarti.rockpaperscissors.utils.DecisionConstants.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

import com.guillemmarti.rockpaperscissors.model.Decision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DecisionServiceTest {

    @Mock
    RandomGenerator randomGenerator;

    DecisionService decisionService;

    @BeforeEach
    void setup() {
        decisionService = new DecisionService(randomGenerator);
    }

    @Test
    void shouldGetCpuDecision() {
        // Given
        final var expected = Decision.ROCK;

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.ROCK.getCode());
        final var result = decisionService.getCpuDecision();

        // Then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldGetRockVsScissorsWinResult() {
        // Given
        final var expected = sampleRockvsScissorsWinResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.SCISSORS.getCode());
        final var result = decisionService.getResult(Decision.ROCK);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetPaperVsRockWinResult() {
        // Given
        final var expected = samplePapervsRocksWinResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.ROCK.getCode());
        final var result = decisionService.getResult(Decision.PAPER);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetScissorsVsRaperWinResult() {
        // Given
        final var expected = sampleScissorsvsPaperWinResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.PAPER.getCode());
        final var result = decisionService.getResult(Decision.SCISSORS);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetRockDrawResult() {
        // Given
        final var expected = sampleRockDrawResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.ROCK.getCode());
        final var result = decisionService.getResult(Decision.ROCK);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetPaperDrawResult() {
        // Given
        final var expected = samplePaperDrawResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.PAPER.getCode());
        final var result = decisionService.getResult(Decision.PAPER);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetScissorsDrawResult() {
        // Given
        final var expected = sampleScissorsDrawResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.SCISSORS.getCode());
        final var result = decisionService.getResult(Decision.SCISSORS);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetScissorsVsRockLoseResult() {
        // Given
        final var expected = sampleScissorsvsRockLoseResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.ROCK.getCode());
        final var result = decisionService.getResult(Decision.SCISSORS);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetRockVsPaperLoseResult() {
        // Given
        final var expected = sampleRockvsPaperLoseResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.PAPER.getCode());
        final var result = decisionService.getResult(Decision.ROCK);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

    @Test
    void shouldGetPaperVsScissorsLoseResult() {
        // Given
        final var expected = samplePapervsScissorsLoseResultResponse();

        // When
        Mockito.when(randomGenerator.nextInt(any())).thenReturn(Decision.SCISSORS.getCode());
        final var result = decisionService.getResult(Decision.PAPER);

        // Then
        Assertions.assertEquals(expected, result);
        Mockito.verify(randomGenerator, times(1)).nextInt(any());
    }

}
