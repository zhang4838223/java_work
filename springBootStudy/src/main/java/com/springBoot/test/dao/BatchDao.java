package com.springBoot.test.dao;

import com.springBoot.test.model.Batch;
import com.springBoot.test.model.StockJournalBo;
import com.springBoot.test.model.StockJournalVo;

import java.util.List;

/**
 * Created by xiaojun.zhang1 on 2017/3/15.
 */
public interface BatchDao {

    /**
     * 分组查询流水数据
     * @param stockJournalBo
     * @return
     */
    List<StockJournalVo> getStockJournalList(StockJournalBo stockJournalBo);

    /**
     * 查询符合条件的数据总量
     * @param stockJournalBo
     * @return
     */
    Long getStockJournalCount(StockJournalBo stockJournalBo);

    /**
     * 更新有效状态
     * @param stockJournalBo
     * @return
     */
    void updateValidStatus(StockJournalBo stockJournalBo);

    StockJournalVo getStockJournalItemById(Long id);
}
