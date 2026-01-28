-- Task 5: Categorize a number as even or odd
-- Function to check if a number is even or odd
evenOdd :: Int -> String
evenOdd n
    | n `mod` 2 == 0 = "Even"
    | otherwise = "Odd"

-- Function to return a pair with boolean
isEven :: Int -> Bool
isEven n = n `mod` 2 == 0

isOdd :: Int -> Bool
isOdd n = n `mod` 2 /= 0

-- Main function to get user input
main :: IO ()
main = do
    putStr "Enter a number to check if it's even or odd: "
    n <- readLn
    putStrLn $ "The number " ++ show n ++ " is " ++ evenOdd n
