package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//뷰 템플릿을 호출하는 컨트롤러
@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");
        return mav;
    }

    @RequestMapping("/response-view-v2") //response body 쓰면 뷰를 안 찾음.. 그래서 x
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!");
        return "response/hello";
    }

    @RequestMapping("/response/hello") //컨트롤러이름과 뷰 논리적 이름 같으면 잘 반환해줌
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!");
    }

}
