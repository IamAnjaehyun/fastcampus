package org.example;

import org.example.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {

    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int operand1, String operator, int operand2, int result){
        int calculatorResult = Calculator.calculate(new PositiveNumber(operand1),operator,new PositiveNumber(operand2));
//        Assertions.assertEquals(result,3);
        assertThat(calculatorResult).isEqualTo(result);
    }
    private static Stream<Arguments> formulaAndResult(){
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2 ,2)
        );
    }
    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgumet 예외를 발생시킨다.")
    @Test
    //PositiveNumber 때문에 의미없는 코드가 됐음
    void calculateExceptionTest(){
        assertThatCode(()->Calculator.calculate(new PositiveNumber(10),"/", new PositiveNumber(0)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0또는 음수를 전달할 수 없습니다.");
    }
}
