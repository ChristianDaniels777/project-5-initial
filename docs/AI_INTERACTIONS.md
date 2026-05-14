# AI Interactions Log

## Implementation Prompt: Gnome Sort

**Prompt used:**

> Implement this Java method using the exact variable names from the pseudocode. The array variable must be named `a` and the position variable must be named `pos`. The method must be generic and work with Comparable objects. Use the provided `swap()` helper method when swapping.
>
> Pseudocode:
> ```
> procedure gnomeSort(a[]):
>     pos := 0
>     while pos < length(a):
>         if (pos == 0 or a[pos] >= a[pos-1]):
>             pos := pos + 1
>         else:
>             swap a[pos] and a[pos-1]
>             pos := pos - 1
> ```

**AI-generated response summary:**

The AI produced a generic Java implementation using `public static <T extends Comparable<T>> void gnomeSort(T[] a)`, an integer `pos`, a `while (pos < a.length)` loop, `compareTo()` for Comparable comparisons, and `swap(a, pos, pos - 1)` for the swap step.

**Verification notes:**

- Confirmed the array variable is `a`, matching the pseudocode.
- Confirmed the position variable is `pos`, matching the pseudocode.
- Confirmed the comparison uses `a[pos].compareTo(a[pos - 1]) >= 0`, which is the Comparable equivalent of `a[pos] >= a[pos-1]`.
- Confirmed the method sorts in place and handles empty and single-element arrays because the `while` condition prevents invalid access.

## Implementation Prompt: Cocktail Shaker Sort

**Prompt used:**

> Implement this Java method using the exact variable names from the pseudocode. The array variable must be named `a`, the swap flag must be named `swapped`, and the loop index must be named `i`. The method must be generic and work with Comparable objects. Use the provided `swap()` helper method.
>
> Pseudocode:
> ```
> procedure cocktailShakerSort(a : list of sortable items) is
>     do
>         swapped := false
>         for each i in 0 to length(a) − 1 do:
>             if a[i] > a[i + 1] then
>                 swap(a[i], a[i + 1])
>                 swapped := true
>             end if
>         end for
>         if not swapped then
>             break do-while loop
>         end if
>         swapped := false
>         for each i in length(a) − 1 to 0 do:
>             if a[i] > a[i + 1] then
>                 swap(a[i], a[i + 1])
>                 swapped := true
>             end if
>         end for
>     while swapped
> end procedure
> ```

**AI-generated response summary:**

The AI generated a `do/while` loop with `swapped`, a forward sweep using `i`, an early break when no swaps occur, and a backward sweep using the same `i` variable name. The implementation uses `compareTo()` for generic Comparable objects.

**Verification notes:**

- Confirmed `a`, `swapped`, and `i` are preserved as required.
- Corrected the loop bounds for Java arrays to avoid reading `a[i + 1]` out of range. The forward loop stops at `a.length - 2` by using `i < a.length - 1`; the backward loop begins at `a.length - 2` and ends at `0`.
- Confirmed empty and one-element arrays do not access invalid indexes because both loops are skipped.

## Implementation Prompt: Shell Sort

**Prompt used:**

> Implement Shell Sort in Java using the Ciura gap sequence. Preserve the pseudocode variable names exactly: `gaps`, `n`, `gap`, `i`, `j`, and `temp`. The method must use `public static <T extends Comparable<T>> void shellSort(T[] a)` and compare values with `compareTo()`.

**AI-generated response summary:**

The AI generated a Shell Sort implementation using `gaps = Arrays.asList(701, 301, 132, 57, 23, 10, 4, 1)`, `n = a.length`, and a gapped insertion sort using `temp` and `j`.

**Verification notes:**

- Confirmed `gaps`, `n`, `i`, `j`, and `temp` match the pseudocode.
- Confirmed `a[j - gap].compareTo(temp) > 0` is the Comparable equivalent of `a[j - gap] > temp`.
- Confirmed large gaps are harmless for small arrays because the loop condition `i < n` skips them.

## Test Generation Prompt

**Prompt used:**

> Generate JUnit 5 tests for these generic sorting methods: `gnomeSort`, `cocktailShakerSort`, and `shellSort`. Use only standard JUnit 5 `@Test`, `@DisplayName`, and `assertArrayEquals`. Include the required categories: empty array, single element, already sorted, reverse sorted, duplicates, all same elements, two swapped elements, two sorted elements, random order, and String arrays.

**AI-generated response summary:**

The AI generated separate tests for each algorithm with descriptive names and expected sorted arrays.

**Modifications made:**

- Kept all required categories for Gnome Sort and Cocktail Shaker Sort.
- Added Shell Sort coverage for important representative cases because the rubric includes Shell Sort.
- Used `assertArrayEquals` for all array comparisons so the test checks array contents instead of object references.
- Used both `Integer[]` and `String[]` arrays to verify generic Comparable behavior.

## Coverage Analysis

The test suite covers empty arrays, one-element arrays, sorted data, reverse-sorted data, duplicate values, all-equal values, two-element boundary cases, random integer data, and String data. These cases verify normal sorting behavior, edge cases, duplicate handling, and generic Comparable support.
