package pl.pj.edu.mp.springboot.restjpademo.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such Person in DB")
public class PersonNotFoundException extends RuntimeException {
}
