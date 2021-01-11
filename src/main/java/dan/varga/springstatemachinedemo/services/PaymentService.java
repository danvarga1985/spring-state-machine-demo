package dan.varga.springstatemachinedemo.services;

import dan.varga.springstatemachinedemo.domain.Payment;
import dan.varga.springstatemachinedemo.domain.PaymentEvent;
import dan.varga.springstatemachinedemo.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
