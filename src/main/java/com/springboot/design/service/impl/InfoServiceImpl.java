package com.springboot.design.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.design.bean.Info;
import com.springboot.design.mapper.InfoMapper;
import com.springboot.design.service.InfoService;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements InfoService { }