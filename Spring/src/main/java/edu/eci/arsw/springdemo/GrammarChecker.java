package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GrammarChecker {

	@Autowired
	@Qualifier("SpanishChecker")
	public SpellChecker sc;
	@Autowired(required = false)
	public String x;

	public SpellChecker getSpellChecker() {
		return sc;
	}

	public void setSpellChecker(SpellChecker sc) {
		this.sc = sc;
	}

	public String check(String text) {

		StringBuffer sb = new StringBuffer();
		sb.append("Spell checking output:" + sc.checkSpell(text));
		sb.append("Plagiarism checking output: Not available yet");

		return sb.toString();

	}

	public SpellChecker getSc() {
		return sc;
	}

	public void setSc(SpellChecker sc) {
		this.sc = sc;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
	

}
