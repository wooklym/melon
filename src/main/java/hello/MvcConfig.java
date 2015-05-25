package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Import(ServiceConfig.class)
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/view").setViewName("view");
        registry.addViewController("/view1").setViewName("view1");
        registry.addViewController("/view2").setViewName("view2");
        registry.addViewController("/view3").setViewName("view3");
        registry.addViewController("/view4").setViewName("view4");
        registry.addViewController("/view5").setViewName("view5");
        registry.addViewController("/view6").setViewName("view6");
//        registry.addViewController("/join").setViewName("join");
    }
}
