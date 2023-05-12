package de.bsi.openai;

import jakarta.servlet.MultipartConfigElement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.util.unit.DataSize;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.MultipartFilter;

@SpringBootApplication
public class ChatgptApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatgptApplication.class, args);
	}

//	@Bean
//	public MultipartResolver multipartResolver() {
//		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//		//100MB
//		resolver.setMaxUploadSize(100 * (long) 1024 * 1024);
//		return resolver;
//	}
//
//	@Bean
//	public MultipartConfigElement multipartConfigElement() {
//		MultipartConfigFactory factory = new MultipartConfigFactory();
//		factory.setMaxFileSize(DataSize.ofMegabytes(200L));
//		factory.setMaxRequestSize(DataSize.ofMegabytes(200L));
//		return (MultipartResolver) factory.createMultipartConfig();
//	}
//@Bean
//public CommonsMultipartResolver multipartResolver() {
//		CommonsMultipartResolver multipart = new CommonsMultipartResolver();
//		multipart.setMaxUploadSize(3 * 1024 * 1024); return multipart;}
//	@Bean @Order(0)
//	public MultipartFilter multipartFilter() {
//		MultipartFilter multipartFilter = new MultipartFilter();
//		multipartFilter.setMultipartResolverBeanName("multipartReso‌​lver"); return multipartFilter;
//	}
}
