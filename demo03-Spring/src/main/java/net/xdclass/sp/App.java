package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Video video = (Video) applicationContext.getBean("video");
//        System.out.println(video.getTitle());

        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
        System.out.println(videoOrder.getOutTradeNo());
        System.out.println(videoOrder.getVideo().getTitle());
    }
}
