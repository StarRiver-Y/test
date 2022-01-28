package com.springboot.common;

import lombok.Data;

import java.util.Date;

/**
 * @author bengda
 */
@Data
public class Message {
    private Long id;

    private String msg;

    private Date sendTime;
}
