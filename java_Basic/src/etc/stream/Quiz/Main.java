package etc.stream.Quiz;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );
        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
            transactions.stream()
                    .filter(year -> year.getYear() == 2021)
                    .sorted(Comparator.comparing(Transaction::getValue))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        System.out.println("============================================");
        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        transactions.stream()
                .filter(ci -> ci.getTrader().getCity() != "")
                .map(Transaction::getTrader)
                .map(trs -> trs.getCity())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("============================================");


        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        transactions.stream()
                .filter(c -> c.getTrader().getCity() == "Cambridge")
                .map(Transaction::getTrader)
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("============================================");


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
        List<String> list = transactions.stream()
//                .map(Transaction::getTrader)
                .map(trs -> trs.getTrader().getName())
                .sorted() // 문자나 숫자는 Comparator를 사용하지 않아도 됩니다.
                .distinct()
//                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("list = " + list);
        System.out.println("============================================");

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag = transactions.stream()
                .anyMatch(c -> c.getTrader().getCity() == "Milan");

        System.out.println("flag = " + flag);
        System.out.println("============================================");


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.

        int sum = transactions.stream()
                .filter(c -> c.getTrader().getCity() == "Cambridge") // .equalsIgnoreCase("cambridge") 하면 따로 대소문자를 비교안해도됨
                .mapToInt(Transaction::getValue) // mapToInt: 새롭게 값에서 추출되는값이 int로 된다
                .sum();// intStream만 sum()함수 사용가능
        System.out.println("sum = " + sum);
//        System.out.println("values = " + values);
        System.out.println("==================S==========================");

        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
        Optional<Integer> i = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
        System.out.println("i = " + i);

        System.out.println("============================================");
        // 다른 방법
        int maxValue = transactions.stream()
                                .mapToInt(trs -> trs.getValue())
                                .max()
                                .getAsInt();
        System.out.println("maxValue = " + maxValue);
                
        
        System.out.println("============================================");
        // 다른 방법
        transactions.stream()
                .min(comparing(Transaction::getValue))
                .ifPresent(System.out::println); // 만약 널이 아니라면 출력
        System.out.println("============================================");

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        Transaction transaction = transactions.stream()
                .min(comparing(Transaction::getValue))
                .get();
        System.out.println("transaction = " + transaction);


    }
}
