package cn.itcast.ssm.spring;

import cn.itcast.ssm.po.UserInf;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;


/**
 * @author tyh
 * @Package cn.itcast.ssm.spring
 * @Description: 日志记录
 * @date 2018/6/11 23:10
 */
@Component
@Aspect
public class ArchivesLogAspect {
    private final Logger logger = Logger.getLogger("user");

//    private String requestPath = null ; // 请求地址
//    private String userName = "" ; // 用户名
//    private Map<?,?> inputParamMap = null ; // 传入参数
//    private Map<String, Object> outputParamMap = null; // 存放输出结果
    private long startTimeMillis = 0; // 开始时间
    private long endTimeMillis = 0; // 结束时间
    private UserInf user = null;
    private HttpServletRequest request = null;

    @Pointcut("execution(* cn.itcast.ssm.controller..*Controller.*(..))")
    public void userLog(){}

    @Before("userLog()")
    public void before(){
//        System.out.println("方法之前");
        //记录时间
        startTimeMillis=System.currentTimeMillis();
        request=getRequest();
        if(request.getSession().getAttribute("user")!=null){
            user=(UserInf) request.getSession().getAttribute("user");
        }

    }
    @After("userLog()")
    public void after(JoinPoint joinPoint){
//        System.out.println("方法之后");
        //获取request对象
        request=getRequest();
        //获取类名
        String targetName=joinPoint.getTarget().getClass().getName();
        //获取方法名
        String methodName=joinPoint.getSignature().getName();
        Object[] arguments=joinPoint.getArgs();
        Class targetClass=null;
        try {
            targetClass=Class.forName(targetName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获得方法列表
        Method[] methods=targetClass.getMethods();
        String operationName="";
        //遍历方法列表，取得方法对象
        for(Method method:methods){
            if(method.getName().equals(methodName)){
                //获得方法的形参类型
                Class[] classes=method.getParameterTypes();
                //验证是否符合要求
                if(classes!=null&&classes.length==arguments.length&&method.getAnnotation(ArchivesLog.class)!=null){
                    //取得注释
                    operationName=method.getAnnotation(ArchivesLog.class).operationName();
                    break;
                }
            }
        }
        endTimeMillis=System.currentTimeMillis();
        //格式化开始时间
        String startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTimeMillis);
        //格式化结束时间
        String endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(endTimeMillis);
        if(request.getSession()!=null){
            if(request.getSession().getAttribute("user")!=null){
                user=(UserInf) request.getSession().getAttribute("user");
            }
        }
        if(user!=null){
//            System.out.println(" 操作人: "+user.getName()+" 操作方法: "+operationName+" 操作开始时间: "+startTime +" 操作结束时间: "+endTime);
            logger.info(" 操作人: "+user.getName()+" 操作方法: "+operationName+" 操作开始时间: "+startTime +" 操作结束时间: "+endTime);
        }else{
//            System.out.println(" 操作人:游客 ; 操作方法: "+operationName+" 操作开始时间: "+startTime +" 操作结束时间: "+endTime);
            logger.info(" 操作人:游客 ; 操作方法: "+operationName+" 操作开始时间: "+startTime +" 操作结束时间: "+endTime);
        }
    }

    public HttpServletRequest getRequest(){
        RequestAttributes requestAttributes= RequestContextHolder.currentRequestAttributes();
        ServletRequestAttributes servletRequestAttributes=(ServletRequestAttributes)requestAttributes;
        HttpServletRequest request=servletRequestAttributes.getRequest();
        return request;
    }
}
