package myAnonymous;

public class Starbucks extends FormAdapter{
	// FormAdapter 를 상속받은 Starbucks 클래스
	// 등록 메소드 만들기
	// 매개변수는 Form 타입(Form 은 FormAdapter 의 부모이므로 FormAdapter 타입도 매개변수 지정가능)
   public void register(Form form) {
	   // 매개변수가 Form 이기 때문에 Form 안에 있던 메소드를 사용할 수 있다.
	   // 따라서 getMenu() 메소드를 사용해서 받아온 String 배열 메뉴들을
	   // menu 배열에 넣는다.
	   // 그리고 반복문을 돌려서 i.메뉴명 을 출력하는 메소드
	   
      String[] menu = form.getMenu();
      for (int i = 0; i < menu.length; i++) {
         System.out.println(i + 1 + "." + menu[i]);
      }
      
//      무료나눔 행사 중이라면, "무료나눔 행사 승인" 출력
//      무료나눔 행사 중이 아니라면, 판매 방식 검토
      
      // 만약 register 에 넣어준 매개 변수가 FormAdapter 라면~
      // 무료나눔 행사를 하지 않는 매장은 Form으로 매개변수를 넣어서 판매방식을 검토 받고
      // 무료나눔 행사를 하는 매장은 FormAdapter 를 매개변수로 넣어서 객체 검사를 한 후
      // 판매방식을 검토 받지 않고 무료나눔 행사를 승인하는 메세지를 출력하는 메소드이다.
      
      if (form instanceof FormAdapter) {
    	  System.out.println("무료나눔행사 승인");
      } else {form.sell("카페라떼");
      }
   }
}