package guru.springframework.sfgdi._05_properties.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:jmsbroker.properties")
public class FakeJmsBroker {

    @Value("${guru.jms.username}")
    private String user;
    @Value("${guru.jms.password}")
    private String password;
    @Value("${guru.jms.url}")
    private String url;

    @Override
    public String toString() {
        return "FakeJmsBroker{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
