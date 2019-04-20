"Namespace"
(ns clojure.calculator)

"Add many numbers together"
(defn addn [nums]
  (apply + nums))

"Multiply many numbers together"
(defn muln [nums]
  (apply * nums))

"Divide two numbers"
(defn div [num denom]
  (/ num denom))

"Do some basic math ..."
(prn "Addition of n numbers:" (addn [1 2]))
(prn "Multiplication of n numbers:" (muln [5 4 5]))
(prn "Divide two numbers:" (div 4 2))

"Try using a higher order function"
(defn addone [num]
  (+ num 1))

(defn incn [nums]
  (map addone nums))

(prn "Add 1 to these numbers:" (incn [1 2 3]))