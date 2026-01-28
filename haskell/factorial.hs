-- Task 3: Find the factorial of a given number
-- Function to find factorial using recursion
factorial :: Int -> Int
factorial 0 = 1
factorial 1 = 1
factorial n = n * factorial (n - 1)

-- Function to find factorial using guards
factorialGuard :: Int -> Int
factorialGuard n
    | n < 0 = error "Factorial not defined for negative numbers"
    | n == 0 = 1
    | n == 1 = 1
    | otherwise = n * factorialGuard (n - 1)

-- Main function to get user input
main :: IO ()
main = do
    putStr "Enter a number to find its factorial: "
    n <- readLn
    if n < 0
        then putStrLn "Factorial is not defined for negative numbers!"
        else putStrLn $ "Factorial of " ++ show n ++ " = " ++ show (factorial n)
