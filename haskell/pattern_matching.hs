-- Task 8: Pattern Matching with multiple data types
-- Demonstrates how pattern matching works with different data types

-- Pattern matching with integers
describeNumber :: Int -> String
describeNumber 0 = "Zero"
describeNumber 1 = "One"
describeNumber 2 = "Two"
describeNumber n
    | n > 0 = "Positive number: " ++ show n
    | otherwise = "Negative number: " ++ show n

-- Pattern matching with lists
describeList :: [Int] -> String
describeList [] = "Empty list"
describeList [x] = "Single element list: " ++ show x
describeList [x, y] = "Two element list: " ++ show x ++ " and " ++ show y
describeList (x:xs) = "List starting with " ++ show x ++ " and " ++ show (length xs) ++ " more elements"

-- Pattern matching with tuples
describeTuple :: (Int, String) -> String
describeTuple (0, name) = "Default with name: " ++ name
describeTuple (id, name) = "ID: " ++ show id ++ ", Name: " ++ name

-- Pattern matching with custom data type
data Shape = Circle Float | Rectangle Float Float | Triangle Float Float Float

shapeArea :: Shape -> String
shapeArea (Circle r) = "Circle area: " ++ show (3.14159 * r * r)
shapeArea (Rectangle l w) = "Rectangle area: " ++ show (l * w)
shapeArea (Triangle a b c) = "Triangle with sides: " ++ show a ++ ", " ++ show b ++ ", " ++ show c

-- Pattern matching with Maybe type
safeHead :: [a] -> Maybe a
safeHead [] = Nothing
safeHead (x:_) = Just x

processMaybe :: Maybe Int -> String
processMaybe Nothing = "No value found"
processMaybe (Just n) = "Found value: " ++ show n

-- Pattern matching with Either type
data Result = Success String | Error String

processResult :: Result -> String
processResult (Success msg) = "Success: " ++ msg
processResult (Error msg) = "Error: " ++ msg

-- Pattern matching with custom Person record
data Person = Person { name :: String, age :: Int, city :: String }

describePerson :: Person -> String
describePerson (Person {name = "Alice", age = 25}) = "Alice is 25 years old"
describePerson (Person {name = n, age = a, city = c})
    | a < 18 = n ++ " is a minor living in " ++ c
    | otherwise = n ++ " is an adult living in " ++ c

-- Main function to demonstrate all pattern matching examples
main :: IO ()
main = do
    putStrLn "========== PATTERN MATCHING EXAMPLES =========="
    
    putStrLn "\n--- Numbers ---"
    putStr "Enter a number: "
    num <- readLn
    putStrLn (describeNumber num)
    
    putStrLn "\n--- Lists ---"
    putStrLn "Demonstrating list patterns:"
    putStrLn (describeList [])
    putStrLn (describeList [42])
    putStrLn (describeList [1, 2])
    putStrLn (describeList [1, 2, 3, 4, 5])
    
    putStrLn "\n--- Tuples ---"
    putStrLn "Demonstrating tuple patterns:"
    putStrLn (describeTuple (0, "Admin"))
    putStr "Enter a name: "
    name <- getLine
    putStrLn (describeTuple (101, name))
    
    putStrLn "\n--- Custom Shape Type ---"
    putStrLn "Demonstrating shape patterns:"
    putStrLn (shapeArea (Circle 5))
    putStrLn (shapeArea (Rectangle 4 6))
    putStrLn (shapeArea (Triangle 3 4 5))
    
    putStrLn "\n--- Maybe Type ---"
    putStrLn "Demonstrating Maybe patterns:"
    putStrLn (processMaybe (safeHead [1, 2, 3]))
    putStrLn (processMaybe (safeHead []))
    
    putStrLn "\n--- Result Type ---"
    putStrLn "Demonstrating Result patterns:"
    putStrLn (processResult (Success "Operation completed"))
    putStrLn (processResult (Error "File not found"))
    
    putStrLn "\n--- Person Record ---"
    putStr "Enter person's name: "
    personName <- getLine
    putStr "Enter person's age: "
    personAge <- readLn
    putStr "Enter person's city: "
    personCity <- getLine
    let person = Person personName personAge personCity
    putStrLn (describePerson person)
