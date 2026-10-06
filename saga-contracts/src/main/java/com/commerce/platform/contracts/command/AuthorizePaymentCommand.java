package com.commerce.platform.contracts.command;

import com.commerce.platform.contracts.SagaMessage;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record AuthorizePaymentCommand(
        UUID messageId,
        UUID sagaId,
        UUID correlationId,
        Instant occurredAt,
        UUID orderId,
        UUID customerId,
        BigDecimal amount,
        String currency,
        String paymentMethodToken
) implements SagaMessage {
}