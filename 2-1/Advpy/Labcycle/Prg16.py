import matplotlib.pyplot as pp
import matplotlib.image as pi
img=pi.imread(r"C:\Users\eswar\Pictures\Screenshots\Screenshot (12).png",0)
img=pi.imwrite(r"C:\Users\eswar\Pictures\Screenshots\Screenshot (12).png",img)
simg=pp.imshow(img)
pp.show()