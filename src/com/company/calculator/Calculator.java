package com.company.calculator;

/**
 * Created by M on 19-02-2017.
 */
public class Calculator {
    Number result;
    Number firstValue;
    String operator;

    public Calculator() {
        this.result = 0;
    }

    public void operate (String operator, Number num1) {
        //Make it better! Give a better solution for operate(String, Number)
        Number result = 0;
        switch (operator) {
            case "+": {
                result = this.result.doubleValue() + num1.doubleValue();
                break;
            }
            case "-": {
                result = this.result.doubleValue() - num1.doubleValue();
                break;
            }
            case "/": {
                result = this.result.doubleValue() / num1.doubleValue();
                break;
            }
            case "*": {
                result = this.result.doubleValue() * num1.doubleValue();
                break;
            }
            case "cos": {
                result = Math.cos(num1.doubleValue());
                break;
            }
            case "sin": {
                result = Math.sin(num1.doubleValue());
                break;
            }
            case "tan": {
                result = Math.tan(num1.doubleValue());
                break;
            }
            case "!": {
                result = factorial((int)num1);
                break;
            }
            default: {
                result = num1;
            }
        }
        System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
        this.result = result;
    }

    public void operate (String operator, String num1) {
        //Make it better! Give a better solution for operate(String, Number)
        Number result = 0;
        double number = 0;
        if((operator=="+")&(num1=="pi")){
            number = Math.PI;
            result = this.result.doubleValue() + number;
        }
        System.out.println(this.result.doubleValue() + " " + operator + " " + number + " = " + result.doubleValue());
        this.result = result;
    }

    public void operate (String operator) {
        //Complete the missing implementation
        this.operator = operator;

        switch (operator) {
            case "C": {
                this.result = 0;
                System.out.println( operator + " = " + result.doubleValue());
                break;
            }
            case "e": {
                this.result = Math.E;
                System.out.println( operator + " = " + result.doubleValue());
                break;
            }
            default: {
                result = 0;
            }
        }
        this.result = result;



        //this.result = newValue
    }

    public void firstValue(Number num1) {
        this.firstValue = num1;
    }

    public int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
