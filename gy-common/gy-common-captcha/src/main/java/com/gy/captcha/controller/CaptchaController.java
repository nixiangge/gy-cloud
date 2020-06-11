package com.gy.captcha.controller;

import com.gy.captcha.model.common.ResponseModel;
import com.gy.captcha.model.vo.CaptchaVO;
import com.gy.captcha.service.CaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raodeming on 2019/12/25.
 */
@RestController("ajCaptchaController")
@RequestMapping("/captcha")
public class CaptchaController
{
    @Autowired
    private CaptchaService captchaService;

    @PostMapping("/get")
    public ResponseModel get(@RequestBody CaptchaVO captchaVO)
    {
        return captchaService.get(captchaVO);
    }

    @PostMapping("/check")
    public ResponseModel check(@RequestBody CaptchaVO captchaVO)
    {
        return captchaService.check(captchaVO);
    }

    @PostMapping("/verify")
    public ResponseModel verify(@RequestBody CaptchaVO captchaVO)
    {
        return captchaService.verification(captchaVO.getCaptchaVerification());
    }
}