package com.ddd.content.domain.service;

import java.util.List;
import com.ddd.content.domain.bean.AbstractPhysicalFile;

public interface PolicyService {
    //依赖注入,各地实现不同,对等,随机,按类型方�

    public List<Object> getStorageInfo(AbstractPhysicalFile file);
}
