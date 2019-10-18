package com.exasol.logging;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class CapturingLogHandlerTest {

    @Test
    void testCapturingLogMessage() {
        final String messageToBeCaptured = "Capture this!";
        final Logger logger = Logger.getLogger("com.exasol");
        final CapturingLogHandler capturingLogHandler = new CapturingLogHandler();
        Logger.getLogger("com.exasol").addHandler(capturingLogHandler);
        logger.info(messageToBeCaptured);
        assertThat(capturingLogHandler.getCapturedData(), equalTo(messageToBeCaptured));
    }

    @Test
    void testClose() {
        final String messageToBeIngored = "Ignore this!";
        final String messageToBeCaptured = "Capture that!";
        final Logger logger = Logger.getLogger("com.exasol");
        final CapturingLogHandler capturingLogHandler = new CapturingLogHandler();
        Logger.getLogger("com.exasol").addHandler(capturingLogHandler);
        logger.info(messageToBeIngored);
        capturingLogHandler.close();
        logger.info(messageToBeCaptured);
        assertThat(capturingLogHandler.getCapturedData(), equalTo(messageToBeCaptured));
    }
}