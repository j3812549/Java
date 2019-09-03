package com.tiancai9.demo.core.response;

import org.springframework.http.HttpStatus;

/**
 * 响应结果生成工具
 * 
 */
public class ResultGenerator {
  private static final String DEFAULT_OK_MESSAGE = "OK";
  private static final String DEFAULT_UNAUTHORIZED_MESSAGE = "Need authorized";
  private static final String DEFAULT_METHOD_NOT_ALLOWED_MESSAGE = "Request method incorrect";

  // OK
  public static Result createOKResult() {
    return new Result.Builder(HttpStatus.OK.value()).msg(DEFAULT_OK_MESSAGE).build();
  }

  public static Result createOKResult(final Object data) {
    return new Result.Builder(HttpStatus.OK.value()).msg(DEFAULT_OK_MESSAGE).data(data).build();
  }

  // Failed
  public static Result createFailedResult(final String msg) {
    return new Result.Builder(HttpStatus.BAD_REQUEST.value()).msg(msg).build();
  }

  // MethodError
  public static Result createMethodErrorResult() {
    return new Result.Builder(HttpStatus.METHOD_NOT_ALLOWED.value()).msg(DEFAULT_METHOD_NOT_ALLOWED_MESSAGE).build();
  }

  // Unauthorized
  public static Result createUnauthorizedResult() {
    return new Result.Builder(HttpStatus.UNAUTHORIZED.value()).msg(DEFAULT_UNAUTHORIZED_MESSAGE).build();
  }

  public static Result createUnauthorizedResult(final String msg) {
    return new Result.Builder(HttpStatus.UNAUTHORIZED.value()).msg(msg).build();
  }

  // InternalServerError
  public static Result createInternalServerErrorResult(final String url) {
    return new Result.Builder(HttpStatus.INTERNAL_SERVER_ERROR.value())
        .msg("API [" + url + "] internal server error. Please call engineer to debug.").build();
  }

}