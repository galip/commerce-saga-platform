package com.commerce.platform.contracts.messaging;

public final class SagaTopics {

    private SagaTopics() {
    }

    public static final String ORDER_COMMANDS = "grocery.order.commands";
    public static final String ORDER_EVENTS = "grocery.order.events";

    public static final String PAYMENT_COMMANDS = "grocery.payment.commands";
    public static final String PAYMENT_EVENTS = "grocery.payment.events";

    public static final String COLD_STOCK_COMMANDS = "grocery.cold-stock.commands";
    public static final String COLD_STOCK_EVENTS = "grocery.cold-stock.events";

    public static final String DELIVERY_COMMANDS = "grocery.delivery.commands";
    public static final String DELIVERY_EVENTS = "grocery.delivery.events";

    public static final String PICKER_COMMANDS = "grocery.picker.commands";
    public static final String PICKER_EVENTS = "grocery.picker.events";

}
