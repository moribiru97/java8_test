package yusuke.mori.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/common")
public class CommonController {
	@RequestMapping(value = "/test", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String test() throws Exception {
		return "asdf";
	}

}
