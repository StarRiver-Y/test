package com.springboot.controller;

import com.springboot.dto.UserDTO;
import com.springboot.entity.User;
import com.springboot.service.UserService;
import com.springboot.util.ExcelUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-01-04 15:10:41
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    @GetMapping("export")
    public void export( HttpServletResponse response) throws IOException {
        List<UserDTO> userDTOS = userService.exportQuery();
        ExcelUtils.exportExcel(response,null,userDTOS,UserDTO.class);
    }

}