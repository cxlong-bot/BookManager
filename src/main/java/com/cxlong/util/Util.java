package com.cxlong.util;


import com.cxlong.domain.Page;

import javax.servlet.http.HttpServletRequest;


/**
 * @author: long
 * @date: 2021/4/29 16:39
 * @description: 分页工具类
 */
public class Util {
    public static Page parse(HttpServletRequest req){
        Page p = new Page();
        p.setSearchText(req.getParameter("searchText"));
        p.setSortOrder(req.getParameter("sortOrder"));
        p.setPageSize(Integer.parseInt(req.getParameter("pageSize")));
        p.setPageNumber(Integer.parseInt(req.getParameter("pageNumber")));
        return p;
    }
}
