(ns clojure.main)

; ELEMENTARY
; -------------------------
; 1. Nothing but the Truth
; This is a clojure form. Enter a value which will make the form evaluate to true.
; Don't over think it! If you are confused, see the getting started page. Hint: true is equal to true.

; (= __ true)

(assert (= true true))
; -------------------------
; 2. Simple Math
; If you are not familiar with polish notation, simple arithmetic might seem confusing.
; Note: Enter only enough to fill in the blank (in this case, a single number) - do not retype the whole problem.

; (= (- 10 (* 2 3)) __)

(assert (= (- 10 (* 2 3))) 4)
; -------------------------
; 3. Intro to Strings
; Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.

; (= __ (.toUpperCase "hello world"))

(assert (= "HELLO WORLD" (.toUpperCase "hello world")))
; -------------------------
; 4. Intro to Lists
; Lists can be constructed with either a function or a quoted form.

; (= (list __) '(:a :b :c))
;http://www.4clojure.com/problem/4