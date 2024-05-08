package org.duna.jep338;

import jdk.incubator.vector.IntVector;

import java.util.Arrays;

public class NewVectorFeaturesDemo01 {
    public static void main(String[] args){
        int[] vector1 = {1, 2, 3, 4};
        int[] vector2 = {5, 6, 7, 8};
        var vector3 = new int[vector1.length];

        System.out.println("multiply 2 matrices");
        for (int i = 0; i < vector1.length; i++) {
            vector3[i] = vector1[i] * vector2[i];
        }
        System.out.println("result : "+ Arrays.toString(vector3));

        System.out.println("multiply 2 matrices with vectors");
        int[] vectorA = {1, 2, 3, 4};
        int[] vectorB = {5, 6, 7, 8};
        var vectorC = new int[vectorA.length];
        IntVector intVectorA = IntVector.fromArray(IntVector.SPECIES_128, vectorA, 0);
        IntVector intVectorB = IntVector.fromArray(IntVector.SPECIES_128, vectorB, 0);
        IntVector intVectorC = intVectorA.mul(intVectorB);
        intVectorC.intoArray(vectorC, 0);
        System.out.println("result : "+ Arrays.toString(vectorC));

    }
}
