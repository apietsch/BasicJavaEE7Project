package be.pengo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Demo implements Serializable {
    private final String hello;
    
    public Demo()
    {
        hello = "hello";
    }

    public Demo(String hello) {
        this.hello = hello;
    }
}
