# Example: In this example, let us plot the linear regression line on the graph and 
# predict the weight-based using height.

# R program to illustrate
# Linear Regression
# Height vector
x <- c(153, 169, 140, 186, 128,136, 178, 163, 152, 133)
# Weight vector
y <- c(64, 81, 58, 91, 47, 57,75, 72, 62, 49)

# Create a linear regression model
png(file = "HW-Dataset.png")
plot(x,y)
dev.off()

model <- lm(y~x)

# Print regression model

print(model)

# Find the weight of a person
# With height 182


df <- data.frame(x = 182)
res <- predict(model, df)

print("Predicted value of a person with height = 182")

print(res)

# Output to be present as PNG file


png(file = "linearRegGFG.png")

# Plot
plot(x, y, main = "Height vs Weight Regression model")


# Save the file.

