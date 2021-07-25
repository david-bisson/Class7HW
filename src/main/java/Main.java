import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        * 1. What is a Java bean?
        *
        *  A JavaBean is still a POJO (Plain Old Java Project) but introduces a strict set of rules around how
            we implement it:
             Access levels – our properties are private and we expose getters and
            setters
             Method names – our getters and setters follow
            the getX and setX convention (in the case of a boolean, isX can be
            used for a getter)
             Default Constructor – a no-argument constructor must be present so
            an instance can be created without providing arguments, for
            example during deserialization
             Serializable – implementing the Serializable interface allows us to
            store the state
            *
            *
        * 2. Are Design patterns are language dependent?

            * Answer: from https://en.wikipedia.org/wiki/Software_design_pattern
            * In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. Rather, it is a description or template for how to solve a problem that can be used in many different situations. Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

                Object-oriented design patterns typically show relationships and interactions between classes or objects, without specifying the final application classes or objects that are involved. Patterns that imply mutable state may be unsuited for functional programming languages. Some patterns can be rendered unnecessary in languages that have built-in support for solving the problem they are trying to solve, and object-oriented patterns are not necessarily suitable for non-object-oriented languages.

                Design patterns may be viewed as a structured approach to computer programming intermediate between the levels of a programming paradigm and a concrete algorithm.

                    In a 2020 review study, Wedyan and Abufakher investigate design patterns and software quality and conclude: "Our study has shown that the primary studies provide an empirical evidence on the positive effect of documentation of designs pattern instances on program comprehension, and therefore, maintainability. While this result is not surprising, it has, however, two indications. First, developers should pay more effort to add such documentation, even if in the form of simple comments in the source code. Second, when comparing
        *
        *
        *
        * */
        // 3

        WriteToLog log = WriteToLog.getInstance();
        log.getTextAndWriteToLog("This is a log file" + System.lineSeparator());

        User x = new User();
        System.out.println("Please enter your name");
        Scanner s1 = new Scanner(System.in);
        x.setName(s1.next());
        System.out.println("Please enter your age");
        Scanner s2 = new Scanner(System.in);
        x.setAge(s2.nextInt());
        System.out.println("Please enter your address");
        Scanner s3 = new Scanner(System.in);
        x.setAddress(s3.next());
        System.out.println("Please enter your phoneNumber");
        Scanner s4 = new Scanner(System.in);
        x.setPhoneNumber(s4.next());

    }
}
