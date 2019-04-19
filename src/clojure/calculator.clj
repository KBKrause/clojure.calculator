(ns clojure.calculator)

"Add many numbers together"
(defn addn [nums]
  (apply + nums))

"Multiply many numbers together"
(defn muln [nums]
  (apply * nums))

(prn "Addition of n numbers:" (addn [1 2]))
(prn "Multiplication of n numbers:" (muln [5 4 5]))