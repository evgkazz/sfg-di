package guru.springframework.sfgdi._05_properties.config;

import guru.springframework.sfgdi._05_properties.beans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${guru.username}")
    private String user;
    @Value("${guru.password}")
    private String password;
    @Value("${guru.dburl}")
    private String url;

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties(){
//        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//        return configurer;
//    }


    @Bean
    public FakeDataSource getDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUser(user);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

}
