D <- data.frame(x=c(0,25,50,75,100),
                y=c(14,38,54,76,95))

fit <- lm(y ~ x, data=D)
summary(fit)
