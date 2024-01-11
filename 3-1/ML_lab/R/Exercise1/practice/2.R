X <- cbind(1, D$pressure)
y <- D$flux
n <- length(y)
beta <- solve(t(X) %*%X ) %*% t(X) %*% y
beta

e <- y - X %*% beta
s <- sqrt(sum(e^2)/(n-2))
Vbeta <- s^2 * solve(t(X) %*%X )
se.beta <- sqrt(diag(Vbeta))
t.obs <- beta / se.beta
p.value <- 2 * (1 - pt(abs(t.obs), df = n-2))
## Collection in a table
analasis.table <- cbind(beta, se.beta, t.obs, p.value)
analasis.table
se.beta


## Put some names on our table
colnames(analasis.table) <- c("Estimates","Std.Error","t.obs","p.value")
rownames(analasis.table) <- c("beta1","beta2")
analasis.table




