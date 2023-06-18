package com.guillemmarti.rockpaperscissors.adapter;

import static com.guillemmarti.rockpaperscissors.utils.DecisionConstants.sampleRockvsScissorsWinResultResponse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.guillemmarti.rockpaperscissors.model.Decision;
import com.guillemmarti.rockpaperscissors.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

class ResultResponseAdapterTest {

    @Test
    void shouldAdaptCorrectly() {
        // Given
        final var expected = sampleRockvsScissorsWinResultResponse();

        // When
        final var result = ResultResponseAdapter.adapt(Decision.ROCK, Decision.SCISSORS, Result.WIN);

        // Then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testConstructorIsPrivate() throws NoSuchMethodException, InvocationTargetException, InstantiationException,
            IllegalAccessException {
        // Given
        Constructor<ResultResponseAdapter> constructor = ResultResponseAdapter.class.getDeclaredConstructor();

        // When - Then
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}
