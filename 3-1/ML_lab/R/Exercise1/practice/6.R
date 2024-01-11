D <- data.frame(concentration=c(11.5, 10.2, 10.3, 9.68, 9.32),
                
                distance=c(2, 4, 6, 8, 10))
fit <- lm(concentration ~ distance, data=D)
summary(fit)
