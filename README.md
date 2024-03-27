# web1_Java✍️
**웹개발 (2023.06.12.~2023.11.07.) 강의에서 공부한 Java 내용**입니다.

앞서 배웠던 Java 강의(2023.04.11.~2023.06.08.) 보다 심화 내용도 포함되어 있습니다.

readme 파일에 목차 및 내용 정리해두었으니 참고 부탁드립니다.

감사합니다.🥰


<br><br>

## 📝 Day01
> ### Java?
- JAVA 
	- 프로그래밍 언어
	- 프로그래밍 언어는 개발자와 컴퓨터가 소통하기 위한 언어이다.

- 소스코드
	- 명령어를 작성해 놓은 것.
	- 개발자와 컴퓨터가 소통할 것을 글로 작성해놓은 것.

- 소스파일
	- 소스코드가 작성돼 있는 파일.

- 컴파일
	- 사람의 언어를 컴퓨터 언어로 바꿔주는 작업.

- 컴파일러
	- 컴파일을 해주는 프로그램 또는 명령어.

- 콘솔
	- 개발자와 컴퓨터가 소통한 결과를 보여주는 창.

- 프로그램
	- 소스코드로 잘 짜여진 틀.


 - 일반 프로그램
	- 프로그램 
	- OS : Operating System (운영체제) : 하드웨어에 적절한 전기 신호를 흘려주는 역할 
	하드웨어
	- **일반 프로그램은 이식성이 나쁘다.**

 - 자바 프로그램
	- 프로그램 
	- 컴파일러
	- JVM : JAVA 프로그램을 OS에 맞게 번역한다. (자바 가상 운영체제)
	- OS : Operating System (운영체제) : 하드웨어에 적절한 전기 신호를 흘려주는 역할 
	하드웨어
	- **JAVA 프로그램은 이식성이 좋다.**

<br>

---

<br>

- JVM(Java Virtual Machine)
	- JAVA 프로그램을 실행해 줌.

- JRE(Java Runtime Environment)
	- JVM을 생성하며, 실행할 때 필요한 라이브러리 파일들을 가지고 있다.

- JDK(Java Development Kit)
	- JRE외에 개발에 필요한 도구들을 가지고 있다.
	- 컴파일 명령어와 실행 명령어를 담고 있다.

```
기본 구조
	프로젝트
		패키지 
			클래스(앞글자 대문자)
				메소드(이름())
					소스코드
```

<br><br>

## 📝 Day02
> ### print: 출력 메소드
- print() : 마지막에 자동으로 줄바꿈이 되지 않고 아래의 문장과 이어서 출력된다.
- println() : 마지막에 자동으로 줄바꿈된다.
- printf()
  - 서식문자 (format): 반드시 따옴표 안에서 사용한다.
    - %d : decimal(10진수 정수)
    - %o : ocatal(8진수 정수)
    - %x : hexadecimal(16진수 정수)
    - %f : float(실수)
    - %c : character(문자)
    - %s : string(문자열)

<br>

> ### variable: 변수: 저장공간
```java
	 x            =          10
	저장공간의   대입         값
	이름        연산자
```

<br>


> #### type: 자료형
```java
	자료형	type	byte	값
	
	정수형	int	4	10, 32, 543, 2147483647, ...
	실수형	float	4	10.5F, -0.9F, 0.0F, 123.45645F, ... 
		double	8	10.5, -0.9, 0.0, 123.45645, ... 
	문자형	char	2	'김', 'A', '0', '.', ...
	문자열	String	?	"이도은", "ABC", "A", "0", ...

// 8bit -> 1 byte
// 32bit , 64bit 한번에 처리할 수 있는 	bit의 개수

```

<br>


> #### 변수의 선언
```java
         type  name  =  value;
	자료형 변수명 = 초기값;	// 초기화
	자료형 변수명;

// 예)
// x라는 이름의 저장공간이 할당(allocation)되고 그 안에 10이 들어간다.

		int x = 10;
```
<br>

> #### RAM: 메모리
```
================
OS Kernel Space
================
Stack
----------------
Free
----------------
Heap
================
BSS
================
Data 영역
================
Text 영역
```

**x라는 이름의 저장공간이 RAM에 할당되고 10이라는 값이 들어간다.**

<br>

> #### hashcode: 주소값
```java
	int x = 10;
```
**x라는 이름의 저장공간이 RAM에 할당되면 고유한 값인 주소값이 부여된다.**

<br>

> #### 변수의 사용
```java
	int data = 20;	// 저장공간
	data = 30;	// 저장공간
	System.out.print(data + 9);	// 값
	data = data + 7;	// 저장공간, 값
	data - 9;	// 값
```
<br>

- 📌 **변수 선언시 주의사항**
  - 같은 이름의 변수로 선언할 수 없다.
  - 초기화를 해준다.
  - 되도록 선언부에 한꺼번에 선언한다. (영역상단)

<br>

- 📌 **변수명 주의사항**
  - 문자로 시작해야 한다.
  - 특수문자는 사용할 수 없다. 단, _는 허용한다.
  - 소문자로 시작한다.
  - 공백을 사용할 수 없다.
  - 되도록 한글은 사용하지 않는다.
  - 명사로 사용한다.
  - 뜻이 있는 단어를 사용한다. 

```
   a, b, c, d, e, ... (X)
   data, number, age, name, ... (O)
```

<br> 

- 표기법
  - 카멜 표기법: happyDay
  - 언더바 표기법: happy_day
 
<br> 

- 변수를 사용하는 이유
  - 반복되는 값을 쉽게 관리할 수 있다.
  - 의미없는 값을 하나의 정보로 만들기 위해서 사용한다.(자료구조) 

<br>

> ### 상수: 항상 그대로인 수
- 값을 변경할 수 없도록 한다.

<br>

> #### 상수의 선언
```java
  	final type name = value;
```

<br>

- 상수를 사용하는 이유
  - 의미 없는 값에 의미를 부여하기 위하여
  - 오타 방지
 
- 상수는 대문자로 변수 선언
- 언더바 표기법 사용(카멜 표기법X) 
```java
// 예
  	final String YOUR_NAME = "개발자";
```

<br>

> ### 형변환
- 값을 변경할 수 없도록 한다.

- 자동 형변환
  - 정수 + 정수 = 정수
  - 정수 + 실수 = 실수
  - 문자 + 정수 = 정수
```
3 + 0.0 = 3.0
5 / 2	= 2
5.0 / 2	= 2.5
```

- 강제 형변환
```
(type)value
(double)3 = 3.0
```

<br>

> #### 문자열 형변환
- 다른 자료형을 문자열로
  - 문자열과 다른 일반 자료형을 연결하면 결과는 문자열이 된다.
- 문자열을 다른 자료형으로
  - 일반 자료형은 일반 자료형끼리만 형변환이 가능하다.
  - 문자열 타입은 클래스 타입이므로, 일반 자료형의 클래스 타입의 도움을 받아야 한다.
```
// 문자열에서 추출된 정수값
Integer.parseInt("")
// 문자열에서 추출된 실수값
Double.parseDouble("")
```
``

<br>

> ### input: 입력
- 커서가 깜빡이고 있는 상태
- 입력하기 전에 출력을 통해 어떤 값을 입력해야할지 사용자에게 알려주어야 한다.

<br>

> #### 입력 클래스
```
Scanner sc = new Scanner(System.in);
```

<br><br>

## 📝 Day03
> ### input: 입력
- 📌 **auto import: ctrl + shirt + o (삭제도 해줌)** 

<br>

> #### 입력 메소드
```
next()
nextLine()
```

<br>

> ### operator: 연산자: 기능이 있는 특수문자
- 연산자의 우선순위
	- **최**: 최우선 연산자
	- **단**: 단항 연산자
	- **산**: 산술 연산자
	- **쉬**: 쉬프트 연산자
	- **관**: 관계 연산자
	- **리**: 논리 연산자
	- **삼**: 삼항 연산자
	- **대**: 대입 연산자

<br>

- 결합성
	- 하나의 수식에 동일한 연산자가 여러 번 사용되면 알맞은 방향으로 결합되어 연산되는 성질

<br>

> #### boolean: 논리형
```java
	참 : true
	거짓 : false
		
	boolean 변수명 = 값(true, false);
-------
1byte (7bit 낭비하지만 약속)
```
<br><br>

> ### 조건식
- 결과가 참 또는 거짓, 둘 중 하나가 나오는 식


```java
// 관계 연산자
	==	: 같다
	!=	: 같지 않다
	>, <	: 초과, 미만
	>=, <=	: 이상, 이하
// 논리 연산자
	&&	: A && B, AND, 두 조건식 모두 참이면 참
	(앞항이 false면 뒷항을 연산하지 않는다.)
	||	: A || B, OR, 둘 중 하나라도 참이면 참
	(true가 나올 때까지 연산한다.)
// 단항 연산자
	!	: !, !A, NOT, 조건식이 참이면 거짓으로, 거짓이면 참으로 변경
```

<br>

> #### 삼항연산자(조건 ? 참 : 거짓): 값으로 봐야 한다.
```java
	int result = 10 > 9 ? 10 : 9;
```
<br>

**📌 단, 참과 거짓 자리에는 값만 작성할 수 있다.**

**📌 삼항 연산자는 조건식이 딱 한 개 있을 때만 사용하자!**

<br><br>

> ### Control Statement: 제어문

> #### 조건문
- if 문
```java
   if(조건식){
      실행할 문장;
   }
   위의 조건식 결과와 상관없이 무조건 검사
   if(조건식){
      실행할 문장;
   }
   if(조건식){
      실행할 문장;
   }...
```
```java
     if(조건식){
      실행할 문장;
   }
   위 조건식이 false일 경우만 검사, 아니면 검사하지 않음.
   else if(조건식){
      실행할 문장;
   }
   ...
   }
   else {
      실행할 문장
   }
```

<br>

- switch문
```java
   switch(값){
   case 값1:
      실행할 문장;
      break;
   case 값2:
      실행할 문장;
      break;
   case 값3:
      실행할 문장;
      break;
   ...
   default:
      실행할 문장;
      break;
   }
```

<br>

> #### 삼항 연산자, if문, switch문의 비교
- 삼항 연산자: 조건식이 1개 있을 경우 사용
- if문: 조건식에 비교(>, <, >=, <=) 연산자를 사용하거나, 여러 개의 조건식을 논리 연산자(&&, ||)를 이용해 사용
- switch: 하나의 변수에 여러 개의 값이 담길 수 있고, 각 값이 같은 지를 비교할 때 사용

<br><br>

> ### 반복문

> #### 대입 연산자(복합 대입 연산자, 누적 연산자)
```java
	int money = 10000;
	money = money - 1000;
	money -= 1000;
	System.out.print(money);
```

<br>

> #### for문
```java
	for(초기식; 조건식; 증감식){
		실행할 문장;
	}
```


> #### while문


> #### do~while문


<br><br>

## 📝 Day04
> ### 기타 제어문
- break
	- 즉시 해당 중괄호 영역을 탈출한다.
	- if문 안에서 사용시 if문을 탈출하지 않고 if문을 감싸고 있는 중괄호 영역을 탈출한다.
- continue
	- 즉시 다음 반복.
	- 아래에 작성된 코드를 실행하고 싶지 않을 때 사용한다.

<br>

> #### for문: 반복 횟수를 알 때
```java
	for(초기식; 조건식; 증감식){
		실행할 문장;
	}
```

<br>

> #### while문: 반복 횟수를 모를 때
```java
	while(조건식){
		실행할 문장;
	}
```

<br>

> #### do~while문: 반복 횟수는 모르지만 무조건 한 번은 실행해야하는 문장은 do{ } 영역에 적는다.
```java
	do {
		실행할 문장;
	} while (조건식);
```

<br>

> ### 배열: 저장공간의 나열
- 배열 선언의 목적
	- 변수를 여러 개 선언하면 이름도 여러 개 생긴다. 이때 각 저장공간을 관리하기가 불편하다. 따라서 n칸 배열을 한번만 선언하면 저장공간도 n개 생기고, 이름도 한개이기 때문에 관리하기가 편하다.
	- 규칙성이 없는 값에 규칙성을 부여하기 위해서

<br>

> #### 배열의 선언
```java
	자료형[] 배열명 = {값1, 값2, 값3, ... }; 	// 어떤 값을 넣을지 정확히 알 때 사용
	자료형[] 배열명 = new 자료형[칸수];		// 어떤 값을 넣을지는 모르나, 몇 칸 만들지는 알 때 사용
	자료형[] 배열명 = null;				// 어떤 값을 넣을지도 모르고, 몇 칸 만들지도 모를 때
	배열명 = new 자료형[칸수];			// null 로 초기화를 하는 것은 저장공간에 주소값을 넣는 타입에!

```

<br>


📌 **객체생성 및 주소값 초기화**
- new : Heap 메모리에 할당, 초기값을 자동으로 초기화
- null : 주소의 초기값, 어떤 주소를 넣을지 모를 때 작성하는 값
- 자바에서 배열은 항상 Heap(동적 메모리)에 할당되기 때문에 메모리 상으로는 동적배열만 존재한다.


<br>

> #### 배열의 구조
```java
	int[] arData = {3, 5, 1, 2, 8};
```

- arData라는 이름의 저장공간은 한 개 만들어지며, 여기에는 한 개의 값만 담을 수 있다.
- 5개의 값을 담기 위해서는 5칸이 필요하며, 이는 Heap 메모리에 할당된다.
- 5칸의 저장공간 중 첫 번째 저장공간의 주소값이 arData 저장공간으로 들어가며, 다음 주소에 접근하기 위해서는 + n을 한다.
- 예를 들어 arData + 2는 1이라는 값이 담긴 주소값이 되며,  *(arData + 2)는 해당 주소에 가서 읽어온 1이라는 값이 된다.
- JAVA에서는 직접 주소에 접근하는 연산자가 없기 때문에 위와 같은 식을 []로 치환하여 사용하며, arData[2]로 사용한다.
- 각각의 방 번호는 index라고 부르며, 배열은 시작주소를 가지고 있기 때문에 인덱스 번호는 항상 0부터 시작된다.

<br>

> #### length
- 배열을 선언하면 length라는 상수가 선언되고, 해당 배열의 길이가 담긴다.
- 배열명.length로 사용하게 된다.

<br>

> #### 배열의 사용
```java
	int[] arData = new int[5]; // 저장공간
	arData[0] = 10; // 저장공간
	arData[0] + 9; // 값
	System.out.println(arData); // 주소값
	arData[2] = arData[0] + arData[1]; // 저장공간, 값, 값
	System.out.println(arData[5]); // 오류
```

<br><br>

## 📝 Day05
> ### 2차원 배열: 배열 안에 배열
- 1차원 배열을 여러 개 선언할 때 관리하기 힘들기 때문에 2차원 배열을 한 번 선언한다.
- 2차원 배열부터는 메모리 낭비가 심하므로 선호하지 않는다.

<br>

> #### 2차원 배열의 선언
```java
	자료형[][] 배열명 = {{값1, 값2, 값3,...}, {값4, 값5, 값6,...}};
	자료형[][] 배열명 = new 자료형[행][열];
	자료형[][] 배열명 = null;
	배열명 = new 자료형[행][열];
	
	int[][] arrData = new int[2][3];
	
	□   arrData      arrData.length : 행의 길이
	□□   arrData[행]   arrData[행].length : 열의 길이
	□□□ □□□ arrData[행][열]
```

📌 **2차원 배열은 무조건 행부터 접근한다.**

<br>

> ### 메소드()
- 이름 뒤에 소괄호
- 단, 키워드 뒤에 소괄호는 메소드가 아니다.
```java
	f		(x) 	= 	2x+1
	메소드의	매개		리턴값
	이름		변수
```

<br>

> #### 메소드 선언
```java
	(1)리턴타입 (2)메소드명(자료형 (3)매개변수명, ...) {
		(4)실행할 문장;
		(5)return 리턴값;
	}
```
(1) 리턴값의 타입을 작성한다, 리턴값이 없으면 void를 작성한다.    
(2) 동사로 작성한다(연필(매개변수)을 쓴다(메소드)).  
(3) 외부에서 전달받을 값이 있다면, 자료형과 순서에 맞게 선언해준다.  
(4) 생략이 가능하다. 메소드의 기능을 구현하는 로직을 작성한다.  
(5) 생략이 가능하다. 리턴값이 있다면, 사용한 부분 통채로를 리턴값으로 봐야한다.

<br>

> #### 메소드 선언 순서
```java
// 문제) 두 정수의 덧셈 메소드 선언

	1. 메소드 이름을 생각한다.
		add(){}

	2. 매개변수를 생각한다.
		add(int number1, int number2){}

	3. 실행할 문장을 작성한다.
		add(int number1, int number2){
			int result = number1 + number2;
		}

	4. 리턴값을 작성한다.
		add(int number1, int number2){
			int result = number1 + number2;
			return result;
		}		
	
	5. 리턴 타입을 결정한다.
		int add(int number1, int number2){
			int result = number1 + number2;
			return result;
		}				
```

<br><br>

## 📝 Day06
> #### 메소드 주의사항
- 메소드를 선언할 때에는 {}(중괄호)가 있으며, 반드시 메소드 밖에서 선언한다.
- 메소드를 사용할 때에는 {}(중괄호)가 없으며, 반드시 메소드 안에서 사용한다.

<br>

> #### 메소드 사용
- 메소드의 리턴 타입이 void라면 실행 메소드이므로 값으로 봐서는 안된다.
- 메소드의 리턴 타입이 void가 아니라면 사용한 부분 통채로가 리턴값이다.

<br>

> #### 메소드 목적
- 재사용(특정성을 부여해서는 절대 안된다.)
- 소스코드 간결화

<br>

📌 **리턴해야 할 때**: 사용한 쪽에 로직의 결과를 전달해야 할 때.
<br>
📌 **리턴하면 안될 때**: 사용한 쪽에 로직의 결과를 전달할 필요가 없을 때.
<br>
📌 **메인 메소드는 개발자가 아니라 컴파일러가 사용하는 것**

<br><br>

## 📝 Day07
> ### 클래스(반)
- 공통요소를 한번만 선언해놓고 가져다 사용만 하도록 설계한다.

<br>

> #### 클래스의 목적
- 타입이다.
	- 클래스 안에 선언된 변수와 메소드를 사용하고 싶다면, 해당 클래스 타입으로 객체를 선언해야 한다.
- 주어이다.
```java
	// 원숭이가 바나나를 먹는다.
	Monkey.eat("바나나");

```

<br>

> #### 클래스 선언
```java
	class 클래스명 {
		필드(변수, 메소드)
	}
```

<br>

> #### 클래스의 필드 사용
**📌 객체화(instance)**
	- 객체(instance variable)를 만드는 작업
	- 추상적인 개념을 구체화시키는 작업
```java
	클래스명 객체명 = new 클래스명();
			----------------
			     생성자
```
- 접근: 객체명.필드명;

- . (마침표): 하위 연산자, 멤버변수 접근 연산자, 닷 연산자, 점 연산자
	- 주소값 뒤에서만 사용이 가능하며 해당 주소를 참조하는 명령어이다.

<br>

**📌 static 키워드**: 클래스 이름으로 직접 접근할 수 있다.
-  static 필드는 컴파일러가 최초 한 번만 메모리에 올려주기 때문에, 객체로 접근할 필요가 없다.
-  이러한 필드를 static 필드라고 부른다.

<br>

> #### 생성자
- 클래스 이름 뒤에 소괄호과 있는 형태, 메소드와 기능이 똑같지만 메소드라고 부르지 않는다.
- 생성자는 리턴이라는 기능이 존재하지 않기 때문이다.
- 해당 클래스의 필드를 메모리에 할당한 후 부여된 주소값을 가져온다.

<br>

> #### 기본 생성자
- 매개변수가 없는 생성자이며, 클래스 선언시 자동으로 선언된다.
- 사용자가 직접 생성자를 선언하게 되면 기본 생성자는 자동으로 만들어지지 않는다.

<br>

> #### this
- 필드에 접근한 객체가 누구인지 알아야 해당 필드에 접근할 수 있다.
- 이때 접근한 객체가 가지고 있는 할당된 필드의 주소값을 this라는 변수에 자동으로 담긴다.

<br>

> ### Storage class(저장 기억 부류)
|　|Stack|Data|
|:---:|:---:|:---:|
|　|지역변수, 매개변수|전역변수, 정적변수(static)|
|초기화|직접|자동|
|생명주기|}|new, 프로그램 종료|

<br><br>

## 📝 Day08
> ### 상속(Inheritance)
- 기존에 선언된 클래스의 필드를 새로 만든 클래스의 필드로 사용하고자 할 때
- 여러 클래스 선언시 필드가 겹칠 때 부모 클래스를 먼저 선언하고, 공통 필드를 묶어서 자식 클래스들에게 상속해준다(추상화).

<br>

> #### 상속 문법
```java
	class A {
			A필드
		}
	class B extends A {
			A필드, B필드
		}

// A: 부모, 상위, 슈퍼, 기반
// B: 자식, 하위, 서브(해외), 파생(문헌)
```

<br>

> #### super(): 부모 생성자
- 자식 클래스 타입의 객체로 부모필드에 접근할 수 있다.
- 하지만 자식 생성자만 호출하기 때문에, 자식 필드만 메모리에 할당된다고 생각할 수 있다.
- 사실 **자식 생성자에는 항상 부모 생성자를 호출**하기 때문에 자식 생성자 호출 시 부모와 자식 필드 모두 메모리에 할당된다.
- 이 때 **부모 생성자를 호출하는 방법은 super()를 사용**하는 것이다.
- 만약, super()를 작성하지 않더라도 **컴파일러가 자동으로 작성**해준다.

<br>

> ### 다형성(polymorphism)
> #### 오버로딩(overloading)
> #### 오버라이딩(overriding)
- 부모 필드에서 선언한 메소드를 자식 필드에서 수정하고자 할 때 재정의를 해야 한다.
- 이는 자식에서 부모 필드의 메소드와 동일한 이름으로 선언하는 것이다.
- 부모 필드가 메모리에 먼저 할당되고 a라는 메소드가 먼저 올라간다고 하면, 자식 필드가 메모리에 할당되면서 재정의한 a메소드가 새롭게 만들어지는 것이 아니라 **기존에 할당된 a메소드 저장공간에 새롭게 재정의한 자식 필드의 소스코드 주소가 들어가게 된다.**
- 따라서 **자식 객체로 a메소드에 접근하면 자식 필드에서 재정의한 소스코드의 내용이 읽히게 된다.**

<br><br>

## 📝 Day09
> ### 접근자: 접근 권한 제어자
- default: 다른 패키지에 접근 불가
- public: 모든 곳에서 접근 가능, 해당 파일의 메인 클래스일 경우만 사용 가능
- protected: 다른 패키지에서 접근 불가, 자식은 가능
- private : 다른 클래스에서 접근 불가, 메소드(getter, setter)로만 접근하자!

<br>

📌**메소드 = 저장공간**

<br>

> ### Casting (하나의 객체가 여러개의 타입을 가질 수 있다.)
📌**모든 자식은 부모 타입이다.**
> #### up casting: 자식 값을 부모 타입으로 형 변환
> #### down casting: up casting된 객체를 다시 자식 타입으로 형 변환
📌**부모 값을 자식 타입으로 형변환시 오류**
📌**생성자(주소값)**
- 넘치면 잘라내면 된다.
- 모자라면 안된다.
- 채워야 구현이 되고 구현이 돼야 메모리에 올릴 수 있다.

<br>

❓ 자식을 업캐스팅하면 오버라이드한 메소드는?

<br>

✔️ 오버라이드: 부모가 가지고 있던 메소드를 이름과 매개변수가 같지만 실행하는 코드를 다르게 하는 것. 그 실행코드를 text 메모리 영역에 저장해두고 자식 객체로 접근해서 메소드를 호출하면 그 메소드의 저장공간으로 가서 그 곳에 쓰인 text 메모리 영역의 주소값을 읽고, 그 주소값을 찾아가서 저장된 코드를 싱행한 다음 return 값이 있으면 그 return 값을 가지고 와서 호출한 메소드의 저장공간에 return 값을 저장하는 것.

<br>

✔️ 업캐스팅을 하면 부모만큼만 쓸 수 있고 자식 부분은 잘린다. 오버라이드 한 건 부모의 메소드 저장공간에 자식이 오버라이드한 메소드의 주소값이 그대로 들어있기 때문에 업캐스팅을 해도 자식의 메소드로 그대로 사용 가능하다.

<br>

> ### Abstract class: 추상 클래스
- 필드 안에 구현이 안된 메소드가 선언되어 있는 클래스
- 이때 구현되지 않은 메소드를 추상 메소드라고 한다.
- 반드시 재정의를 통해 구현을 해야지만 메모리에 할당되기 때문에 '강제성'을 부여하기 위해 추상 메소드로 선언한다.
  
<br>

> #### 추상 클래스 선언
```java
abstract class 클래스명 {
		
		abstract 리턴타입 메소드명(매개변수, ...);
		일반 메소드도 선언 가능
	}

```

<br>

> ### Interface: 인터페이스
- 추상클래스를 고도화시킨 문법.
- 상수와 추상메소드만 존재한다.
- 구현은 지정한 클래스에서 진행한다.
- 인터페이스를 다른 클래스에 지정할 때에는 implements 키워드를 사용한다.

<br><br>

## 📝 Day10
> ### Adaper class: 어댑터 클래스
> #### 추상 클래스와 인터페이스 간의 관계
- 인터페이스를 클래스에 바로 지정하면 모든 메소드에 강제성이 부여되어서 전부 다 구현해야 한다.
- 하지만 일반적인 상황에서는 모든 것이 아닌, **필요한 메소드를 골라서 재정의**해야한다.
- 인터페이스를 직접 지정하지 않고 다른 클래스에 지정한 후 바디를 만들어 놓는다면 강제성이 소멸되고
- 이 클래스를 상속받아서 필드를 구현한다면, 골라서 재정의할 수 있게 된다.
- 이 때 중간에서 **강제성을 없애주는 클래스를 추상클래스**로 선언하기로 하며,
- **추상클래스 이름 뒤에는 Adapter를 붙여**서 목적을 알려준다.

<br>

> ### Marker Interface: 마커 인터페이스
- 클래스들을 그룹화하기 위한 목적으로 사용
- 인터페이스는 지정한 클래스의 부모이며, 모든 자식은 부모의 타입 -> 마커 인터페이스를 지정받은 클래스들이 하나의 타입으로 묶이게 된다.
- **이름 뒤에 Marker를 붙여**줘야 한다.

<br>

> ### Inner class: 내부 클래스
- 하나의 클래스에서 a작업과 b작업이 있을 때에는 분리하여 클래스로 만들지 않고 클래스 안에 클래스를 선언하여 설계
- 이때 밖을 감싸는 클래스를 외부 클래스 라고 하며, 안에 선언된 클래스를 내부 클래스라고 한다.
- 외부 클래스가 메모리에 할당되어야 내부 클래스를 객체화할 수 있다.
- 클래스를 숨기기 위해서 내부 클래스를 사용하기도 하며, 이를 **캡슐화 또는 은닉화**라고 한다.
- 내부 클래스는 외부 클래스의 필드이기 때문에 **외부 클래스의 필드를 자신의 필드처럼 가져다 사용**할 수 있다.
- 하지만 상속관계가 아니기 때문에 extends 를 통해서 다른 클래스를 상속받을 수 있다.

<br>

📌**어떤 영역 안에 선언된 클래스는 내부 클래스이다.**

<br>

> ### Anonymous Inner Class: 익명 내부 클래스
- 이름이 없는 클래스이며 구현되지 않은 필드를 구현하기 위해 일회성으로 생성되는 클래스

<br>

> ### Functional Interface: 함수형 인터페이스
- 인터페이스 중 추상 메소드를 하나만 가지고 있는 인터페이스
- **@FunctionalInterface**를 **인터페이스 위에 작성**하여 단 하나의 추상메소드만 선언할 수 있도록 제한

<br>

> ### Lambda Expression: 람다식 = Anonymous Method: 익명 메소드
- 이름이 없는 메소드로서 값처럼 사용이 가능하며, 매개변수로도 전달이 가능
- 추상 메소드가 한 개만 선언된 것이기 때문에 구현할 때 메소드 이름이 필요 없다.

<br>

> #### 람다식 문법
```java
1. (매개변수 형식 나열, ... ) -> 리턴값;
2. (매개변수 형식 나열, ... ) -> {2개 이상의 문장 작성; return 리턴값;};
3. 매개변수가 딱 한 개 있을 경우에만 소괄호 전부 생략 가능 (실무에선 보통 다 씀)
```

<br><br>

## 📝 Day11
> ### Exception: 예외
- 컴파일 시(코딩시 빨간 줄), 빌드 시(문법적 오류, 내부적 메모리 구조 오류), 런타임 시(프로그램 돌다가 사용자가 입력하거나 그럴 때) 오류가 발생하면 이를 제어문으로 막을 수 있으나, 제어문으로도 막을 수 없는 오류들을 직접 처리할 수 있어야 한다.

<br>

> #### 예외 처리 문법
```java
	try {
	      예외가 발생할 수 있는 문장
	      예외가 발생하지 않았을 때 실행할 문장
	
	   } catch(예외이름 객체명){
	      예외 발생 시 실행할 문장
	
	   } catch(예외이름 객체명){
	      예외 발생 시 실행할 문장
	
	   } ...
	
	   } finally {
	      예외 발생 여부에 상관없이 무조건 실행할 문장
	      ※ 외부 장치와 연결했을 경우 다시 닫을 때 주로 사용한다.
	   }
```

<br>

> #### 예외 발생: throw
- 직접 예외를 발생시키기 위해서는 예외 던지기를 사용
- 생성자 호출 전 throw 키워드를 사용
```java
예) throw new BadWordException();
```

<br>

> #### 사용자 정의 예외
- 기본적으로 제공되는 예외가 아닌 특정 상황에서 직접 예외를 만들어야 할 때
	- Exception 혹은 RuntimeException을 상속받아서 예외 클래스를 선언
	- Exception은 컴파일러가 체크를 하기 때문에 예외처리를 강제로 해야함
	- RuntimeException은 컴파일러가 체크하지 않기 때문에 예외처리를 선택할 수 있음

<br>

> ### API: Application Programming Interface
- 개발에 필요한 라이브러리들의 집합
- 선배 개발자들이 만들어 놓은 소스코드

<br>

> #### 내부 API
- JDK 설치시 제공해주는 기본 API
- docs.oracle.com/javase

<br>

> #### 외부 API
- 선배 개발자들이 개발한 패키지 및 클래스들을 의미
- 보통 JAR 파일로 배포하며 자바 프로젝트의 build path에 추가하여 사용


<br><br>

## 📝 Day12
> ### Object: 모든 클래스의 부모 클래스
- 모든 클래스에는 메소드가 있다.
- Object 에 있는 메소드는 반드시 재정의를 해서 써야 한다.

<br>

**📌 getter, setter 단축키**: ctrl + shift + s - alt + r - seclet + all - r

<br>

> #### to String()
- 객체를 출력하면 객체명.toString() 을 생략하고 출력한 것
	- 클래스의 필드를 확인할 수 있으면 좋겠다.
	- 리턴값을 주소값이 아니라 필드를 연결하면 필드 확인 가능
- 항상 객체명을 출력할 때에는 toString()을 붙여서 출력해준다.
	- 따라서 객체명만 출력메소드에 전달하더라도 toString() 문자열 값이 출력된다.
- 기본적으로 Object에서는 소속과 필드 주소를 문자열로 리턴
	- 실사용에서는 불필요한 정보이기 때문에, 재정의한 뒤 필드의 정보를 확인하도록 구현
	- 실무에서는 클래스 선언 시 각 필드의 초기화 여부를 확인하기 위해 toString()을 재정의하여 사용

<br>

> #### eqauls()
- Object.equals(): 주소값 비교
- String.equals(): 값 비교
	- String 클래스에서 Object의 것을 재정의한 것이다.
	- 객체 주소 비교가 아닌 특정 필드를 비교해야 할 경우 재정의

<br>

> #### hashCode(): jvm 에서 만들어놓은 고유한 값(같은 ver의 jvm이면 같은 값이 나온다.)
- 실제 os 메모리 주소가 아니라 jvm 과정에서 쓰이는 대체 주소값이라고 보면 됨
- JVM에서 관리하는 중복 없는 값
- 실제 메모리에 할당되는 주소가 다르다.
- 컬렉션 프레임워크 챕터에서 재정의 목적을 이해하도록 한다.

<br>

> ### algorithm: 알고리즘
- 어떤 문제가 발생되었을 때 해결할 수 있는 절차 혹은 순서

<br>

> #### 자료구조: 저장공간
- 의미 없었던 정보가 알고리즘을 통과하는 순간 의미있는 정보(자료구조)가 된다.
- 이름, 기능 설정 -> 의미 없는 데이터를 하나의 정보로 만들어주는 알고리즘들의 집합
- 수집한 자료를 저장하는 방

<br>

> ### Collection Framework: 컬렉션 프레임워크
- 많은 데이터를 쉽고 효과적으로 관리할 수 있는 표준화된 방법을 제공하는 클래스들의 집합
- 데이터를 수집하고 일을 하기 위해 관리할 수 있게 하는 틀
- 인터페이스끼리도 상속이 된다.
- 같은 인터페이스(Collection)를 상속받았기 때문에 List 와 Set 의 메소드가 똑같다 -> 다르게 재정의 한 것

<br>

> #### List extends Collection
- Vector (java에서 초창기에 나온 모델, 속도 < 안전성(보안))
	- 용량 관리, 보안성 강화, 처리량 감소
- LinkedList (Stack 구조: 쌓다. first in last out, 넣는 건 빠르지만 빼는 건 느리다.)
	- FILO로 인해 넣을 때는 빨라도 원하는 위치의 데이터를 가져오는 것이 상대적으로 느리다.
- ArrayList
	- 인덱스로 데이터를 관리한다.
	- 컬렉션 클래스 중 실무에서 가장 많이 사용되는 클래스이다.
	- 배열의 특징인 인덱스를 사용하여 값을 저장하고 관리한다.

**📌 배열과 ArrayList의 차이?**
- 개수에 제한을 줄 때 배열을 쓴다.
- ArrayList는 몇 개의 데이터가 들어올 지 알 수 없을 때 사용한다.

<br>

> #### Set extends Collection

<br>

> #### Map


<br><br>

## 📝 Day13
> **📌 클래스 생성시 해야할 것**
> - 필드 구성
> - private 붙이기(Alt + Shift+ A -> 한꺼번에 적기)
> - 기본 생성자(ctrl + space)
> - 초기화 생성자(Alt + Shift + o + enter)
> - getter, setter(Alt + Shift + r + Alt + a + r)
> - toString(Alt + Shift + s + s + enter)
> - equals + hashcode(Alt  + Shift + h)

<br>

> #### Set extends Collection
- 코딩테스트 때 중복을 없애는 것에 유용
- HashSet(고등수학 집합)
	- 집합에서는 중복되는 원소를 포함할 수 없는 것처럼 HashSet이라는 자료구조는 중복되는 값을 무시
- DBMS 가 Set으로 관리
- 순서가 없다.
	- 저장된 값들이 인덱스가 없기 때문에 순서가 없다.
- 값을 가지고 올 수 없고 넣을 수만 있다.
- 순서가 빠르다.
	- 값의 유무 검사에 특화되어 있는 자료구조이고 해시코드로 유무 검사가 진행되기 때문에 속도가 상대적으로 좋다.
- 검색, 조회

<br><br>

## 📝 Day14
> #### Map
- Collection 상속을 받지 않아서, 구조 자체가 다르다.
- HashMap(서버 간 데이터 교환)
- Key와 Value 한쌍으로 저장되며, 검색의 목적을 가지고 있다.
- Key에 중복된 값을 넣으면 Value 가 최근 값으로 수정
- Key에 중복되지 않은 값을 넣으면 새롭게 추가
- Value는 중복이 가능
- **Put( Key 값 , Value 값 )**: 이 메소드 하나로 **추가와 수정이 둘 다 가능** -> 이미 있는 Key 값이면 수정

<br>

**📌 구조 정리**
- Array: index (순서 있음)
- Map: Key(순서 없음)
- Key 자료구조: 중복이 있으면 안되기 때문에 Set 구조
- Value 자료구조: Collection -> 중복, 순서 있음
- 뭐든지 순서는 있는데 Set 에서 순서를 없앤 것이다.
- 가운데 HashTable 의 도움을 받아 Value 를 가지고 온다.
- Key 값이 중복되면 그 Key, Value 세트가 수정된다.

<br>

> ### MSA: Micro Service Architect
- 세부적으로 나눠서 설계해서 일부에서 문제가 생겨도 다른 곳에 지장이 가지 앉게 만드는 것  
> 원래 전체 서비스를 하나의 프로젝트로 만들었고 하나의 프로젝트당 서버 하나가 필요한데  
> 요즘엔 서비스를 나눠서 프로젝트를 만들기 때문에 서버가 많이 필요하고  
> 그 **비용적인 문제를 해결하기 위해 클라우드가 발전**함(서버 할당 대여 (AWS, 네이버/구글 클라우드))
>
> 다른 프로젝트끼리는 올라간 메모리가 다르니까 각각의 변수를 공유할 수 없다.  
> **서로 서버간 데이터를 교환하기 위해서 XML 사용**

<br>

> ### XML: 서버간 데이터 교환하기 위한 파일
- 어떤 언어든 반드시 있는 자료형: 문자열

<br>

> ### JSON: XML이 불편해져서 구글이 만든 JSON
- 문자열(Map 구조화 된)_ 구글이 문자열 타입으로 형식을 만듬
> Key랑 Value 형식으로 문자열 값을 만들어놓고
> 각 언어에 맞게 형변환을 시키면
> 어디서는 이것을 객체로 쓰고 어디서는 이것을 HashMap으로 쓰고
> 이런 식으로 변환해서 본인들 언어에 맞춰서 데이터를 가져다 쓰게끔 해놓은 것.

<br>

**📌 따라서!**
- Java 에서 메소드를 만들면 리턴을 할 때는 JSON 으로 리턴  
> 그대로 다른 언어나 다른 서버로 도착해서 그 언어, 그 서버에 맞게 변환해서 알아서 쓴다.  
> 다른 언어도 JSON 으로 보내주면 Java 에서는 HashMap 으로 바꿔서 쓴다.  
> 그래서 get() 메소드만 알면 값을 꺼내 쓸 수 있다.  
> 코드 짜서 JSON으로 리턴 -> 다른 곳에서도 JSON으로 제공해주면 Java 에서도 get으로 받음

<br>

**📌 Q. 만약 User 데이터를 HashMap으로 만든다면 하나를 만드는가, User (객체)수만큼 만들어줘야 하나?**
> ✔️ 한 명의 정보가 HashMap 객체 하나.  
> List<HashMap> -> JSON Object 가 알아서 해준다.  
> HashMap 대신 클래스 사용/ 클래스 필드명 = Key / 들어간 값 = Value  
> 따라서, List<User> -> JSON 에 넣어주면  
> 알아서 User 가 **[{Key = Value}, {Key = Value}, {Key = Value}]** 구조로 바뀐다.  
>  
> JSONObject 생성자에 Map 전달하면 분석해서 알아서 문자열 값으로 만들어준다.  
> JSONObject 객체명.toString(); 으로 리턴하면 알아서  
> **{"Key":"Value", "Key":"Value", "Key":"Value"}** 로 리턴  

<br>

**📌 .toString(); 조심해야 할 부분!**
> 생략이 가능한 게 아니라 **Print 출력 메소드 안에서 객체를 출력할 때 toString()을 지원**을 해주는 것  
> 따라서 print 쓸 때만 생략 가능  
> 리턴할 때는 toString() 붙여줘야 한다!  
> 그래야 값으로 리턴!  

<br>

**📌 JSON Test**
- 각각 JSON 객체로 바꾸고 그걸 JSONArray(Array 이지만 Map 구조)로 넣어줘야 한다.
- Array라고 돼 있지만 값을 넣을 때는 put을 쓴다.
- 따라서 **JSON 은 Map 구조**이다.

<br>

**📌 map(), forEach()**
- 누군가 만들어놓은 람다
- 그래서 map() 안에 인터페이스를 전달해야 되는데, **인터페이스 구현체를 익명클래스로 연 게 아니라 람다로 구현**한 것

<br>

> ### Stream: 옆으로 흘러가는 것
- Collection 객체에서 .반복 .변경 .필터 찍어가면서 쭉 쓰는 것
- IntStream: 시작점부터 끝점까지 지정해줄 수 있음

<br>

> ### Stream API
- java 에서 기본적으로 제공하는 api (내장돼 있다.)
- jdk 8버전부터 사용가능
- 어떤 언어에서도 다 있는 기능
	- java script -> arrow expression(화살 표현)

<br><br>

## 📝 Day15
> ### Optional
- jdk 8버전부터
- Lambda 활용
- NullPointException(NPE) 발생 최대한 방지 가능
- Null 일때, Null 아닐 때를 구분해서 코드 짜는 것 도와줌
- Null 떴을 때 처리할 수 있어야 하고, Null이 뜨면 안되게도 설계 가능해야 한다.
- 람다 안에서는 지역변수를 바꿀 수 없다.
	- of: Null 일리 없다.
	- ofNullalbe: Null일 수도 있다.
- Optional 객체는 Lamdba 이다. -> null이 아닐 때만 실행된다.
	- ifPresent() -> Null 일 때만 해 -> boolean 타입임
	- ifPresentOrElse() -> () -> Null 일 때 할 것, () -> Null이 아닐 때 할 것

<br>

**📌 { } 초기화 블럭: 객체 만들때 마다 처음에 실행되는 것**  
**📌 static { } 시작하자마자 실행하는 것**  
**📌 반드시 리턴 타입에서만 Optional을 사용하고, 단일 객체만 감싸준다.**  
```java
예) Optional<List<User>>
// List는 Null 일 수가 없다.	
```

<br>

> ### 프로그램
- 실행되지 않은 상태
  
<br>

> ### 프로세스: Linker
- (더블클릭 혹은 엔터로)실행된 프로그램. (실행시킨 프로그램)

<br>

> ### 쓰레드: thread
- 비동기: 무한스크롤로 정보를 계속 불러옴
```java
// 번갈아가면서 출력되는 게 아니라 ? 이 먼저 10번 출력된다.
// 멀티 아니고 main 이라는 단일 쓰레드로 작업된다.
// 멀티로 등록: 스케줄링: start()
// run(): main
// start() 만 써도 번걸아가면서 해준다.
// sleep: 1초를 쉬게 해줌
```

<br>

> #### 단일 쓰레드: 처리 경로 1개
```java
 	aaa bbbbbbbbbb c

// b가 제일 오래 걸리고 c가 짧지만
// 순서는 abc 순서로 처리가 된다.

// 앞에 것이 처리 돼야 뒤의 것이 처리된다.
// a가 다 돼야 b를 하기 때문에 a 에 문제가 생기면 b, c는 시작도 하지 않았기 때문에 안정성이 좋다. 
```
- 처리 경로를 한 개만 가지고 있기 때문에 **직렬적**이다.
- 동시에 많은 양을 처리하기 힘들기 때문에 **상대적으로 비효율적**이다.
- 하지만 하나의 작업에 문제가 발생하더라도 다른 작업에는 영향을 끼치지 않는다.
- 따라서 **안정성이 보장**되고 **설계 시 멀티 쓰레드에 비해 쉽다.**

<br>

**📌 빨리 끝나는 것을 먼저 처리해야 효율적**  

<br>

> #### 멀티 쓰레드: 처리 경로 여러개
- 쓰레드는 무조건 단일로 일단 시작한다.
- 그런 다음 처리 경로를 여러개로 나누는 것
- **동시에 진행되는 게 아니라(중요⭐) 빠른 시간안에 순차적으로 조금씩 조금씩!**
- 빨라서 하나의 프로세스를 동시에 처리하는 것처럼 보이지만 사실은 매우 짧은 단위로 분할해서 차례로 처리한다.
- **처리는 하나씩** 밖에 못한다!
- 설계하기 굉장히 어려우며, 하나의 쓰레드 문제 발생 시 모든 쓰레드에 문제가 발생하게 된다.
- JAVA 웹 서버가 대표적인 멀티 쓰레드이다.
- **멀티 쓰레드로 설계하면 처리량 증가, 효율성 증가, 처리비용 감소의 장점**이 있기 때문에 단점을 감수하고 설계하는 편이다.



<br>

**📌 정말 똑같은 환경에서는 걸리는 시간은(속도) 똑같다.**  
**📌 처리량이 증가된다. ➡️ 한번에 많은 일을 맡길 수 있다.**  

<br>

- JS(비동기: async)와는 전혀 다른 개념이다.
- JS로 코드 짜는 것 ➡️ NODE
- Python: 연산이 많은 것
- Java
	- 요청이 100개면 일하는 애도 100개
	- 요청 들어올 때마다 쓰레드가 생김
	- 요청 처리에 대한 안정성이 있음
- JS
	- 요청이 100개라도 일하는 애는 1개

<br>

**📌 단순한 입출력(예) 영상출력) ➡️ 자바스크립트**  
**📌 서비스(예) 로그인, 구독, 결제 등) ➡️ 자바**  

<br>

> #### 멀티 쓰레드 구현 방법  
> 자바의 장점: 멀티 쓰레드가 지원된다.(만들어져 있다.)
- Thread 클래스 상속
- Runnable 인터페이스 구현: @FunctionalInterface -> Lambda 가능

<br>

**📌 핵심: 둘다 run() 메소드 가지고 있다 ➡️ 재정의**  

<br>

- 결국 thread도 코드를 실행하는 것
- run() 안에 있는 것만 thread 객체가 접근이 가능
- run() 메소드 안에 담긴 코드가 엄마(자원), 애들이 thread다.
- 하나였던 처리경로를 나눠주는 것: **스케줄링**: Thread.start()
- 멀티 쓰레드 환경에서 특정 부분만 단일처럼 처리해주는 것(동기화)

<br>

> ### 날짜: Date, Calendar, LocalDate Type
- Calendar (싱글턴) = 달력은 세상에 하나니까 객체 만들지 말고 본인들 것 써라.
- Protected 를 걸어놓음
- 그래서 new 하지 않고 getInstance

<br><br>

## 📝 Day16
> ### 파일 입출력


