package com.nd.controller;

import com.nd.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 类名称：
 * 类描述：
 * 创建人：newtonk
 * 创建日期：2016/8/17 0017
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {
    Logger logger = LoggerFactory.getLogger(BookController.class);
    @Autowired
//    private BookRepository bookRepository;

    @PostMapping(value = "/all")
    public Object getAll(@RequestBody Person person){
//       Object o =bookRepository.findAll();
        return person;
    }


    @GetMapping(value = "error")
    public Object throwException(String param){
        if(param.equals("true")) {
            logger.info("error");
//            throw new NiceException(PASSWORD_CRYPTO_ERROR);
        }
        return "hello";
    }
}
