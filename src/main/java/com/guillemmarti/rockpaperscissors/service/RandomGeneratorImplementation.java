package com.guillemmarti.rockpaperscissors.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGeneratorImplementation implements RandomGenerator {

    @Override
    public Integer nextInt(final Integer bound) {
        return new Random().nextInt(bound);
    }

}
