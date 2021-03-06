package io.choerodon.issue.infra.enums;

/**
 * @author shinan.chen
 * @date 2018/10/9
 */
public class TransformConditionStrategy {
    private TransformConditionStrategy() {
    }

    /**
     * 满足下列所有条件
     */
    public static final String ALL = "condition_all";
    /**
     * 满足下列条件之一
     */
    public static final String ONE = "condition_one";
}
