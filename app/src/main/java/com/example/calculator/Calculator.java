package com.example.calculator;

public class Calculator {
    private double operandOne, operandTwo,result;
    private char operation;


    public Calculator(double operandOne, double operandTwo, char operation) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operation = operation;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void performOperation() {
        switch (operation) {
            case '+':
                result = getOperandOne() + getOperandTwo();
                break;
            case '-':
                result = getOperandOne() - getOperandTwo();
                break;
        }
    }

    public Double getResult(){
            performOperation();
            return result;
    }
}
