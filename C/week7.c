#include <stdio.h>

#define MAX 100

void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void mergeArrays(int arr1[], int n1, int arr2[], int n2, int merged[]) {
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) {
        if (arr1[i] < arr2[j]) {
            merged[k++] = arr1[i++];
        } else {
            merged[k++] = arr2[j++];
        }
    }
    while (i < n1) {
        merged[k++] = arr1[i++];
    }
    while (j < n2) {
        merged[k++] = arr2[j++];
    }
}

int binarySearch(int arr[], int n, int key) {
    int low = 0, high = n - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] < key) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}

int main() {
    int arr1[MAX], arr2[MAX], merged[2 * MAX], unsorted[2 * MAX];
    int n1, n2, size, num_keys, i, key;

    printf("Enter size of first array: ");
    scanf("%d", &n1);
    printf("Enter elements of first array: ");
    for (i = 0; i < n1; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter size of second array: ");
    scanf("%d", &n2);
    printf("Enter elements of second array: ");
    for (i = 0; i < n2; i++) {
        scanf("%d", &arr2[i]);
    }

    for (i = 0; i < n1; i++) {
        unsorted[i] = arr1[i];
    }
    for (i = 0; i < n2; i++) {
        unsorted[n1 + i] = arr2[i];
    }

    printf("Unsorted merged array: ");
    for (i = 0; i < n1 + n2; i++) {
        printf("%d ", unsorted[i]);
    }
    printf("\n");

    bubbleSort(arr1, n1);
    bubbleSort(arr2, n2);

    mergeArrays(arr1, n1, arr2, n2, merged);
    size = n1 + n2;

    printf("Sorted merged array: ");
    for (i = 0; i < size; i++) {
        printf("%d ", merged[i]);
    }
    printf("\n");

    printf("Enter number of keys to enter: ");
    scanf("%d", &num_keys);

    for (i = 0; i < num_keys; i++) {
        printf("Enter key %d: ", i + 1);
        scanf("%d", &key);

        if (binarySearch(merged, size, key) != -1) {
            printf("Key %d is already present in the array.\n", key);
        } else {
            merged[size] = key;
            size++;
            bubbleSort(merged, size);
            printf("Key %d added to the array.\n", key);
        }

        printf("Updated array (size %d): ", size);
        for (int j = 0; j < size; j++) {
            printf("%d ", merged[j]);
        }
        printf("\n");
    }

    return 0;
}