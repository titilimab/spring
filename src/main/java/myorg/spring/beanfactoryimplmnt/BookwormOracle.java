package myorg.spring.beanfactoryimplmnt;

public class BookwormOracle implements Oracle{
	private Encyclopedia encyclopedia;
	
	public void setEncyclopedia(Encyclopedia encyclopedia) {
		this.encyclopedia = encyclopedia;
	}
	
	public String defineMeaningOfLife() {
		return "Encyclopedias are a waste of time - go see the world instead";		
	}

}
