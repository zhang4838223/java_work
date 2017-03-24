package com.springBoot.test.controller;

import com.google.gson.Gson;
import com.springBoot.test.model.StockJournalBo;
import com.springBoot.test.model.StockJournalVo;
import com.springBoot.test.service.StockJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by xiaojun.zhang1 on 2017/3/15.
 */
@Controller//注意，这里使用RestController注解的时候，模板无法生效
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockJournalService stockJournalService;

    @RequestMapping("/list")
    public String index(Model model){

        StockJournalBo bo = new StockJournalBo();
        bo.setBatchStockId(10034708L);
        Map<String, Object> map = stockJournalService.queryStockJournalList(bo);
        model.addAttribute("name","lisi");
        return "index";//src/main/resources/templates/31810
    }

    @RequestMapping(value = "/item/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    public String getByItemId(@PathVariable("id") Long id){

        StockJournalVo vo = stockJournalService.queryStockJournalItemById(id);
        Gson gson = new Gson();
        return gson.toJson(vo);//src/main/resources/templates/
    }
}
