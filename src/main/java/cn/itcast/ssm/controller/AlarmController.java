package cn.itcast.ssm.controller;

import cn.itcast.ssm.service.AlarmService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.Paging;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author wsw
 * @Package cn.itcast.ssm.service
 * @Description:
 * @date 18-11-19 下午20:10
 */
@Controller
@RequestMapping(value = "/Alarm")
public class AlarmController {
    @Autowired
    AlarmService alarmService;
    /**
     * 查询报警信息
     * @param reMap
     * @return
     */
    @ResponseBody
    @ArchivesLog(operationType = "查询信息", operationName = "查询报警信息")
    @RequestMapping(value = "/selectAlarmInfo.action")
    public Map<String,Object> selectSceneAddress(@RequestBody Map<String, Object> reMap){
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = alarmService.selectPaging("alarm_info", (active - 1) * pagelist, pagelist,null,null);
        return R.ok("查询场景地址分页成功").put("data", paging);
    }

    @ResponseBody
    @ArchivesLog(operationType = "删除信息", operationName = "删除报警信息")
    @RequestMapping(value = "/deleteAlarmInfo.action")
    public Map<String, Object> deleteSenorTypeIno(@RequestBody Map<String, Object> deleteMap) {
        Integer soilTypeInfo_id = Integer.valueOf(String.valueOf(deleteMap.get("id")));
        if (alarmService.deleteAlarmInfo(soilTypeInfo_id)) {
            return R.ok();
        } else {
            return R.error();
        }
    }
}
