import pandas as pd

class Process:
    def __init__(self, pid,burst_time):
        self.pid = pid
        self.burst_time = burst_time
def round_robin(processes,):
    ct=0
    global rr
    for process in processes:
        for i in range(processes):
            bt = process.burst_time
            while  (bt) > 0 :
                bt -= tq
                ct+=bt
                rr['ct'].append()
                rr['tat'][i]=ct-0
                rr['wt'][i]=0


processes=[]
n=int(input("Enter no of p"))
tq=int(input("Enter Time Quantum:"))
rq=[]
rr = {'at': [],'bt': [],'ct': [],'tat': [],'wt':[]}
for i in  range (n):
    value=int(input("Enter burst time:"))
    processes.append(Process(i+1,(value)))
round_robin(processes)
print(pd.DataFrame(rr))
print("Average turn around time is",sum(rr['tat'])/n)
print("Average waiting time is",sum(rr['wt'])/n)
#ct=prev_bt+current_bt
#tat=ct-at