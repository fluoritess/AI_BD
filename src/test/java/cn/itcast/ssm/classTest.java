package cn.itcast.ssm;

import cn.itcast.ssm.service.impl.WarningDeviceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.ws.Action;

/**
 * @author tyh
 * @Package cn.itcast.ssm
 * @Description:
 * @date 18-8-11 上午10:25
 */

public class classTest {
    @Autowired
    WarningDeviceImpl warningDevice;
    @Test
    public void test(){
        warningDevice.ValueJudgment(1,60);
    }
}
