package org.example;

public class SquareRoot {
        public static double findSquareRoot(double num, double precision) {
            if (num < 0) {
                throw new IllegalArgumentException("Cannot compute square root of a negative number.");
            }
            if (num == 0 || num == 1) {
                return num;
            }

            double start = 0;
            double end = num;
            double mid = 0;

            while ((end - start) > precision) {

                mid = start + (end - start) / 2;


                if (mid * mid == num) {
                    return mid;
                }
                else if (mid * mid< num) {
                    start= mid;
                }
                else {
                    end = mid;
                }
            }


            return start + (end - start) / 2;
        }

        public static void main(String[] args) {
            double number = 5;
            double precision = 0.00001;
            double result = findSquareRoot(number, precision);
            System.out.println(result);
        }
    }

