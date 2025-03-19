package com.itwray.iw.points.dao;

import com.itwray.iw.points.model.bo.QueryTaskNumBo;
import com.itwray.iw.points.model.entity.PointsTaskBasicsEntity;
import com.itwray.iw.points.mapper.PointsTaskBasicsMapper;
import com.itwray.iw.points.model.enums.TaskStatusEnum;
import com.itwray.iw.points.model.param.QueryTaskNumParam;
import com.itwray.iw.web.dao.BaseDao;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 任务基础表 DAO
 *
 * @author wray
 * @since 2025-03-19
 */
@Component
public class PointsTaskBasicsDao extends BaseDao<PointsTaskBasicsMapper, PointsTaskBasicsEntity> {

    /**
     * 根据分组id查询分组下的待完成任务数量
     *
     * @param groupIds 分组id集合
     * @return <分组id,分组下的待完成任务数量>
     */
    public Map<Integer, Integer> queryTaskNumByGroupIds(List<Integer> groupIds) {
        QueryTaskNumParam param = new QueryTaskNumParam(groupIds);
        param.setTaskStatus(TaskStatusEnum.WAIT.getCode());
        return getBaseMapper().queryTaskNum(param).stream()
                .collect(Collectors.toMap(QueryTaskNumBo::getTaskGroupId, QueryTaskNumBo::getTaskNum));
    }
}
