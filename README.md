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

> #### for문: 반복 횟수를 알 
```java
for(초기식; 조건식; 증감식){
	실행할 문장;
}
```

<br>

> #### while문


<br>

> #### do~while문


<br>
























