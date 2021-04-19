package com.yanbing.generate_code.controller;

import com.yanbing.generate_code.model.RespBean;
import com.yanbing.generate_code.model.TableClass;
import com.yanbing.generate_code.service.GenerateCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: yanbing
 * @Date: 2021/04/18/15:24
 * @Description:
 */
@RestController
public class GenerateCodeController {
    @Autowired
    GenerateCodeService generateCodeService;


    @PostMapping("/generateCode")
    public RespBean generateCode(@RequestBody List<TableClass> tableClassList, HttpServletRequest req) {
        return generateCodeService.generateCode(tableClassList, req.getServletContext().getRealPath("/"));
    }
}