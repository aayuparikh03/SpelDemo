package org.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Component
public class SpelExamples {

    // 1. Literal Expressions
    @Value("#{42}")
    private int number;
    @Value("#{null}")
    private Object nullValue;

    // 2. Property Access
    @Value("#{myBean.name}")
    private String beanName;

    @Value("#{myBean.version}")
    private int beanVersion;

    // 3. Method Invocation
    @Value("#{myBean.getDetails()}")
    private String beanDetails;

    @Value("#{T(java.lang.Math).sqrt(16)}")
    private double squareRoot;

    // 4. Arithmetic Operators
    @Value("#{10 + 20}")
    private int sum;
    // 5. Relational and Logical Operators
    @Value("#{10 > 5}")
    private boolean isGreater;

    @Value("#{10 < 5}")
    private boolean isLesser;

    @Value("#{10 == 10}")
    private boolean isEqual;

    @Value("#{10 != 5}")
    private boolean isNotEqual;

    @Value("#{10 > 5 and 5 < 10}")
    private boolean logicalAnd;

    @Value("#{10 > 5 or 5 > 10}")
    private boolean logicalOr;

    @Value("#{!false}")
    private boolean logicalNot;

    // 6. Conditional Operator
    @Value("#{myBean.name == 'Spring Framework' ? 'Matched' : 'Not Matched'}")
    private String conditionalCheck;

    // 7. Collections and Maps
    @Value("#{T(java.util.Arrays).asList(1, 2, 3, 4, 5)}")
    private List<Integer> numberList;

    @Value("#{T(java.util.Map).of('key1', 'value1', 'key2', 'value2')}")
    private Map<String, String> keyValueMap;

    @Value("#{T(java.util.Arrays).asList(1, 2, 3).contains(2)}")
    private boolean containsElement;

    // 8. Static Fields and Methods
    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Value("#{T(java.lang.Math).max(10, 20)}")
    private int max;

    // 9. Bean Reference with Default Fallback
    @Value("#{myBean.name ?: 'Default Name'}")
    private String defaultName;

    @PostConstruct
    public void printExamples() {
        // Literal Expressions
        System.out.println("Number: " + number);
        System.out.println("Null Value: " + nullValue);

        // Property Access
        System.out.println("Bean Name: " + beanName);
        System.out.println("Bean Version: " + beanVersion);

        // Method Invocation
        System.out.println("Bean Details: " + beanDetails);
        System.out.println("Square Root: " + squareRoot);

        // Arithmetic Operators
        System.out.println("Sum: " + sum);

        // Relational and Logical Operators
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Lesser: " + isLesser);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Conditional Operator
        System.out.println("Conditional Check: " + conditionalCheck);

        // Collections and Maps
        System.out.println("Number List: " + numberList);
        System.out.println("Key-Value Map: " + keyValueMap);
        System.out.println("Contains Element: " + containsElement);

        // Static Fields and Methods
        System.out.println("PI: " + pi);
        System.out.println("Max: " + max);

        // Default Fallback
        System.out.println("Default Name: " + defaultName);
    }
}