package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        testScope(applicationContext);
//        依赖注入
//        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
//        System.out.println(videoOrder.getOutTradeNo());
//        System.out.println(videoOrder.getVideo().getTitle());
    }
    private static void testScope(ApplicationContext context){
        Video video1 = (Video)context.getBean("video");
        Video video2 = (Video)context.getBean("video");
        // 靠匹配内存地址 == 是匹配内存地址
        System.out.println(video1 == video2);
    }
}
