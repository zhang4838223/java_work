package com.springBoot.test.service.serviceImpl;

import com.springBoot.test.dao.ServerDao;
import com.springBoot.test.model.XsgServer;
import com.springBoot.test.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaojun.zhang on 2016/3/26.
 */
//@Service
public class ServerServiceImpl implements ServerService {

//    @Autowired
    private ServerDao serverDao;

//    @Override
    public List<XsgServer> findAll() {
//        Iterable<XsgServer> all = serverDao.findAll();
//        List<XsgServer> list = new ArrayList<XsgServer>();
//        if (all != null && all.iterator().hasNext()){
//            list.add(all.iterator().next());
//        }
//        return list;
        return null;
    }
}
