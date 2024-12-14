package org.example;

public class SquareRoot {
        public static double findSquareRoot(int num, int p) {

                    int left = 0;
                    int right = num;
                    int mid;
                    double res = 0.0;

                    // Step 1: Binary search to find the integer part
                    while (left <= right) {
                        mid = (left + right) / 2;
                        if (mid * mid == num) {
                            res = mid;
                            break;
                        }
                        if (mid * mid < num) {
                            left = mid + 1;
                            res = mid;
                        } else {
                            right = mid - 1;
                        }
                    }

                    // Step 2: Incrementally find decimal places to the desired precision
                    double increment = 0.1;
                    for (int i = 0; i < p; i++) {
                        // Add increments until the square exceeds the target
                        while (res * res <= num) {
                            res += increment;
                        }
                        // Step back once it exceeds the target
                        res -= increment;
                        // Decrease increment for the next decimal place
                        increment /= 10;
                    }

                    return res;
                }


            public static void main(String[] args) {
            int number = 27;
            int precision = 3;
            double result = findSquareRoot(number, precision);
            System.out.println(result);
        }
    }

