package oop.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemItemTest {
    @DisplayName("요리를 생성한다.")
    @Test
    void createTest() {
        assertThatCode(()-> new MenuItem("만두",5000))
                .doesNotThrowAnyException();
    }
}
