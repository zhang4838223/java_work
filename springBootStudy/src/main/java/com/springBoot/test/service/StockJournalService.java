package com.springBoot.test.service;

import com.springBoot.test.model.StockJournalBo;
import com.springBoot.test.model.StockJournalVo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by xiaojun.zhang1 on 2017/3/15.
 */
public interface StockJournalService {

    public Map<String, Object> queryStockJournalList(StockJournalBo bo);

    StockJournalVo queryStockJournalItemById(Long id);
}
