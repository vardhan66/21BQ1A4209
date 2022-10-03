l=[1,2,3]
try:
    print(l[3])
except:
    print("Index out of range")
else:
    print("Corresponding value displayed")
finally:
    print("End of Program")