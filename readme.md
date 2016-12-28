# Codewars Katas
<p align="left">
	<a target="_blank" href="https://travis-ci.org/jcaromiq/codewars-Katas"><img src="https://travis-ci.org/jcaromiq/codewars-Katas.svg?branch=master"></a>
</p>
## Money, Money, Money
### Description:
Mr. Scrooge has a sum of money 'P' that wants to invest, and he wants to know how many years 'Y' this sum has to be kept in the bank in order for this sum of money to amount to 'D'.

The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly, and the new sum is re-invested yearly after paying tax 'T'

Note that the principal is not taxed but only the year's accrued interest

### Example:
```
Let P be the Principal = 1000.00
Let I be the Interest Rate = 0.05
Let T be the Tax Rate = 0.18      
Let D be the Desired Sum = 1100.00

After 1st Year --> P = 1041.00
After 2nd Year --> P = 1083.86
After 3rd Year --> P = 1128.30

```

Thus Mr. Scrooge has to wait for 3 years for the initial pricipal to ammount to the desired sum.

Your task is to complete the method provided and return the number of years 'Y' as a whole in order for Mr. Scrooge to get the desired sum.

Assumptions : Assume that Desired Principal 'D' is always greater than the initial principal, however it is best to take into consideration that if the Desired Principal 'D' is equal to Principal 'P' this should return 0 Years.

## Give me a Diamond
### Description:
This kata is to practice simple string output. Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.

### Task:

You need to return a string that displays a diamond shape on the screen using asterisk ("*") characters. Please see provided test cases for exact output format.

The shape that will be returned from print method resembles a diamond, where the number provided as input represents the number of *’s printed on the middle line. The line above and below will be centered and will have 2 less *’s than the middle line. This reduction by 2 *’s for each line continues until a line with a single * is printed at the top and bottom of the figure.

Return null if input is even number or negative (as it is not possible to print diamond with even number or negative number).

Please see provided test case(s) for examples.

## Find The Parity Outlier
### Description:
You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns N.

For example:

[2, 4, 0, 100, 4, 11, 2602, 36]

Should return: 11

[160, 3, 1719, 19, 11, 13, -21]

Should return: 160