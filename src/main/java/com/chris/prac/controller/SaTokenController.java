package com.chris.prac.controller;

import cn.dev33.satoken.stp.StpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试控制器
 *
 * @author zhangh
 * @date 2020/12/17
 */
@Slf4j
@RestController
public class SaTokenController{

    @RequestMapping(value = "/sign-in")
    public Map<String, Object> signIn(@RequestBody Map<String, Object> params) {
        Map<String, Object> res = new HashMap<>();
        StpUtil.setLoginId(params.get("loginId"));
        res.put("tokenInfo", StpUtil.getTokenInfo());
        res.put("loginId", StpUtil.getLoginId());
        return res;
    }

    @RequestMapping(value = "/getLoginIdAsString")
    public Map<String, Object> getLoginIdAsString(@RequestBody Map<String, Object> params) {
        Map<String, Object> res = new HashMap<>();
        res.put("loginId", StpUtil.getLoginIdAsString());
        return res;
    }

    @RequestMapping(value = "/getSessionByLoginId")
    public Map<String, Object> getSessionByLoginId(@RequestBody Map<String, Object> params) {
        Map<String, Object> res = new HashMap<>();
        res.put("saSession", StpUtil.getSession().getId());
        return res;
    }

    @RequestMapping(value = "/logout")
    public Map<String, Object> logout(@RequestBody Map<String, Object> params) {
        Map<String, Object> res = new HashMap<>();
        StpUtil.logout();
        return res;
    }
}
