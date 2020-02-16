# k-combination
Recursion Code Challenge — Write a program
Let's introduce the term k-combination. It is a subset of k distinct elements of this set.

Two combinations are called different if one of the combinations contains an element, which is not present in the other combination.

The number of k-combinations of a set of n elements is the number of different such combinations. Let’s write this number as C(n, k).

It is easy to understand that C(n, 0) = 1, as you can select 0 elements from the set of n elements by the only way: namely, by not choosing anything.
Also, it is easy to understand that if k > n, then C(n, k) = 0, as it is impossible, for example, to choose five elements from the three given ones.
The following recurrent formula is used to calculate C(n, k) in the other cases: C(n, k) = C(n - 1, k) + C(n - 1, k - 1).
 



 

Implement a method, which calculates C(n, k) for the specified n and k.

It should use the recurrent formula to calculate C(n, k).

 

Example:

Let n = 3, i.e. there are three elements (1, 2, 3). Let k = 2.
All the different 2-combination of 3 elements: (1, 2), (1, 3), (2, 3).
There are three different combinations, thus C(3, 2) = 3.

Sample Input 1:

3 2
Sample Output 1:

3
