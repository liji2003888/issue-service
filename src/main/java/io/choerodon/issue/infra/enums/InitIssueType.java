package io.choerodon.issue.infra.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dinghuang123@gmail.com
 * @since 2018/10/24
 */
public enum InitIssueType {
    /**
     * 史诗
     */
    EPIC("agile_epic", "史诗", "史诗", "#743be7", "issue_epic"),
    /**
     * 故事
     */
    STORY("agile_story", "故事", "故事", "#00bfa5", "story"),
    /**
     * 缺陷
     */
    BUG("agile_fault", "缺陷", "缺陷", "#f44336", "bug"),
    /**
     * 任务
     */
    TASK("agile_task", "任务", "任务", "#4d90fe", "task"),
    /**
     * 子任务
     */
    SUB_TASK("agile_subtask", "子任务", "子任务", "#4d90fe", "sub_task"),
    /**
     * 测试
     */
    TEST("table_chart", "测试", "测试", "#4D90FE", "issue_test"),
    /**
     * 自动化测试
     */
    AUTO_TEST("auto_test", "自动化测试", "自动化测试", "#00BFA5", "issue_auto_test");
//    /**
//     * 特性
//     */
//    FEATURE("agile_feature", "特性", "特性", "#29B6F6", "feature");

    private String icon;
    private String name;
    private String description;
    private String colour;
    private String typeCode;

    InitIssueType(String icon, String name, String description, String colour, String typeCode) {
        this.icon = icon;
        this.name = name;
        this.description = description;
        this.colour = colour;
        this.typeCode = typeCode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public static List<InitIssueType> listByApplyType(String applyType) {
        List<InitIssueType> result = new ArrayList<>();
        switch (applyType) {
            case SchemeApplyType.AGILE:
//                result.add(InitIssueType.FEATURE);
                result.add(InitIssueType.EPIC);
                result.add(InitIssueType.STORY);
                result.add(InitIssueType.BUG);
                result.add(InitIssueType.TASK);
                result.add(InitIssueType.SUB_TASK);
                break;
            case SchemeApplyType.TEST:
                result.add(InitIssueType.TEST);
                result.add(InitIssueType.AUTO_TEST);
                break;
            case SchemeApplyType.PROGRAM:
                result.add(InitIssueType.EPIC);
//                result.add(InitIssueType.FEATURE);
                break;
        }
        return result;
    }
}
