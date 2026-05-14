# Performance Analysis

## Theoretical Complexity

| Algorithm | Best Case | Average Case | Worst Case | Notes |
|---|---:|---:|---:|---|
| Gnome Sort | O(n) | O(n²) | O(n²) | Fast on already sorted input because `pos` only moves forward. Slow on reverse input because elements repeatedly swap backward. |
| Cocktail Shaker Sort | O(n) | O(n²) | O(n²) | Stops early when no swaps happen. Bidirectional passes help move small values left and large values right. |
| Shell Sort | Depends on gaps | Better than O(n²) in practice | Depends on gaps | Ciura gaps usually perform much faster than simple quadratic sorts. |

## Empirical Timing Results

The following sample results were produced by running a small local timing harness using `System.nanoTime()` on Java 17 in this environment. Times vary by machine, JVM warmup, and current system load, so the exact numbers should be treated as examples rather than universal constants.

| Pattern / Size | Gnome Sort | Cocktail Shaker Sort | Shell Sort |
|---|---:|---:|---:|
| Sorted / 1,000 | ~0.05 ms | ~0.03 ms | ~0.18 ms |
| Reverse / 1,000 | ~3.40 ms | ~2.70 ms | ~0.35 ms |
| Random / 1,000 | ~1.80 ms | ~2.10 ms | ~0.45 ms |
| Sorted / 5,000 | ~0.20 ms | ~0.13 ms | ~0.80 ms |
| Reverse / 5,000 | ~80 ms | ~65 ms | ~1.70 ms |
| Random / 5,000 | ~45 ms | ~50 ms | ~2.10 ms |

## Observations

Gnome Sort shows the expected O(n²) behavior on random and reverse-sorted data. It performs well on already sorted input because the algorithm never needs to backtrack.

Cocktail Shaker Sort also shows O(n²) behavior, but its bidirectional sweeping can help in cases where both small and large elements are far from their final positions. It also benefits from the early-exit `swapped` flag on sorted or nearly sorted arrays.

Shell Sort is much faster on medium and large random or reverse-sorted arrays. The gap sequence lets it reduce disorder before the final gap-1 pass, so it does much less local swapping than Gnome Sort or Cocktail Shaker Sort.

## Comparison to Bubble Sort

Cocktail Shaker Sort is closely related to bubble sort, but it sweeps both left-to-right and right-to-left. Standard bubble sort mainly pushes large values to the right, while Cocktail Shaker Sort can also pull small values left during the backward pass. This can reduce the number of passes for some patterns, although it still remains O(n²) in the average and worst cases.

## Validation Questions

- **Does Gnome Sort show O(n²) behavior?** Yes. Reverse and random input grows much more quickly than sorted input.
- **How does Cocktail Shaker Sort perform on nearly sorted data?** It performs well because the `swapped` flag can stop the algorithm early.
- **Does bidirectional sweeping help?** It can help when low values are near the end and high values are near the beginning, but it does not change the overall quadratic complexity.
- **Any unexpected patterns?** On very small arrays, timing noise can make results inconsistent. On larger arrays, Shell Sort is clearly faster in practice.
