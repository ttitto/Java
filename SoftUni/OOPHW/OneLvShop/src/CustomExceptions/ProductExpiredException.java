package CustomExceptions;

import java.security.InvalidParameterException;

public class ProductExpiredException extends IllegalArgumentException {

    public ProductExpiredException() {
        super();
    }

    public ProductExpiredException(String msg) {
        super(msg);
    }
}
