package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Video video = (Video) applicationContext.getBean("video");
        System.out.println(video.getTitle());
    }
}
