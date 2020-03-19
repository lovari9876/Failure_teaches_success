package kakao.pay.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kakao.pay.ex.service.KakaoPay;

//@Log
@Controller
public class KakaoController {

	@Autowired
	private KakaoPay kakaopay;

	public KakaoPay getKakaopay() {
		return kakaopay;
	}

	public void setKakaopay(KakaoPay kakaopay) {
		this.kakaopay = kakaopay;
	}

	@GetMapping("/kakaoPay")
	public void kakaoPayGet() {
//		return "kakaoPay";
	}

	@PostMapping("/kakaoPay")
	public String kakaoPay() {
//		log.info("kakaoPay post............................................");
		System.out.println("kakaoPay post............................................");

		return "redirect:" + kakaopay.kakaoPayReady();

	}

	@GetMapping("/kakaoPaySuccess")
	public void kakaoPaySuccess(@RequestParam("pg_token") String pg_token, Model model) {
//		log.info("kakaoPaySuccess get............................................");
//		log.info("kakaoPaySuccess pg_token : " + pg_token);

		System.out.println("kakaoPaySuccess get............................................");
		System.out.println("kakaoPaySuccess pg_token : " + pg_token);

	}

}
