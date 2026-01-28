bmi::Float->Float->String
bmi w h
    | bmiValue <= 18.5 = "Underweight"
    | bmiValue <= 24.9 = "Normal weight"
    | bmiValue <= 29.9 = "Overweight"
    | otherwise        = "Obesity"
    where bmiValue = w / (h * h)
main :: IO ()
main = do
    let weight = 70.0  -- weight in kilograms
    let height = 1.75  -- height in meters
    let category = bmi weight height
    putStrLn ("BMI Category: " ++ category)