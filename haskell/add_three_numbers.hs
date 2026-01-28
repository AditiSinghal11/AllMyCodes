-- Task 1: Add three integer numbers
-- Function to add three integers
addThree :: Int -> Int -> Int -> Int
addThree a b c = a + b + c

-- Main function to get user input
main :: IO ()
main = do
    putStrLn "Enter three numbers to add:"
    putStr "Enter first number: "
    a <- readLn
    putStr "Enter second number: "
    b <- readLn
    putStr "Enter third number: "
    c <- readLn
    putStrLn $ "Sum of " ++ show a ++ " + " ++ show b ++ " + " ++ show c ++ " = " ++ show (addThree a b c)
