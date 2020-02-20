package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PrintClasspath {
    public static void main(String[] args) {
        List<String> guavas = new ArrayList<String>();
        for (String part: System.getProperty("java.class.path").split(":")) {
            if (part.contains("guava"))
                guavas.add(part);
        }
        System.out.println(String.join(", ", guavas));
    }
}