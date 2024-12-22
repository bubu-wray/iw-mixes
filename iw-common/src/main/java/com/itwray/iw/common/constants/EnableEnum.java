package com.itwray.iw.common.constants;

import com.itwray.iw.common.ConstantEnum;
import lombok.Getter;

/**
 * 启用状态枚举
 *
 * @author wray
 * @since 2024/9/12
 */
@Getter
public enum EnableEnum implements ConstantEnum {
    ENABLE(1, "启用"),
    DISABLE(0, "禁用");

    private final Integer code;

    private final String name;

    EnableEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
