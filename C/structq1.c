#include <stdio.h>
#include <stdlib.h>

struct Product {
    int id;
    char name[50];
    int quantity;
    float price;
};

int main() {
    int n, extra;
    printf("Enter number of products: ");
    scanf("%d", &n);

    struct Product *p = (struct Product *)malloc(n * sizeof(struct Product));

    for (int i = 0; i < n; i++) {
        printf("Product %d (ID Name Quantity Price): ", i + 1);
        scanf("%d %s %d %f", &p[i].id, p[i].name, &p[i].quantity, &p[i].price);
    }

    printf("How many more products to add? ");
    scanf("%d", &extra);

    p = (struct Product *)realloc(p, (n + extra) * sizeof(struct Product));

    for (int i = n; i < n + extra; i++) {
        printf("Additional product %d: ", i + 1);
        scanf("%d %s %d %f", &p[i].id, p[i].name, &p[i].quantity, &p[i].price);
    }

    printf("\nInventory Details:\n");
    for (int i = 0; i < n + extra; i++) {
        printf("ID: %d, Name: %s, Qty: %d, Price: $%.2f\n",
               p[i].id, p[i].name, p[i].quantity, p[i].price);
    }

    free(p);
    return 0;
}
