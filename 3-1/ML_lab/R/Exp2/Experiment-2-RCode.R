
library(ISLR)
library(MASS)
data("Auto")
typeof(data)
head(Auto)

### apply the lenear Regression model (lm)
lm.fit<-lm(mpg~horsepower,data=Auto)
summary(lm.fit)

## Predictions

predict(lm.fit,data.frame(horsepower=c(98)),interval="prediction")

predict(lm.fit,data.frame(horsepower=c(98)),interval="confidence")

#Plot the response and the predictor. Use the abline() function to display the least squares regression line.
attach(Auto)
plot(horsepower,mpg)
abline(lm.fit,lwd=5,col="blue")

which.max(hatvalues(lm.fit))
par(mfrow = c(2,2))
plot(lm.fit)

