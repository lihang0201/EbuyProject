package exception;

import enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EbuyException extends RuntimeException {
    private ExceptionEnums exceptionEnums;

}
