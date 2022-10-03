class parent:
    def f1(self):
        print("I am super class")
class child1(parent):
    def f1(self):
        print("I am in child 1")
class Child2(parent):
    def f1(self):
        print("I am in child 2)")

o=Child2()
o.f1()
o1=child1()
o1.f1()