# load the Auto data set




#Auto: Auto Data Set
#In ISLR: Data for an Introduction to Statistical Learning with Applications in R


library(ISLR)
library(MASS)


# to load the Auto data to the Local-Environment
data("Auto")

#Check the Data after loading

head(Auto)
tail(Auto)

# to check the Columns

# cols = colnames(Auto)
# cols = strsplit(cols, " ")
# cols

#(a) Use the lm() function to perform a simple linear regression with mpg as the response and horsepower as the predictor

# linear model (lm()) on Auto data , with mpg as response and horse power as predicator ()