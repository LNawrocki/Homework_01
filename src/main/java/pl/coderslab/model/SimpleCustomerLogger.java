package pl.coderslab.model;

import java.time.LocalDateTime;


public class SimpleCustomerLogger implements CustomerLogger{
    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + " : Customer operation");
    }
}
