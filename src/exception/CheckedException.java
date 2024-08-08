package exception;

import java.util.Map;

public class CheckedException extends  Exception{
    // có thể kiểm tra đc  : Exception, ko thuộc Runtime
    Map<String,String> detailError ;
    String error;
    int code;
    public CheckedException(String mess){
        super(mess);

    }

    public CheckedException(Map<String, String> detailError, String error, int code) {
        this.detailError = detailError;
        this.error = error;
        this.code = code;
    }
}
