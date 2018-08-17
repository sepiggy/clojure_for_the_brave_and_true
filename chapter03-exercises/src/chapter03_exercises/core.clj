(ns chapter03-exercises.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; exer2
(defn exer2
  "Write a function that takes a number and adds 100 to it."
  [number]
  (+ 100 number))

(exer2 200)

;; exer3
(defn dec-maker
  "Create a custom decrementor"
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))
(dec9 10)
