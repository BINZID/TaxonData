package org.big.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 *<p><b>LogAspect 记录日志</b></p>
 *<p> LogAspect 记录日志</p>
 * @author Bin
 * <p>Created date: 2022/06/27</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Aspect
public class LogAspect {
    @Around("execution(* org.big.restapi.*.*(..))")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        System.out.println("execute method:" + method.getName());
        return pjp.proceed();
    }
}
