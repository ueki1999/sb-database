package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DBController {

	// foodDao という変数名で FoodDao インターフェースを利用するための宣言
	
	
	// 検索画面の表示
	//【Ｑ１】URL「http://localhost:8080/db/search」とひもづけする
	@GetMapping("Q1")
	public ModelAndView showSearchForm(ModelAndView mav) {
		//【Ｑ２】次に表示させるHTMLファイル名を指定する文
		
		return mav;
	}
	
	// 検索結果の表示
	//【Ｑ３】URL「http://localhost:8080/db/result」とひもづけする
	@GetMapping("Q3")
	//【Ｑ４】リクエストとして送られてきた値 searchWord を引数「String searchWord」に格納する
	public ModelAndView search(@RequestParam("Q4") String searchWord, ModelAndView mav) {
		// searchメソッドの処理内容
		
		
		
		
		return mav;
	}

}
