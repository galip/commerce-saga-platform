package com.commerce.platform.contracts.event;

import com.commerce.platform.contracts.SagaMessage;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record PaymentAuthorizedEvent(
        UUID messageId,
        UUID sagaId,
        UUID correlationId,
        Instant occurredAt,
        UUID orderId,
        UUID paymentAuthorizationId,
        BigDecimal amount,
        String currency,
        Instant expiresAt
) implements SagaMessage {
}