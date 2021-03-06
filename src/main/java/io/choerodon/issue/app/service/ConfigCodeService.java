package io.choerodon.issue.app.service;

import io.choerodon.issue.api.vo.ConfigCodeVO;
import io.choerodon.issue.api.vo.PropertyData;

import java.util.List;

/**
 * @author shinan.chen
 * @date 2018/10/10
 */
public interface ConfigCodeService {

    /**
     * 根据类型获取ConfigCode
     *
     * @param type
     * @return
     */
    List<ConfigCodeVO> queryByType(String type);

    /**
     * 根据转换id获取未设置的ConfigCode
     *
     * @param organizationId
     * @param transformId
     * @param type
     * @return
     */
    List<ConfigCodeVO> queryByTransformId(Long organizationId, Long transformId, String type);

    /**
     * 处理eureka发现新服务时扫描到的ConfigCode
     *
     * @param propertyData
     */
    void handlePropertyData(PropertyData propertyData);
}
