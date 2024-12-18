package com.itwray.iw.web.exception;

import com.itwray.iw.common.IwException;

/**
 * IW Web 服务异常
 * <p>属于编码期导致的bug异常, 不应该把该异常信息返回给客户端, 需要在测试阶段解决这类异常.</p>
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
