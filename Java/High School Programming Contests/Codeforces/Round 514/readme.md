# Codeforces Round #514

In this round, I answered 1 question.

## Question #1 - Cashier

:credit_card: https://codeforces.com/contest/1059/problem/A

I used a boolean array and passed the first 5 pretests, but exceeded the memory limit on pretest 6. To fix this, I took out the arrays.fill(time, true) and switched values to = true instead. This reduced the time, but the memory was still exceeded.


