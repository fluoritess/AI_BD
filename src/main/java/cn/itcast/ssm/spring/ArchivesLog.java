package cn.itcast.ssm.spring;

import java.lang.annotation.*;

/**
 * @author tyh
 * @Package cn.itcast.ssm.spring
 * @Description:
 * @date 2018/6/11 23:10
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArchivesLog {
    /** 要执行的操作类型比如：add操作 **/
     String operationType() default "";

    /** 要执行的具体操作比如：添加用户 **/
     String operationName() default "";
}
