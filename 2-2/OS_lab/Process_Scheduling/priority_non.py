import pandas as pd
n=int(input("Enter no of processes"))
processes=[]
prio = {'priority': [],'bt': [],'ct': [],'tat': [],'wt':[]}
class Process:
    def __init__(self,priority,burst_time):
        self.burst_time = burst_time
        self.priority = priority
def priority_scheduling(processes):
    processes.sort(key=lambda x: x.priority)
    schedule= []
    ct = 0
    for process in processes:
        prio['priority'].append(process.priority)
        prio['bt'].append(process.burst_time)
        ct += process.burst_time
        tat=ct
        wt=tat-process.burst_time
        prio['ct'].append(ct)
        prio['tat'].append(tat)
        prio['wt'].append(wt)
    return
for i in  range (n):
    values=input("Enter Priority and burst time:").split()
    values = list(map(int,values[0:]))
    processes.append(Process((values[0]),(values[1])))
priority_scheduling(processes)
df=pd.DataFrame(prio)
print(df)
print("Average turn around time is",sum(prio['tat'])/n)
print("Average waiting time is",sum(prio['wt'])/n)


    
