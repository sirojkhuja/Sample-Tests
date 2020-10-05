# This Repo was created to solve sample entry exam problems
To test this codes you need to have `Java 8` JRE or JDK

1. First Task:
	- An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.

2. Second Task:
	- Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. The function should return X – Y The signature of the function is:
int f(int[ ] a)

3. Third Task:
	- Write a function that accepts a character array, a zero-based start position and a length. It should return a character array containing containing lengthcharacters starting with the startcharacter of the input array. The function should do error checking on the start position and the length and return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)

4. Fourth Task:
	- Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
The signature of the function is:
int f(int n)

5. Fifth Task:
	- Write a function to return an array containing all elements common to two given arrays containing distinct positive integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
The signature of the function is:
int[] f(int[] first, int[] second)

6. Sixth Task:
	- Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1]. Write a function to return POE of an array, if it exists and -1 otherwise. 
The signature of the function is:
int f(int[] a)
