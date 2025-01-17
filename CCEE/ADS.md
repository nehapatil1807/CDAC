# Java Snippets with Time Complexities

## 1. **O(1) - Constant Time**
```java
int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr[2]); // Accessing an element by index
```

## 2. **O(log n) - Logarithmic Time**
```java
int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

## 3. **O(n) - Linear Time**
```java
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}
```

## 4. **O(n^2) - Quadratic Time**
```java
int countPairsWithSum(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) count++;
        }
    }
    return count;
}
```

## 5. **O(n log n) - Sorting**
```java
import java.util.Arrays;

int[] arr = {5, 3, 8, 4, 2};
Arrays.sort(arr); // Sorting an array
```

## 6. **O(2^n) - Exponential Time**
```java
int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

## 7. **O(n!) - Permutations**
```java
void generatePermutations(String str, String ans) {
    if (str.length() == 0) {
        System.out.println(ans);
        return;
    }
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        String rest = str.substring(0, i) + str.substring(i + 1);
        generatePermutations(rest, ans + ch);
    }
}
```

## 8. **O(n^3) - Cubic Time**
```java
int countTripletsWithSum(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[i] + arr[j] + arr[k] == target) count++;
            }
        }
    }
    return count;
}
```

## 9. **O(n log n) - Merge Sort**
```java
void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1, n2 = right - mid;
    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];
    System.arraycopy(arr, left, leftArr, 0, n1);
    System.arraycopy(arr, mid + 1, rightArr, 0, n2);

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (leftArr[i] <= rightArr[j]) arr[k++] = leftArr[i++];
        else arr[k++] = rightArr[j++];
    }
    while (i < n1) arr[k++] = leftArr[i++];
    while (j < n2) arr[k++] = rightArr[j++];
}
```

## 10. **O(n^4) - 4 Nested Loops**
```java
int countQuadruplets(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                for (int l = k + 1; l < arr.length; l++) {
                    if (arr[i] + arr[j] + arr[k] + arr[l] == target) count++;
                }
            }
        }
    }
    return count;
}
```

## 11. **O(n^1.5) - Sieve of Eratosthenes (Prime Numbers)**
```java
void sieveOfEratosthenes(int n) {
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    for (int i = 2; i * i <= n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) System.out.print(i + " ");
    }
}
```

## 12. **O(n^k) - K Nested Loops (General)**
```java
void kNestedLoops(int n, int k) {
    kNestedLoopsHelper(new int[k], 0, n);
}

void kNestedLoopsHelper(int[] result, int depth, int n) {
    if (depth == result.length) {
        System.out.println(Arrays.toString(result));
        return;
    }
    for (int i = 0; i < n; i++) {
        result[depth] = i;
        kNestedLoopsHelper(result, depth + 1, n);
    }
}
```

## 13. **O(1) - Matrix Access**
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(matrix[1][2]); // Accessing element in constant time
```

## 14. **O(2^n) - Subset Generation**
```java
void generateSubsets(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < (1 << n); i++) { // 2^n subsets
        for (int j = 0; j < n; j++) {
            if ((i & (1 << j)) > 0) System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
```

## 15. **O(n^2 log n) - 2D Matrix Sorting**
```java
int[][] sortMatrix(int[][] matrix) {
    int rows = matrix.length, cols = matrix[0].length;
    int[] flat = new int[rows * cols];
    int index = 0;

    for (int[] row : matrix) {
        for (int val : row) flat[index++] = val;
    }

    Arrays.sort(flat); // O(n^2 log n)

    index = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = flat[index++];
        }
    }
    return matrix;
}
