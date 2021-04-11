# 🍃 Spring 입문
생성일: Jan 12, 2021 1:13 AM
태그: #공부/Java, #공부/Spring

자료 : 
<a href='Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/%E1%84%89%E1%85%B3%E1%84%91%E1%85%B3%E1%84%85%E1%85%B5%E1%86%BC%20%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB%20-%20%E1%84%8F%E1%85%A9%E1%84%83%E1%85%B3%E1%84%85%E1%85%A9%20%E1%84%87%E1%85%A2%E1%84%8B%E1%85%AE%E1%84%82%E1%85%B3%E1%86%AB%20%E1%84%89%E1%85%B3%E1%84%91%E1%85%B3%E1%84%85%E1%85%B5%E1%86%BC%20%E1%84%87%E1%85%AE%E1%84%90%E1%85%B3,%20%E1%84%8B%E1%85%B0%E1%86%B8%20MVC,%20DB%20%E1%84%8C%E1%85%A5%E1%86%B8%E1%84%80%E1%85%B3%E1%86%AB%20%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%20v2021-03-03.pdf'>스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술 v2021-03-03.pdf</a>

**목차**
- [x] 프로젝트 환경설정 [[/🔫 요이~ 땅!]]
- [x] [[/Spring 웹 개발 기초]]
- [x] [[/회원 관리 예제 - 백엔드 개발]]
- [x] 스트링 빈과 의존관계
- [x] 회원 관리 예제 - 웹 MVC 개발
- [x] 스프링 DB 접근 기술
- [x] AOP
- [x] 다음으로...

- - - -
## Spring은 뭘까?
>  스프링 프레임워크는 어떤 플랫폼에서도 종합적인 프로그래밍과 자바 기반의 현대 엔터프라이즈 어플리케이션의 Configuration Model을 제공한다. 스프링의 핵심요소는 어플리케이션 단위의 인프라를 제공한다는 것이다. 스프링은 기업용 어플리케이션의 plumbing에 초점을 맞추고 있다. 그래서 개발팀은 특정 배포 환경에서 불필요한 시도없이 어플리케이션의 비즈니스 로직에 초점을 맞출 수 있다.  

🤷‍♀️ **WHYRANO?** 스프링을 안쓰면 서블릿도 사용해야 하고, 각 객체들의 생성/소멸도 신경을 써주어야 함. 변경에 대해 유연하게 대응하려면 패턴들도 내가 직접 작성해야 함. 더불어 인증/보안/로깅 등 공통으로 필요한 모듈들도 직접 만들어야 함… 으메 귀찮어

### 정의
* 자바(JAVA) 플랫폼을 위한 오픈소스(Open Source) 어플리케이션 프레임워크
* 자바 엔터프라이즈 개발을 편하게 해주는 오픈 소스 경량급 애플리케이션 프레임워크
* 자바 개발을 위한 프레임워크로 종속 객체를 생성해주고, 조립해주는 도구
* POJO(Plain Old Java Object) BEAN CONTAINNER

### 특징
* 크기와 부하의 측면에서 경량
* 제어 역행(IoC)를 통하여 어플리케이션의 느슨한 결합을 도모
* 관점지향(AOP) 프로그래밍을 위한 풍부한 지원을 함.
* 어플리케이션 객체의 생명주기와 설정을 포함하고 관리한다는 점에서 일종의 컨테이너라고 할 수 있음.
* 간단한 컴포넌트로 복잡한 어플리케이션을 구성하고 설정할 수 있음.

### 주요 컴포넌트
* **Plain Object Java Object** : 기본적으로 사용자가 만들어낸 객체를 의미함. 스프링은 사용자가 만들 객체들에 대해서도 라이프사이클 관리를 위임해서 수행하며, 이들의 조합으로 어플리케이션을 만들 수 있음.
* **AOP** : 관점지향형 프로그램으로 사용자들이 트랜젝션 처리/로깅/예외 처리들의 로직을 공통으로 처리할 수 있는 기능을 지원함. 해당 기능을 잘 사용하면 비지니스로직와 기타 공통모듈이 섞이는 것을 방지하여 비지니스 로직에 집중할 수 있도록 합니다.
* **PSA(Portable Service Abstraction)** : 스프링은 다른 여러 모듈을 사용함에 있어서 별도의 추상화 레이어를 제공합니다. 예를 들어 JPA를 사용할 때에서 Spring JPA를 사용하여 추상화 하므로 실제 구현에 있어서 Hibernate를 사용하든 EclipseLink를 사용하든 사용자는 이 모듈의 의존 없이 프로그램에 집중할 수 있습니다.

[Spring 공식 사이트](https://spring.io/projects/spring-framework)
- - - -
# 🔫 요이~ 땅!

**사전 준비물**
* Java 11
* IntelliJ or Eclipse

[스프링 부트 스타터 사이트](https://start.spring.io)로 이동해서 스프링 프로젝트 생성

* 프로젝트 선택
	* Project: Gradle Project
	* Spring Boot: 2.3.x
	* Language: Java
	* Packaging: Jar
	* Java: 11
* Project Metadata
	* groupId: hello
	* artifactId: hello-spring
* Dependencies: Spring Web, Thymeleaf

* **메이븐/그래들** : 라이브러리 끌어오고, 빌드까지 도와주는 툴 → 요즘에는 거의 다 그래들을 씀.
프로젝트를 다 만들고 나면 buil.gradle 파일을 IntelliJ에서 열기.
보면 main과 test가 있음. 요즘 트렌드에서 테스트가 굉장히 중요!

👆  main에는 java 폴더와 resources 폴더가 있는데, .java파일 이외에는 전부  resources 폴더에 들어감.

### 라이브러리 살펴보기
왼쪽 아래 아이콘 클릭 OR cmd 두 번

> Gradle은 의존관계가 있는 라이브러리를 함께 다운로드 한다.  


**스프링 부트 라이브러리**
* Spring-boot-starter-web
	* spring boot-starter-tomcat: 톰캣 (웹서버)
	* spring-webmvc: 스프링 웹 MVC
* spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
* spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
	* spring-boot
		* spring-core
	* spring-boot-starter-logging
		* logback, slf4j

**테스트 라이브러리**
* spring-boot-starter-test
	* junit: 테스트 프레임워크
	* mockito: 목 라이브러리
	* assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
	* spring-test: 스프링 통합 테스트 지원
- - - -
### 폴더 구경하기
![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-03-03%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%208.46.59.png)
- gradle : 그래이들 관련 폴더
- src/main/java : 실제 패키지와 소스파일
- src/test : ★테스트 코드★와 관련된 소스
- src/main/resources : 자바 제외 모든 파일
- build.gradle : 버전 설정 및 라이브러리 땡겨오는 곳. 라떼는 말이야 다 쳤어야됐어… 근데 최근에는 스프링 부트로 바뀌면서 다 알아서 작성해줌~(우리가 골랐던 설정 적혀있음)
- .gitignore : git에는 진짜 중요한 소스코드 이외에는 올라가면 안되는데, 걔네를 제외해주는 파일

- 보기 설정에 따라 폴더 명이 다르게 보일 수 있다.
![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-03-03%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.50.30.png)


`📁 main>java>HelloSpringApplication.java`를 실행해보자. 
-> 프로젝트 환경 설정에 성공함!

😮 실행 시 좀 느릴 때가 있는데, 그래들을 통하지 않고 인텔리제이에서 자바를 바로 돌려서 빠르게 설정하세요!
![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-03-03%20%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE%209.54.12.png)

- - - -
# View 환경설정
### Welcome Page 만들기
`📁 resources/static/index.html`
```html
<!DOCTYPE HTML>
<html>
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
Hello
<a href="/hello">hello</a>
</body>
</html>
```


## 스프링 부트가 제공하는 웰컴페이지 템플릿 찾는 법
1. spring.io에 들어간다.
2. Project > Spring Boot > Version 클릭 > Spring Boot Features → Cmd + F "index.html"
여기에 나와있는 템플릿을 가져와서 이용한다.

**thymeleaf 템플릿 엔진**

* thymeleaf 공식 사이트: thymeleaf.org
* 스프링 공식 튜토리얼 :  spring.io/guides/gs/serving-seb-content
* 스프링 부트 매뉴얼: https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-template-engines

## Next step! 
- 웹 애플리케이션의 첫 진입점 컨트롤러를 만들어보자.
	- `📁 main > 📁 java` 에 패키지 생성. 이름은 controller.
	- 	`📁 controller` 에 클래스 생성. 이름은 HelloController

📁`java/controller/HelloController.java`
```java
package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨트롤러는 어노테이션 써줘야댐.
public class HelloController {
    @GetMapping("hello") //get 방식으로 가져온다.
    public String hello(Model model){
        model.addAttribute("data","hello!!"); 
        return "hello";  //resources폴더에 templates폴더에 hello라는 이름을 가진 파일에 렌더링해라.
    }
}
```
 👉 위처럼 Controller를 작성한 뒤 view이름과 같은 문자열을 return하게 되면 classpath에 존재하는 view를 찾아 그것을 사용자에게 응답한다. [참고](https://galid1.tistory.com/556) 

📁`resources/templates/hello.html`
```html
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<p th:text="'안녕하세요. ' + ${data}" >안녕하세요. 손님</p>
</body>
</html>
```
**thymeleaf 템플릿 엔진 동작 확인**
- 실행 : http://localhost:8080/hello

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-12__9.50.19.png)


* 컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버(`viewResolver`)가 화면을 찾아서 처리한다.
* 스프링 부트 템플릿 엔진 viewName 매핑
* `resources:templates/` + {ViewName} + `.html`

	- 참고 : `spring-boot-devtools` 라이브러리를 추가하면, `html` 파일을 컴파일만 해주면 서버 재시작 없이 View 파일 변경이 가능하다.
	- 인텔리J 컴파일 방법: 메뉴 build → Recompile

### 콘솔로 빌드하고 실행하기
콘솔로 이동!
0. `cd documents/dev/git/JavaStudy/hello-spring`
1. `./gradle build`
2.  `cd build/libs`
3. `java -jar hello-spring.0.0.1-SNAPSHOT.jar`
4. 실행 확인
5. 끄려면 `Ctrl+C`

- - - -
# Spring 웹 개발 기초
* 정적 콘텐츠
: 파일을 그대로 웹 브라우저에 보여주기
* MVC와 템플릿 엔진 (요즘 많이 씀)
: 서버에서 조금 변형해서 보여주기
* API
: vue, react, json과 같은 데이터 포멧으로 전달하기

- - - -
## 정적 콘텐츠
📁`resources/static/hello-static.html`

```html
<!DOCTYPE HTML>
<html>
<head>
    <title>static contents</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
정적 콘텐츠 입니다.
</body>
</html>
```

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-12__10.26.21.png)

- - - -
## MVC와 템플릿 엔진

* MVC: Model, View, Controller

**Controller**
📁 `java/hello.hellospring/controller/HelloController.java` 에 하단 내용 추가
```java
@GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
```
- @RequestParam("가져올 데이터의 이름") [데이터타입] [가져온데이터를 담을 변수]

**View**
📁 `rewources/templates/hello-template.html`
```html
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<p th:text="'안녕하세요. ' + ${name}" >hello empty</p>
</body>
</html>
```

🔗 접속 ! [http://localhost:8080/hello-mvc?name=spring](http://localhost:8080/hello-mvc?name=spring)

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-12__10.46.48.png)

1. 브라우저 : hello-mvc에 연결해줘~
2. 톰캣 : 야 스프링! hello-mvc가 왔어~
3. 스프링 : 어 helloController의 메서드에  매핑된게 있어~ (메서드 호출)
4. hello-template로 리턴. (모델에 name 키에 spring 값을 넣음.)
5. 뷰 리졸버 : 리턴의 스트링과 같은 파일 명 .html을 찾음.
6. 톰캣이 키값에 값으로 대치하여 변환 후 웹 브라우저에 표시함.

- - - -
## API
📁 `java/hello.hellospring/controller/HelloController` 에 추가

```java
@GetMapping("hello-string")
@ResponseBody
public String helloString(@RequestParam("name") String name){
    return "hello " + name;
}
```

`@ResponseBody`는 http의 body부에 return된 내용을 직접 넣어줄 것이다! 라는 의미.

🔗 접속 ! [http://localhost:8080/hello-string?name=yerang](http://localhost:8080/hello-string?name=yerang)

근데, source code를 보면?!

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-12__10.53.03.png)

진짜 그냥, 그대로 데이터를 보여줘버림! 그래서 이렇게는 잘 안쓴다.

### 그럼, 어떻게  쓰는걸까?
📁 `java/hello.hellospring/controller/HelloController` 에 또 추가!

```java
@GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
```

`Generate` 단축키는 ⌘ + N (getter setter 바로 만들 수 있음)
작성하다가, 끝맺음 짓기 귀찮을 때는 ⌘+⇧+↩

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/Untitled.png)

짤막한 암기시간 ^^~ 맨날 모르쥬?

🔗 접속 ! [http://localhost:8080/hello-api?name=yerang](http://localhost:8080/hello-string?name=yerang)

결과는 두둥..

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-12__11.02.56.png)

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-12__11.03.31.png)

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-12__11.10.29.png)

객체이면 JasonConverter가, String이면 StringConverter가 동작.

* `@ResponseBody`를 사용.
* HTTP의 BODY에 문자 내용을 직접 반환
* `viewResolver` 대신에  `HttpMessageConverter`가 동작
* 기본 문자처리:  `StringHttpMessageConverter`
* 기본 객체처리: `MappingJackson2HttpMessageConverter`
(jackson은 json을 이용하는 범용적인 컨버터!)
* byte 처리 등등 기타 여러 HttpMessageConverter가 기본으로 등록되어 있음

> 참고: 클라이언트의 HTTP Accept 헤더와 서버의 컨트롤러 반환 타입 정보 둘을 조합해서 `HttpMessageConverter` 가 선택된다. 더 자세한 내용은 스프링 MVC 강의에서!  

- - - -
# 회원 관리 예제 - 백엔드 개발
* 비즈니스 요구사항 정리
* 회원 도메인과 리포지토리 만들기
* 회원 리포지토리 테스트 케이스 작성
* 회원 서비스 개발
* 회원 서비스 테스트

## 비즈니스 요구사항 정리

* 데이터: 회원ID, 이름
* 기능: 회원 등록, 조회
* 아직 데이터 저장소가 선정되지 않음(가상 시나리오)

### 일반적인 웹 애플리케이션 계층 구조
![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-28__5.16.33.png)

- 컨트롤러: 웹 MVC의 컨트롤러 역할
- 서비스: 핵심 비즈니스 로직 구현
- 도메인: 비즈니스 도메인 객체 예)회원, 주문, 쿠폰 등등 주로 데이터베이스에 저장하고 관리됨
- 리포지토리: 데이터베이스에 접근, 도메인 객체를 DB에 저장하고 관리

### 클래스 의존관계
![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/_2021-01-28__5.23.25.png)

* 아직 데이터 저장소가 선정되지 않아서, 우선 인터페이스로 구현 클래스를 변경할 수 있도록 설계
* 데이터 저장소는 RDB, NoSQL 등등 다양한 저장소를 고민중인 상황으로 가정
* 개발을 진행하기 위해서 초기 개발 단계에서는 구현체로 가벼운 메모리 기반의 데이터 저장소 사용

**tip** : 코드 복붙 후 변수명 일괄변경 rename : shift + f6

- - - -
## 회원 도메인과 리포지토리 만들기
**회원 객체**
- 폴더 생성 `📁 main>java>domain`
- 클래스 생성 `member`

- 회원 객체를 저장하는 저장소 만들기 `📁 main>java>repository`
- 인터페이스 만들기 `MemberRepository`
(optional : 복잡한 조건문 없이 Null 처리 해주는 것.)

- 클래스 생성 `MemoryMemberRepository`
- 인터페이스 implements하기.
- Map 자료구조를 이용하여 회원 정보를 저장.

- - - -
#### 내가 작성한 회원 레포지토리가 제대로 작동할까? 
## 테스트해보자!

개발한 기능을 실행해서 테스트 할 때 자바의 main 메서드를 통해서 실행하거나, 웹 애플리케이션의 컨트롤러를 통해서 해당 기능을 실행한다. 

이러한 방법은 준비하고 실행하는데 ~오래 걸리고, 반복 실행하기 어렵고 여러 테스트를 한 번에 실행하기 어렵다~ 는 단점이 있다. 자바는 `JUnit`이라는 프레임워크로 테스트를 실행해서 이러한 문제를 해결한다.

**회원 레포지토리 메모리 구현체 테스트**
- `src/test/java` 하위 폴더에 패키지 생성 `repository`
- 패키지 내부에 클래스 생성 `MemoryMemberRepositoryTest`

- - - -
ㅁㅊ…. 인텔리제이 오류 계속 나는 문제 있었는데
Preference > Build, Exe…. > Maven > Gradle 에서 
Build and run using 이랑 Run tests using을 Gradle로 바꿨다가 IntelliJ로 다시 바꾸니까 오류 싹 사라졌고,,,,
테스트 파일에 오타가 있었다는걸 발견.. 왜그랬을까..? 그래들아 너 나 싫어하지?
너 완전 zzㅏ증나 여우같은 결🦊
- - - -

## 회원 서비스 객체 만들기
`main/java`에 `service`repository 만들기


- - - -
# 단축키
- command+option+v : 자동 옵셔널
- option+enter > ‘Add on static demand import…’ : 스태틱 임포트
									(앞부분 깔끔하게 지우기)
- control+R : 이전 실행 그대로 실행
- command+N : 게터 세터 등 자동 생성
- command+E : 최근에 봤던 목록
- - - -
## 스프링 빈과 의존관계
### 스프링 빈을 등록하고, 의존관계 설정하기
회원 컨트롤러가 회원서비스와 회우너 리포지토리를 사용할 수 있게 의존관계를 준비하자.
화면에 붙이려면 컨트롤러랑 뷰 템플릿이 필요함.
-> 그래서 컨트롤러부터 만들어야하는데, 컨트롤러가 이전에 만들었던 멤버 서비스를 통해서 회원가입, 데이터 조회 등의 기능을 이용할 수 있음 (이것을 **의존한다**고 한다.)

- Create Controller class `📁 main/java/controller`에 MemberController 생성
…

**정형화된 패턴**
- controller: 외부 요청 받기
- service: 비즈니스 로직 만들기
- repository: 데이터 저장하기

> 참고: helloController는 스프링이 제공하는 컨트롤러여서 스프링 빈이 자동 등록된다. `@Controller`가 있으면 자동 등록됨.  

**스프링 빈을 등록하는 2가지 방법**
- 컴포넌트 스캔과 자동 의존관게 설정
- 자바 코트로 직접 스프링 빈 등록하기


### 컴포넌트 스캔과 자동 의존관게 설정
- `@Component`애노테이션이 있으면 스프링 빈으로 자동 등록된다.
- `@Controller`컨트롤러가 스프링 빈으로 자동 등록된 이유도 컴포넌트 스캔 때문이다.

- `@Component`를 포함하는 다음 애노테이션도 스프링 빈으로 자동 등록된다.
	- `@Controller`
	- `@Service`
	- `@Repository`

> 참고: DI에는 필드 주입, setter 주입, 생성자 주입 이렇게 3가지 방법이 있다. 의존관계가 실행중에 동적으로 변하는 경우는 거의(아예) 없으므로 생서자 주입을 권한다. (값을 바꾸는 것은 안좋다~ 생성자로 첨에 지정만 하는게 좋다!)  

- - - -
##  회원 관리 예제 - 웹 MVC 개발
#### <학습 목표>
- 웹 기능 - 홈 화면 추가
- 웹 기능 - 등록
- 웹 기능 - 조회

먼저 링크 있는 사이트를 하나 만들어 봅시당.

`📁java/hello.hellospring/controller/HomeController`
```java
@Controller
public class HomeController {

    @GetMapping("/") //localhost:8080 들어오면 호출됨
    public String home() {
        return "home";
    }
}

```

`📁java/resources/templates/home.html`
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<body>

<div class="container">
    <div>
        <h1>Hello Spring</h1>
        <p>회원 기능</p>
        <p>
            <a href="/members/new">회원 가입</a>
            <a href="/members">회원 목</a>
        </p>
    </div>
</div>록
</body>
</html>
```

#### 근데, 어떻게 index가 안나오고 얘가 나오지…? 응…?
	-> 왜냐면 우선순위가 있거든!
		- 요청이 오면 내장 톰캣 서버에서 스프링 컨테이너에 접근해서 관련 컨트롤러가 있는지 검색한 후, 없으면 스태틱 홈페이지를 보여줌!! (정적 컨텐츠 쪽 다이어그램 참고)

- - - -
**My fault**
- templates>memberList.html
	가입한 녀석들을 보여줘야하는데, 자꾸 안떠 이놈들이 ㅠㅠ 조회가 안된대 그런 애가 없대
![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-03-12%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%202.02.53.png) -> 네모 친 애들은 이름이 같아야 한다. 
									(1시간 날림^^ㅋㅋㅋㅋㅋㅋ)



- - - -


# 스프링 DB 접근 기술
스프링 데이터 액세스
**<학습 목표>**
- H2 데이터베이스 설치
- 순수 JDBC
- 스프링 JdbcTemplate
- JPA
- 스프링 데이터 JPA
-> 다 적용해보면서 한 단계씩 바꿔볼 겁니다~


- - - -

## H2  데이터베이스 설치
개발이나 테스트 용도로 가볍고 편리한 DB.

![](Spring%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-03-12%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%202.44.00.png)
- `📁 h2>bin` 폴더에 가서 `./h2.sh` 로 실행
- 첨에 테스트로 한 번 연결한 후에는 `~`홈에 `test.mv.db`파일이 생김.
- 그 이후로는 소켓으로 연결하면 되는데,  JDBC URL 항목에 `jdbc:h2:tcp://localhost/~/test`라고 적기!
- 터미널 끄면 디비 꺼지니까 켜노셈~~~~~~~

> `@SpringBootTest` 애노테이션은 스프링 컨테이너와 테스트를 함께 실행한다.  
> -> 따로 객체를 생성할 필요가 없다~  

> `@Transactional` 애노테이션을 테스트 클래스 위에 달면, 먼저 실행하고, DB데이터를 인서트하고 테스트 끝나면 롤백함. (디비에 남지 않음!!!)  

- 단위 테스트 : 순수하게 연결 없이 단위로 쪼개서 스프링 컨테이너 없이 테스트 하는 것
- 통합 테스트 : 스프링 컨테이너랑 디비랑 다 연결한 것…
단위 테스트가 좋은 테스트일 확률이 높다. 
통합 테스트는 시간이 오래걸리고 효율이 낮기 때문에 단위가 중요~



- - - -


## 스프링  JdbcTemplate
- 스프링  JdbcTemplate과 MyBatis같은 라이브러리는 JDBC API에서 본 반복 코드를 대부분 제거해준다. 하지만 SQL은 직접 작성해야 함!
- 실무에서도 쓰는 방식

- - - -

## JPA























