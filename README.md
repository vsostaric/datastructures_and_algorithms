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

