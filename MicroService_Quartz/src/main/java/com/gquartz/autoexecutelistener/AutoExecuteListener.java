package com.gquartz.autoexecutelistener;

import com.gquartz.MainScheduler;
import com.gquartz.annotation.JobTag;
import com.gquartz.utils.AnnoManageUtil;
import com.gquartz.utils.MyTest;
import org.quartz.SchedulerException;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;

@Component
public class AutoExecuteListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        //do something...
        System.out.println("----------------------------auto execute------------------------------------");
        String cronExpression="";
        List<Class<?>> list = AnnoManageUtil.getPackageController("com.gquartz.utils", JobTag.class);
        for (Class clazz:list) {
            System.out.println(clazz.getName());
//            JobTag jobTag = clazz.getClass().getAnnotation(JobTag.class);
            Annotation[] annotations = clazz.getAnnotations();
            JobTag jobTags=(JobTag) annotations[0];
            cronExpression = jobTags.cronExpression();
        }
        try {
            MainScheduler.schedulerJob(MyTest.class,cronExpression);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}