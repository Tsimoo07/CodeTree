n, m = map(int, input().split())

# Please write your code here.
mnum = n
mod = m
if m > n:
    mnum = m
    mod = n
while True:
    if mnum % mod == 0:
        print(mod)
        break
    mnum,mod = mod,mnum%mod