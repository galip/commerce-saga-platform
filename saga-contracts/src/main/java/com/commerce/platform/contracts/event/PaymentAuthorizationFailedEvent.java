package com.commerce.platform.contracts.event;

import com.commerce.platform.contracts.SagaMessage;
import com.commerce.platform.contracts.model.FailureReason;

import java.time.Instant;
import java.util.UUID;

public record PaymentAuthorizationFailedEvent(
        UUID messageId,
        UUID sagaId,
        UUID correlationId,
        Instant occurredAt,
        UUID orderId,
        FailureReason reason,
        String detail
) implements SagaMessage {
}