# Codeforces Lyft Level 5 Challenge 2018

In this round, I answered 1 problem.

## Question #2 - Square Difference 

:black_large_square: https://codeforces.com/contest/1033/problem/B

I calculated the area of each square, subtracting the difference to find the area of the remaining cloth. I then used a for loop to check if the area of the remaining cloth was prime by using the modulus operator where I looped values from 2 to the "remaining cloth area" divided by 2. If any of the modulus operations returned a 0, I then knew that it was not a prime number and exited the loop. I passed the first 6 pretests, but exceeded the time limit on pretest 7. I went back after the contest ended to try and reduce the time. This time, I passed the first 7 pretests, but exceeded the time limit on test 8.
