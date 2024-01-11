def towers_of_hanoi(numbers,b,m,e):
    if numbers==1:
        print(f'Move disk from pole{b} to pole{e}')
        return
    towers_of_hanoi(numbers-1,b,e,m)
    print(f"Move disk from pole{b} to pole{e}")
    towers_of_hanoi(numbers-1,m,b,e)
number=3
towers_of_hanoi(number,'A','B','C')