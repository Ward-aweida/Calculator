package com.example.calculator;

import java.util.ArrayList;

public class Calculator2 {
    private ArrayList<Double> numberOfArray = new ArrayList<>();
    private ArrayList<String> operationsArray = new ArrayList<>();
    private double result = 0;

    public Calculator2() {
        this.numberOfArray = numberOfArray;
        this.operationsArray = operationsArray;
        this.result = result;
    }

    public void performOperation(double number) {
        numberOfArray.add(number);
    }

    public void performOperation(String operation) {
        double result = 0;
        if (!operation.equals("=")) {
            this.operationsArray.add(operation);
        } else {
            int i = 0;
            while (this.operationsArray.contains("*") || this.operationsArray.contains("/")) {
                if (this.operationsArray.get(i).equals("*")) {
                    result = this.numberOfArray.get(i) * this.numberOfArray.get(i + 1);
                    this.numberOfArray.set(i, result);
                    this.numberOfArray.remove(i + 1);
                    this.operationsArray.remove(i);
                    i--;
                } else if (this.operationsArray.get(i).equals("/")) {
                    result = this.numberOfArray.get(i) / this.numberOfArray.get(i + 1);
                    this.numberOfArray.set(i, result);
                    this.numberOfArray.remove(i + 1);
                    this.operationsArray.remove(i);
                    i--;
                }
                i++;
            }
            this.result = this.numberOfArray.get(0);
            for (i = 0; i < this.operationsArray.size(); i++) {
                if (this.operationsArray.get(i).equals("+")) {
                    this.result += this.numberOfArray.get(i + 1);
                } else if (this.operationsArray.get(i).equals("-")) {
                    result -= this.numberOfArray.get(i + 1);
                }
            }

        }
    }

    public ArrayList<Double> getNumberOfArray() {
        return numberOfArray;
    }

    public void setNumberOfArray(ArrayList<Double> numberOfArray) {
        this.numberOfArray = numberOfArray;
    }

    public ArrayList<String> getOperationsArray() {
        return operationsArray;
    }

    public void setOperationsArray(ArrayList<String> operationsArray) {
        this.operationsArray = operationsArray;
    }

    public double getResult() {
        return result;
    }


}
