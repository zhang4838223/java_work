package com.springBoot.test.service.serviceImpl;

import com.springBoot.test.dao.BatchDao;
import com.springBoot.test.model.StockJournalBo;
import com.springBoot.test.model.StockJournalVo;
import com.springBoot.test.service.StockJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaojun.zhang1 on 2017/3/15.
 */
@Service
public class StockJouralServiceImpl implements StockJournalService {

    @Autowired
    private BatchDao stockJournalMapper;
    @Override
    public Map<String, Object> queryStockJournalList(StockJournalBo bo) {
        Map<String, Object> resultMap = new HashMap();
        Long count = stockJournalMapper.getStockJournalCount(bo);
        List<StockJournalVo> voList = new ArrayList();

        if (count == null || count == 0){
            resultMap.put("rows",voList);
            resultMap.put("total",0);
            return resultMap;
        }
        voList = stockJournalMapper.getStockJournalList(bo);
        resultMap.put("rows",voList);
        resultMap.put("total",count);
        return resultMap;
    }

    @Override
    public StockJournalVo queryStockJournalItemById(Long id) {
        StockJournalVo vo = stockJournalMapper.getStockJournalItemById(id);
        return vo;
    }
}
