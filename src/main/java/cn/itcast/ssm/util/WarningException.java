package cn.itcast.ssm.util;
/**
 * @author wsw
 * @Package cn.edu.cdu.utils
 * @Description:
 * @date 2018/11/13 20:35
 */
public class WarningException extends  Exception{
    private static final long serialVersionUID = 1L;
    private String msg;
    private int SensorId;
    public WarningException(){

    }
    public WarningException(String msg,int SensorId){
        super(msg);
        this.msg=msg;
        this.SensorId=SensorId;
    }
    public void OverMax(){

    }
    public void OverMin(){

    }
}
