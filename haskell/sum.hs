import Data.Char (intToDigit)

main :: IO ()
main = do
    let loclsum :: Int -> Int -> Int
        loclsum x y = x + y

    let result :: Int
        result = loclsum 5 10

    putStrLn ("The sum is: " ++ show result)
