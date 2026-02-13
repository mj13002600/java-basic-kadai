package kadai_018;

public abstract class Kato_Chapter18{
	public String familyName;
	public String givenName;
	public String address;
	
	public void commonIntroduce() {
		System.out.println("名前は加藤" + givenName + "です");
		System.out.println("住所は東京都中野区〇×です");
	}
	abstract public void eachIntroduce();
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}