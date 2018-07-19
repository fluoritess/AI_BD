package cn.itcast.ssm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author tyh
 * @Package cn.itcast.ssm.exception
 * @Description:
 * @date 2018/5/24 11:04
 */

@ControllerAdvice
public class GlobalExceptionResolver extends DefaultHandlerExceptionResolver{

    @ExceptionHandler(value = Exception.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ex.printStackTrace();
        String url=request.getServletPath();
        System.out.println(url);
        if(url.startsWith("/phm")){
            if (ex instanceof HttpRequestMethodNotSupportedException) {
                setResponseParam(request,response, "405", "请求方式错误！");
                return null;
            }

            if (ex instanceof MissingServletRequestParameterException) {
                setResponseParam(request,response, "400", "错误请求！");
                return null;
            }

            if (ex instanceof NoHandlerFoundException) {
                setResponseParam(request,response, "404", "请求路径错误！");
                return null;
            }

            setResponseParam(request,response, "500", "服务器内部错误！服务暂时不可用！");
            return null;
        }
        return super.resolveException(request, response, handler, ex);
    }

    private void setResponseParam(HttpServletRequest request,HttpServletResponse response,String code,String msg){
        response.setHeader("ERRORCODE",code);
        response.setHeader("ERRORMSG", msg);
        try {
            response.sendRedirect(request.getContextPath()+"/WEB-INF/error.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
