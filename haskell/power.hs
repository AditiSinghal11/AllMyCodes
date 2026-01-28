-- Task 6: Find the power of a given number
-- Function to find power using recursion
power :: Int -> Int -> Int
power base 0 = 1
power base exponent = base * power base (exponent - 1)

-- Function to find power using guards
powerGuard :: Int -> Int -> Int
powerGuard base exponent
    | exponent < 0 = error "Exponent cannot be negative"
    | exponent == 0 = 1
    | otherwise = base * powerGuard base (exponent - 1)

-- Efficient power function using binary exponentiation
powerEfficient :: Int -> Int -> Int
powerEfficient base exponent
    | exponent == 0 = 1
    | even exponent = let halfPower = powerEfficient base (exponent `div` 2)
                      in halfPower * halfPower
    | otherwise = base * powerEfficient base (exponent - 1)

-- Main function to get user input
main :: IO ()
main = do
    putStr "Enter the base number: "
    base <- readLn
    putStr "Enter the exponent: "
    exponent <- readLn
    putStrLn $ show base ++ "^" ++ show exponent ++ " = " ++ show (power base exponent)
