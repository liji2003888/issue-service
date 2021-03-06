package io.choerodon.issue.infra.mapper;

import io.choerodon.issue.api.vo.ObjectSchemeSearchVO;
import io.choerodon.issue.infra.dto.ObjectSchemeDTO;
import io.choerodon.mybatis.common.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shinan.chen
 * @since 2019/3/29
 */
public interface ObjectSchemeMapper extends Mapper<ObjectSchemeDTO> {
    /**
     * 分页查询对象方案
     *
     * @param organizationId
     * @param searchVO
     * @return
     */
    List<ObjectSchemeDTO> fulltextSearch(@Param("organizationId") Long organizationId, @Param("searchVO") ObjectSchemeSearchVO searchVO);
}
