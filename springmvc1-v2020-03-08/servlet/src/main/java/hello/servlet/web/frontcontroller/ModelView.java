package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

//서블릿의 종속성을 제거하기 위해 Model 직접 만들고 View 이름까지 전달하는 객체

public class ModelView {
    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
