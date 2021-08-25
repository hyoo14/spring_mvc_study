package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace my log="+ name); //더하기를 먼저 함.trace로그가 없으면 더하지도 않는데 낭비함. 그래서 이렇게 쓰면 안 됨!

        log.trace("trace log={}", name); //그러므로 이렇게 써야 함. 대부분 이렇게 씀. ( if(있으면){log.trace} 이런식으로 옛날에는 씀 )

        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
