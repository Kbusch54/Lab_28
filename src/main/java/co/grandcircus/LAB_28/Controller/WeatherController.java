package co.grandcircus.LAB_28.Controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.LAB_28.entity.WeatherResult;

@Controller
public class WeatherController {
	RestTemplate rt = new RestTemplate();
	
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("show-w")
	public ModelAndView showWeather() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing");
		String url = "https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
		ResponseEntity<WeatherResult> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<String>("parameters", headers)
				, WeatherResult.class);
		ModelAndView mv = new ModelAndView("table", "test", response.getBody().getData().getTemperature());
				mv.addObject("text",response.getBody().getData().getText());
				mv.addObject("weather",response.getBody().getData().getWeather());
		return mv;
	}

}
