package com.ddd.content.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.ddd.content.controller.dto.ContentDto;
import com.ddd.content.domain.bean.ContentAgg;
import com.ddd.content.domain.factory.ContentFactory;
import com.ddd.content.domain.service.ContentServiceImpl;
import com.ddd.content.repository.ContentRepository;

public class ContentController {

    @Autowired
    ContentServiceImpl service;

    public ContentAgg addContent(ContentDto dto) {
        //validate dto

        ContentAgg content = service.addContent(dto);
        return content;
    }
}
