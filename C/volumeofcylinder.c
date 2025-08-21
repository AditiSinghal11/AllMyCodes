#include <stdio.h>

int radius;
int height;

// args, return
double volume(int r, int h) {
    double v = 3.141 * r * r * h;
    return v;
}

// no args, no return
void volume_1(void) {
    double v = 3.141 * radius * radius * height;
    printf("volume(no arg,no return) is %f\n", v);
}

// no arg, return
double volume2(void) {
    double v = 3.141 * radius * radius * height;
    return v;
}

// arg, no return
void volume3(int r, int h) {
    double v = 3.141 * r * r * h;
    printf("volume(arg,no return) is %f\n", v);
}

int main() {
    printf("enter the radius and height of the cylinder: ");
scanf("%d %d", &radius, &height);
    
    

    double v1 = volume(radius, height);
    printf("volume(args,return) is %f\n", v1);

    volume_1();

    double v2 = volume2();
    printf("volume(no arg,return) is %f\n", v2);

    volume3(radius, height);

    return 0;}

