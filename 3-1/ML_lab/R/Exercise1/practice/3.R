data("Auto",package="ISLR")
pairs(Auto)
cor(subset(Auto,select = -name))
lm.fit = lm(mpg~.-name,data=Auto)
summary(lm.fit)
#par(mfrow=c(2,2))
plot(lm.fit)
plot(predict(lm.fit),rstudent(lm.fit))
lm.fit2 <- lm(mpg~cylinders*displacement+displacement*weight,data=Auto)
summary(lm.fit2)
lm.fit3 <- lm(mpg~.-name+log(acceleration),data = Auto)
summary(lm.fit3)
lm.fit4 <- lm(mpg~.-name + I(horsepower^2),data = Auto)
summary(lm.fit4)
