package me.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 @SpringBootApplication은 크게 3가지가 합쳐진 것이라고 생각할 수 있다.
 1. @SpringBootConfiguration
 2. @ComponentScan
 3. @EnableAutoConfiguration

 @Componentscan 어노테이션은
 @Component어노테이션 및 streotype(@Service, @Repository, @Controller.)어노테이션이 부여된 Class들을
 자동으로 Scan하여 Bean으로 등록해주는 역할

 @Configuration
 해당 클래스에서 Bean을 등록하고자 함을 명시*/

//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
//@Configuration
@SpringBootApplication
public class SpringBootProjectApplication {

    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(Application.class);
//        application.setWebApplicationType(WebApplicationType.NONE);
//        application.run(args);

        SpringApplication.run(SpringBootProjectApplication.class, args);

//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        tomcat.addContext("/", "/");
//
//        HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//                PrintWriter writer = new resp.getWriter();
//                writer.println("<html><head><title >");
//            }
//        };
//
//        tomcat.start();
//        tomcat.getServer().await();
    }

    //A bean with that name has already been defined in me.whiteship.SpringBootProjectApplication and overriding is disabled.
    //버전 달라서 그런가
    //componentScan -> autoconfigure 순으로 읽기때문에 이건 쓸수없다고 하는데 에러는 안남 근데 여기는 에러남 꺄륵
//    @Bean
//    public Holoman holoman(){
//        Holoman holoman = new Holoman();
//        holoman.setName("test");
//        holoman.setHowLong(60);
//        return holoman;
//    }

}
