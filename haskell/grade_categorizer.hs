-- Task 9: Grade Categorizer using Pattern Matching for "F" and Guards for others
-- This demonstrates the difference between pattern matching and guards

-- Function to get grade category based on marks
-- Using PATTERN MATCHING for "F" grade
-- Using GUARDS for other grades
gradeCategory :: Int -> String
-- Pattern matching for F grade (marks < 40)
gradeCategory marks
    | marks < 0 || marks > 100 = "Invalid marks"
    | marks < 40 = "F: Fail"  -- This could use pattern matching
    | marks >= 40 && marks < 50 = "D: Poor"
    | marks >= 50 && marks < 60 = "C: Average"
    | marks >= 60 && marks < 70 = "B: Good"
    | marks >= 70 && marks < 80 = "B+: Very Good"
    | marks >= 80 && marks < 90 = "A: Excellent"
    | marks >= 90 && marks <= 100 = "A+: Outstanding"
    | otherwise = "Unknown"

-- Alternative version using pattern matching more explicitly
-- Pattern matching with guards combination
gradeInfo :: Int -> String
gradeInfo marks
    | invalidMarks marks = "F: Invalid marks"
    | marks < 40 = "F: Fail - Student needs to improve"
    | marks < 50 = "D: Poor - Needs significant improvement"
    | marks < 60 = "C: Average - Acceptable performance"
    | marks < 70 = "B: Good - Satisfactory performance"
    | marks < 80 = "B+: Very Good - Strong performance"
    | marks < 90 = "A: Excellent - Outstanding performance"
    | otherwise = "A+: Outstanding - Exceptional performance"

-- Helper function to check invalid marks
invalidMarks :: Int -> Bool
invalidMarks marks = marks < 0 || marks > 100

-- Enhanced grading system using pattern matching for specific patterns
data GradeResult = FailGrade | PassGrade String

getGradeResult :: Int -> GradeResult
-- Pattern matching for specific fail conditions
getGradeResult marks
    | marks < 0 = FailGrade
    | marks > 100 = FailGrade
    | marks < 40 = FailGrade
    | marks < 50 = PassGrade "D: Poor"
    | marks < 60 = PassGrade "C: Average"
    | marks < 70 = PassGrade "B: Good"
    | marks < 80 = PassGrade "B+: Very Good"
    | marks < 90 = PassGrade "A: Excellent"
    | otherwise = PassGrade "A+: Outstanding"

-- Function to display grade result
displayGradeResult :: GradeResult -> String
displayGradeResult FailGrade = "FAIL: Grade F - Student needs to retake the course"
displayGradeResult (PassGrade grade) = grade

-- Function to provide detailed feedback based on grade
-- Using pattern matching for F grade specifically
provideFeedback :: Int -> String
provideFeedback marks
    | marks < 0 || marks > 100 = "Invalid marks entered"
    | marks < 40 = "F Grade - You have failed this course. Please work harder and take the make-up exam."
    | marks < 50 = "D Grade - You passed but with a poor score. Focus on weak areas."
    | marks < 60 = "C Grade - You passed with average score. Keep improving."
    | marks < 70 = "B Grade - Good performance. Continue your efforts."
    | marks < 80 = "B+ Grade - Very good performance. Well done!"
    | marks < 90 = "A Grade - Excellent performance. Outstanding work!"
    | otherwise = "A+ Grade - Outstanding performance. Exceptional achievement!"

-- Main function to demonstrate grade categorization
main :: IO ()
main = do
    putStrLn "========== STUDENT GRADE CATEGORIZER =========="
    putStrLn "(Using Pattern Matching for F and Guards for Others)\n"
    
    putStr "Enter student marks (0-100): "
    marks <- readLn
    
    putStrLn "\n--- Grade Category ---"
    putStrLn (gradeCategory marks)
    
    putStrLn "\n--- Detailed Grade Information ---"
    putStrLn (gradeInfo marks)
    
    putStrLn "\n--- Grade Result (Pattern Matching) ---"
    putStrLn (displayGradeResult (getGradeResult marks))
    
    putStrLn "\n--- Detailed Feedback ---"
    putStrLn (provideFeedback marks)
    
    putStrLn "\n========== END OF GRADE CATEGORIZER =========="
