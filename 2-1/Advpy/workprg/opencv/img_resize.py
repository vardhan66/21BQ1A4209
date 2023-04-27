import cv2 as cv
import sys
img = cv.imread(r"C:\Users\eswar\Desktop\cvtest\1 - Copy.png",1)
if img is None:
    sys.exit("Could not read the image.")
width=img.shape[1]-320
height=img.shape[0]-1840
print(width,height)
dim=width,height
r=cv.resize(img,dim)
cv.imwrite(r"C:\Users\eswar\Desktop\cvtest\1 - Copy.png",r)