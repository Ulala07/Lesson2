package javaSimple;

import java.awt.*;
import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 3;
        try {
            nums[1] = 1;
        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }finally {
            System.out.println("UUPS");
        }

        System.out.println(nums[1]);

        String[] str = {"2", "4", "8"};
        System.out.println(str[1]);


        ArrayList<String> list = new ArrayList<>();
        list.add("SAgsdg");
        list.add("frvf");
        list.add("12354");

        }
    }

