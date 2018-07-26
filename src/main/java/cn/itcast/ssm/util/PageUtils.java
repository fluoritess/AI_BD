package cn.itcast.ssm.util;

import cn.itcast.ssm.po.PageInf;

import java.util.List;

/**
 * @author tyh
 * @Package cn.itcast.ssm.util
 * @Description:
 * @date 18-7-26 下午1:45
 */
public class PageUtils {

    private PageInf pageInf;

    private List<?> list;

    public PageInf getPageInf() {
        return pageInf;
    }

    public void setPageInf(PageInf pageInf) {
        this.pageInf = pageInf;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageUtils{" +
                "pageInf=" + pageInf +
                ", list=" + list +
                '}';
    }
}
