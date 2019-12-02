package com.example.config;

import org.springframework.security.crypto.password.PasswordEncoder;

//passwordEncoder(PasswordEncoder passwordEncoder)：密码编码，Spring Security 高版本必须进行密码编码，否则报错
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
