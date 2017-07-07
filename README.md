# FactorialCalc

For the first part of the task (1.) I have used the conventional method to calculate
factorial using a loop from one to N (the number whose factorial I want to calculate). 
The method in the source code is called "factorial(int n)"

For the second part I have used a better algorithm to calculate factorial. It is implemented in the method called
"smartFactorial(int n)". The loop in this algorithm is half the size of the conventional one.
Here is how it works:
The first factor will be the number you are taking the factorial of, then the next will be that number plus that number minus two.
The next number will be the previous number plus the lasted added number minus two.
You are done when the last number you added was two.

Here is an example:

8! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8
8! = (1 * 8) * (2 * 7) * (3 * 6) * (4 * 5)
8! = 8 * 14 * 18 * 20
8! = 8 * (8 + 6 = 14) * (14 + 4 = 18) * (18 + 2 = 20)

If the number N happens to be odd I just calculate the factorial of N-1 and than multiply it by N.

The execution time using the first method is shown after "1. Execution time:".
The execution time using the second method is shown after "2. Execution time:"
