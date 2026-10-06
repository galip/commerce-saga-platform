package com.commerce.platform.contracts.command;

import com.commerce.platform.contracts.SagaMessage;

import java.time.Instant;
import java.util.UUID;

public record ReleasePaymentAuthorizationCommand(
        UUID messageId,
        UUID sagaId,
        UUID correlationId,
        Instant occurredAt,
        UUID orderId,
        UUID paymentAuthorizationId,
        String reason
) implements SagaMessage {
}