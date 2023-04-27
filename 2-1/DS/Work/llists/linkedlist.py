class Node:
    def __init__(self,data):
        self.data=data
        self.add=None
class ll:
    def __init__(self):
        self.head=None
    def prin(self,data):
        if self.head is None:
            print("Linked List id Empty")
        n=self.head
        while n is not None:
            print(n.data)
            n=self.add
l=ll()
l.head=Node(5)
second=Node(4)
third=Node(6)
            
        
        