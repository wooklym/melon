package hello;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/list")
	public String main(Locale locale, HttpServletRequest request, Model model) {
		
		
		try {
		      Document doc = Jsoup.connect("http://www.melon.com/").get(); //웹에서 내용을 가져온다.
		      Elements contents = doc.select(".chart>div>ul>li.nth1>div.typeRealtime>ul"); //내용 중에서 원하는 부분을 가져온다.
		      String text = contents.text(); //원하는 부분은 Elements형태로 되어 있으므로 이를 String 형태로 바꾸어 준다.
		      System.out.println("멜론 사이트 파싱");
		      System.out.println(contents.html());
		      
		      model.addAttribute("chart", contents.html());
		} catch (IOException e) { //Jsoup의 connect 부분에서 IOException 오류가 날 수 있으므로 사용한다.   
		      e.printStackTrace();
		}
		
		return "list";
	}
}
