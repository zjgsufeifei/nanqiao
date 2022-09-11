package com.example.nanqiao.common.util;

import com.example.nanqiao.common.error.BaseException;
import com.example.nanqiao.common.error.NanQiaoErrorCode;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Component
public class MobileUtils {
    private static final String regex = "^1[3-9][0-9]{9}$";

    public static Boolean checkMobile(String mobile) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobile);
        boolean isMatch = m.matches();
        if (!isMatch) {
            throw new BaseException(NanQiaoErrorCode.PARAM_ILLEGAL,"请输入正确的手机号");
        }

        return true;
    }
}
