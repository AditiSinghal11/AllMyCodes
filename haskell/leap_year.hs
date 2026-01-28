-- Task 2: Check if a year is a leap year
-- Function to check leap year
isLeapYear :: Int -> Bool
isLeapYear year
    | year `mod` 400 == 0 = True
    | year `mod` 100 == 0 = False
    | year `mod` 4 == 0 = True
    | otherwise = False

-- Main function to get user input
main :: IO ()
main = do
    putStr "Enter a year to check if it's a leap year: "
    year <- readLn
    if isLeapYear year
        then putStrLn $ show year ++ " is a LEAP YEAR"
        else putStrLn $ show year ++ " is NOT a leap year"
