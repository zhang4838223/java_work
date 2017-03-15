package com.springBoot.test.dao;

import com.springBoot.test.model.XsgServer;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaojun.zhang on 2016/3/26.
 */
@Repository
public interface ServerDao {
        //extends CrudRepository<XsgServer,Long> {

    /**
     * 这里的方法名称有规则
     * @param name 这里的参数名必须与Book类中属性一致
     * @return
     */
    public XsgServer findXsgServerByName(String name);
}
