# FP, OOP 연습

## STEP2 사다리타기(생성)
### 요구사항
- 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
- |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

### 기능목록
- [x] 게임 참여자 이름 입력받고 입력값은 ','로 구분된다.
- [x] 참여자명은 최대 5글자까지 입력가능하다.
- [x] 사다리 높이를 입력받아 세팅한다.
- [x] 사다리의 폭은 게임참여자의 숫자이다.
- [x] 사다리 가로 라인을 랜덤으로 세팅한다.
- [x] 각 사다리의 라인은 가로로 연속으로 세팅될 수 없다.
- [x] 사다리 생성 결과를 출력한다.
- [x] 결과출력는 참가자명 최대 입력 글자수를 고려한다.

## STEP2 사다리타기(생성)
### 요구사항
- 자바 8의 스트림과 람다를 적용해 프로그래밍한다.
- 규칙 6: 모든 엔티티를 작게 유지한다.
- 규칙 7: 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.

### 기능목록
- [x] 실행 결과를 입력받고 입력값은 ','로 구분된다.
- [x] 실행 결과는 참가자 수만큼만 입력받는다.
- [x] 사다리 타기를 진행한다.
- [x] 각 참가자의 결과를 저장한다.
- [x] 결과를 보고 싶은 사람이름을 입력받는다
- [x] all을 입력받는 경우 전체를 출력한다.
- [x] 결과를 출력한다.