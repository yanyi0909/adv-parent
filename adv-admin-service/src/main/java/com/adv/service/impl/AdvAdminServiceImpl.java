package com.adv.service.impl;

import com.adv.service.AdvAdminService;
import org.springframework.stereotype.Service;

@Service
public class AdvAdminServiceImpl implements AdvAdminService {

    @Override
    public String hell() {
        return "hello word service!";
    }
}
