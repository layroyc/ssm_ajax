package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    // 首页
    @RequestMapping("/showPage")
    public String showPage() {
        return "showPage";
    }

    // 增 peiJianAdd  配件的添加界面
    @RequestMapping("/peiJianAdd")
    public String peiJianAdd() {
        return "peiJianAdd";
    }

    // 查 peiJianList  配件的展示界面
    @RequestMapping("/peiJianList")
    public String peiJianList() {
        return "peiJianList";
    }

    // 增 computerAdd  电脑增加的界面
    @RequestMapping("/computerAdd")
    public String computerAdd() {
        return "computerAdd";
    }

    // 查 computerList 电脑得显示界面
    @RequestMapping("/computerList")
    public String computerList() {
        return "computerList";
    }


}
