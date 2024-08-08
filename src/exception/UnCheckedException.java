package exception;

import java.util.Map;

public class UnCheckedException extends RuntimeException {
    // Kế thừa lớp RuntimeException

    // có thể kiểm tra đc  : Exception, ko thuộc Runtime
    Map<String,String> detailError ;
    String error;
    int code;
    public UnCheckedException(){

    }

    public UnCheckedException(Map<String, String> detailError, String error, int code,String message) {
        super(message);
        this.detailError = detailError;
        this.error = error;
        this.code = code;
    }
    public UnCheckedException(String mess){
        super(mess);
    }


}
