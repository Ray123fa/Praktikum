#include <stdio.h>

struct student
{
	char name[50];
	int age;
};

void display(struct student s);
void main()
{
	struct student s1;
	printf("Enter name: ");
	scanf("%[^\n]s", &s1.name);
	printf("Enter age: ");
	scanf("%d", &s1.age);
	display(s1); // passing structure as an argument
}

// membuat fungsi dengan struct sebagai parameter
void display(struct student s)
{
	printf("\nDisplaying information\n");
	printf("Name: %s", s.name);
	printf("\nRoll: %d", s.age);
}