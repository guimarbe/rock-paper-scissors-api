package com.guillemmarti.rockpaperscissors.service;

import com.guillemmarti.rockpaperscissors.model.Decision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

class RandomGeneratorTest {

    RandomGenerator randomGenerator;

    @BeforeEach
    void setup() {
        randomGenerator = new RandomGeneratorImplementation();
    }

    @Test
    void shouldNextInt() {
        // Given
        final var result = randomGenerator.nextInt(3);

        // When - Then
        Assertions.assertInstanceOf(Integer.class, result);
        Assertions.assertTrue(result >= 0 && result < 3);
        Assertions.assertTrue(Decision.ROCK.getCode().equals(result) ||
                Decision.PAPER.getCode().equals(result) ||
                Decision.SCISSORS.getCode().equals(result));
    }

}
