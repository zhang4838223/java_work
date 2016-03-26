package com.springBoot.test.controller;

import com.springBoot.test.dao.ServerDao;
import com.springBoot.test.model.XsgServer;
import com.springBoot.test.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xiaojun.zhang on 2016/3/26.
 */
@Controller//注意，这里使用RestController注解的时候，模板无法生效
@RequestMapping("/gameServer")
public class GameServerController {

    @Autowired
    private ServerService serverService;
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","lisi");
        return "index";//src/main/resources/templates/
    }

    @RequestMapping("/serverList")
    public String findServerList(Model model){
        List<XsgServer> result = serverService.findAll();
        model.addAttribute("servers",result);
        return "serverList";//需要在默认的模板文件夹src/main/resources/templates/目录下添加一个模板文件serverList.html
    }
}
