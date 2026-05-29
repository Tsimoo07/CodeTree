n = int(input())

# Please write your code here.
curn = 1
for y in range(n):
    for x in range(n):
        print(curn,end=' ')
        curn += 1
        if curn == 10:
            curn = 1
    print()