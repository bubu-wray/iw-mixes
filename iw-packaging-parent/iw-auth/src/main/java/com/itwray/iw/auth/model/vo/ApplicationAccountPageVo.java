package com.itwray.iw.auth.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.itwray.iw.common.utils.DateUtils;
import com.itwray.iw.web.model.vo.PageRecordVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 应用账号信息分页 VO
 *
 * @author wray
 * @since 2024/9/10
 */
@Data
@Schema(name = "应用账号信息分页VO")
public class ApplicationAccountPageVo implements PageRecordVo {

    @Schema(title = "id")
    private Integer id;

    @Schema(title = "应用分类")
    private Integer type;
    @Schema(title = "应用名称")
    private String name;

    @Schema(title = "应用地址")
    private String address;

    @Schema(title = "账号")
    private String account;

    @Schema(title = "备注")
    private String remark;

    @Schema(title = "创建时间")
    @JsonFormat(pattern = DateUtils.DATETIME_FORMAT)
    private LocalDateTime createTime;

    @Schema(title = "更新时间")
    @JsonFormat(pattern = DateUtils.DATETIME_FORMAT)
    private LocalDateTime updateTime;
}
