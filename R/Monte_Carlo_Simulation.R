#Monte Carlo simulation
p <- 0.45    # unknown p to estimate
N <- 1000

# simulate one poll of size N and determine x_hat
x <- sample(c(0,1), size = N, replace = TRUE, prob = c(1-p, p))
x_hat <- mean(x)

# simulate B polls of size N and determine average x_hat
B <- 10000    # number of replicates
N <- 1000    # sample size per replicate
x_hat <- replicate(B, {
  x <- sample(c(0,1), size = N, replace = TRUE, prob = c(1-p, p))
  mean(x)
})

library(tidyverse)
library(gridExtra)
p1 <- data.frame(x_hat = x_hat) %>%
  ggplot(aes(x_hat)) +
  geom_histogram(binwidth = 0.005, color = "black")
p2 <- data.frame(x_hat = x_hat) %>%
  ggplot(aes(sample = x_hat)) +
  stat_qq(dparams = list(mean = mean(x_hat), sd = sd(x_hat))) +
  geom_abline() +
  ylab("X_hat") +
  xlab("Theoretical normal")
grid.arrange(p1, p2, nrow=1)


library(tidyverse)
N <- 100000
p <- seq(0.35, 0.65, length = 100)
SE <- sapply(p, function(x) 2*sqrt(x*(1-x)/N))
data.frame(p = p, SE = SE) %>%
  ggplot(aes(p, SE)) +
  geom_line()

  take_sample <- function(p , N){
    x <- sample(c(0,1), size = N, replace = TRUE, prob = c(1-p, p))
    return(mean(x))
  }
  
  set.seed(1)
  # Define `p` as the proportion of Democrats in the population being polled
  p <- 0.45
  
  # Define `N` as the number of people polled
  N <- 100
  #take_sample(p , N)
  
  # Calculate the standard error
  SE <- sqrt((p * (1 - p)/N))
  SE
  
  errors <- replicate(10000, {p - take_sample(p , N)})
  
  # Calculate the standard deviation of `errors`
  print(sqrt(mean(errors^2)))

#mean(errors)
#hist(errors)

#abs(errors)
#mean(abs(errors))
#hist(abs(errors))
  
set.seed(1)
# Define `p` as the proportion of Democrats in the population being polled
p <- 0.45

# Define `N` as the number of people polled
N <- 100
x <- sample(c(0,1), size = N, replace = TRUE, prob = c(0,1))
X_bar <- mean(x)
X_bar

SE <- sqrt((X_bar * (1 - X_bar))/N)
SE


N <- seq(100, 5000, len = 100)
p <- 0.5
se <- sqrt(p*(1-p)/N)
se



# Define `p` as the proportion of Democrats in the population being polled
p <- 0.45

# Define `N` as the number of people polled
N <- 100

# The variable `B` specifies the number of times we want the sample to be replicated
B <- 10000

# Use the `set.seed` function to make sure your answer matches the expected result after random sampling
set.seed(1)

# Define `p` as the proportion of Democrats in the population being polled
p <- 0.45

# Define `N` as the number of people polled
N <- 100

# Calculate the probability that the estimated proportion of Democrats in the population is greater than 0.5. Print this value to the console.
1 - pnorm(0.5, mean = p, sd = sqrt(p*(1-p)/N))

# Define `N` as the number of people polled
N <-100

# Define `X_hat` as the sample average
X_hat <- 0.51

# Define `se_hat` as the standard error of the sample average
se_hat <- sqrt(X_hat*(1-X_hat)/N)

# Calculate the probability that the error is 0.01 or larger
1 - pnorm(0.01, 0, se_hat) + pnorm(-0.01, 0, se_hat)





