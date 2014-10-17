package CustomExceptions;

public class PurchasePermissionDeniedException extends IllegalArgumentException {

    public PurchasePermissionDeniedException() {
        super();
    }

    public PurchasePermissionDeniedException(String msg) {
        super(msg);
    }
}
