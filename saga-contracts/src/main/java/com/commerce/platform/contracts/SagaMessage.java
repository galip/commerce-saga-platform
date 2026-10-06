package com.commerce.platform.contracts;

import java.time.Instant;
import java.util.UUID;

public interface SagaMessage {

    UUID messageId();

    UUID sagaId();

    UUID correlationId();

    Instant occurredAt();
}