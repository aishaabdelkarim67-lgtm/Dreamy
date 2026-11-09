package org.example.dreamy;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



    @Configuration

    public class WebConfig implements WebMvcConfigurer{

        @Override

        public void addResourceHandlers(ResourceHandlerRegistry registry){
            registry.addResourceHandler("/style.css").addResourceLocations("classpath:/static/");

        }
    }

