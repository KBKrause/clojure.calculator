"Namespace"
(ns clojure.main)

"-- THE BASICS --"
"Add many numbers together. Apply will take the + function and pass all of nums to it"
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

"-------------------------------------------------"

" -- INTERESTING THINGS --"
"Try using a higher order function ..."
(defn addone [num]
  (+ num 1))

"Map will apply the function to each element in the list. It treats another function like a parameter!"
(defn incn [nums]
  (map addone nums))

(prn "Add 1 to these numbers:" (incn [1 2 3]))