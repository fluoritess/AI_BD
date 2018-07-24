package cn.itcast.ssm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author tyh
 * @Package cn.itcast.ssm.util
 * @Description:
 * @date 2018/5/23 14:57
 */
public class Paging {
    private List<String> data_title=new ArrayList<>();
    private Integer listTotal;
    private List<?> lists=new ArrayList<>();

    public void addDataTitle(List<HashMap<String,Object>> lists){
        for (HashMap<String,Object> map:lists) {
            this.data_title.add(String.valueOf(map.get("Comment")));
        }
    }

    public List<String> getData_title() {
        return data_title;
    }

    public void setData_title(List<String> data_title) {
        this.data_title = data_title;
    }

    public Integer getListTotal() {
        return listTotal;
    }

    public void setListTotal(Integer listTotal) {
        this.listTotal = listTotal;
    }

    public List<?> getLists() {
        return lists;
    }

    public void setLists(List<?> lists) {
        this.lists = lists;
    }
}
