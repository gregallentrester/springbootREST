package com.mkyong.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
  Spring handles the exceptions, we just override the status code
 */
@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {


  @ExceptionHandler(BookNotFoundException.class)
  public void springHandleNotFound(HttpServletResponse resp) throws IOException {
    resp.sendError(HttpStatus.NOT_FOUND.value());
  }

  @ExceptionHandler(BookUnSupportedFieldPatchException.class)
  public void springUnSupportedFieldPatch(HttpServletResponse resp) throws IOException {
    resp.sendError(HttpStatus.METHOD_NOT_ALLOWED.value());
  }
}
