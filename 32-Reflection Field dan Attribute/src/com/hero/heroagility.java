package com.hero;

public class heroagility extends hero{
  public String nickname;
	private String heroType = "Agility";

	public heroagility(String name, double health){
		super(name,health);
	}

	public void showall(){
		this.show();
		System.out.println("heroType: "+this.heroType);
		System.out.println("nickname: "+this.nickname);
	}

	private void setherotype(String heroType){
		this.heroType = heroType;
	}
}
