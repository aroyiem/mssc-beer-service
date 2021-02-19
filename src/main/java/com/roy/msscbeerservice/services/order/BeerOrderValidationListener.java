package com.roy.msscbeerservice.services.order;

import com.roy.brewery.model.events.ValidateOrderRequest;
import com.roy.brewery.model.events.ValidateOrderResult;
import com.roy.msscbeerservice.config.JMSConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BeerOrderValidationListener {

    private final BeerOrderValidator beerOrderValidator;
    private final JmsTemplate jmsTemplate;

    @JmsListener(destination = JMSConfig.VALIDATE_ORDER_QUEUE)
    public void listen(ValidateOrderRequest validateOrderRequest) {
        Boolean isValid = beerOrderValidator.validateOrder(validateOrderRequest.getBeerOrderDto());

        jmsTemplate.convertAndSend(JMSConfig.VALIDATE_ORDER_RESPONSE_QUEUE,
                ValidateOrderResult.builder().orderId(validateOrderRequest.getBeerOrderDto().getId())
                        .isValid(isValid).build());
    }
}
