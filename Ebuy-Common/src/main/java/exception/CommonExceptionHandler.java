package exception;

import enums.ExceptionEnums;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author:lihang
 * @Description:通用的异常处理
 * 自动拦截所有的Controller
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(EbuyException.class)
    public ResponseEntity<EbuyException> commonoException(EbuyException e){
        ExceptionEnums em = e.getExceptionEnums();
        return ResponseEntity.status(em.getCode()).body(new EbuyException(e.getExceptionEnums()));
    }
}
