package etc.stream;

import java.util.Comparator;
import java.util.Optional;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;

public class Finding {

    public static void main(String[] args) {

        // 음식 메뉴 중에 채식주의자가 먹을 수 있는 요리가 있는가?
        boolean flag1 = menuList.stream()
                .anyMatch(dish -> dish.isVegetarian());// anyMatch: dish에 true가 하나라도 있다면 true를 리턴

        System.out.println("flag1 = " + flag1);

        // 음식 메뉴 중에 칼로리가 50 미만읜 음식이 있는가?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);

        System.out.println("flag2 = " + flag2);

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만입니까?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000); // allMatch: dish에 하나라도 1000이 넘으면 false

        System.out.println("flag3 = " + flag3);

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만이 이닙니까?
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() < 1000); // noneMatch: dish에 하나라도 1000이 아니면 false

        System.out.println("flag4 = " + flag4);

        // 음식 중에 칼로리가 가장 낮은 음식을 조회해 주세요.
//        Dish dish = menuList.stream()
// 순서대로 0번 1번이와서 둘을 빼서 양수가 나오면 0번이 리턴 menuList에 있는 메뉴 다 돌아서 값 찾음
//                .min(((o1, o2) -> o1.getCalories() - o2.getCalories())).get();
// 위에랑 같은 뜻
        Dish dish = menuList.stream()
                .min(comparing(Dish::getCalories))
                .get();

        System.out.println("dish = " + dish);
        // 위에랑 같은 뜻
//        Optional<Dish> min = menuList.stream()
//                .min(comparing(Dish::getCalories));
//
//        min.ifPresent(dish -> System.out.println(dish)); // 존재가 한다면 출력을 해라 , null이 오면 실행이 안됨


    }
}
