package com.springBoot.test.service;

import com.springBoot.test.model.XsgServer;

import java.util.List;

/**
 * Created by xiaojun.zhang on 2016/3/26.
 */
public interface ServerService {

    List<XsgServer> findAll();
}
