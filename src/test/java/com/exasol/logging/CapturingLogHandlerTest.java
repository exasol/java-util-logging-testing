package com.exasol.logging;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CapturingLogHandlerTest {
    private final CapturingLogHandler capturingLogHandler = new CapturingLogHandler();

    @BeforeEach
    void beforeEach() {
        Logger.getLogger("com.exasol").addHandler(this.capturingLogHandler);
        this.capturingLogHandler.reset();
    }

    @Test
    void testCapturingLogMessage() {
        final String messageToBeCaptured = "Capture this!";
        Logger.getLogger("com.exasol").info(messageToBeCaptured);
        assertThat(this.capturingLogHandler.getCapturedData(), equalTo(messageToBeCaptured));
    }
}