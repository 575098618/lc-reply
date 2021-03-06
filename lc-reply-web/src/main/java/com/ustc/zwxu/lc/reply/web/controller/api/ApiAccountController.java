/*package com.ustc.zwxu.lc.reply.web.controller.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zwxu.lc.um.api.AccountQueryService;
import com.zwxu.lc.um.bean.QueryStudentResult;


@Controller
@RequestMapping("/api")
public class ApiAccountController {
	private static Logger logger = Logger.getLogger(ApiAccountController.class);
	
	@Resource
	private AccountQueryService accountQueryService;

	@RequestMapping("/list")
	@ResponseBody
	public Object list(HttpServletRequest request, HttpServletResponse response, ModelMap model,@PathVariable Map<String, String> vars) {

		String start = request.getParameter("start");
		if(start ==null)
		{
			start=String.valueOf(1);
		}
        int limit=6;
		QueryStudentResult result=accountQueryService.queryPage(Integer.parseInt(start),limit);
		logger.info(result.getInfo());
		model.addAttribute("limit", limit) ;
		model.addAttribute("total", result.getCount()) ;
		model.addAttribute("start", Integer.parseInt(start));
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("userList", result.getInfo());
		return data;
	}
}
*/