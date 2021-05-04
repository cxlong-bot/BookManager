package com.cxlong.controller;

import com.cxlong.domain.DictionaryTag;
import com.cxlong.domain.ResponseResult;
import com.cxlong.service.inter.DictService;
import com.cxlong.util.CountHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 15:55
 * @description: 字典控制器
 */
@Controller
@RequestMapping("/dict")
public class DictController {
    @Resource
    private DictService dictService;
    @Resource
    private ResponseResult result;

    /*
        查询入口
     */
    @RequestMapping("/tag/query")
    @ResponseBody
    public ResponseResult tagQuery(HttpServletRequest request, HttpServletResponse response){
        String key = request.getParameter("dictionaryKey");
        List<DictionaryTag> dictionaryTagList = dictService.queryDict(key);
        result.setData(dictionaryTagList);
        return result;
    }
}
