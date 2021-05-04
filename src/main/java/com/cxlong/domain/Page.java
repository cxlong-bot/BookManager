package com.cxlong.domain;

/**
 * @author: long
 * @date: 2021/4/29 16:39
 * @description: 分页类
 */
public class Page {
    private String searchText;
    private String sortOrder;
    private Integer pageSize;
    private Integer pageNumber;

    public Page() {
    }

    public Page(String searchText, String sortOrder, Integer pageSize, Integer pageNumber) {
        this.searchText = searchText;
        this.sortOrder = sortOrder;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Page{" +
                "searchText='" + searchText + '\'' +
                ", sortOrder='" + sortOrder + '\'' +
                ", pageSize=" + pageSize +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
