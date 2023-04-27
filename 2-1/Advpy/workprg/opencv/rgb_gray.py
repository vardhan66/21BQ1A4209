import cv2 as cv
import matplotlib.pyplot as pp
import sys
img = cv.imread(r"C:\Users\eswar\Downloads\pexels-lumn-167699 (1).jpg",0)
if img is None:
    sys.exit("Could not read the image.")
cv.imwrite(r"C:\Users\eswar\Downloads\pexels-lumn-167699 (1).jpg",img)