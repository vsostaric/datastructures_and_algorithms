Neet code solutions in Java

# Working

## Arrays

* ContainsDuplicate
    * Task
        * Check if an array of numbers has any duplicates
    * The trick
        * Know the value of a Set. Set is great and fast at fetching elements.
        * In fact in Java contains complexity for most Set implementations are O(1)
        * For List implementations it's O(n)
        * The solution is then to turn the array into a Set
        * The best way is to iterate the array and check if a new Set already has the element
* IsAnagram
    * Task
        * Check if two input strings are anagrams
    * The trick
        * Here we must use a map in some way
        * The simplest way is to simply turn both strings into a Map<Character, Integer>
        * Simply iterate through each string and count every character
        * Compare the two maps for the solution
        * People are hyper optimizing this in a variety of clever ways
            * For instance, they don't create two maps but rather one. For one string they add 1 to the value, and for
              the other they subtract 1. At the end they check if all values are 0.
            * This provides a lower memory print.
            * It also skips the comparison which adds to time complexity
* TwoSums
    * Task
        * In an array find two numbers which add up to the target
    * The trick
        * The trick is to create a Map of complements and their indexes. Basically target minus the element of the
          array.
            * You iterate the array and calculate the complement (target - array[i])
            * You check if the Map key Set has this complement. If it does, you actually found your solution. If not you
              add the complement Map.

## Two pointers

* IsPalindrom
    * Task
        * Check if a given string is a palindrome after removing non-alphanumerical characters and doing it
          case-insensitive
    * The trick
        * We need to create two pointers on the array and go index by index. One pointer starts at the start of the
          string and goes up, the other one starts at the end.
        * After comparing all digits we either find the difference or we don't.
        * We also need to ignore non-alphanumeric values and take into account case-insensitivity

## Stacks

* ValidParantheses
    * Task
        * Check if a string containing only "()[]{}" is a validly closed parantheses
    * The trick
        * The trick is to only understand Stack as a data structure.
        * The Stack is a LIFO structure. So what we do is we stack character by character. If we find a closing
          bracket ")]}" we check if the last added is the corresponding opening bracket.

## Binary search

* BinarySearch
    * Task
        * Implement a binary search on a sorted array. In this case the array is sorted in ascending order.
    * The trick
        * Binary search works on a sorted array. The main idea is to half the search area with each iteration.
        * We start by finding the middle and check if the target is larger or smaller that the middle element, or is it
          in the upper or lower interval.
        * We then cut the interval in half again and so forth until we do or don't find the result.

## Sliding window

* Best time to buy and sell stocks
    * Task
        * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to
          maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to
          sell that stock.
    * The trick
        * We have to iterate the array and at each point we always have to know what the minimum price in the past is.
          If we know that we can calculate the profit on each day while we iterate and see if it's a may profit.
* LengthOfLongestSubstringWithoutRepeatingCharacters
    * Task
        * Given a string s, find the length of the longest substring without repeating characters.
    * The trick
        * We need to have a window and move the right part of the window through the string until we find a repeating
          character. We keep track of all encountered characters in a set. When we do find it we move the left part of
          the window clearing the set of those encountered characters until we again have a string with no repeating
          characters and we can move the right side again.