#include <stdio.h>

#define MAX 10

int st[MAX];
int top = -1;

void push(int data);
void pop();
void display();
void peek();
int isempty();
int isfull();

int main()
{
    int choice, data;
    char ch;

    do
    {
        printf("\nEnter the choice:\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("4. Empty\n");
        printf("5. IsFull\n");
        printf("6. Peek\n");

        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                printf("Enter the data: ");
                scanf("%d", &data);
                push(data);
                break;

            case 2:
                pop();
                break;

            case 3:
                display();
                break;

            case 4:
                if(isempty())
                    printf("Stack is empty\n");
                else
                    printf("Stack is not empty\n");
                break;

            case 5:
                if(isfull())
                    printf("Stack is full\n");
                else
                    printf("Stack is not full\n");
                break;

            case 6:
                peek();
                break;

            default:
                printf("Invalid choice\n");
        }

        printf("\nDo you want to continue - press 'y' or 'n': ");
        scanf(" %c", &ch);

    } while(ch == 'y');

    return 0;
}

void push(int data)
{
    if(isfull())
    {
        printf("Stack overflow\n");
    }
    else
    {
        top = top + 1;
        st[top] = data;
    }
}

void pop()
{
    int temp;

    if(isempty())
    {
        printf("Stack underflow\n");
    }
    else
    {
        temp = st[top];
        top = top - 1;

        printf("The deleted element is %d\n", temp);
    }
}

void display()
{
    int i;

    if(isempty())
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("The elements in stack are:\n");

        for(i = top; i >= 0; i--)
        {
            printf("%d\n", st[i]);
        }
    }
}

void peek()
{
    if(isempty())
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("The topmost element in the stack is %d\n", st[top]);
    }
}

int isempty()
{
    if(top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isfull()
{
    if(top == MAX - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}