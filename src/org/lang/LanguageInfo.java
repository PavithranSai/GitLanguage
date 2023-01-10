package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("My Language is Tamil");
	}

	public void englishLanguage() {
		System.out.println("My Language is English");
	}

	public void hindiLanguage() {
		System.out.println("My Lanugage is Hindi");
	}

	public static void main(String[] args) {
		LanguageInfo language = new LanguageInfo();
		language.tamilLanguage();
		language.englishLanguage();
		language.hindiLanguage();
		language.southIndian();
		language.northIndian();
	}
}
