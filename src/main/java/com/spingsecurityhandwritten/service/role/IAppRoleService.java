package com.spingsecurityhandwritten.service.role;

import com.spingsecurityhandwritten.model.AppRole;
import com.spingsecurityhandwritten.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
