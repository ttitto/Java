package CustomExceptions;

import java.security.InvalidParameterException;

public class PaymentAmountException extends IllegalArgumentException {

    public PaymentAmountException() {
        super();
    }

    public PaymentAmountException(String msg) {
        super(msg);
    }
}
