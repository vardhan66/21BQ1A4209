f=open(r"C:\Users\eswar\Desktop\File.txt",'r')
alphabet_buckets={}
for word in f.read().split():
   if(word[0].isalpha()):
       temp=word.lower()
       if(temp[0] not in alphabet_buckets.keys()):
           alphabet_buckets[temp[0]]=[]
           alphabet_buckets[temp[0]].append(temp)
       else:
           alphabet_buckets[temp[0]].append(temp)
print(alphabet_buckets)
f.close()
