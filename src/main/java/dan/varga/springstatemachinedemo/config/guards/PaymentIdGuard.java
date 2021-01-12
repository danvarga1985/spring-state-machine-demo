package dan.varga.springstatemachinedemo.config.guards;

import dan.varga.springstatemachinedemo.domain.PaymentEvent;
import dan.varga.springstatemachinedemo.domain.PaymentState;
import dan.varga.springstatemachinedemo.services.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

@Component
public class PaymentIdGuard implements Guard<PaymentState, PaymentEvent> {

    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> context) {
        return context.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}
