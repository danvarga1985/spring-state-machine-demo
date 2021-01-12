package dan.varga.springstatemachinedemo.config.actions;

import dan.varga.springstatemachinedemo.domain.PaymentEvent;
import dan.varga.springstatemachinedemo.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class AuthApprovedAction implements Action<PaymentState, PaymentEvent> {

    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> context) {
        System.out.println("Sending Notification of Auth Approved");
    }
}
