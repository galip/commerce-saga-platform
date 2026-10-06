package com.commerce.platform.contracts.event;

import com.commerce.platform.contracts.SagaMessage;

import java.time.Instant;
import java.util.UUID;

public record PaymentAuthorizationReleasedEvent(
        UUID messageId,
        UUID sagaId,
        UUID correlationId,
        Instant occurredAt,
        UUID orderId,
        UUID paymentAuthorizationId
) implements SagaMessage {
}