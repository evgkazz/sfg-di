package guru.springframework.sfgdi._05_properties.beans;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class FakeEnvironmentComponent {
    private String systemUser;
    private String javaVmName;
    private String jmsUser;

    public FakeEnvironmentComponent(Environment environment) {
        //environment properties
        systemUser = environment.getProperty("USERNAME");
        //system properties
        javaVmName = environment.getProperty("java.vm.name");
        // jmsbroker.properties
        jmsUser = environment.getProperty("guru.jms.url");

    }

    @Override
    public String toString() {
        return "FakeEnvironmentComponent{" +
                "systemUser='" + systemUser + '\'' +
                ", javaVmName='" + javaVmName + '\'' +
                ", jmsUser='" + jmsUser + '\'' +
                '}';
    }
}
