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
      * For instance, they don't create two maps but rather one. For one string they add 1 to the value, and for the other they subtract 1. At the end they check if all values are 0.
      * This provides a lower memory print.
      * It also skips the comparison which adds to time complexity
* TwoSums
  * Task
    * In an array find two numbers which add up to the target
  * The trick
    * The trick is to create a Map of complements and their indexes. Basically target minus the element of the array.
      * You iterate the array and calculate the complement (target - array[i])
      * You check if the Map key Set has this complement. If it does, you actually found your solution. If not you add the complement Map.

## Two pointers

* IsPalindrom
  * Task
    * Check if a given string is a palindrome after removing non-alphanumerical characters and doing it case-insensitive
  * The trick
    * We need to create two pointers on the array and go index by index. One pointer starts at the start of the string and goes up, the other one starts at the end.
    * After comparing all digits we either find the difference or we don't.
    * We also need to ignore non-alphanumeric values and take into account case-insensitivity

## Stacks

* ValidParantheses
  * Task
    * Check if a string containing only "()[]{}" is a validly closed parantheses
  * The trick
    * The trick is to only understand Stack as a Datastructure. 
    * The Stack is a LIFO structure. So what we do is we stack character by character. If we find a closing bracket ")]}" we check if the last added is the corresponding opening bracket.