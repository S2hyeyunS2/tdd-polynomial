package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("3+5=8")
    public void t1(){
        int rs= com.ll.Calc.run("3+5");
        assertThat(rs).isEqualTo(8);

    }

    @Test
    @DisplayName("10+5=15")
    public void t2(){
        int rs= com.ll.Calc.run("10+5");
        assertThat(rs).isEqualTo(15);

    }

    @Test
    @DisplayName("20+5=25")
    public void t3(){
        int rs= com.ll.Calc.run("20+5");
        assertThat(rs).isEqualTo(25);

    }
}
