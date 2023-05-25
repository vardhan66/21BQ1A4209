import pandas as pd
n=int(input("Enter no of p"))
fcfs = {'at': [],'bt': [],'ct': [],'tat': [],'wt':[]}
for i in range(n):
    fcfs['at'].append(int(input("Enter arrival time:")))
    fcfs['bt'].append(int(input("Enter burst time:")))
    if i==0:
        ct=fcfs['bt'][i]
    else:
        ct=fcfs['ct'][i-1]+fcfs['bt'][i]
    tat=ct-fcfs['at'][i]
    wt=tat-fcfs['bt'][i] 
    fcfs['ct'].append(ct)
    fcfs['tat'].append(tat)
    fcfs['wt'].append(wt)
print(pd.DataFrame(fcfs))
print("Average turn around time is",sum(fcfs['tat'])/n)
print("Average waiting time is",sum(fcfs['wt'])/n)




