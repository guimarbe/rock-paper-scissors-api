package com.guillemmarti.rockpaperscissors.model;

import java.util.HashMap;
import java.util.Map;

public enum Decision {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private static final Map<Integer, Decision> byCode = new HashMap<>();

    static {
        for (Decision decision : values()) {
            byCode.put(decision.code, decision);
        }
    }

    private final Integer code;

    Decision(final Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static Decision getDecisionByCode(final Integer code) {
        return byCode.get(code);
    }

}
