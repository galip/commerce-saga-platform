package com.commerce.platform.contracts.event;

import com.commerce.platform.contracts.SagaMessage;
import com.commerce.platform.contracts.model.FailureReason;

import java.time.Instant;
import java.util.UUID;

public record PaymentAuthorizationReleaseFailedEvent(
        UUID messageId,
        UUID sagaId,
        UUID correlationId,
        Instant occurredAt,
        UUID orderId,
        UUID paymentAuthorizationId,
        FailureReason reason,
        String detail
) implements SagaMessage {
}