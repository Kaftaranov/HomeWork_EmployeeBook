package pro.sky.homework.EmployeeBook;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class BadEmployeeCredentials extends RuntimeException{
    public BadEmployeeCredentials(){super();}

}
