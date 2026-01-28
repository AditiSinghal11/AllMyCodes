-- Task 4: Check if a number is prime
-- Function to check if a number is prime
isPrime :: Int -> Bool
isPrime n
    | n < 2 = False
    | n == 2 = True
    | n `mod` 2 == 0 = False
    | otherwise = checkOddDivisors n 3

-- Helper function to check odd divisors
checkOddDivisors :: Int -> Int -> Bool
checkOddDivisors n divisor
    | divisor * divisor > n = True
    | n `mod` divisor == 0 = False
    | otherwise = checkOddDivisors n (divisor + 2)

-- Main function to get user input
main :: IO ()
main = do
    putStr "Enter a number to check if it's prime: "
    n <- readLn
    if isPrime n
        then putStrLn $ show n ++ " is a PRIME number"
        else putStrLn $ show n ++ " is NOT a prime number"
