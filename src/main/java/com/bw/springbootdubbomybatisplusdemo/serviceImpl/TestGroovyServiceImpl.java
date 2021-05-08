package com.bw.springbootdubbomybatisplusdemo.serviceImpl;

import com.bw.springbootdubbomybatisplusdemo.GroovyUtil.GroovyCommonUtil;
import com.bw.springbootdubbomybatisplusdemo.service.TestGroovyService;
import org.springframework.stereotype.Service;

@Service
public class TestGroovyServiceImpl implements TestGroovyService {
    @Override
    public void executeGroovyFile() {
        try {
            while(true){
                Integer result = (Integer) GroovyCommonUtil.invokeMethod("addMethods2.groovy","calculateMethods1", 1,2,3,4);
                System.out.println(result);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void executeAndLoadGroovyClass() {

    }

    @Override
    public void executeGroovyByLoadSpringbootBean() {

    }

    @Override
    public void executeGroovyByLoadMysqlScript() {

    }
}
