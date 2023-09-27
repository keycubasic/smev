package org.keycube.smev.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CxfClientException {
    String code;
    String message;
}
