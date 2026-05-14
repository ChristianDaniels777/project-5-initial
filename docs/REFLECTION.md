# Reflection

## Understanding the Algorithms

Gnome Sort works by walking forward through the array until it finds an out-of-order pair. When it finds one, it swaps the pair and steps backward, repeating until the current element is in the correct location. It feels similar to insertion sort, but instead of shifting elements directly, it repeatedly swaps neighboring values.

Cocktail Shaker Sort is a bidirectional version of bubble sort. It moves larger values toward the end during the forward pass, then moves smaller values toward the beginning during the backward pass. The `swapped` flag allows the algorithm to stop early if a full pass finds no changes.

Shell Sort uses a series of gaps to compare and move elements that are far apart before finishing with a final gap of 1. With the Ciura gap sequence, the array becomes partially ordered before the final insertion-sort-like pass, which makes it much faster in practice than the other two algorithms.

## Code Generation Effectiveness

The AI was effective for turning the pseudocode into Java methods, especially after the prompt clearly required exact variable names. It correctly used generic method signatures with `<T extends Comparable<T>>` and used `compareTo()` instead of numeric comparison operators. This was important because the project required the sorts to work with any Comparable type, not only integers.

The main part that required careful verification was Cocktail Shaker Sort. The pseudocode wording can suggest loop bounds that would be unsafe in Java because `a[i + 1]` must not be read when `i` is already at the last index. I verified and adjusted the forward loop to use `i < a.length - 1` and the backward loop to start at `a.length - 2`.

The AI preserved the required variables: `a` and `pos` for Gnome Sort; `a`, `swapped`, and `i` for Cocktail Shaker Sort; and `gaps`, `n`, `i`, `j`, and `temp` for Shell Sort. The code is readable, uses comments, and follows the pseudocode closely.

## Working with Unfamiliar Algorithms

Gnome Sort and Cocktail Shaker Sort were less familiar than common algorithms like selection sort, insertion sort, or merge sort. Using AI helped because it translated the pseudocode into Java quickly, but I still had to trace the algorithms manually to understand them. The most useful part of AI assistance was getting a starting implementation and then checking it line by line against the assignment requirements.

I could explain both algorithms without the code now: Gnome Sort keeps stepping backward after swaps until local order is restored, while Cocktail Shaker Sort sweeps in both directions and stops when no swaps happen.

## Prompt Engineering

The best prompt strategy was being very specific. Mentioning exact variable names in the prompt prevented the AI from renaming variables to `array`, `arr`, `position`, or `index`. Specifying `Comparable objects` also prevented the AI from using operators like `>` and `<`, which do not work with generic Java objects.

Next time, I would include the grading rubric directly in the prompt so the AI pays attention not just to correctness but also to naming, comments, tests, and documentation.

## Test Generation Effectiveness

AI was helpful for quickly generating a broad set of test cases. The generated tests covered empty arrays, single elements, sorted input, reverse input, duplicates, repeated values, two-element arrays, random order, and String arrays. I reviewed the assertions to make sure they used `assertArrayEquals`, because `assertEquals` would compare array references instead of contents.

The tests verify that the algorithms sort in place and work with more than one Comparable type. Manual review was still necessary to make sure the required categories were all included and that the tests were not redundant or too vague.

## Overall Reflection

AI assistance made the project faster, but it did not replace understanding. The most important manual steps were checking variable names, verifying loop bounds, confirming generic Comparable usage, and making sure the tests actually prove the arrays are sorted correctly. This project showed that AI is useful as a coding assistant, but the programmer still has to verify correctness and align the result with the assignment specifications.
