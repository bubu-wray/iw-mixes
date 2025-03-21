package com.itwray.iw.points.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.itwray.iw.common.utils.DateUtils;
import com.itwray.iw.points.model.enums.PointsTaskPeriodicIntervalEnum;
import com.itwray.iw.points.model.enums.PointsTaskPeriodicTypeEnum;
import com.itwray.iw.points.model.enums.PointsTaskTypeEnum;
import com.itwray.iw.web.model.dto.AddDto;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 积分任务 新增DTO
 *
 * @author wray
 * @since 2024/10/9
 */
@Data
public class PointsTaskAddDto implements AddDto {

    /**
     * 任务名称
     */
    private String name;

    /**
     * 任务描述
     */
    private String description;

    /**
     * 任务类型
     */
    private PointsTaskTypeEnum taskType;

    /**
     * 任务基础积分
     */
    private Integer basePoints;

    /**
     * 是否允许自定义积分
     */
    private Boolean allowCustomPoints;

    /**
     * 截止时间
     */
    @JsonFormat(pattern = DateUtils.DATETIME_FORMAT)
    private LocalDateTime deadline;

    /**
     * 周期任务类型
     */
    private PointsTaskPeriodicTypeEnum periodicType;

    /**
     * 周期间隔
     */
    private PointsTaskPeriodicIntervalEnum periodicInterval;

    /**
     * 未执行任务扣除的积分
     */
    private Integer penaltyPoints;

    /**
     * 周期内最大执行次数
     */
    private Integer maxExecutionCount;
}
