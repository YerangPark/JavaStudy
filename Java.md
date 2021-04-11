# Java
생성일: Jan 7, 2021 6:18 PM
태그: #공부/Java

📝 노트 정리 Click [here](---)
<details>
<summary>🪄 공부 순서</summary>
 <pre>
 1. 객체지향 프로그래밍
2. 생성자 호출과 정의
3. 레퍼런스와 스태틱
4. 접근 제한자와 게터 세터
5. 자바 API
6. 상속, 클래스의 확장
7. 인터페이스
8. 스트링토크나이저
9. 자바 API 클래스(추가)
-1) Object 클래스
-2) Stirng 클래스
-3) StringBuffer 클래스
-4) Math 클래스
-5) Wrapper 클래스
-6) Enum 클래스
-7) Arrays 클래스
-8) Calendar 클래스
10. 제네릭
[- 설명 잘돼있는 곳](https://coding-factory.tistory.com/573)
11. 컬렉션 프레임워크
-1) 컬렉션 프레임워크의 개념
-2) List 컬렉션 클래스
-3) Stack과 Queue
-4) Set 컬렉션 클래스
-5) Map 컬렉션 클래스
-6) Iterator
-7) Comparable
12. 예외처리
13. 입력과 출력
14. 스레드
15. JAVA8 람다
16. JAVA8 스트림
[- 스트림 설명 잘돼있는 곳](https://coding-factory.tistory.com/574?category=758267)
[- 어노테이션 설명 잘돼있는 곳](https://coding-factory.tistory.com/575?category=758267)
17. JAVA8 java.time
 
 </pre>
 </details>


- - - -
# 1. 객체지향 프로그래밍
OOP란? 객체지향 프로그래밍.

자전거가 프로그램이라면 몸체,바퀴, 손잡이 각각이 객체.

### 장점

1. 관리가 쉽다.
2. 객체 재사용이 가능하다.
3. 확장이 편리하다.

### 이제 만들어볼까?
*객체*를 만들기 위해서는 *클래스*(설계도)가 필요하다.

클래스로 객체를 만드는 과정을 *인스턴스화*라고 부른다.

그래서 객체를 *인스턴스*라고 부르기도 한다.

### 만드는 방법!

1. 클래스를 만든다.
2. 필드를 작성한다.
3. 메소드를 정의한다

- - - -
### 😲  실습타임~ [링크](https://cloudstudying.kr/lectures/195)

* string은 기본값이 null
int의 기본값은 0이다!
* 필드의 활동 영역(스코프)은 클래스 전역(클래스 스코프)이다.
메소드에서도 필드를 호출하여 사용 가능!
* 함수 내에서 선언된 변수는 메소드 스코프를 갖는다.

- - - -
# 2. 생성자 호출과 정의
*생성자란?*
: 객체를 만드는 특별한 메소드 (ex `new Cat();`)

*생성자의 역할*
: 객체 생성, 객체 초기화

* 생성자는 리턴타입을 적지 않는다!

* 이전 방식

```java
/* 1. 객체 생성 */
Cat c = new Cat();

/* 2. 필드 초기화 */
c.name = "네로";
c.weight = 3.78;
c.age = 3;
```

* 생성자 활용 방식 (한 줄로 줄여진다!)

```java
/* 객체 생성과 동시에 초기화 */
Cat c = new Cat("네로", 3.78, 3);
```

![](Java/Untitled.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/Untitled.png

- - - -

[실습!](https://cloudstudying.kr/lectures/197)

### printf와 String.format()의 차이
printf는 콘솔창에 just 출력까지 하지만,
String.format은 print하지 않고, 문자열을 만들어주기만 한다.

예시)

```java
String str() {
    return String.format("Goroke { name: %s, price: %d원 }", name, price);
  }
```

### 디폴트 생성자
클래스에 생성자가 없는 경우, 안보이는 곳에 자동으로 만들어주는 생성자!

디폴트 생성자를 따로 추가하려면 매개변수와 중괄호 안을 다 비워서 만들어주면 됨!
예) `Cat( ) { }`

- - - -
# 3. 레퍼런스와 스태틱
![](Java/Untitled%201.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/Untitled%201.png

*레퍼런스 변수* : 객체를 간접적으로 가리키는 형태.

*기본 변수* : 객체가 아닌 값을 직접 가짐.

### 스태틱
static은 “공유”라는 개념을 담은 키워드.

![](Java/Untitled%202.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/Untitled%202.png

![](Java/Untitled%203.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/Untitled%203.png

### 클래스 메소드 vs 인스턴스 메소드
![](Java/Untitled%204.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/Untitled%204.png

### 잠깐 퀴즈!

* 객체 외부 클래스 영역에서 공유되는 변수는?

```
클래스 변수(static)
```

* 클래스가 동작시키는 메소드는?

```
클래스 메소드
```

* 주체 객체가 동작하는 메소드는?

```
인스턴스 메소드
```

* 필드&메소드에 적용 가능한 공유의 키워드는?

```
static 키워드
```

* 객체 내부 변수는?

```
인스턴스 변수(non-static)
```

- - - -

[실습!](https://cloudstudying.kr/lectures/198)

### 🤭  클래스 변수 ...와 이거 몰라썽

```java
class Galaxy {
  static int count = 0;
  
  Galaxy() {
    count++;
  }
}
```

→ `static`필드가 없으면 `count`는 새로운 인스턴스가 생성될 때마다 계속 0으로 초기화됨.

→ `static`필드가 있으면 `count`는 새로운 인스턴스가 생성되어도 초기화되지 않음.

- - - -
# 4. 접근 제한자와 게터 세터

### 접근 제한자
*private* : 비공개

*default* : 패키지 내부 공개

*protected* : 상속 공개

*public* : 완전 공개

*Then*, private는 정상적인 사용자의 접근까지 막아버리잖아!!

→ 이럴 때 getter와 setter가 이용됨. 게터와 세터를 통해 우회하여 비공개 필드를 변경 및 가져옴!

- - - -

[실습~](https://cloudstudying.kr/lectures/201)

접근 제한자를 아무것도 안써주면 디폴트 접근 제한자가 적용됨!

*디폴트 접근 제한자* : 같은 공간(문서 내에) 클래스에게 공개됨

### 게터와 세터의 특징

* private 필드를 반환한다.
* public이다.
* 메소드 명은 `get` + `필드명` / `set` + `필드명`으로 한다.

### 스코프란? 변수의 활동 영역
*메소드 스코프 vs 클래스 스코프*

* 메소드 스코프 : 메소드 내부에서 활동 (예 - 파라미터, 지역변수)
* 클래스 스코프 : 클래스 전역에서 활동 (예 - 필드)

### 드뎌 나왔다! `this`!!
클래스의 필드 변수와 파라미터 변수의 이름이 같아 생기는 문제를 방지하기 위해서 `this`를 사용한다.

`this`가 붙으면 인스턴스 변수를 의미하고, 안붙으면 파라미터를 의미한다.

그래서 생성자의 형태가

```java
public Cat(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }
```

- - - -
# 5. 자바 API
프로그램을 만들기 위한 도구. 이를 사용하면 더 편리한 프로그래밍이 가능! 패키지의 형태로 제공됨.

*패키지란?* 일종의 디렉터리. 관련 코드를 하나로 묶어 관리를 수월하게 함.

*예시)* Math 클래스, Random 클래스, ArrayList 클래스

실습!

### Random 클래스

```java
// 자바 API를 불러옴
import java.util.Random;

class DieB {
  public static int roll() {
    /* Random 클래스를 활용하여 주사위의 눈값(1 ~ 6)을 반환하시오.*/
    Random rand = new Random();
    int randInt = rand.nextInt(6); //0 ~ 5
    return randInt + 1;
  }
}
```

ㄴ`Random` 클래스의 `nextInt()`메소드를 활용하여 무작위 주사위 값 반환하기!

자바에서는 배열 선언하는 방식이 조금 다르므로 기억하기!

```java
int[] counts = new int[11];    //인덱스 : 0 ~ 10
```

### ArrayList!
: 객체를 담기 위한 클래스. java.util 패키지 안에 존재함!

1. `import java.util.ArrayList` 로 불러오기
2. `ArrayList<String> names = new ArrayList<String>();`
→ 저장할 객체 타입을 < 꺾쇠 > 안에 담아주기! : 이러한 방법을 '제네릭'이라고 한다.

*예시)*

```java
ArrayList<String> names = new ArrayList<String>();

// 객체 추가
names.add("Park");
names.add("Kim");
names.add("Paul");
// 객체 획득
System.out.println(names.get(0)); // Park
System.out.println(names.get(1)); // Kim
System.out.println(names.get(2)); // Pual
// 객체 수 반환
System.out.println(names.size()); // 3
```

### ArrayList - `get()`, `set()`
*전제)*

```java
ArrayList<Book> list = new ArrayList<Book>();
Book alchemist = new Book("연금술사", 8550);
list.add(alchemist);
```

*get 예제)*

```java
Book book=list.**get**(0);
System.out.printf("%s\n", book.toString());
```

*set 예제)*

```java
Book gunsGermsSteel = new Book("총,균,쇠", 25200);
list.**set**(0, gunsGermsSteel);
```

### Collections 클래스
ArrayList의 요소를 랜덤하게 섞으려면 Collections클래스의 shuffle() 메소드를 이용하면 된다!

예) `Collections.shuffle(list);`

- - - -
# 6. 상속, 클래스의 확장
상속이란, 기존 클래스를 확장하여 새 클래스를 만드는 것.

예를 들어서 메이플스토리에서 모험가가 마법사로 전직하는 상황이라면,

![](Java/Untitled%205.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/Untitled%205.png

기존의 이름, 체력, 펀치 스킬은 그대로 가져가면서 마나, 파이어볼 스킬을 추가하면 된다!

중복되는 코드를 더 쓸 필요가 없겠지? 그리고 프로그램을 확장할 수 있다!

코드 예시)

```java
class Wizard extends Novice { // 부모 클래스
	private int mp;
	
	public void fireball() {   // 자식 클래스
		System.out.println("파이어볼!");
	}
}
```

[실습 시작!](https://cloudstudying.kr/lectures/246)

상속을 위한 키워드 `extends` !!

기존 클래스 `class A { ... } ->`확장된 새로운 클래스 `class B extends A { ... }`

### 업캐스팅이란?
: 자식 객체를 부모의 타입으로 해석하는 것.

```java
// 고양이 객체 생성
Cat c = new Cat();
Animal aa = new Animal();

// 고양이는 동물이다.(O)
Animal a = c;

// 동물은 고양이다.(X)
Cat cc = aa;  //ERROR!
```

자식객체를 부모의 타입으로 묶어서 관리할 수 있게 해줌!

### 메소드 오버라이딩
: 부모의 메소드를 자식 클래스에서 재정의하는 것.

예를 들어, 1차 전직 법사의 파이어볼 데미지는 10인데, 2차 전직 법사의 파이어볼 데미지는 20일 때 재정의가 필요하다.

### Protected 상속 공개!!
상속 관계의 클래스까지 접근을 허용하는 제한자.

### `super`키워드
자식 객체를 생성과 동시에 초기화하려면? super~!

부모 클래스의 생성자를 호출한다.

예시)

```java
public Truck(String name, double ton) {
    super(name);
    this.ton = ton;
  }
```

- - - -
# 7. 인터페이스

### *무엇?*
인터페이스란, 역할을 부여하는 것이다.

### *특징?*
인터페이스는 추상 메소드로 구성된다. 추상 메소드란, 중괄호 내부가 없는 껍데기 메소드이다.

### *실생활 예*
스마트폰은 알람, 전화기, 메신저의 역할을 한다.

### *인터페이스란*

* 인터페이스란, 역할을 부여하는 것이다.
* 인터페이스는 추상 메소드로 구성된다.
* 추상 메소드(=프로토타입 메소드)란, 중괄호 내부가 없는 껍데기 메소드이다.

### *인터페이스 정의 및 구현*

* 인터페이스 구현 시, implements 키워드를 사용한다.
* 해당 인터페이스(역할)를 구현하는(부여받은) 클래스를 구현체 클래스라 한다.
* 구현체 클래스는 모든 추상 메소드를 오버라이딩(재정의)해야 한다

### 장점

* 연관관계를 부여할 수 있다. → 업캐스팅, 그룹화 가능!
* 설계가 명확해진다.
* 한 객체를 다양한 인터페이스로 해석이 가능하다.(다형성)

- - - -

실습타임~

1. 인터페이스 만들기

```java
interface Alarm {
	// 내용 생략...
}
```

2. *추상 메소드(프로토타입 메소드 = 중괄호가 없는 껍데기 메소드)* 만들기

```java
interface Alarm {
	public void beep();
	public void playMusic();
}
```

3. 정의한 역할을 클래스에게 부여하기. 이 클래스는 *구현체 클래스*라고 부름.
→ 그리고, 구성하는 프로토타입(추상)메소드를 반.드.시 **오버라이딩(재정의)**해야 함!

```java
class SmartPhone implements Alarm { // 구현체 클래스
	// 오버라이딩
	public void beep(){
		System.out.println("삐빅~삐비비빅!");
	}
	public void playMusic(){
		System.out.println("동해물과 백두산이~");
	}
}
```

- - - -
# 8. StringTokenizer 문자열 구분하고, 자르기!!
예시 코드)

```java
//  불러오기
import java.util.StringTokenizer;

// 대상 문자열
String str = "2019-06-19";

// 구분자
String delim = "-";

// 토크나이저 객체 생성
StringTokenizer st = new StringTokenizer(str, delim);

// 토큰이 존재한다면 반복,
while (st.hasMoreTokens()) {
  // 토큰을 하나 꺼내온 뒤 출력
  System.out.println(st.nextToken());
}
```

홍팍의 자바 강의 끝 🙂

- - - -
# 9. 자바 API 클래스

## -1) Object 클래스

### java.lang 패키지

* 자바에서 가장 기본적인 동작을 수행하는 클래스들의 집합.
* 따로 import 하지 않아도 클래스 이름만으로 바로 사용 가능.

### java.lang.Object 클래스

* java.lang 패키지 중에서도 가장 많이 사용되는 클래스.
* Object 클래스는 모든 자바 클래스의 최고 조상 클래스.
* 필드를 가지지 않고, 11개의 메소드로만 구성되어있음.

java.lang.Object의 메소드를 소개할게용

### toString() 메소드

* 인스턴스에 대한 정보를 문자열로 반환.
* 반환되는 문자열은 클래스 이름과 함께 구분자로 '@'가 사용되고, 그 뒤로 16진수 해시 코드가 추가됨.
(16진수 해시 코드값은 인스턴스의 주소를 가리키며, 인스턴스마다 모두 다르게 반환됨)

```java
Car car01 = new Car();
Car car02 = new Car();
 
System.out.println(car01.toString());
System.out.println(car02.toString());
```

💁  자바에서 toString() 메소드는 기본적으로 각 API 클래스마다 자체적으로 오버라이딩을 통해 재정의되어 있습니다.

### equals() 메소드

* equals() 메소드는 해당 인스턴스를, 매개변수로 전달받는 참조 변수와 비교하여 결과를 반환한다.
* 같으면 true, 다르면 false를 반환한다.

```java
Car car01 = new Car();
Car car02 = new Car();
 
System.out.println(car01.equals(car02));
car01 = car02; // 두 참조 변수가 같은 주소를 가리킴.
System.out.println(car01.equals(car02));
```

### clone()  메소드

* 해당 인스턴스를 복제하여 새로운 인스턴스를 생성하여 반환함.
* 하지만 단지 필드의 값만 복사하므로, 필드의 값이 배열이나 인스턴스면 제대로 복제할 수 없다.
→ 이러한 경우에는 해당 클래스에서 clone() 메소드를 오버라이딩하여 복제가 제대로 이루어지도록 재정의 해야함.
→ 이러한 clone() 메소드는 데이터의 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 인스턴스만이 사용할 수 있음.

▪️ clone() 메소드를 이용하여 인스턴스를 복제하는 예제

```java
import java.util.*;
 
class Car implements Cloneable {
    private String modelName;
①  private ArrayList<String> owners = new ArrayList<String>();

    public String getModelName() { return this.modelName; }                    // modelName의 값을 반환함
    public void setModelName(String modelName) { this.modelName = modelName; } // modelName의 값을 설정함
 
    public ArrayList getOwners() { return this.owners; }                      // owners의 값을 반환함
    public void setOwners(String ownerName) { this.owners.add(ownerName); }   // owners의 값을 추가함
 
    public Object clone() {
        try {
②          Car clonedCar = (Car)super.clone();
③          // clonedCar.owners = (ArrayList)owners.clone();
            return clonedCar;
④      } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
 
public class Object03 {
    public static void main(String[] args) {
⑤      Car car01 = new Car();
        car01.setModelName("아반떼");
        car01.setOwners("홍길동");
⑥      System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners() + "\n");
 
⑦      Car car02 = (Car)car01.clone();
⑧      car02.setOwners("이순신");
⑨      System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners());
⑩      System.out.println("Car02 : " + car02.getModelName() + ", " + car02.getOwners());
    }
}
```

②: 부모 클래스(super)의 clone() 메소드를 호출하여 clone() 메소드를 오버라이딩(재정의)함.

⑤: Car 클래스의 인스턴스인 car1을 생성함

⑦: 오버라이딩한 clone() 메소드를 호출하여 복제를 수행함.

▪️ 하지만 ②번 라인처럼 clone() 메소드를 재정의하면, 필드의 값이 ①번 라인처럼 인스턴스일 때는 제대로 된 복제를 수행할 수 없음.

⑧: 복제된 인스턴스이 car02의 owners 필드에 새로운 값을 추가함. (이순신)

⑨: car01의 owners 필드에도 값이 추가됐네?!

▪️ 이처럼 단순히 부모 클래스의 clone() 메소드를 호출하여 clone() 메소드를 재정의하면, 배열이나 인스턴스인 필드는 복제되는 것이 아닌 해당 배열이나 인스턴스를 가리키는 주소값만이 복제된다!

따라서 정확한 복제를 위해서는 ③번 라인처럼 배열이나 인스턴스인 필드에 대해서는 별도로 clone() 메소드를 구현하여 호출해야 함.

* ③번 라인의 주석을 해제하고 결과보기를 다시 실행하면, 다음과 같이 정확한 실행 결과가 출력됨.

```
**<실행결과>**
```

```
Car01 : 아반떼, [홍길동]
```

```
Car02 : 아반떼, [홍길동]
```

```
Car02 : 아반떼, [홍길동, 이순신]
```


- - - -
## -2) String 클래스

### java.lang.String 클래스

* C언어에서는 문자열을 char형 배열로 표현하지만 자바에서는 String 클래스를 쓰면 됨.
* String 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고 변경할 수 없음.
→ 이러한 객체를 자바에서는 불변 객체(immutable object)라고 함.
* 자바에서 덧셈(+) 연산자를 이용하여 문자열을 결합하면 기존 문자열의 내용이 변경되는 것이 아니라, 내용이 합쳐진 새로운 String 인스턴스가 생성됨!

### charAt() 메소드

* 해당 문자열의 특정 인덱스에 해당하는 문자를 반환함.
* 만약 해당 문자열의 길이보다 큰 인덱스나 음수를 전달하면, IndexOutOfBoundsException 오류가 발생함.
* 

▪️ 문자열의 각 문자를 charAt() 메소드를 이용하여 하나씩 출력하는 예제

```java
String str = new Stirng("Java");
System.out.println("원본 문자열 : " + str);

for(int i=0;i<str.length();i++){
	System.out.print(str.charAt(i) + " ");
}

System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + str);
```

### comparTo() 메소드

* 해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교함.
* 대소문자 구분하여 비교함.
(만약 구분 안하려면 compareToIgnoreCase() 메소드를 사용하숑)
* 같으면 0, 해당 문자열이 작으면 음수, 크면 양수 반환.

▪️ compareTo() 메소드와 compareToIgnoreCase() 메소드를 이용하여 두 문자열을 비교하는 예제

```java
String str = new String("abcd");
System.out.println("원본 문자열 : " + str);
 
System.out.println(str.compareTo("bcef"));
System.out.println(str.compareTo("abcd") + "\n");
 
System.out.println(str.compareTo("Abcd"));
System.out.println(str.compareToIgnoreCase("Abcd"));
System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);
```

### concat() 메소드

* 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환함.

▪️ 두 문자열을 연결하는 예제

```java
String str = new String("Java");
System.out.println("원본 문자열 : " + str);
 
System.out.println(str.concat("수업"));
System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str);
```

### indexOf() 메소드

* 해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환. 대소문자 구분함.
(만약 해당 문자열에 전달된 문자나 문자열이 포함되어 있지 않으면 -1을 반환)

▪️ 특정 문자나 문자열이 처음 등장하는 위치의 인덱스를 찾는 예제

```java
String str = new String("Oracle Java");
System.out.println("원본 문자열 : " + str);
 
System.out.println(str.indexOf('o')); //없음
System.out.println(str.indexOf('a'));
System.out.println(str.indexOf("Java"));
System.out.println("indexOf() 메소드 호출 후 원본 문자열 : " + str);
```

### trim() 메소드

* 해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거

▪️ 문자열에 포함된 띄어쓰기와 탭 문자를 제거하는 예제

```java
String str = new String(" Java     ");
System.out.println("원본 문자열 : " + str);
 
System.out.println(str + '|'); //여기까지 공백있다고오
System.out.println(str.trim() + '|'); //제거했다고오
System.out.println("trim() 메소드 호출 후 원본 문자열 : " + str);
```

### toLowerCase(), toUpperCase()

* 모든 문자를 소문자로/대문자로 변환시켜주는 메소드.


- - - -
## -3) StringBuffer 클래스

### java.lang.StringBuffer 클래스

* String 클래스의 인스턴스는 한 번 생성되면 그 값을 변경할 수 없지만, 얜 변경 및 추가 가능!
→ 이를 위해 버퍼(buffer)라는 독립적인 공간을 가짐.
→ 버퍼 크기의 기본값은 16개의 문자를 저장할 수 있는 크기.
(생성자를 통해 크기 별도 지정 가능. But 인스턴스 생성 시 사용자가 설정한 크기보다 언제나 16개의 문자를 더 저장할 수 있도록 여유있는 크기로 생성된다.)
* 덧셈(+) 연산자를 이용해 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 새로운 String 인스턴스를 생성함.
→ String으로 문자열을 많이 결합하면 공간 낭비, 속도 낭비!
* 하지만, Stirng Buffer 인스턴스를 사용하면 문자열을 바로 추가할 수 있어서 공간과 속도의 낭비 없음!!

### 불변 클래스(immutable class)와 가변 클래스(mutable class)
String→ 불변 클래스

StringBuffer→ 가변 클래스 (자유롭게 인스턴스 값 변경)

String 클래스와 같은 불변 클래스는 append()나 insert()처럼 값 변경하는 메소드를 포함하지 않음!

근데 이렇게 불편한 애를 왜 쓰나요?

→ 멀티 스레드 환경에서 객체가 변화되는 상황이면 불변 인스턴스를 사용하는 것이 더 신뢰할 수 있는 코드를 작성 가능!

→ 하나의 객체에 접근하면서 각각의 객체가 서로 영향을 주어서는 안 되는 경우에 불변 인스턴스를 사용하면 값이 변하지 않는다는 점이 보장됨.

### append() 메소드

* 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열을 마지막에 추가함.
* String 클래스의 concat() 메소드와 같은 결과를 반환하지만, 내부적인 처리 속도가 훨씬 빠름.

```java
StringBuffer str = new StringBuffer("Java");
System.out.println("원본 문자열 : " + str);
 
System.out.println(str.append("수업"));
System.out.println("append() 메소드 호출 후 원본 문자열 : " + str);
```

### capacity() 메소드

* StringBuffer 인스턴스의 현재 버퍼 크기를 반환함.

### delete() 메소드

* 전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거
(첫 번째 매개변수로 전달된 인덱스부터 두 번째 매개변수로 전달된 인덱스 바로 앞의 문자까지를 삭제)
* deleteCharAt() 메소드를 사용하면 특정 위치의 문자 한 개만을 제거 가능

```java
StringBuffer str = new StringBuffer("Java Oracle");
System.out.println("원본 문자열 : " + str);
 
① System.out.println(str.delete(4, 8));
System.out.println(str.deleteCharAt(1));
System.out.println("deleteCharAt() 메소드 호출 후 원본 문자열 : " + str);
```

### insert() 메소드

* 인수로 전달된 값을 문자열로 변환 후 해당 문자열의 지정된 인덱스 위치에 추가함.


- - - -
## -4) Math 클래스

### java.lang.Math 클래스

* 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
* Math 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용할 수 있음.

### Math.E와 Math.PI
*1. Math.E:* 오일러의 수라 불리며, 자연로그(natural logarithms)의 밑(base) 값으로 약 2.718을 의미합니다.

*2. Math.PI:* 원의 원주를 지름으로 나눈 비율(원주율) 값으로 약 3.14159를 의미합니다.

### random() 메소드

* 0.0 이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환.
* 내부적으로 java.util 패키지의 Random 클래스를 사용한 의사 난수 발생기(pseudorandom-number generator)를 사용하여 임의의 수를 생성함.

```java
//방법 1
System.out.println((int)(Math.random() * 100)); // 0 ~ 99

//방법 2
Random ran = new Random();
System.out.println(ran.nextInt(100));           // 0 ~ 99

//범위 난수
(int)(Math.random() * 6);       // 0 ~ 5
((int)(Math.random() * 6) + 1); // 1 ~ 6
((int)(Math.random() * 6) + 3); // 3 ~ 8
```

### abs() 메소드

* 전달된 값이 음수이면 그 값의 절댓값을 반환, 전달된 값이 양수이면 전달된 값을 그대로 반환.

```java
System.out.println(Math.abs(10));    // 10
System.out.println(Math.abs(-10));   // 10
System.out.println(Math.abs(-3.14)); // 3.14
```

### floor() 메소드, ceil() 메소드와 round() 메소드

* floor() : 인수로 전달받은 값과 같거나 작은 수 중에서 가장 큰 정수를 반환. (밑 버림)
* ceil() : 반대로 인수로 전달받은 값과 같거나 큰 수 중에서 가장 작은 정수를 반환. (올림)
* round() : 전달받은 실수를 소수점 첫째 자리에서 반올림한 정수를 반환.

```java
System.out.println(Math.ceil(10.0));      // 10.0
System.out.println(Math.ceil(10.1));      // 11.0
System.out.println(Math.ceil(10.000001)); // 11.0
 
System.out.println(Math.floor(10.0));     // 10.0
System.out.println(Math.floor(10.9));     // 10.0
 
System.out.println(Math.round(10.0));     // 10
System.out.println(Math.round(10.4));     // 10
System.out.println(Math.round(10.5));     // 11
```

### max() 메소드와 min() 메소드

* max() 메소드는 전달된 두 값을 비교하여 그중에서 큰 값을 반환하며, min() 메소드는 그중에서 작은 값을 반환

### pow() 메소드와 sqrt() 메소드

* pow() 메소드는 전달된 두 개의 double형 값을 가지고 제곱 연산을 수행.
(예를 들어, pow(a, b)는 a의 b 승, 즉 ab를 반환)
* 반대로 sqrt() 메소드는 전달된 double형 값의 제곱근 값을 반환

```java
System.out.println((int)Math.pow(5, 2)); // 25
System.out.println((int)Math.sqrt(25));  // 5
```

### sin() 메소드, cos() 메소드와 tan() 메소드
이 외에도 Math 클래스에서 제공하는 삼각 함수와 관련된 메소드는

* asin(), acos(), atan(), atan2(), sinh(), cosh(), tanh()

단, 정확한 소숫점을 표현할 순 없음. [그 이유는](http://www.tcpschool.com/java/java_datatype_floatingPointNumber)

- - - -
## -5) Wrapper 클래스

### 래퍼 클래스
프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우가 존재함.

☝️ 예를 들어, 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없습니다.
→ 기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행해야 합니다.

이렇게 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스(Wrapper class)라고 합니다.
![](Java/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-02-09%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%204.43.48.png)



### 박싱과 언박싱

* 래퍼 클래스(Wrapper class)는 산술 연산을 위해 정의된 클래스가 아니므로, 인스턴스에 저장된 값을 변경할 수 없음.
* Just 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값만을 참조할 수 있음.

```
![Java%20f744bc1bc4c34a868c9e00b29ce8f748/_2021-01-29__4.53.06.png](Java%20f744bc1bc4c34a868c9e00b29ce8f748/_2021-01-29__4.53.06.png)
```

* 박싱(Boxing): 기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정
* 언박싱(UnBoxing): 래퍼 클래스의 인스턴스에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정

### 오토 박싱과 오토 언박싱
JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 자동으로 처리함.

렇게 자동화된 박싱과 언박싱을 오토 박싱, 오토 언박싱이라고 부름

```java
Integer num = new Integer(17); // 박싱
int n = num.intValue();        // 언박싱
System.out.println(n);
 
Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
char c = ch;        // char c = ch.charValue();           : 오토언박싱
System.out.println(c);
```

→ 래퍼 클래스인 Integer 클래스와 Character 클래스에는 각각 언박싱을 위한 intValue(), charValue() 메소드가 포함되어 있음.

→ 오토 박싱을 이용하면 new 키워드를 사용하지 않고도 자동으로 Character 인스턴스를 생성 가능.

그래서 이런 연산도 가능해

```java
public class Wrapper02 {
    public static void main(String[] args) {
        Integer num1 = new Integer(7); // 박싱
        Integer num2 = new Integer(3); // 박싱
 
        int int1 = num1.intValue();    // 언박싱
        int int2 = num2.intValue();    // 언박싱
 
①      Integer result1 = num1 + num2; // 10 
②      Integer result2 = int1 - int2; // 4
③      int result3 = num1 * int2;     // 21
    }
}
```

단, 비교연산 시 동등 연산자(==)를 주의해야 함!

두 인스턴스 간의 주소값을 비교하여서 언제나 false를 반환하게 됨.

그래서  equals() 메소드를 이용하여 비교해야 함.

- - - -
## -6) Enum 클래스

### 열거체(enumeration type)
C언어와 C++에서는 열거체를 사용할 수 있지만, JDK 1.5 이전의 자바에서는 사용할 수 없었다. 1.5부터는 더 향상된 열거체를 정의한 Enum 클래스 사용 가능!

* 열거체를 사용하면 이런 장점이 있다.
	1. 열거체를 비교할 때 실제 값 뿐 만 아니라 타입까지도 체크한다.
	2. 열거체의 상숫값이 재정의되더라도 다시 컴파일할 필요가 없다.

### 열거체의 정의 및 사용
*<정의 방법>*

* 문법
`enum 열거체이름 { 상수1이름, 상수2이름, ... }`
* 예제
`enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }`

*<사용 방법>*

* 문법
`열거체이름.상수이름`
* 예제
`Rainbow.RED`

### 열거체의 상숫값 정의 및 추가

* 열거체의 첫 번째 상숫값은 0부터 설정되어 1씩 증가함. (배열이랑 똑띠)
* 만약, 불규칙한 값을 상숫값으로 설정하고 싶으면 상수 이름 옆에 괄호를 추가하고, 그 안에 원하는 상숫값을 명시하면 됨.

```java
enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
 
    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
```

### values() 메소드

* 모든 상수를 저장한 배열을 생성하여 반환함.

```java
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
 
public class Enum01 {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();
        for (Rainbow rb : arr) {
            System.out.println(rb);
        }
    }
}
```

### valueOf() 메소드

* 전달된 문자열과 일치하는 해당 열거체의 상수를 반환.

```java
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
 
public class Enum02 {
    public static void main(String[] args) {
        Rainbow rb = Rainbow.valueOf("GREEN");
        System.out.println(rb);
    }
}
```

### ordinal() 메소드

* 해당 열거체 상수가 열거체 정의에서 정의된 순서(0부터 시작)를 반환함.
(이 때 반환되는 값은 열거체 정의에서 해당 열거체 상수가 정의된 순서를 의미하고, 상숫값 자체가 아님)

```java
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
 
public class Enum03 {
    public static void main(String[] args) {
        int idx = Rainbow.YELLOW.ordinal();
        System.out.println(idx);
    }
}
```

```java
enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
 
    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
 
public class Enum04 {
    public static void main(String[] args) {
        System.out.println(Rainbow.YELLOW.ordinal());
    }
}
```

- - - -
## Arrays 클래스
`import java.util.Arrays`

### binarySearch() 메소드

* 전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후, 해당 위치를 반환함.
* 이진 검색 알고리즘을 이용하기에, 매개변수로 전달되는 배열이 sort() 메소드 등을 사용하여 미리 정렬되어 있어야만 제대로 작동함.

```java
int[] arr = new int[1000];
for(int i = 0; i < arr.length; i++) {
    arr[i] = i;
}
 
System.out.println(Arrays.binarySearch(arr, 437));
```

### copyOf() 메소드

* 전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환.
* 첫 번째 매개변수: 원본 배열
두 번째 매개변수: 원본 배열에서 새로운 배열로 복사할 요소의 개수
(이때 새로운 배열의 길이가 원본 배열보다 길면, 나머지 요소는 배열 요소의 타입에 맞게 다음과 같은 기본값으로 채워짐)
![](Java/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-02-09%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%204.42.56.png)


```java
int[] arr1 = {1, 2, 3, 4, 5};
① int[] arr2 = Arrays.copyOf(arr1, 3);
 
for (int i = 0; i < arr2.length; i++) {
    System.out.print(arr2[i] + " ");
}
 
② int[] arr3 = Arrays.copyOf(arr1, 10);
for (int i = 0; i < arr3.length; i++) {
    System.out.print(arr3[i] + " ");
}
```

### copyOfRange() 메소드

* 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환함.
* 첫 번째 매개변수: 복사의 대상이 될 원본 배열
두 번째 매개변수: 원본 배열에서 복사 시작할 인덱스
세 번째 매개변수: 마지막으로 복사될 배열 요소의 바로 다음 인덱스

### fill() 메소드

* 전달받은 배열의 모든 요소를 특정 값으로 초기화함.
* 첫 번째 매개변수: 초기화할 배열
두 번째 매개변수: 초기값

```java
int[] arr = new int[10];
 
Arrays.fill(arr, 7);
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

### sort() 메소드

* 전달받은 배열의 모든 요소를 오름차순으로 정렬함.

```java
int[] arr = {5, 3, 4, 1, 2};
 
Arrays.sort(arr);
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

- - - -
## Calendar 클래스
JDK 1.0까지는 Date 클래스를 사용했다. JDK 1.1부터는 새롭게 제공되는 Calenddar 클래스를 이용하여 날짜와 시간에 관한 처리를 수행함.

→ Java SE 8 버전에서는 더 향상된 java.time 패키지를 사용함.

`import java.util.GregorianCalendar`

### add() 메소드

* 전달된 Calendar 필드에서 일정 시간만큼을 더하거나 빼줌.

*▪️  현재 시각에 120초 더하는 예제*

```java
Calendar time = Calendar.getInstance();
System.out.println(time.getTime());
 
time.add(Calendar.SECOND, 120);
System.out.println(time.getTime());
```

### before()와 after() 메소드

* before(): 현재 Calendar 인스턴스가 전달된 객체가 나타내는 시간보다 이전인지 판단.
* after(): 현재 Calendar 인스턴스가 전달된 객체가 나타내는 시간보다 나중인지 판단.

```java
Calendar time1 = Calendar.getInstance();
Calendar time2 = Calendar.getInstance();
Calendar time3 = Calendar.getInstance();
 
time2.set(1998, 4, 7);
time3.set(2021, 12, 25);

System.out.println(time1.before(time2));
System.out.println(time1.before(time3));
```

### get() 메소드

* Calendar 필드에 저장된 값을 반환

```java
Calendar time = Calendar.getInstance();
 
System.out.println(time.getTime());
System.out.println(time.get(Calendar.DAY_OF_WEEK));
System.out.println(time.get(Calendar.MONTH) + 1);
System.out.println(time.get(Calendar.DAY_OF_MONTH));
System.out.println(time.get(Calendar.HOUR_OF_DAY));
System.out.println(time.get(Calendar.MINUTE));
System.out.println(time.get(Calendar.SECOND));
System.out.println(time.get(Calendar.YEAR));
```

### roll() 메소드

* 전달된 Calendar 필드에서 일정 시간 만큼을 더하거나 뺌
(add() 와는 달리 Calendar 필드에 영향 없음.)

```java
Calendar time1 = Calendar.getInstance();
Calendar time2 = Calendar.getInstance();
System.out.println(time1.getTime());
 
time1.add(Calendar.SECOND, 60);
System.out.println(time1.getTime());
 
time2.roll(Calendar.SECOND, 60);
System.out.println(time2.getTime());
```

### set() 메소드

* 전달된 Calendar 필드를 특정 값으로 설정.

```java
Calendar time = Calendar.getInstance();
System.out.println(time.getTime());
 
time.set(Calendar.YEAR, 2020);
System.out.println(time.getTime());
 
time.set(1982, 1, 19); // 1은 2월을 나타냄.
System.out.println(time.getTime());
 
time.set(1982, 1, 19, 12, 34, 56);
System.out.println(time.getTime());
```

- - - -
## 제네릭의 개념
[여기 설명 진짜 잘돼있음!!!](https://coding-factory.tistory.com/573)

* 제네릭(generic): 데이터의 타입을 일반화(generalize)한다.
* 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법.
* 장점
	1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있음.
	2. 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있음.

### 제네릭의 선언 및 생성
**선언**
```java
class ExClassGeneric<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }
			
    public T getT() {
        return t;
    }
}
```

* 'T'를 타입 변수라고 하며, 임의의 참조형 타입을 의미함.
* 꼭 'T' 뿐만 아니라 어떠한 문자를 사용해도 상관없고, 여러 개의 타입 변수는 쉼표로 구분하여 명시할 수 있음.
* 타입 변수는 클래스에서뿐만 아니라 메소드의 매개변수나 반환값으로도 사용할 수 있음.

위와 같이 선언된 제네릭 클래스(generic class)를 생성할 때에는 타입 변수 자리에 사용할 실제 타입을 명시해야 함.

`MyArray<Integer> myArr = new MyArray<Integer>();`

`MyArray<Integer> myArr = new MyArray<>(); // Java SE 7부터 가능`

자바에서 타입 변수 자리에 사용할 실제 타입을 명시할 때 기본 타입을 바로 사용할 수는 없음.

이때는 위 예제의 Integer와 같이 래퍼(wrapper) 클래스를 사용해야만 함.

▪️  제네릭에서 적용되는 타입 변수의 다형성

```java
import java.util.*;
 
class LandAnimal { public void crying() { System.out.println("육지동물"); } }
class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹"); } }
class Dog extends LandAnimal { public void crying() { System.out.println("멍멍"); } }
class Sparrow { public void crying() { System.out.println("짹짹"); } }
 
class AnimalList<T> {
    ArrayList<T> al = new ArrayList<T>();
 
    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}
 
public class Generic01 {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>(); // Java SE 7부터 생략가능함.
 
        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());
        // landAnimal.add(new Sparrow()); // 오류가 발생함.
 
        for (int i = 0; i < landAnimal.size() ; i++) {
            landAnimal.get(i).crying();
        }
    }
}
```

* 위의 예제에서 Cat과 Dog 클래스는 LandAnimal 클래스를 상속받는 자식 클래스이므로, AnimalList에 추가할 수 있음.
* 하지만 Sparrow 클래스는 타입이 다르므로 추가할 수 없음.

### 제너릭 제거 시기

* 제네릭 타입은 컴파일 시 컴파일러에 의해 자동으로 검사되어 타입 변환됨.
* 그리고서 코드 내의 모든 제네릭 타입은 제거되어 컴파일된 class 파일에는 어떠한 제네릭 타입도 포함되지 않게 됨.
* 이러한 식으로 동작하는 이유는 제네릭을 사용하지 않는 코드와의 호환성을 유지하기 위함임.

- - - -
## 다양한 제네릭 표현

### 타입 변수의 제한

* 제네릭은 'T'와 같은 타입 변수를 사용하여 타입을 제한하는데, 이때 extends 키워드를 사용하면 타입 변수에 특정 타입만을 사용하도록 제한할 수  있음.
`class AnimalList<T extends LandAnimal> { ... }`
* 위와 같이 클래스의 타입 변수에 제한을 걸어놓으면 클래스 내부에서 사용된 모든 타입 변수에 제한이 걸림. 이떄엔 클래스가 아닌 인터페이스를 구현할 경우에도 implements 키워드가 아닌 extends 키워드를 사용해야 함.

```java
interface WarmBlood { ... }
...
class AnimalList<T extends WarmBlood> { ... } // implements 키워드를 사용해서는 안됨.
```

* *자주 사용하는 타입인자*
	- <T>: Type
	- <E>: Element
	- <K>: Key
	- <N>: Number
	- <V>: Value
	- <R>: Result


▪️  클래스와 인터페이스를 동시에 상속받고 구현해야 한다면 엠퍼센트 기호를 사용.

```java
class AnimalList<T extends LandAnimal & WarmBlood> { ... }
```

```java
import java.util.*;
 
class LandAnimal { public void crying() { System.out.println("육지동물"); } }
class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹"); } }
class Dog extends LandAnimal { public void crying() { System.out.println("멍멍"); } }
class Sparrow { public void crying() { System.out.println("짹짹"); } }
 
class AnimalList<T extends LandAnimal> {
    ArrayList<T> al = new ArrayList<T>();
 
    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}
 
public class Generic02 {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>(); // Java SE 7부터 생략가능함.
 
        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());
        // landAnimal.add(new Sparrow()); // 오류가 발생함.
 
        for (int i = 0; i < landAnimal.size() ; i++) {
            landAnimal.get(i).crying();
        }
    }
}
```

* 위의 예제는 타입 변수의 다형성을 이용하여 AnimalList 클래스의 선언부에 명시한 'extends LandAnimal' 구문을 생략해도 제대로 동작합니다.
* 하지만 코드의 명확성을 위해서는 위와 같이 타입의 제한을 명시하는 편이 더 좋습니다.

### 제네릭 메소드(generic method)

* 메소드의 선언부에 타입 변수를 사용한 메소드.
* 이때 타입 변수의 선언은 메소드 선언부에서 반환 타입 바로 앞에 위치함.

`public static <T> void sort( ... ) { ... }`

▪️  다음 예제의 제네릭 클래스에서 정의된 타입 변수 T와 제네릭 메소드에서 사용된 타입 변수 T는 전혀 별개의 것임을 주의!

```java
class AnimalList<T> {
    ...
    public static <T> void sort(List<T> list, Comparator<? super T> comp) {
        ...
    }
    ...
}
```

### 와일드카드의 사용

* 이름에 제한을 두지 않음을 표현하는 데 사용되는 기호.
* 물음표`?` 기호를 사용하여 와일드 카드를 사용할 수 있음.

```java
<?>           // 타입 변수에 모든 타입을 사용할 수 있음.
<? extends T> // T 타입과 T 타입을 상속받는 자손 클래스 타입만을 사용할 수 있음.
<? super T>   // T 타입과 T 타입이 상속받은 조상 클래스 타입만을 사용할 수 있음.
```

▪️  클래스 메소드(static method)인 cryingAnimalList() 메소드의 매개변수의 타입을 와일드카드를 사용하여 제한하는 예제

```java
import java.util.*;
 
class LandAnimal { public void crying() { System.out.println("육지동물"); } }
class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹"); } }
class Dog extends LandAnimal { public void crying() { System.out.println("멍멍"); } }
class Sparrow { public void crying() { System.out.println("짹짹"); } }
 
class AnimalList<T> {
    ArrayList<T> al = new ArrayList<T>();
 
    public static void cryingAnimalList(AnimalList<? extends LandAnimal> al) {
        LandAnimal la = al.get(0);
        la.crying();
    }
 
    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}
 
public class Generic03 {
    public static void main(String[] args) {
        AnimalList<Cat> catList = new AnimalList<Cat>();
        catList.add(new Cat());
        AnimalList<Dog> dogList = new AnimalList<Dog>();
        dogList.add(new Dog());
 
        AnimalList.cryingAnimalList(catList);
        AnimalList.cryingAnimalList(dogList);
    }
}
```

- - - -
## 컬렉션 프레임워크

* 컬렉션 프레임워크(collection framework)란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미함.
* 즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것.
* 자바의 인터페이스(interface)를 사용하여 구현됨.

### 컬렉션 프레임워크의 주요 인터페이스

* 데이터를 저장하는 자료 구조에 따라 다음과 같은 핵심이 되는 주요 인터페이스를 정의함.
	1. List 인터페이스
	2. Set 인터페이스
	3. Map 인터페이스
* 이 중에서 List와 Set 인터페이스는 모두 Collection 인터페이스를 상속받지만, 구조상의 차이로 인해 Map 인터페이스는 별도로 정의됨.
* 따라서 List 인터페이스와 Set 인터페이스의 공통된 부분을 Collection 인터페이스에서 정의하고 있음.

[Document Link : The Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html)

### 주요 인터페이스 간의 상속 관계
![](Java/_2021-02-03__3.48.00.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/_2021-02-03__3.48.00.png

위의 그림에서 나 <K, V>라는 것은 컬렉션 프레임워크를 구성하는 모든 클래스가 제네릭으로 표현되어 있음을 알려줌.

### 주요 인터페이스의 간략한 특징
![](Java/_2021-02-03__4.05.58.png)Java%20f744bc1bc4c34a868c9e00b29ce8f748/_2021-02-03__4.05.58.png

### 컬렉션 클래스(collection class)

* 컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스를 컬렉션 클래스(collection class)라고 함.
* 컬렉션 프레임워크의 모든 컬렉션 클래스는 List와 Set, Map 인터페이스 중 하나의 인터페이스를 구현함.
* 또한, 클래스 이름에도 구현한 인터페이스의 이름이 포함되므로 바로 구분할 수 있음.
* Vector나 Hashtable과 같은 컬렉션 클래스는 예전부터 사용해 왔으므로, 기존 코드와의 호환을 위해 아직도 남아 있음.
하지만 기존에 사용하던 컬렉션 클래스를 사용하는 것보다는 새로 추가된 ArrayList나 HashMap 클래스를 사용하는 것이 성능 면에서도 더 나은 결과를 얻을 수 있음!

```java
import java.util.*;
 
public class Collection01 {
    public static void main(String[] args) {
        // 리스트 생성
        ArrayList<String> arrList = new ArrayList<String>();
 
        // 리스트에 요소의 저장
        arrList.add("넷");
        arrList.add("둘");
        arrList.add("셋");
        arrList.add("하나");
 
        // 리스트 요소의 출력
        for(int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }
}
```

### Collection 인터페이스

* List와 Set 인터페이스의 많은 공통된 부분을 Collection 인터페이스에서 정의하고, 두 인터페이스는 그것을 상속받음.
* 따라서 Collection 인터페이스는 컬렉션을 다루는데 가장 기본적인 동작들을 정의하고, 그것을 메소드로 제공하고 있음.
* *주요 메소드 목록*
	* `boolean add(E e)`
	* `void clear()`
	* `boolean contains(Object o)`
	* `boolean equals(Object o)`
	* `boolean isEmpty()`
	* `Iterator<E> iterator()`
	* `boolean remove(Object o)`
	* `int size()`
	* `Object[] toArray()`

- - - -
## List 컬렉션 클래스

* *특징*
	1. 요소의 저장 순서가 유지됨
	2. 같은 요소의 중복 저장을 허용함
* *대표적인 List 컬렉션 클래스에 속하는 클래스*
	1. ArrayList
	2. LinkedList
	3. Vector
	4. Stack

### ArrayList 클래스

* 가장 많이 사용되는 컬렉션 클래스 중 하나
* ArrayList 클래스는 배열을 이용하기 때문에 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있음.
* 하지만 배열은 크기를 변경할 수 없는 인스턴스이므로, 크기를 늘리기 위해서는 새로운 배열을 생성하고 기존의 요소들을 옮겨야 하는 복잡한 과정을 거쳐야 함.
→ 이 과정은 자동으로 수행되지만, 요소의 추가 및 삭제 작업에 걸리는 시간이 매우 길어지는 단점을 가지게 됩니다.

```java
ArrayList<Integer> arrList = new ArrayList<Integer>();
 
// add() 메소드를 이용한 요소의 저장
arrList.add(40);
arrList.add(20);
arrList.add(30);
arrList.add(10);
 
// for 문과 get() 메소드를 이용한 요소의 출력
for (int i = 0; i < arrList.size(); i++) {
    System.out.print(arrList.get(i) + " ");
}
 
// remove() 메소드를 이용한 요소의 제거
arrList.remove(1);
 
// 출력 방법 1: Enhanced for 문과 get() 메소드를 이용한 요소의 출력
for (int e : arrList) {
    System.out.print(e + " ");
}
 
// 출력 방법 2: Collections.sort() 메소드를 이용한 요소의 정렬
Collections.sort(arrList);
 
// 출력 방법 3: iterator() 메소드와 get() 메소드를 이용한 요소의 출력
Iterator<Integer> iter = arrList.iterator();
while (iter.hasNext()) {
    System.out.print(iter.next() + " ");
}
 
// set() 메소드를 이용한 요소의 변경
arrList.set(0, 20);
 
for (int e : arrList) {
    System.out.print(e + " ");
}
 
// size() 메소드를 이용한 요소의 총 개수
System.out.println("리스트의 크기 : " + arrList.size());
```

### LinkedList 클래스

* 이중 연결 리스트를 내부적으로 구현한 것.

```java
LinkedList<String> lnkList = new LinkedList<String>();
 
// add() 메소드를 이용한 요소의 저장
lnkList.add("넷");
lnkList.add("둘");
lnkList.add("셋");
lnkList.add("하나");
 
// for 문과 get() 메소드를 이용한 요소의 출력
for (int i = 0; i < lnkList.size(); i++) {
    System.out.print(lnkList.get(i) + " ");
}
 
// remove() 메소드를 이용한 요소의 제거
lnkList.remove(1);
 
// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
for (String e : lnkList) {
    System.out.print(e + " ");
}
 
// set() 메소드를 이용한 요소의 변경
lnkList.set(2, "둘");
 
for (String e : lnkList) {
    System.out.print(e + " ");
}
 
// size() 메소드를 이용한 요소의 총 개수
System.out.println("리스트의 크기 : " + lnkList.size());
```

### Vector 보다는 ArrayList를 써라~

**List 인터페이스 메소드**
* `boolean add(E e)`: 해당 리스트(list)에 전달된 요소를 추가함. (선택적 기능)
* `void add(int index, E e)`: 해당 리스트의 특정 위치에 전달된 요소를 추가함. (선택적 기능)
* `void clear()`: 해당 리스트의 모든 요소를 제거함. (선택적 기능)
* `boolean contains(Object o)`: 해당 리스트가 전달된 객체를 포함하고 있는지를 확인함.
* `boolean equals(Object o)`: 해당 리스트와 전달된 객체가 같은지를 확인함.
* `E get(int index)`: 해당 리스트의 특정 위치에 존재하는 요소를 반환함.
* `boolean isEmpty()`: 해당 리스트가 비어있는지를 확인함.
* `Iterator<E> iterator()`: 해당 리스트의 반복자(iterator)를 반환함.
* `boolean remove(Object o)`: 해당 리스트에서 전달된 객체를 제거함. (선택적 기능)
* `boolean remove(int index)`: 해당 리스트의 특정 위치에 존재하는 요소를 제거함. (선택적 기능)
* `E set(int index, E e)`: 해당 리스트의 특정 위치에 존재하는 요소를 전달받은 객체로 대체함. (선택적 기능)
* `int size()`: 해당 리스트의 요소의 총 개수를 반환함.
* `Object[] toArray()`: 해당 리스트의 모든 요소를 Object 타입의 배열로 반환함.

- - - -
## Stack과 Queue

* 후입선출(LIFO)
* *Vector 클래스의 메소드 5개를 상속받아 사용함.*
	* `boolean empty()`: 해당 스택이 비어 있으면 true를, 비어 있지 않으면 false를 반환
	* `E peek()`: 해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환
	* `E pop()`: 해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환하고, 해당 요소를 스택에서 제거
	* `E push()(E item)`: 해당 스택의 제일 상단에 전달된 요소를 삽입
	* `int search(Object o)`: 해당 스택에서 전달된 객체가 존재하는 위치의 인덱스를 반환. 이때 인덱스는 제일 상단에 있는(제일 마지막으로 저장된) 요소의 위치부터 0이 아닌 1부터 시작

더욱 복잡하고 빠른 스택을 구현하고 싶다면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용하면 됨.

`Deque<Integer> st = new ArrayDeque<Integer>();`

단, ArrayDeque 클래스는 Stack 클래스와는 달리 search() 메소드는 지원하지 않음!

```java
Stack<Integer> st = new Stack<Integer>(); // 스택의 생성
//Deque<Integer> st = new ArrayDeque<Integer>();
 
// push() 메소드를 이용한 요소의 저장
st.push(4);
st.push(2);
st.push(3);
st.push(1);
 
// peek() 메소드를 이용한 요소의 반환
System.out.println(st.peek());
System.out.println(st);
 
// pop() 메소드를 이용한 요소의 반환 및 제거
System.out.println(st.pop());
System.out.println(st);
 
// search() 메소드를 이용한 요소의 위치 검색
System.out.println(st.search(4));
System.out.println(st.search(3));
```

### Queue 인터페이스

* 선입선출(FIFO)
* *Queue 인터페이스를 상속받는 하위 인터페이스*
	1. `Deque<E>`
	2. `BlockingDeque<E>`
	3. `BlockingQueue<E>`
	4. `TransferQueue<E>`

```
Deque 인터페이스를 구현한 LinkedList 클래스가 큐 메모리 구조를 구현하는 데 가장 많이 사용됨.
```

* *Collection 인터페이스 메소드 상속받아 사용하는 것*
	* `boolean add(E e)`: 해당 큐의 맨 뒤에 전달된 요소 삽입. 삽입 성공 시 true 반환하고, 큐에 여유 공간이 없어 실패하면 IllegalStateException을 발생.
	* `E element()`: 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.
	* `boolean offer(E e)`: 해당 큐의 맨 뒤에 전달된 요소를 삽입함.
	* `E peek()`: 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함. 만약 큐가 비어있으면 null을 반환함.
	* `E poll()`: 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거함. 만약 큐가 비어있으면 null을 반환함.
	* `E remove()`: 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 제거함.

더욱 복잡하고 빠른 큐를 구현하고 싶다면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용!

`Deque<Integer> qu = new ArrayDeque<Integer>();`

```java
LinkedList<String> qu = new LinkedList<String>(); // 큐의 생성
//Deque<String> qu = new ArrayDeque<String>();
 
// add() 메소드를 이용한 요소의 저장
qu.add("넷");
qu.add("둘");
qu.add("셋");
qu.add("하나");
 
// peek() 메소드를 이용한 요소의 반환
System.out.println(qu.peek());
System.out.println(qu);
 
// poll() 메소드를 이용한 요소의 반환 및 제거
System.out.println(qu.poll());
System.out.println(qu);
 
// remove() 메소드를 이용한 요소의 제거
qu.remove("하나");
System.out.println(qu);
```

* Java SE 6부터 지원되는 ArrayDeque 클래스는 스택과 큐 메모리 구조를 모두 구현하는데 가장 적합한 클래스임.

- - - -
# Set 컬렉션 클래스
### 특징
1. 요소의 저장 순서를 유지하지 않음.
2. 같은 요소의 중복 저장을 허용하지 않음.

대표적인 Set 컬렉션 클래스에 속하는 클래스는 다음과 같다.
- HashSet<E>
- TreeSet<E>

## HashSet<E> 클래스
- HashSet 클래스는 Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나.
- 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.
- 내부적으로 HashMap 인스턴스를 이용하여 요소를 저장함.

`HashSet 예제`
```java
HashSet<String> hs01 = new HashSet<String>();
HashSet<String> hs02 = new HashSet<String>();
 
// add() 메소드를 이용한 요소의 저장
hs01.add("홍길동");
hs01.add("이순신");
System.out.println(hs01.add("임꺽정"));
System.out.println(hs01.add("임꺽정")); // 중복된 요소의 저장
 
// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
for (String e : hs01) {
    System.out.print(e + " ");
}
 
// add() 메소드를 이용한 요소의 저장
hs02.add("임꺽정");
hs02.add("홍길동");
hs02.add("이순신");
 
// iterator() 메소드를 이용한 요소의 출력
Iterator<String> iter02 = hs02.iterator();
while (iter02.hasNext()) {
    System.out.print(iter02.next() + " ");
}
 
// size() 메소드를 이용한 요소의 총 개수
System.out.println("집합의 크기 : " + hs02.size());
```

`📝 Enhanced for문`
```java
String[] strArr = {"향상된", "FOR", "LOOP", "테스트"};
for(String arr : strArr){
	System.out.println(arr);
}
```
**출력 결과 :** 
```
향상된
FOR
LOOP
테스트
```


**그럼, HashSet에 이미 존재하는 요소인지는 어떻게 파악할까?**
1. 해당 요소에서 hashCode() 메소드를 호출하여 반환된 해시값으로 검색할 범위를 결정한다.
2. 해당 범위 내의 요소들을 equals() 메소드로 비교한다.
-> 따라서 HashSet에서 add() 메소드를 사용하여 중복 없이 새로운 요소를 추가하기 위해서는 hashCode()와 equals() 메소드를 상황에 맞게 오버라이딩해야 함.

`사용자가 정의한 Animal 클래스의 인스턴스를 HashSet에 저장하기 위해 hashCode()와 equals() 메소드를 오버라이딩한 예제`
```java
class Animal {
    String species;
    String habitat;
 
    Animal(String species, String habitat) {
    this.species = species;
    this.habitat = habitat;
	  }
 
		public int hashCode() { return (species + habitat).hashCode(); }

    public boolean equals(Object obj) {
        if(obj instanceof Animal) {
            Animal temp = (Animal)obj;
            return species.equals(temp.species) && habitat.equals(temp.habitat);
        } else {
            return false;
        }
    }
}
 
public class Set02 {
    public static void main(String[] args) {
        HashSet<Animal> hs = new HashSet<Animal>();
 
        hs.add(new Animal("고양이", "육지"));
        hs.add(new Animal("고양이", "육지"));
        hs.add(new Animal("고양이", "육지"));
 
        System.out.println(hs.size());
    }
}
//출력 결과 : 1
```


## 해시 알고리즘 (hash algorithm)
- 해시 함수를 사용하여 데이터를 해시 테이블에 저장하고, 다시 그것을 검색하는 알고리즘.
![](Java/47D79197-9258-499D-A681-BE4E12E60C75.png)
- 자바에서 해시 알고리즘은 그림과 같이 배열과 연결 리스트로 구현됨.
- 저장할 데이터의 키 값을 해시 함수에 넣어 반환되는 값으로 배열의 인덱스를 구함. 
-> 그 후 해당 인덱스에 저장된 연결 리스트에 데이터를 저장함.

- - - -
## TreeSet<E> 클래스
- 데이터가 정렬된 상태로 저장되는 이진 검색 트리(binary search tree)의 형태로 요소를 저장함. 
- 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠름.
(JDK 1.2부터 제공되는 TreeSet 클래스는 NavigableSet 인터페이스를 기존의 이진 검색 트리의 성능을 향상시킨 레드-블랙 트리로 구현함)
- TreeSet 클래스는 Set 인터페이스를 구현하므로, 요소를 순서에 상관없이 저장하고 중복된 값은 저장하지 않음.

`예제`
```java
TreeSet<Integer> ts = new TreeSet<Integer>();
 
// add() 메소드를 이용한 요소의 저장
ts.add(30);
ts.add(40);
ts.add(20);
ts.add(10);
 
// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
for (int e : ts) {
    System.out.print(e + " ");
}
 
// remove() 메소드를 이용한 요소의 제거
ts.remove(40);
 
// iterator() 메소드를 이용한 요소의 출력
Iterator<Integer> iter = ts.iterator();
while (iter.hasNext()) {
    System.out.print(iter.next() + " ");
}
 
// size() 메소드를 이용한 요소의 총 개수
System.out.println("이진 검색 트리의 크기 : " + ts.size());
 
// subSet() 메소드를 이용한 부분 집합의 출력
① System.out.println(ts.subSet(10, 20));
② System.out.println(ts.subSet(10, true, 20, true));
/* 실행 결과 : 
10 20 30 40 
10 20 30 
이진 검색 트리의 크기 : 3
[10]
[10, 20]
*/
```
-> 위 예제처럼 TreeSet 인스턴스에 저장되는 요소들은 모두 정렬된 상태로 저장됨.
-> 위 예제에서 사용된 subSet() 메소드는 TreeSet 인스턴스에 저장되는 요소가 모두 정렬된 상태이기에 동작이 가능한 ~해당 트리의 부분 집합만을 보여주는 메소드~
```java
1. public NavigableSet<E> subSet(E fromElement, E toElement)
2. public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
```

- ①번 라인에서 사용된 subSet() 메소드는 첫 번째 매개변수로 전달된 값에 해당하는 요소부터 시작하여 두 번째 매개변수로 전달된 값에 해당하는 요소의 바로 직전 요소까지를 반환
- ②번 라인에서 사용된 subSet() 메소드는 두 번째와 네 번째 매개변수로 각각 첫 번째와 세 번째 매개변수로 전달된 값에 해당하는 요소를 포함할 것인지 아닌지를 명시할 수 있습니다.
- 즉, ②번 라인에서 네 번째 매개변수를 false로 변경하면 20을 포함하지 않게 되므로, ①번 라인과 같은 결과를 출력할 것입니다.
![](Java/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-02-09%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%206.12.17.png)

- - - -
# Map 컬렉션 클래스
[링크](http://www.tcpschool.com/java/java_collectionFramework_map)
- Collection 인터페이스와는 다른 저장방식을 가짐! -> 키와 값을 하나의 쌍으로 저장하는 방식(Key-Value 방식)을 사용함.

**특징**
1. 요소의 저장 순서를 유지하지 않음.
2. 키는 중복을 허용하지 않지만, 값의 중복은 허용함.

**대표적인 Map 컬렉션 클래스**
1. HashMap<K, V>
2. Hashtable<K, V>
3. TreeMap<K, V>

## HashMap<K, V> 클래스
- HashMap 클래스는 Map 컬렉션 클래스 중에서 가장 많이 사용되는 클래스 중 하나.
- JDK 1.2부터 제공된 HashMap 클래스는 해시 알고리즘을 사용하여 ~검색 속도가 매우 빠름.~
- HashMap 클래스는 Map 인터페이스를 구현하므로 중복된 키로는 값을 저장할 수 없음.

`여러 HashMap 메소드를 이용하여 맵을 생성하고 조작하는 예제`
```java
HashMap<String, Integer> hm = new HashMap<String, Integer>();
 
// put() 메소드를 이용한 요소의 저장
hm.put("삼십", 30);
hm.put("십", 10);
hm.put("사십", 40);
hm.put("이십", 20);
 
// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
for (String key : hm.keySet()) {
    System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
}
 
// remove() 메소드를 이용한 요소의 제거
hm.remove("사십");
 
// iterator() 메소드와 get() 메소드를 이용한 요소의 출력
Iterator<String> keys = hm.keySet().iterator();
while (keys.hasNext()) {
    String key = keys.next();
    System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
}
 
// replace() 메소드를 이용한 요소의 수정
hm.replace("이십", 200);
 
for (String key : hm.keySet()) {
    System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
}
 
// size() 메소드를 이용한 요소의 총 개수
System.out.println("맵의 크기 : " + hm.size());
/* 실행 결과 : 
맵에 저장된 키들의 집합 : [이십, 삼십, 사십, 십]
키 : 이십, 값 : 20
키 : 삼십, 값 : 30
키 : 사십, 값 : 40
키 : 십, 값 : 10
 
키 : 이십, 값 : 20
키 : 삼십, 값 : 30
키 : 십, 값 : 10
 
키 : 이십, 값 : 200
키 : 삼십, 값 : 30
키 : 십, 값 : 10
 
맵의 크기 : 3
*/
```
-> 위의 예제에서 사용된 keySet() 메소드는 해당 맵에 포함된 모든 키 값들을 하나의 집합(Set)으로 반환해 줌.

## Hashtable<K, V> 클래스
현재는 기존 코드와의 호환성을 위해서만 남아있고, Hashtable 클래스보다는 HashMap 클래스를 사용하는 것이 좋다.

## TreeMap<K, V> 클래스
- TreeMap 클래스는 키와 값을 한 쌍으로 하는 데이터를 이진 검색 트리의 형태로 저장함.
- 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠름.
- 중복된 키로는 값 저장 불가, 같은 값을 다른 키로 저장하는 것은 가능.

- - - -
# Iterator(반복자)와 ListIterator(리스트 반복자)
## Iterator<E> 인터페이스
- Java의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법을 Iterator 인터페이스로 표준화 함.
- Collection 인터페이스에서는 Iterator 인터페이스를 구현한 클래스의 인스턴스를 반환하는 iterator() 메소드를 정의하여 각 요소에 접근하도록 하고 있음.
-> 따라서 Collection 인터페이스를 상속받는 List와 Set 인터페이스에서도 iterator() 메소드 사용 가능.

`연결 리스트를 반복자(iterator)를 사용하여 순회하는 예제`
```java
LinkedList<Integer> lnkList = new LinkedList<Integer>();
 
lnkList.add(4);
lnkList.add(2);
lnkList.add(3);
lnkList.add(1);
 
Iterator<Integer> iter = lnkList.iterator();
while (iter.hasNext()) {
    System.out.print(iter.next() + " ");
}
// 실행 결과 : 4 2 3 1
```

**Iterator 인터페이스의 컬렉션의 요소에 접근하는 메소드**
	- `boolean hasNext()`: 해당 이터레이션이 다음 요소를 가지고 있으면 true를 반환, 아니면 false를 반환.
	- `E next()`: 이터레이션의 다음 요소를 반환.
	- `default void remove()`: 해당 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거.

## Enumeration<E> 인터페이스
Iterator 인터페이스와 같은 동작을 하지만 현재에는 기존 코드와의 호환성을 위해서만 남아있으므로, Enumeration 인터페이스보다는 Iterator 인터페이스를 써라!

## ListIterator<E> 인터페이스
- Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스.
- 컬렉션의 요소에 접근할 때 한 방향으로만 이동할 수 있었지만 JDK 1.2부터 제공된 ListIterator 인터페이스는 컬렉션 요소의 대체, 추가 그리고 인덱스 검색 등을 위한 작업에서 양방향으로 이동하는 것을 지원함.
(단, ListIterator 인터페이스는 List 인터페이스를 구현한 List 컬렉션 클래스에서만 listIterator() 메소드를 통해 사용할 수 있음)

`리스트 반복자를 사용하여 리스트의 모든 요소를 순방향과 역방향으로 출력하는 예제`
```java
LinkedList<Integer> lnkList = new LinkedList<Integer>();
 
lnkList.add(4);
lnkList.add(2);
lnkList.add(3);
lnkList.add(1);
 
ListIterator<Integer> iter = lnkList.listIterator();
while (iter.hasNext()) {
    System.out.print(iter.next() + " ");
}
 
while (iter.hasPrevious()) {
    System.out.print(iter.previous() + " ");
}
/* 실행 결과 : 
4 2 3 1 
1 3 2 4 
*/
```

- - - -
# Comparable과 Comparator
## Comparable<T> 인터페이스
- Comparable 인터페이스는 객체를 정렬하는 데 사용되는 메소드인 compareTo() 메소드를 정의하고 있음.
- 자바에서 같은 타입의 인스턴스를 서로 비교해야만 하는 클래스들은 모두 Comparble 인터페이스를 구현하고 있음.
-> 따라서, Boolean을 제외한 래퍼 클래스나 String, Time, Date와 같은 클래스의 인스턴스는 모두 정렬 가능함. (이 때 기본 정렬 순서는 작은 값에서 큰 값으로 정렬되는 오름차순)

`사용자 정의 클래스 Car이 Comparable 인터페이스를 구현하는 예제`
```java
class Car implements Comparable<Car> {
    private String modelName;
    private int modelYear;
    private String color;
 
    Car(String mn, int my, String c) {
        this.modelName = mn;
        this.modelYear = my;
        this.color = c;
    }
 
    public String getModel() {
        return this.modelYear + "식 " + this.modelName + " " + this.color;
    }
 
    public int compareTo(Car obj) {
        if (this.modelYear == obj.modelYear) {
            return 0;
        } else if(this.modelYear < obj.modelYear) {
            return -1;
        } else {
            return 1;
        }
    }
}
 
public class Comparable01 {
    public static void main(String[] args) {
        Car car01 = new Car("아반떼", 2016, "노란색");
        Car car02 = new Car("소나타", 2010, "흰색");
 
        System.out.println(car01.compareTo(car02));
    }
}
//실행 결과 : 1
```


## Comparator<T> 인터페이스
- 객체를 정렬하는 데 사용되는 인터페이스.

- Comparable은 오름차순이 기본이지만, Comparator 인터페이스는 내림차순이나 아니면 다른 기준으로 정렬하고 싶을 때 사용할 수 있음.
(이 때 Comparator 인터페이스를 구현한 클래스에서는 compare() 메소드를 정의하여 사용하게 됨)

`요소를 내림차순으로 정렬하여 저장하는 TreeSet 인스턴스를 생성하기 위해 Comparator 인터페이스를 구현하는 예제`
```java
import java.util.*;
 
class DescendingOrder implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Integer c1 = (Integer)o1;
            Integer c2 = (Integer)o2;
            return c2.compareTo(c1);
        }
        return -1;
    }
}
 
public class Comparable02 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>(new DescendingOrder());
 
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);
 
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
/* 실행 결과 : 
40
30
20
10
*/
```


- - - -
::내가 가장 배우고 싶었던!!!::
# 예외 처리
### 오류와 예외
  컴퓨터 시스템이 동작하는 도중에 예상하지 못한 사태가 발생하여 실행 중인 프로그램이 영향을 받는 것을 오류(error)와 예외(exception) 두 가지로 구분할 수 있음.

- **오류**는 시스템 레벨에서 프로그램에 심각한 문제를 야기하여 실행 중인 프로그램을 종료시킨다. 이러한 오류는 개발자가 미리 예측하여 처리할 수 없는 것이 대부분이므로, 오류에 대한 처리는 할 수 없다.

- **예외**는 오류와 마찬가지로 실행 중인 프로그램을 종료시키지만, 발생할 수 있는 상황을 미리 예측하여 처리할 수 있다.

 따라서, 개발자는 ~예외 처리(exception handling)~ 를 통해 상황을 처리할 수 있도록 코드의 흐름을 바꿀 필요가 있다.

## 예외 처리(exception handling)
- 자바에서는 예외를 처리하기 위해 try/catch/finally 문을 사용할 수 있다.
```java
try {
    //예외를 처리하길 원하는 실행 코드;
} catch (e1) {
    //e1 예외가 발생할 경우에 실행될 코드;
} catch (e2) {
    //e2 예외가 발생할 경우에 실행될 코드;
}
...
finally {
    //예외 발생 여부와 상관없이 무조건 실행될 코드;
}
```
1. `try` : 기본적으로 맨 먼저 실행되는 코드로 여기에서 발생한 예외는 catch 블록에서 처리됨.
2. `catch` : try 블록에서 발생한 예외 코드나 예외 객체를 인수로 전달받아 그 처리를 담당함.
3. `finally` : 이 블록은 try 블록에서 예외가 발생하건 안 하건 맨 마지막에 무조건 실행됨.
-> catch 블록과 finally 블록은 선택적인 옵션이므로 반드시 사용할 필요는 없음.


## 예외 처리 매커니즘
자바에서 예외 처리는 다음과 같은 순서로 진행된다.
1. `try`블록에 도달하면 try 블록 내의 코드를 실행함.
-> 이때 만약 예외가 발생(throw)하지 않고, finally 블록이 존재하면 프로그램은 바로 finally 블록으로 이동함.
2. try 블록에서 예외가 발생하면 `catch`핸들러는 다음과 같은 순서로 catch 블록을 찾음
	1. 스택에서 try 블록과 가장 가까운 catch 블록부터 차례대로 검사함.
	2. 만약 적절한 catch 블록을 찾지 못하면, 바로 다음 바깥쪽 try 블록 다음에 위치한 catch 블록을 차례대로 검사함.
	3. 이러한 과정을 가장 바깥쪽 try 블록까지 검사함.
	4. 그래도 적절한 catch 블록을 찾지 못하면 예외는 처리되지 못함.
3. 만약 적절한 catch 블록을 찾으면, throw 문의 피연산자는 예외 객체의 형식 매개변수로 전달됨.
4. 모든 예외 처리가 끝나면 프로그램의 제어는 finally 블록으로 이동함.
5. finally 블록이 모두 처리되면, 프로그램의 제어는 예외 처리문 바로 다음으로 이동함.
![](Java/B6911613-ADF5-4B8F-899A-D5AA89C431CE.png)
①번에서 예외 발생하지 않으면 -> ⑥
①번에서 예외 발생 -> ② -> ③ -> (적절한 블록 못찾으면) ④ -> ⑤ (이 catch 블록 중에서 해당 예외를 처리할 수 있는 블록을 찾으면) -> ⑥
하지만 모든 catch 블록이 해당 예외를 처리할 수 없으면, 예외는 처리되지 못한 채 해당 프로그램은 강제 종료될 것임.

- - - -
# 예외 클래스
## Exception 클래스
1. RuntimeException 클래스
2. 그 외의 Exception 클래스의 자식 클래스
![](Java/63C042AB-902F-4CD2-A0AD-097730030457.png)
- RuntimeException 클래스를 상속받는 자식 클래스들은 주로 ~치명적인 예외 상황을 발생시키지 않는 예외~ 들로 구성됨.
-> try / catch 문을 사용하기보다는 프로그램을 작성하면서 예외가 발생하지 않도록 주의를 기울이는 편이 좋음.

- 하지만 그 외의 Exception 클래스에 속하는 자식 클래스들은 치명적인 예외 상황을 발생시키므로, 반드시 try / catch 문을 사용하여 예외를 처리해야만 함.
(Java에서 강제하기 때문에 이러한 예외 발생 가능성 있는 구문을 예외처리하지 않았을 때에는 컴파일 시 오류를 발생시킴.)

예를 들어, `PrintSteram 클래스의 write() 메소드를 사용하여 byte 타입 배열의 모든 요소를 출력하는 예제`
```java
public class Exception01 {
    public static void main(String[] args) {
        byte[] list = {'a', 'b', 'c'};
        System.out.write(list);
    }
}
```
-> write() 메소드에서 발생할 수 있는 IOException에 대한 예외를 처리하지 않았으므로, 컴파일 시 오류가 발생함.
```java
byte[] list = {'a', 'b', 'c'};
 
try {
    System.out.write(list);
} catch (IOException e) {
    e.printStackTrace();
}
// 실행 결과 : abc
```


## 예외 처리의 계층 관계
자바에서는 예외가 발생하면, try 블록과 가장 가까운 catch 블록부터 순서대로 검사함.
따라서 여러 개의 catch 블록을 사용할 때는 Exception 클래스의 계층 관계에도 주의를 기울여야 함.

```java
try {
    System.out.write(list);
} catch (Exception e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```
- 위 예제에서 IOException이 발생하면 IOException의 부모인 Exception도 처리할 수 있기에, 무조건 첫 번째 catch 블록에서만 처리됨.
-> IOException과 Exception의 처리 순서를 바꿔야 함.
- 이처럼 **범위가 더 좁은 예외를 처리하는 catch 블록을 먼저 명시**하고, 넓은 예외 처리 catch 블록은 나중에 명시해야만 함!!!

## 여러 예외 타입의 동시 처리
Java SE 7부터는 ‘|’ 기호를 사용하여 하나의 catch 블록에서 여러 타입의 예외를 동시에 처리할 수 있음.
```java
try {
    this.db.commit();
} catch (IOException | SQLException e) {
    e.printStackTrace();
}
```
- 둘 이상의 예외 타입를 동시에 처리하는 catch 블록에서 매개변수로 전달받은 예외 객체는 묵시적으로 final 제어자를 가지게 됨.
-> 따라서 catch 블록 내에서 해당 매개변수에는 어떠한 값도 대입할 수 없음!


## Throwable 클래스
- 자바에서 Throwable 클래스는 모든 예외의 조상이 되는 Exception 클래스와 모든 오류의 조상이 되는 Error 클래스의 부모 클래스
- Throwable 타입과 이 클래스를 상속받은 서브 타입만이 자바 가상 머신(JVM)이나 throw 키워드에 의해 던져질 수 있음.

`일부러 숫자를 0으로 나눠 ArithmeticException 오류를 발생시키는 예제`
: 발생한 오류에 대해 Throwable 메소드를 사용하여 발생한 오류에 대한 정보를 출력함.
```java
try {
    System.out.println(5 / 0);
} catch (ArithmeticException e) {
    System.out.println("현재 발생한 예외 정보 : " + e.getMessage());
}
// 실행 결과 : 현재 발생한 예외 정보 : / by zero
```

### 자주 사용되는 예외 클래스
![](Java/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-02-09%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%207.38.06.png)

- - - -
# 예외 발생 및 회피
## 예외 발생시키기
자바에서는 throw 키워드를 사용하여 강제로 예외를 발생시킬 수 있음.
```java
Exception e = new Exception("오류메시지");
...
throw e;
```
-> 위의 예제처럼 생성자에 전달된 문자열은 getMessage() 메소드를 사용하여 오류 메시지로 출력할 수 있음.

## 예외 회피하기
메소드 선언부에 throw 키워드를 사용하여 해당 메소드를 사용할 때 발생할 수 있는 예외를 미리 명시할 수도 있음.
	- 해당 메소드를 사용할 때 발생할 수 있는 예외를 사용자가 충분히 인지할 수 있으며, 그에 대한 처리도 강제할 수 있음
	-> 따라서 더욱 안정성있는 프로그램을 작성할 수 있음.

`예제`
```java
public class Exception03 {
    static void handlingException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("호출된 메소드에서 예외가 처리됨!");
        }
    }
 
    public static void main(String[] args) {
        try {
            handlingException();
        } catch (Exception e) {
            System.out.println("main() 메소드에서 예외가 처리됨!");
        }
    }
}
// 실행 결과 : 호출된 메소드에서 예외가 처리됨!
```
- 이때 호출된 메소드의 try / catch 문을 생략하면 컴파일 오류가 발생함.
- 또한, 이 메소드를 호출한 main() 메소드는 호출된 메소드에서 예외가 발생한 사실을 알 수 없음.

`throws 키워드를 사용하여 호출된 메소드에서 발생한 예외를 호출한 메소드로 넘기는 예제`
```java
public class Exception04 {
    static void handlingException() throws Exception { throw new Exception(); }
 
    public static void main(String[] args) {
        try {
            handlingException();
        } catch (Exception e) {
            System.out.println("main() 메소드에서 예외가 처리됨!");
        }
    }
}
// 실행 결과 : main() 메소드에서 예외가 처리됨!
```
- 이렇게 함으로써 호출된 메소드에는 try / catch 문을 생략할 수 있음.
- 그리고 호출된 메소드에서 발생한 예외를 해당 메소드를 호출한 main() 메소드에서 처리할 수 있게 됨.

## 사용자 정의 예외 클래스
- 자바에서는 Exception 클래스를 상속받아 자신만의 새로운 예외 클래스를 정의하여 사용할 수 있음.
- 사용자 정의 예외 클래스에는 생성자뿐만 아니라 필드 및 메소드도 원하는 만큼 추가할 수 있음.
```java
class MyException extends RuntimeException {
    MyException(String errMsg) {
        super(errMsg);
    }
}
```
-> 요즘에는 위와 같이 Exception 클래스가 아닌 예외 처리를 강제하지 않는 RuntimeException 클래스를 상속받아 작성하는 경우가 많음.

## try-with-resources 문
Java SE 7부터는 사용한 자원을 자동으로 해제해 주는 try-with-resources 문을 사용할 수 있음.
`try( 파일을 열거나 자원을 할당하는 명령문) { }`
- 위와 같이 try 블록에 괄호를 추가하여 파일을 열거나 자원을 할당하는 명령문을 명시하면, 해당 try 블록이 끝나자마자 자동으로 파일을 닫거나 할당된 자원을 해제해 줌.

✔️ Java SE 7 이전에는 finally 블록을 사용하여 사용한 파일을 닫아줘야 했는데, try-with-resources 문을 사용하면 자동으로 파일의 닫기를 수행할 수 있음. [링크](http://www.tcpschool.com/java/java_exception_throw)

- - - -
# 스트림(stream)
자바에서는 파일이나 콘솔의 입출력을 직접 다루지 않고, 스트림(stream)이라는 흐름을 통해 다룬다.

- 스트림이란 실제의 입력이나 출력이 표현된 데이터의 이상화된 흐름을 의미함.
-> 즉, 스트림은 운영체제에 의해 생성되는 가상의 연결 고리를 의미하며, 중간 매개자 역할을 함.
![](Java/808CF369-D0B1-43A1-A97F-9C4B70E77990.png)
⚠️ Java SE 8 버전부터 추가된 스트림 API는 앞서 설명한 스트림과는 전혀 다른 개념임!

## 입출력 스트림
스트림은 한 방향으로만 통신할 수 있으므로, 입력과 출력을 동시에 처리할 수 없음.
따라서 스트림은 사용 목적에 따라 입력 스트림과 출력 스트림으로 구분됨.

자바에서는 java. io 패키지를 통해 Input Steram과 OutputStream 클래스를 별도로 제공함.
-> 즉, 자바에서의 스트림 생성이란 이러한 스트림 클래스 타입의 인스턴스를 생성한다는 의미.

**InputStream**
	- `abstract int read()`: 해당 입력 스트림으로부터 다음 바이트를 읽어들임.
	- `int read(byte[] b)`: 해당 입력 스트림으로부터 특정 바이트를 읽어들인 후, 배열 b에 저장함.
	- `int read(byte[] b, int off, int len)`: 해당 입력 스트림으로부터 len 바이트를 읽어들인 후, 배열 b[off]부터 저장함.
**OutputStream**
	- `abstract void write(int b)`: 해당 출력 스트림에 특정 바이트를 저장함.
	- `void write(byte[] b)`: 배열 b의 특정 바이트를 배열 b의 길이만큼 해당 출력 스트림에 저장함.
	-  `void write(byte[] b, int off, int len)`: 배열 b[off]부터 len 바이트를 해당 출력 스트림에 저장함.

⚠️ read() 메소드는 해당 입력 스트림에서 더 이상 읽어들일 바이트가 없으면, -1을 반환해야 함. 그런데 반환 타입을 byte 타입으로 하면, 0부터 255까지의 바이트 정보는 표현할 수 있지만 -1은 표현할 수 없게 됨. 따라서 InputStream의 read() 메소드는 반환 타입을 int형으로 선언하고 있음.

## 바이트 기반 스트림
자바에서 스트림은 기본적으로 바이트 단위로 데이터를 전송함.
**자바에서 제공하는 바이트 기반의 입출력 스트림**
	- 파일: FileInputStream (/Output)
	- 메모리: ByteArrayInputStream (/Output)
	- 프로세스: PipeInputStream (/Output)
	- 오디오 장치: AudioInputStream (/Output)

## 보조 스트림
자바에서 제공하는 보조 스트림은 실제 데이터를 주고받을 수는 없지만, 다른 스트림의 기능을 향상시키거나 새로운 기능을 추가해 줌.

## 문자 기반 스트림
자바에서 스트림은 기본적으로 바이트 단위로 데이터를 전송하기에 자바에서 가장 작은 타입인 char 형이 2바이트이므로, 1바이트씩 전송되는 바이트 기반 스트림으로는 원활한 처리가 힘든 경우가 있음.

따라서 자바에서는 문자 기반의 스트림도 별도로 제공함.
	- FileReader (/Writer)
	- CharArrayReader (/Writer)
	- PipedReader (/Writer)
	- StringReader (/Writer)

- - - -
# 파일 입출력
## 표준 입출력
자바에서는 콘솔과 같은 표준 입출력 장치를 통해 System이라는 표준 입출력 클래스를 정의함.
- java.lang 패키지에 포함되어있는 System 클래스는 표준 입출력을 위해 다음과 같은 클래스 변수를 제공함.
![](Java/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-02-09%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%208.02.20.png)
-> 표준 입출력 스트림은 자바가 자동으로 생성하므로, 개발자가 별도로 스트림을 생성하지 않아도 사용할 수 있음.

파일 입출력은 간략하게 적었으므로 추가 정보가 필요한 경우에는 서칭하거나 [링크](http://www.tcpschool.com/java/java_io_file)를 참조하세요옹

- - - -
# 스레드
- **프로세스**: 단순히 실행중인 프로그램. 사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행 중인 것.
- **스레드**: 프로세스 내에서 실제로 작업을 수행하는 주체.

## 스레드의 생성과 실행
스레드를 생성하는 방법으로 두 가지 방법이 있다.
1. Runnable 인터페이스를 구현하는 방법
2. Thread 클래스를 상속받는 방법
-> 두 방법 모두 스레드를 통해 작업하고 싶은 내용을 run() 메소드에 작업하면 됨.

`예제`
```java
class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);          // 0.01초간 스레드를 멈춤.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 
class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 
public class Thread01 {
    public static void main(String[] args){
        ThreadWithClass thread1 = new ThreadWithClass();       // Thread 클래스를 상속받는 방법
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable 인터페이스를 구현하는 방법
 
        thread1.start(); // 스레드의 실행
        thread2.start(); // 스레드의 실행
    }
}
/* 실행 결과
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
*/
```

## 스레드의 우선순위
스레드는 우선순위에 관한 자신만의 필드를 가짐.
- static int MAX_PRIORITY: 스레드가 가질 수 있는 최대 우선순위
- static int MIN_PRIORITY: 스레드가 가질 수 있는 최소 우선순위
- static int NORM_PRIORITY: 스레드가 생성될 때 가지는 기본 우선순위
getPriority()와 setPriority() 메소드를 통해 우선순위를 반환하거나 변경할 수 있음.
범위는 1~10, 숫자가 높을수록 우선순위 높아짐.

## 멀티 스레드
- **멀티 스레드**: 둘 이상의 스레드가 동시에 작업을 수행하는 것을 의미.
- **멀티 프로세스**: 여러 개의 CPU를 사용하여 여러 프로세스를 동시에 수행하는 것
-> 여러 흐름을 동시에 수행한다는 공통점 有.
-> 멀티 프로세스는 각 프로세스가 독립적인 메모리를 가지고 별도로 실행되지만, 멀티 스레드는 각 스레드가 자신이 속한 프로세스의 메모리를 공유한다는 점이 다름.

**장점**
- 각 스레드가 자신이 속한 프로세스의 메모리를 공유하므로, 시스템 자원의 낭비가 적다.
- 하나의 스레드가 작업을 할 때 다른 스레드가 별도의 작업을 할 수 있어서 사용자와의 응답성이 좋다.

## 문맥 교환
컴퓨터에서 동시에 처리할 수 있는 최대 작업 수는 CPU의 코어 수와 같음.
만약 CPU의 코어 수보다 더 많은 스레드가 실행되면, 각 코어가 정해진 시간 동안 여러 작업을 번갈아가며 수행하게 됨.
-> 이 때 각 스레드가 서로 교차될 때 스레드 간의 문맥 교환(context switching)이 발생함. (문맥 교환: 현재까지의 작업 상태나 다음 작업에 필요한 각종 데이터를 저장하고 읽어오는 작업)
-> 문맥 교환에 걸리는 시간이 커지면 커질수록, 멀티 스레딩의 효율이 저하됨.

## 스레드 그룹
서로 관련이 인쓴 스레드를 하나의 그룹으로 묶어 다루기 위한 장치.

## 데몬 스레드
다른 일반 스레드의 작업을 돕는 보조적인 역할을 하는 스레드를 가르킴.
데몬 스레드는 일반 스레드가 모두 종료되면 더 할 일 이 없으므로, 데몬 스레드 역시 자동으로 종료됨.

## 가비지 컬렉터
프로그래머가 동적으로 할당한 메모리 중 더 이상 사용하지 않는 영역을 자동으로 찾아내어 해제해 주는 데몬 스레드.

프로그래머가 메모리에 직접 접근하지 못하게 하는 대신에, 가비지 컬렉터가 자동으로 메모리를 관리해줌.
-> 버그 발생 확률 저하.

가비지 컬렉터가 동작하는 동안에는 프로세서가 일시적으로 중지되므로, 성능 저하가 발생됨. (최근에는 좀 발전됨)

- - - -
# 람다 표현식(lambda expression)
메소드를 하나의 식으로 표현한 것.
**메소드로는** 
```java
int min(int x, int y){
	return x < y ? x : y;
}
//x가 y보다 크다가 참이면 x, 거짓이면 y
```
**람다 표현식으로는**
```java
(x, y) -> x < y ? x : y;
```

람다 표현식은 메소드의 매개변수로 전달될 수 있고, 메소드의 결괏값으로 반환될 수 있음.
-> 불필요한 코드 감소, 코드 가독성 증가

## 람다 표현식 작성법
`(매개변수 목록) -> { 함수 몸체 }`

**유의할 사항**
1. 매개변수가 타입을 추론할 수 있는 경우에는 타입을 생략할 수 있음.
2. 매개변수가 하나인 경우에는 괄호를 생략할 수 있음.
3. 함수의 몸체가 하나의 명령문만으로 이루어진 경우에는 중괄호생략 가능. (이때 세미콜론 안붙임)
4. 함수의 몸체가 하나의 return문으로만 이루어진 경우에는 중괄호 생략 불가.
5. return문 대신 표현식을 사용할 수 있고, 이 때 반환값은 표현식의 결괏값이 됨.(이때 세미콜론 안붙임)

`전통적인 방식과 람다 표현식을 사용한 스레드 생성 비교`
```java
new Thread(new Runnable() {
    public void run() {
        System.out.println("전통적인 방식의 일회용 스레드 생성");
    }
}).start();
 
new Thread(()->{
    System.out.println("람다 표현식을 사용한 일회용 스레드 생성");
}).start();
```


## 함수형 인터페이스
람다 표현식을 사용할 때는 람다 표현식을 저장하기 위한 참조 변수의 타입을 결정해야만 함.
**문법**: `참조변수의타입 참조변수의이름 = 람다표현식`
		-> 람다 표현식을 하나의 변수에 대입할 때 사용하는 참조 변수의 타입을 ~함			    수형 인터페이스~ 라고 부른다.

함수형 인터페이스는 추상 클래스와는 달리 단 하나의 추상 메소드만을 가져야 하는데, 다음과 같은 어노테이션을 사용하여 함수영 인터페이스임을 명시할 수 있음.
`@FunctionalInterface`


## 메소드 참조
메소드 참조(method reference)는 람다 표현식이 단 하나의 메소드만을 호출하는 경우에 해당 람다 표현식에서 불필요한 매개변수를 제거하고 사용할 수 있도록 해줌.
```java
클래스이름::메소드이름
또는
참조변수이름::메소드이름
```

예제 : `(base, exponent) -> Math.pow(base, exponent);`

## 생성자 참조
예제:
`(a) -> { return new Object(a); }`
`Object::new;`
`Function<Integer, double[]> func1= a -> new double[a];//람다표현식`
`Function<Integer, double[]> func2 = double[]::new;//생성자참조`

- - - -
# 스트림 API
(Java SE 8부터 추가됨)

- 자바에서는 많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션을 이용한다. 이렇게 저장된 데이터에 접근하기 위해서는 반복문이나 반복자(iterator)를 사용하여 매번 새로운 코드를 작성해야 하는데, 이러한 문제점을 해결하기 위한 것이 Java SE 8 의 스트림 API!
- 스트림 API는 데이터를 추상화하여 다루므로, 다양한 방식으로 저장된 데이터를 읽고 쓰기 위한 공통된 방법을 제공한다.
- 따라서 스트림 API를 이용하면 배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방법으로 다룰 수 있음.

## 특징
1. 스트림은 외부 반복을 통해 작업하는 컬렉션과는 달리 내부 반복(internal iteration)을 수행한다.
2. 스트림은 재사용이 가능한 컬렉션과는 달리 단 한 번만 사용할 수 있다.
3. 스트림은 원본 데이터를 변경하지 않는다.
4. 스트림의 연산은 필터-맵(filter-map) 기반의 API를 사용하여 지연(lazy) 연산을 통해 성능을 최적화한다.
5. 스트림은 parallelStream() 메소드를 통한 손쉬운 병렬 처리를 지원한다.

## 스트림 API의 동작 흐름
![](Java/0B811BFA-C222-4E8F-B512-EB0F4A4CA6B8.png)
1. 스트림의 생성
2. 스트림의 중개 연산 (스트림의 변환)
3. 스트림의 최종 연산 (스트림의 사용)

## 스트림의 생성
다음과 같은 다양한 데이터 소스에서 생성 가능.
1. 컬렉션
2. 배열
3. 가변 매개변수
4. 지정된 범위의 연속된 정수
5. 특정 타입의 난수들
6. 람다 표현식
7. 파일
8. 빈 스트림
[예제](http://www.tcpschool.com/java/java_stream_creation)

## 스트림의 중개 연산(intermediate operation)
- 초기 스트림은 중개 연산을 통해 또 다른 스트림으로 변환됨.
- 중개 연산은 연속으로 연결해서 사용할 수 있음.
- 필터-맵 기반의 API를 사용하므로 지연(lazy) 연산을 통해 성능을 최적화할 수 있음.

1. 스트림 필터링 : filter(), distinct()
2. 스트림 변환 : map(), flatMap()
3. 스트림 제한 : limit(), skip()
4. 스트림 정렬 : sorted()
5. 스트림 연산 결과 확인 : peek()
[예제](http://www.tcpschool.com/java/java_stream_intermediate)

## 스트림의 최종 연산(terminal operation)
- 중개 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 각 요소를 소모하여 결과를 표시함.
(즉, 지연되었던 모든 중개 연산들이 최종 연산 시에 모두 수행됨)
- 최종 연산 시에 모든 요소를 소모한 해당 스트림은 더는 사용할 수 없게 됨.

1. 요소의 출력 : forEach()
2. 요소의 소모 : reduce()
3. 요소의 검색 : findFirst(), findAny()
4. 요소의 검사 : anyMatch(), allMatch(), noneMatch()
5. 요소의 통계 : count(), min(), max()
6. 요소의 연산 : sum(), average()
7. 요소의 수집 : collect()
[예제](http://www.tcpschool.com/java/java_stream_terminal)

- - - -
# Optional 클래스
- Optional<T> 클래스는 Integer나 Double 클래스처럼 ’T’타입의 객체를 포장해 주는 래퍼 클래스(Wrapper class)이다.
- 따라서 Optional 인스턴스는 모든 타입의 참조 변수를 저장할 수 있다.
- 이러한 Optional 객체를 사용하면 예상치 못한 ~NullPointerException 예외~ 를 제공되는 메소드로 간단히 회피할 수 있다.
-> 복잡한 조건문 없이도 널(null) 값으로 인해 발생하는 예외를 처리할 수 있게 됨!!
[예제](http://www.tcpschool.com/java/java_stream_optional)

- - - -
# java.time 패키지
[java.time](http://www.tcpschool.com/java/java_time_javaTime)
[LocalDate 클래스와 LocalTime 클래스](http://www.tcpschool.com/java/java_time_localDateTime)



- - - -
**🦅  뽜이링 박예랑 !**
