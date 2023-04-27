import cv2 as cv
import matplotlib.pyplot as pp
import sys
img = cv.imread(r"C:\Users\eswar\Downloads\210906.jpg",1)
if img is None:
    sys.exit("Could not read the image.")
cv.imshow("Image",img)