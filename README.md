# java_basic
#### **2023-08-22**
## **begin**
 * 주석 (CommentsExample)
 * 자바 표준 형식 (PrintExample) (println,print,printf)
   
## **Operator**
 * 대입 연산자 (AssignmentOperator) (+=, -=, *=, /=, %=)
 * 3항 연산자 (ConditionalOperator) (  ? : )
 * 난수 생성 (conOperatorQuiz) (Math.random())
 * 비교연산자,논리연산자 (LogicalOperatoer) (<, <=, >, >=, ==, !=), (&, &&, |, ||)
 * 증감 연산자 (PlusMinusOperator) (++, --)

## **Datatype**
 * 논리자료형 (BooleanExample) (Boolean)
 * 숫자자료형 (FloatExample) (float,double)
 * 정수형자료형 (IntegerExample) (byte,int,long,char)
 * 참조자료형 (TextualExample) (String)

## **Casting**
* 자바 가상머신(JVM)의 이해1 (CastingExample1) ([크기가 작은 데이터 -> 큰 데이터]byte -> int, char -> int, int -> double)
* 자바 가상머신(JVM)의 이해2 (CastingExample2) ([크기가 큰 데이터 -> 작은 데이터]int -> byte, int -> char, double -> int)
* 자바 가상머신(JVM)의 이해3 (CastingExample3) [서로 다른 타입의 데이터는 타입이 큰 쪽으로 맞춰져서 자동 형 변환]
  * (int : char = int, int : double = double, byte : byte = int[데이터 손실의 방지])

#### **2023-08-23**
## **begin**(추가)
* Scanner (ScannerExample) (next, nextLine,nextInt...)

## **constate**
* If문 (IfExample1) (if)
* else if, else활용 (IfExample2) (else if, else)
* 다중 if문 (IfExample3)
* Switch문 (SwitchExample1) (Switch, default)
* Switch문 안에 If문 활용 (SwitchExample2) (Switch > If)

## **Loop**
* While 활용 (WhileExample1) (while)
* While안의 if문 활용 (WhileExample2) (4의 배수 &&  8의배수가 아닌수, 개수세기, 약수개수세기)
* While을 이용하여 구구단 생성 (WhileQuiz01) (구구단 생성)
* While을 이용하여 소수값 판별 (WhileExample3) (while과 if문 활용)

#### **2023-08-24**
## **Loop**(추가)
* For문 활용 (ForExample)(6의 배수 && 12의 배수가 아닌 수, 개수세기, 팩토리얼! 값 구하기)
* For문을 이용하여 구구단 생성 (ForQuiz01) (구구단 생성)
* 중첩For문으로 구구단 로직 생성 (LoopNesting) (2~9단까지)
* For문과 If문으로 소수 로직 생성 (LoopNesting2) (소수 , 소수개수 출력)
* 반복문 Break선언 (BreakExample1) (Break, label선언)
* 반복문 무한루프 (BreakExample2) (While(true))
* 랜덤 함수를 활용하여 연산 (BreakQuiz01) (Meth.random()의 범위지정, 무작위 연산 등)
* 반복문 Continue선언 (ContinueExample) (Continue선언)

## **Array**
* Array배열의 활용 (ArrayBasic) (배열 선언,배열의 길이(크기), 배열의 반복문, 선언과 생성 동시에, 초기화)
* 향상된 For문(forEach) 활용 (EnhancedForLoop) (for(저장할 변수 : 반복문 돌릴 변수), 총점과 평균구하기)

#### **2023-08-25**
## **Array**(추가)
* 배열 활용 (Arrayinsert) (.equals()문자열 비교, 활용for문으로 배열 내용출력)
* 배열 응용 (ArrayModify) (배열 내용 수정, 배열의 인덱스 검색, 배열에 없는 내용찾기)
* 배열 땡기기 (ArrayDelete) (배열 삭제(배열은 삭제라는개념이없어서 땡겨야한다))
* 배열 값넣기 응용 (ArrayInsertQuiz) (배열 중복 입력 내용 제외(for문if문중첩)배열에 없는내용은 출력x(null))
* 배열 땡기기 응용 (ArrayDeleteQuiz) (입력 받은값 반복 삭제, 배열에 없는내용일때)
* 사원 관리프로그램 로그(과제) (EmployeeManger) (배열 등록, 배열 내용출력, 배열 내용 검색, 배열 정보 수정, 배열 정보 삭제)

#### **2023-08-28**
## **Array**(추가)
* 2차원 배열 사용법 (Array2D) ([][])
* 2차원 배열 활용 (Array2DQuiz) (학생, 과목, 반 평균 구하기)

## **Method**
* 메서드 사용법 (MethodExample1) (메서드 선언)
* 메서드 활용 (MethodExample2) (누적합계, 매개변수 필요없는경우, 받을 값이 많을때, 가변 인수(가변 파라미터))
* 메서드 return활용 (MethodExample3) (리턴값이 많을때, void(리턴이없을때), 메서드 강제 종료)
