package com.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlignNegativeOneSideOfArrayTest {

    @Test
    public void check() {
        int[] sample = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int abc[] = new AlignNegativeOneSideOfArray().alignNegative(sample);
        System.out.println(Arrays.toString(abc));
    }

    public static void main(String[] args) {
        int[] sample = {0,0,0,0,-1, 2, -3, 4, 5, 6,0,0,0,0, -7, 8, 9,0,0,0,0};
        int abc[] = new AlignNegativeOneSideOfArray().alignNegative(sample);
        System.out.println(Arrays.toString(abc));
    }


}