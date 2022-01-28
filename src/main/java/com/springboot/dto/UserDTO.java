package com.springboot.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * @author bengda
 */
@Data
public class UserDTO {
    @Excel(name = "用户名",width = 20)
    private String userName;
    @Excel(name = "密码")
    private String passWord;
    @Excel(name = "qq号")
    private String qq;
    @Excel(name = "性别")
    private String sex;
}
