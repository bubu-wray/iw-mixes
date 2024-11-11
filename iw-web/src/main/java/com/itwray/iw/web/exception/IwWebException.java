package com.itwray.iw.web.exception;

import com.itwray.iw.common.IwException;

/**
 * IW Web 服务异常
 *
 * @author wray
 * @since 2024/4/15
 */
public class IwWebException extends IwException {

    public IwWebException() {
        super();
    }

    public IwWebException(Throwable cause) {
        super(cause);
    }

    public IwWebException(String message) {
        super(message);
    }

    public IwWebException(Integer code, String message) {
        super(code, message);
    }
}
