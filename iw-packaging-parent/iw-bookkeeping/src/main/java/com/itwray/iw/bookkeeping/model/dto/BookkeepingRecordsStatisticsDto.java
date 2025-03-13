package com.itwray.iw.bookkeeping.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.itwray.iw.common.utils.DateUtils;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * 记账记录 统计DTO
 *
 * @author wray
 * @since 2024/9/23
 */
@Data
public class BookkeepingRecordsStatisticsDto {

    /**
     * 记账记录开始时间
     */
    @JsonFormat(pattern = DateUtils.DATE_FORMAT)
    private LocalDate recordStartDate;

    /**
     * 记账记录结束时间
     */
    @JsonFormat(pattern = DateUtils.DATE_FORMAT)
    private LocalDate recordEndDate;

    /**
     * 记录分类
     */
    private Integer recordType;

    /**
     * 是否查询全部账单
     * <p>默认为null, 表示查询所有</p>
     * <p>如果为 {@link com.itwray.iw.common.constants.BoolEnum#FALSE} , 表示只查询 is_statistics = 1 的数据</p>
     */
    private Integer isSearchAll;

    /**
     * 最小金额
     */
    private BigDecimal mixAmount;

    /**
     * 最大金额
     */
    private BigDecimal maxAmount;

    /**
     * 记账标签id集合
     */
    private List<Integer> tagIdList;

    /**
     * 标签业务类型
     */
    private Integer tagBusinessType;
}
