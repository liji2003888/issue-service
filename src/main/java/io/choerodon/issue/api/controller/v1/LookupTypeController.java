package io.choerodon.issue.api.controller.v1;

import io.choerodon.base.annotation.Permission;
import io.choerodon.base.enums.ResourceType;
import io.choerodon.issue.api.vo.LookupTypeVO;
import io.choerodon.issue.app.service.LookupTypeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by HuangFuqiang@choerodon.io on 2018/09/27.
 * Email: fuqianghuang01@gmail.com
 */
@RestController
@RequestMapping(value = "/v1/organizations/{organization_id}/lookup_types")
public class LookupTypeController {

    @Autowired
    private LookupTypeService lookupTypeService;

    @Permission(type = ResourceType.ORGANIZATION, permissionPublic = true)
    @ApiOperation("查询所有lookup type类型")
    @GetMapping
    public ResponseEntity<List<LookupTypeVO>> listLookupType(@ApiParam(value = "项目id", required = true)
                                                             @PathVariable(name = "organization_id") Long organizationId) {
        return new ResponseEntity<>(lookupTypeService.listLookupType(organizationId), HttpStatus.OK);
    }
}