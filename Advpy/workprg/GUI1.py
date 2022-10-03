from tkinter import*
from tkinter import messagebox
w=Tk()
w.geometry('700x400')
w.title('Details')
def Submit():
    messagebox.showinfo("Info","Details are submitted")
l1=Label(w,text="Name:").grid(row=1,column=1)
l1=Label(w,text="Date of Birth:").grid(row=2,column=1)
l1=Label(w,text="Email:").grid(row=3,column=1)
e=Entry(w,width=30).grid(row=1,column=2)
e1=Entry(w,width=30).grid(row=2,column=2)
e2=Entry(w,width=30).grid(row=3,column=2)
b=Button(w,text='Submit',command=Submit).grid(row=4,column=2)
b1=Button(w,text='Cancel',command=quit).grid(row=4,column=1)
w.mainloop