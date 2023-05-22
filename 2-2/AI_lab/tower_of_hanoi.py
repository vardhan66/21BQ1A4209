def towers_of_hanoi(numbers,b,m,e):
    if numbers==1:
        print("Move disk from pole{} to pole{}":format(b,e))
        return
    towers_of_hanoi(numbers-1,b,e,m)
    print("Move disk from pole{} to pole{}":format(b,e))
    towers_of_hanoi(numbers-1,m,b,e)
number=3
towers_of_hanoi(number,'A','B','C')