-- Task 7: Combined program using Guards for questions 2-6
-- Question 2: Check leap year
isLeapYear :: Int -> Bool
isLeapYear year
    | year `mod` 400 == 0 = True
    | year `mod` 100 == 0 = False
    | year `mod` 4 == 0 = True
    | otherwise = False

-- Question 3: Find factorial
factorial :: Int -> Int
factorial n
    | n < 0 = error "Factorial not defined for negative numbers"
    | n == 0 = 1
    | n == 1 = 1
    | otherwise = n * factorial (n - 1)

-- Question 4: Check prime number
isPrime :: Int -> Bool
isPrime n
    | n < 2 = False
    | n == 2 = True
    | n `mod` 2 == 0 = False
    | otherwise = checkOddDivisors n 3

checkOddDivisors :: Int -> Int -> Bool
checkOddDivisors n divisor
    | divisor * divisor > n = True
    | n `mod` divisor == 0 = False
    | otherwise = checkOddDivisors n (divisor + 2)

-- Question 5: Even or Odd
evenOdd :: Int -> String
evenOdd n
    | n `mod` 2 == 0 = "Even"
    | otherwise = "Odd"

-- Question 6: Power of a number
power :: Int -> Int -> Int
power base exponent
    | exponent < 0 = error "Exponent cannot be negative"
    | exponent == 0 = 1
    | otherwise = base * power base (exponent - 1)

-- Main function to demonstrate all functions
main :: IO ()
main = do
    putStrLn "========== COMBINED FUNCTIONS WITH GUARDS =========="
    
    putStrLn "\n--- Leap Year Check ---"
    putStr "Enter a year: "
    year <- readLn
    putStrLn (show year ++ " is " ++ (if isLeapYear year then "a leap year" else "not a leap year"))
    
    putStrLn "\n--- Factorial ---"
    putStr "Enter a number for factorial: "
    n1 <- readLn
    putStrLn ("Factorial of " ++ show n1 ++ ": " ++ show (factorial n1))
    
    putStrLn "\n--- Prime Number Check ---"
    putStr "Enter a number to check if prime: "
    n2 <- readLn
    putStrLn (show n2 ++ " is " ++ (if isPrime n2 then "prime" else "not prime"))
    
    putStrLn "\n--- Even or Odd ---"
    putStr "Enter a number: "
    n3 <- readLn
    putStrLn (show n3 ++ " is " ++ evenOdd n3)
    
    putStrLn "\n--- Power of a Number ---"
    putStr "Enter base: "
    base <- readLn
    putStr "Enter exponent: "
    exp <- readLn
    putStrLn (show base ++ "^" ++ show exp ++ " = " ++ show (power base exp))
