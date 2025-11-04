package com.hero;

public class heroagility extends hero{
  private String nickname;
  private String herotype = "agility";

  public heroagility (String name, double health){
    super(name, health);
  }

  public void showall (){
    this.show();
    System.out.println("nickname = "+this.nickname);
    System.out.println("hero type = "+this.herotype);
  }

  private void setnickname (String nickname){
    this.nickname=nickname;
  }
  private void setherotype (String herotype){
    this.herotype=herotype;
  }
}
