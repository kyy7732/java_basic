# java_basic

#### **2023-08-22**

# **Basic**

## **begin**

- 주석 (CommentsExample)
- 자바 표준 형식 (PrintExample) (println,print,printf)

## **Operator**

- 대입 연산자 (AssignmentOperator) (+=, -=, \*=, /=, %=)
- 3항 연산자 (ConditionalOperator) ( ? : )
- 난수 생성 (conOperatorQuiz) (Math.random())
- 비교연산자,논리연산자 (LogicalOperatoer) (<, <=, >, >=, ==, !=), (&, &&, |, ||)
- 증감 연산자 (PlusMinusOperator) (++, --)

## **Datatype**

- 논리자료형 (BooleanExample) (Boolean)
- 숫자자료형 (FloatExample) (float,double)
- 정수형자료형 (IntegerExample) (byte,int,long,char)
- 참조자료형 (TextualExample) (String)

## **Casting**

- 자바 가상머신(JVM)의 이해1 (CastingExample1) ([크기가 작은 데이터 -> 큰 데이터]byte -> int, char -> int, int -> double)
- 자바 가상머신(JVM)의 이해2 (CastingExample2) ([크기가 큰 데이터 -> 작은 데이터]int -> byte, int -> char, double -> int)
- 자바 가상머신(JVM)의 이해3 (CastingExample3) [서로 다른 타입의 데이터는 타입이 큰 쪽으로 맞춰져서 자동 형 변환]
  - (int : char = int, int : double = double, byte : byte = int[데이터 손실의 방지])

#### **2023-08-23**

## **begin**(추가)

- Scanner (ScannerExample) (next, nextLine,nextInt...)

## **constate**

- If문 (IfExample1) (if)
- else if, else활용 (IfExample2) (else if, else)
- 다중 if문 (IfExample3)
- Switch문 (SwitchExample1) (Switch, default)
- Switch문 안에 If문 활용 (SwitchExample2) (Switch > If)

## **Loop**

- While 활용 (WhileExample1) (while)
- While안의 if문 활용 (WhileExample2) (4의 배수 && 8의배수가 아닌수, 개수세기, 약수개수세기)
- While을 이용하여 구구단 생성 (WhileQuiz01) (구구단 생성)
- While을 이용하여 소수값 판별 (WhileExample3) (while과 if문 활용)

#### **2023-08-24**

## **Loop**(추가)

- For문 활용 (ForExample)(6의 배수 && 12의 배수가 아닌 수, 개수세기, 팩토리얼! 값 구하기)
- For문을 이용하여 구구단 생성 (ForQuiz01) (구구단 생성)
- 중첩For문으로 구구단 로직 생성 (LoopNesting) (2~9단까지)
- For문과 If문으로 소수 로직 생성 (LoopNesting2) (소수 , 소수개수 출력)
- 반복문 Break선언 (BreakExample1) (Break, label선언)
- 반복문 무한루프 (BreakExample2) (While(true))
- 랜덤 함수를 활용하여 연산 (BreakQuiz01) (Meth.random()의 범위지정, 무작위 연산 등)
- 반복문 Continue선언 (ContinueExample) (Continue선언)

## **Array**

- Array배열의 활용 (ArrayBasic) (배열 선언,배열의 길이(크기), 배열의 반복문, 선언과 생성 동시에, 초기화)
- 향상된 For문(forEach) 활용 (EnhancedForLoop) (for(저장할 변수 : 반복문 돌릴 변수), 총점과 평균구하기)

#### **2023-08-25**

## **Array**(추가)

- 배열 활용 (Arrayinsert) (.equals()문자열 비교, 활용for문으로 배열 내용출력)
- 배열 응용 (ArrayModify) (배열 내용 수정, 배열의 인덱스 검색, 배열에 없는 내용찾기)
- 배열 땡기기 (ArrayDelete) (배열 삭제(배열은 삭제라는개념이없어서 땡겨야한다))
- 배열 값넣기 응용 (ArrayInsertQuiz) (배열 중복 입력 내용 제외(for문if문중첩)배열에 없는내용은 출력x(null))
- 배열 땡기기 응용 (ArrayDeleteQuiz) (입력 받은값 반복 삭제, 배열에 없는내용일때)
- 사원 관리프로그램 로그(과제) (EmployeeManger) (배열 등록, 배열 내용출력, 배열 내용 검색, 배열 정보 수정, 배열 정보 삭제)

#### **2023-08-28**

## **Array**(추가)

- 2차원 배열 사용법 (Array2D) ([][])
- 2차원 배열 활용 (Array2DQuiz) (학생, 과목, 반 평균 구하기)

## **Method**

- 메서드 사용법 (MethodExample1) (메서드 선언)
- 메서드 활용 (MethodExample2) (누적합계, 매개변수 필요없는경우, 받을 값이 많을때, 가변 인수(가변 파라미터))
- 메서드 return활용 (MethodExample3) (리턴값이 많을때, void(리턴이없을때), 메서드 강제 종료)

#### **2023-08-29**

## **Method**(추가)

- 메서드 활용 (MethodQuiz01) (메서드로 약수구하기)
- 메서드 응용 (MethodQuiz02) (배열 마지막줄 데이터 추가, 배열 내 데이터 찾기, 배열 포함 여부, 제거, 수정)

# **oop**

## **basic**

- 객체 설계용 클래스 (Pen) (Pen 객체 설계 클래스)
- 객체 호출 클래스 (PenMain) (Pen 객체 호출 클래스)
- 맴버 변수(필드) (MemberLocalVariable) (맴버 변수(필드), 지역 변수 설명)

## **String**

- User객체 생성 (User) (User객체 생성)
- User객체 활용 (CompareStr)(객체 선언)
- 다양한 메소드 (StringMethod) (문자열 추출 메소드, 단일 문자 반환, 범위 지정하여 추출, 총 길이 반환, 해당 만자가 있는 인덱스 반환, 문자 시작 인덱스, 일괄 대/ 소문자 변경, 문자열의 앞, 뒤 공백제거, 문자열 수정, 문자열을 구분자로 구분하여 분할, 문자열의 정수/실수 변환, 기본 타입을 문자열로 변경)
- 문자열 추출 메소드 문제(StringQuiz01) (id입력후 공백제거 등)
- 문자열 추출 메소드 문제(StringQuiz02) (주민등록번호로 남여판별)

## **Constructor**

- Phone생성자 사용법 (Phone) (Phone생성자 생성 , 생성자 오버로딩 (중복 선언))
- Phone생성자 호출 (PhoneMain) (Phone생성자 호출)
- Person생성자 생성 (Person) (Person생성자 생성)
- Person생성자 호출 (PersonMain) (Person생성자 입력받은 값 호출)
- import (MainClass) (다른 패키지에 있는 클래스 객체 생성)

#### **2023-08-30**

## **Inherit-good**

- 상속(extends)활용 (Player) (부모클래스 정의, 중복값 생성 메소드(부모))
- 상속(extends)호출 (MainClass) (상속자 호출)
- 자식클래스 활용 (Warrior) (자식클래스 정의, 오버라이딩 정의)

## **This_super**

- 상속 활용 (Player) (this(같은 클래스의 다른 생성자를 부르는 문법.))
- 상속 활용 (MainClass) (상속자 호출)
- 자식클래스 활용 (Warrior) (super 활용, 자바 기본생성자)

## **modi**

- public (어떤 클래스에서든 접근 가능, 다른 패키지도 가능 접근 제한 자체가 없는 경우)
- default (같은 패키지 내에서만 접근 가능, 접근자 안쓴 기본 상태)
- protected (모든 클래스 접근 가능, 다른 패키지에서는 상속받은 자식 클래스에서만 접근 가능, default와 접근 제한 범위가 비슷하지만, 상속여부에 따라 다름)
- private (같은 클래스 내에서만 접근 가능, getter, setter를 이용해야)

## **Encap-good**

- getter,setter 사용법 (MyBirth) (범위를 지정한 getter,setter사용법, getter에 입력값 설정, 정보 은닉,캡슐화 등)
- getter,setter 출력 (MainClass) (private된 값들을 getter, setter를 이용하여 출력)

#### **2023-08-31**

## **Overloading**

- 오버로딩 활용 (Calculator) (오버로딩 정의, 매개변수 중복 선언)

## **Obj_arr**

- getter,setter 단축키 (Person) (alt + shift + s -> generate getters and setters, alt + shift + s -> generater constructor using fields)
- 배열을 활용한 객체 생성, 출력 (MainClass) (Person클래스의 객체를 출력(객체안의 배열 활용)
- 배열 문제 (ArrayInsert) (배열 객체, 배열안에 입력한 내용넣기(for문 활용))

## **Poly**

- 다형성 정의 (basic) (상속 관계, object)
- 다형성 예시 (Car) (다형성 예시)
- 다형성 예제 (Player) (10~15의 난수를 발생시켜 타겟들에게 각각 적용(배열활용))

#### **2023-09-01**

## **Poly - Casting**

- 다형성 형 변환 (MainClass) ( 부모가 자식의 객체를 호출, 부모클래스를 자식으로 형 변환)

## **poly - car** (추가)

- instanceof (CarShop) ( c instanceof Sonata = c가 Sonata 타입을 가질수 있느냐??)

## **Static - field**

- static 사용법 (MainClass, Count) (static 정의, static은 클래스의 이름으로 접근)

## **Static\_ - Method**

- instanceof 사용법 (Count) (static 정의2, 인스턴스 메서드안에 정적(static)변수와 인스턴스 변수 모두 참조 가능)

## **Static\_ - Calc**

- static 활용 (Calculator) (static을 붙일지 말지 예시)

## **Static\_ - Init**

- static 응용 (DBManager) (정적 초기화자 정의, 정적 초기화자(static호출 메소드))

## **Static\_ - Singleton**

- singleton(싱글톤) (Singleton) (singleton 정의)

## **Final\_ - field**

- final 사용법 (Person) (필드변수final(초기화불가(수정 불가)

## **Final\_ - Method**

- final 사용법 (Parent) (초기화 불가, 오버라이딩 불가, final 클래스는 상속 불가)

## **Final\_ - Constant**

- 상수(Constant) (Earth) (고정된 불변의값, static final사용)

## **abs - good**

- 추상메서드(abstract) (HeadStore) (추상메서드 정의, 추상메서드 사용법)

#### **2023-09-04**

## **Inter - basic**

- 인터페이스 사용법 (...) (인터페이스 정의)

## **Good**

- 인터페이스 활용 (MainClass) (인터페이스 활용)

# **etc.exception**

## **basic**

- 예외처리 사용법 (TryCatchExample) (try-catch, 예외 처리 정의)
- 다중 예외처리 방법 (MultiCatchExample) (다중 catch문, 다중 catch문 정의, e.getMessage(): 예외처리 내용확인)
- 반복문(while(true))에 입력값 받는 예외처리 (MainClass) (정수만 입력하는 반복문에sc.nextLine()을 입력해서 입력을 다시 받을수 있다.)
- Finally 사용법 (FinallyExample) (finally: 예외 발생 여부와 상관 없이 항상 실행하고 싶은 문장을 작성)

## **Throws\_**

- throws 사용법 (ThrowsExample) (throws 정의)

#### **2023-09-05**

## **Throw\_**

- throw 사용법 (ThrowExample) (throw : 강제로 예외를 발생시킴, throw 정의)

## **Custom**

- throw 활용 (LoginValidateException) (직접 에러 메세지를 만드는 법)

# **etc.api.lang**

## **obj**

- object에서 제공하는 메서드 (Person) (toString, clone, hashCode, equals, finalize)

## **Stringbuilder**

- StringBuilder, StringBuffer 사용법 (StrBuilderExample) (정의, StringBuilder append(문자열 맨 끝에 추가),
  insert(특정 인덱스에 삽입), replace((특정 인덱스 범위 문자열 교체), delete(특정 단어 삭제))

## \*끝

# 인텔리제이 설정

1. 한글버전 설치

- shift 두번 연타 후 plugin 검색

2. 테마, 아이콘 테마 설치

- plugin에서 material검색
- Atom material icon, Material Theme UI
  - 테마 적용하기
  - 파일 -> 설정 -> 테마 검색 후 -> 모양 탭에서 테마 선택

3. 기본 폰트사이즈, 폰트사이즈 조절 설정

- 파일 -> 설정 -> 글꼴 검색 후 사이즈 조정
- 파일 -> 설정 -> 마우스 검색 후 -> 일반 탭에서 -> 마우스 휠로 크기조절 + 모든에디터 적용 체크

4. 깃허브 연동

- 파일 -> 설정 -> 버전관리 -> github 계정 등록
- 하단부 터미널 열고 $ git rm -r --cached 입력

## 자바 8 람다 문법

- 여러가지 람다 표현식

1. `(String s) -> s.length()` : String형식의 파라미터 하나를 가지며 int를 반환한다. 람다표현식에는 return이 함축되어 있다.
2. (Apple a) -> a.getWeight() > 150` : Apple형식의 파라미터 하나를 가지며 boolean을 반환한다.
3. int형식의 2개의 파라미터를 가지며 리턴값이 없다.
  (int x, int y) -> {
  System.out.println("Result:");
  System.out.println(x + y);
  }

4. () -> 42` : 파라미터가 없으며 42를 반환한다.

- 제공되는 함수형 인터페이스
  함수형 인터페이스 | 함수 디스크립터 |
  ---|---|
  Predicate<T> | T -> boolean
  Consumer<T> | T -> void
  Function<T, R> | T -> R
  Supplier<T> | () -> T
  UnaryOperator<T> | T -> T
  BinaryOperator<T> | (T, T) -> T
  BiPredicate<L, R> | (T, U) -> boolean
  BiConsumer<T, U> | (T, U) -> void
  BiFunction<T, U, R> | (T, U) -> R
- 메서드 참조
  - `(args) -> ClassName.staticMethod(args)` => `ClassName::staticMethod`
    - `() -> Math.random()` => `Math::random`
    - `message -> System.out.println(message)` => `System.out::println`
  - `(args0, rest) -> args0.instanceMethod(rest)` => `ClassName::instanceMethod`
    - `(str, i) -> str.substring(i)` => `String::substring`
    - `(apple) -> apple.getWeight()` => `Apple::getWeight`
  - `(args) -> expr.instanceMethod(args)` => `expr::instanceMethod`
    - `(s) -> this.isValidName(s)` => `this::isValidName`
- 생성자 참조
  - `() -> new Constructor()` => `ClassName::new`
    - `() -> new Apple()` => `Apple::new`
  - `(args) -> new Constructor(args)` => `ClassName::new`
    - `(weight) -> new Apple(weight)` => `Apple::new`
