// Recursive Implemtations
// Practice for Foundation Exam

#include <stdio.h>
#include <stdlib.h>

// Sums values from 0 - n, n is non-negative
unsigned int sum(unsigned int n)
{
    if (n == 0)
        return 0;

    if (n == 1)
        return 1;
        
    return n + sum(n - 1);
}

// Finds the max value in an array, where n is the length of the array.
int findMax(int *array, int n)
{
    int max;

    if (n == 1)
        return array[0];

    max = findMax(array, n - 1);

    return max > array[n - 1] ? max : array[n - 1];
}

// Finds the min value in an array.
int findMin(int *array, int n)
{
    int min; 

    if (n == 1)
        return array[0];

    min = findMin(array, n - 1);

    return min < array[n - 1] ? min : array[n - 1];
}

// Calculates n!
unsigned int factorial(unsigned int n)
{
    if (n == 0)
        return 1;

    return n * factorial(n - 1);
}

// Prints a string, assumes n >= 1
void print_string(char *str, int n)
{
    if (n == 1)
    {
        printf("%c", str[0]);
        return;
    }

    print_string(n - 1);
    printf("%c", str[n - 1]);
}

// Returns a^n
unsigned int power(unsigned int a, unsigned int n)
{
    if (n == 0)
        return 1;

    if (a == 0)
        return 0;

    return a * power(a, n - 1);   
}

// Returns a * n
int mult(unsigned int a, unsigned int b)
{
    // 5 * 2
    if (b == 0)
        return 0;

    return a + mult(a, b - 1);
}

// Fibonacci Sequence where nth element = (n - 1) + (n - 2)
int fibonacci(int n)
{
    if (n == 0)
        return 0;
    
    if (n == 1)
        return 1;
    
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// Returns 1 if the string is a palindrome.
int isPalindrome(char *str, int n)
{
    if (n == 1)
        return 1;

    if (n == 0)
        return 1;

    if (str[0] != str[n - 1])
        return 0;
    
    return isPalindrome(str + 1, n - 2);
}
