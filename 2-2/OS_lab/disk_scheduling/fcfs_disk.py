from matplotlib import pyplot as pp
def fcfs(sequence,start):
    temp=sequence.copy()
    temp.insert(0,start)
    pp.rcparams['xtick.bottom']=pp.rcparams['xtick.labelbottom']
    pp.rcparams['xtick.top']=pp.rcparams['xtick.labeltop']=True
    size=len(temp)
    x=temp
    y=[]
    headmovement=0
    for i in range(0,size):
        y.append(-1)
        if i!=size-1:
            headmovement+=abs(temp[i]-temp[i-1])
            string="Headmovement=",str(headmovement)
            string2=str(temp)
            pp.plot(x,y,color='green',markerfacecolor="blue",marker='o',
                    markersize=5,linewidth=2,label="FCFS")
            pp.ylim=(0,size)
            pp.yticks([])
            pp.xlim=(0,199)
            pp.title("FCFS")
            pp.show()
            
            
            
            
            
sequence=list(map().strip().split())
    need=50
    
                    