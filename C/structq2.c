#include <stdio.h>
#include <stdlib.h>

union AccountInfo {
    long accountNumber;
    char accountType[20];
    float minBalance;
};

struct BankAccount {
    char customerName[50];
    int infoType;
    union AccountInfo info;
};

int main() {
    int n;
    printf("Enter number of accounts: ");
    scanf("%d", &n);

    struct BankAccount *acc = (struct BankAccount *)malloc(n * sizeof(struct BankAccount));

    for (int i = 0; i < n; i++) {
        printf("Account %d - Name: ", i + 1);
        scanf("%s", acc[i].customerName);
        printf("Info type (1-Number/2-Type/3-Balance): ");
        scanf("%d", &acc[i].infoType);

        switch (acc[i].infoType) {
            case 1:
                printf("Account Number: ");
                scanf("%ld", &acc[i].info.accountNumber);
                break;
            case 2:
                printf("Account Type: ");
                scanf("%s", acc[i].info.accountType);
                break;
            case 3:
                printf("Minimum Balance: ");
                scanf("%f", &acc[i].info.minBalance);
                break;
        }
    }

    printf("\nBank Account Details:\n");
    for (int i = 0; i < n; i++) {
        printf("Customer: %s, ", acc[i].customerName);
        switch (acc[i].infoType) {
            case 1:
                printf("Account Number: %ld\n", acc[i].info.accountNumber);
                break;
            case 2:
                printf("Type: %s\n", acc[i].info.accountType);
                break;
            case 3:
                printf("Min Balance: $%.2f\n", acc[i].info.minBalance);
                break;
        }
    }

    free(acc);
    return 0;
}
