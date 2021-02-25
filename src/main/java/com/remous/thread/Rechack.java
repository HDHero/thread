package com.remous.thread;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Remous
 * @Date: 2021/1/7 16:32
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 判断算式是否合法，
 * 1.首先判断输入的字符是否合法
 * 2.然后判断运算是否合法
 */
public class Rechack {

    public static void main(String[] args) {

        //正确
        // String expression = " 1 | 3";

        //正确
        //String expression = " 1 & 3";

        //正确
        //String expression = " ((12) +34)/4.0";

        //正确的
        //String expression = " 5 | (31 & (6+20))";

        //或匹配有问题呢
        //String expression = "| (31 & (6+20))";

        //左括号匹配有问题呢
        //String expression = "1 | 31 & (6+20))";

        //数字+有括号匹配有问题
        //String expression = "1 | 31 (6+20))";

        //数字匹配有问题呢
        //String expression = "1 | 31 (6+20)";

        //数字匹配有问题你
        //String expression = "1 | 31 (6+20) &52";

        //括号顺序匹配有问题
        //String expression = "1 | 31 )6+20( &52";

        //String expression = "1 | 31 (6+20) &52";

        //+-*/问题
        //String expression = "5 /";

        //String expresion = "5 /(3 *2)";

        //+-*/问题
        //String expression = "5 //(2)";

        String expression = "5 (/+)2";

        boolean isNumber = checkIllegel(expression);
        //boolean isNumber = isNumber(expression);
        System.out.println("算式 为" + expression + "," + isNumber + "表达式");

    }


    private static final char PLUS_OPERATION = '+';

    private static final char REDUCE_OPERATION = '-';

    private static final char MUTIPLY_OPERATION = '*';

    private static final char DIVIDE_OPERATION = '/';

    private static final char LEFT_BRACKET_OPERATION = '(';

    private static final char RIGHT_BRACKET_OPERATION = ')';

    private static final char DECIMAL_OPERATION = '.';

    private static final char AND_OPERATION = '|';

    private static final char OR_OPERATION = '&';

    private static final char EQUALS_OPERATION = '=';


    private static Set<Character> operationSets = new HashSet<>();

    static {
        operationSets.add(PLUS_OPERATION);
        operationSets.add(REDUCE_OPERATION);
        operationSets.add(MUTIPLY_OPERATION);
        operationSets.add(DIVIDE_OPERATION);
        operationSets.add(LEFT_BRACKET_OPERATION);
        operationSets.add(RIGHT_BRACKET_OPERATION);
        operationSets.add(DECIMAL_OPERATION);
        operationSets.add(AND_OPERATION);
        operationSets.add(OR_OPERATION);

    }

    /**
     * 判断字符串是否为整数，浮点数类型，是返回true
     *
     * @param expression
     * @return
     */
    private static boolean checkIllegel(String expression) {

        //去空格
        expression = expression.replaceAll(" ", "");

        Stack<Character>  bracketStack= new Stack<>();


        char[] charArray = expression.toCharArray();


        //括号匹配
        for (char temp : charArray) {
            if (operationSets.contains(temp)) {
                //如果是左括号入栈
                switch (temp) {
                    case LEFT_BRACKET_OPERATION:
                        bracketStack.push(temp);
                        break;
                    case RIGHT_BRACKET_OPERATION:
                        if (bracketStack.isEmpty()) {
                            return false;
                        }
                        bracketStack.pop();

                }
                continue;
            }
            if (('0' <= temp && temp <= '9')) {
                continue;
            }
            //含有非法字符
            return false;
        }

        if (bracketStack.isEmpty()) {
            return true;
        }

        /** 规则
         *  1.左括号和右扩或匹配。
         *  2.能和数字进行匹配
         *  3.数字可以连一起，因为是char
         *  4.且和或(&和|)，满足左右两边必须是数字，或者是左边是)、右边是(。
         **/
//        while (!result.isEmpty()) {
//
//            Character pop = result.pop();
//            System.out.println(pop);
//        }

        return false;

    }

}
