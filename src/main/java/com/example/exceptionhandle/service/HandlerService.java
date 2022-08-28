package com.example.exceptionhandle.service;

import com.example.exceptionhandle.exception.ServiceException;
import org.springframework.stereotype.Service;

@Service
public class HandlerService {
    public String calculate(Integer index) {
        if (index != null) {
            try {
                int a[] = new int[2];
                System.out.println(a[3]);
                return "success";
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ServiceException("hhhh " + e);
            }
        }
        return null;
    }
}
