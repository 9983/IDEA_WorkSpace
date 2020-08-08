package com.zking.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.zking.model.SsmUser;
import com.zking.service.ISsmUserService;
import com.zking.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/SsmUser")
public class SsmUserController {


    //自动找到接口
    @Autowired
    private ISsmUserService SsmUserService;


    /**
     * 根据id查询单个对象·接口
     * @param ssmUser
     * @param model
     * @return
     */
    @RequestMapping("/selectUserByID")
    @ResponseBody
    public String selectUserByID(SsmUser ssmUser,Model model){

        System.out.println("Controller：SsmUser-- selectUserByID类   :调用");
        SsmUser ssmUser2 = SsmUserService.selectByPrimaryKey(ssmUser.getUserId());


        return ssmUser2.toString();
    };


    /**
     * 查询所有
     * @param model
     * @return
     */
    @RequestMapping("/selectUserAll")
    @ResponseBody
    public String selectUserAll(Model model){

        System.out.println("Controller：SsmUser-- selectUserAll类   :调用");
        List<SsmUser> ssmUserList = SsmUserService.selectSsmUserAll();

//        Gson gson = new Gson();
//
//        JsonData jsonData = new JsonData();
//        jsonData.JsonVaString(ssmUserList);


        String json ="";

        try {

            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(ssmUserList);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return json;
    };





}
