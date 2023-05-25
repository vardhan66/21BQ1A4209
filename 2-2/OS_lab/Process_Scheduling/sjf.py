import pandas as pd
n=int(input("Enter no of processes"))
processes=[]
sjf = {'pid': [],'bt': [],'ct': [],'tat': [],'wt':[]}
class Process:
    def __init__(self, pid, burst_time):
        self.pid = pid
        self.burst_time = burst_time
def sjf_non_preemptive(processes):
    processes.sort(key=lambda x: x.burst_time)
    ct=0
    for process in processes:
        sjf['bt'].append(process.burst_time)
        sjf['pid'].append(process.pid)
        ct+=process.burst_time
        tat=ct
        wt=tat-process.burst_time
        sjf['ct'].append(ct)
        sjf['tat'].append(tat)
        sjf['wt'].append(wt)
for i in  range (n):
    values=input("Enter Pid and burst time:").split()
    values = list(map(int,values[0:]))
    processes.append(Process((values[0]),(values[1])))
sjf_non_preemptive(processes)
df=pd.DataFrame(sjf)
print(df)
print("Average turn around time is",sum(sjf['tat'])/n)
print("Average waiting time is",sum(sjf['wt'])/n)
    
