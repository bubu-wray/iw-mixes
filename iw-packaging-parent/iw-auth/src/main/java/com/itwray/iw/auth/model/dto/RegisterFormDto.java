package com.itwray.iw.auth.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * 注册-表单填写方式 DTO
 *
 * @author wray
 * @since 2024/3/5
 */
@Data
@Schema(name = "注册-表单填写方式DTO")
public class RegisterFormDto {

    @Schema(title = "用户名")
    @NotBlank(message = "用户名不能为空")
    @Size(max = 64, message = "用户名不能超过64位")
    private String username;

    @Schema(title = "密码")
    @NotBlank(message = "密码不能为空")
    @Size(max = 64, message = "密码不能超过64位")
    private String password;

    @Schema(title = "姓名")
    @Size(max = 32, message = "姓名不能超过32位")
    private String name;

    @Schema(title = "电话号码")
    @Length(min = 11, max = 11, message = "电话号码长度要求为11位")
    private String phoneNumber;
}
