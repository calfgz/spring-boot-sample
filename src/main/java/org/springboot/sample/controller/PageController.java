package org.springboot.sample.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@Value("{application.hell:Hello Boot.}")
	private String hello;
	
	@RequestMapping(value={"/", "/index"})
	public String index(Map<String, Object> model) {
		// 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
        // 本例为 /WEB-INF/jsp/index.jsp
		model.put("time", new Date());
		model.put("message", this.hello);
		return "index";
	}
	
	@RequestMapping("/page1")
	public ModelAndView page1() {
		// 页面位置 /WEB-INF/jsp/page/page.jsp
		ModelAndView mav = new ModelAndView("page1");
		mav.addObject("content", this.hello);
		return mav;
	}

    /**
     * 响应到JSP页面page1（可以直接使用Model封装内容，直接返回页面字符串）
     *
     * @return
     * @author SHANHY
     * @create  2016年1月5日
     */
    @RequestMapping("/page2")
    public String page2(Model model){
        // 页面位置 /WEB-INF/jsp/page.jsp
        model.addAttribute("content", this.hello + "（第二种）");
        return "page1";
    }
}
