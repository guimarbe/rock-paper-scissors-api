package com.guillemmarti.rockpaperscissors.model;

import java.util.HashMap;
import java.util.Map;

public enum Decision {
    ROCK(0, "rock"),
    PAPER(1, "paper"),
    SCISSORS(2, "scissors");

    private static final Map<Integer, Decision> byCode = new HashMap<>();

    static {
        for (Decision decision : values()) {
            byCode.put(decision.code, decision);
        }
    }

    private final Integer code;
    private final String description;

    Decision(final Integer code, final String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Decision getDecisionByCode(final Integer code) {
        return byCode.get(code);
    }

}
