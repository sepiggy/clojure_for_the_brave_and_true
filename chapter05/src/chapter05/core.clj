(ns chapter05.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; P98. Pure functions: what and why
;; P98. Pure Functions Are Referentially Transparent
(defn wisdom
  [words]
  (str words ", Daniel-san"))
(wisdom "Always bathe on Fridays")

(defn year-end-evaluation
  []
  (if (> (rand) 0.5)
    "You get a raise!"
    "Better luck next year!"))

(year-end-evaluation)

(defn analyze-file
  [filename]
  (analysis (slurp filename)))

(defn analysis
  [text]
  (str "Character count: " (count text)))

(slurp "http://www.baidu.com")

;; P99. Pure Functions Have No Side Effects
;; P100. living with Immutable data structures
;; P100. Recursion Instead of for/while
(defn sum
  ([vals] (sum vals 0))
  ([vals accumulating-total]
   (if (empty? vals)
     accumulating-total
     (sum (rest vals) (+ (first vals) accumulating-total)))))

(sum [39 5 1])

;; P103. Function Composition Instead of Attribute Mutation


;; P105. Cool things to do with Pure functions
;; P105. comp
((comp inc *) 2 3)

(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strength 4
                :dexterity 5}})
(def c-int (comp :intelligence :attributes))
(def c-str (comp :strength :attributes))
(def c-dex (comp :dexterity :attributes))

(c-int character)
(c-str character)
(c-dex character)

(defn spell-slots
  [char]
  (int (inc (/ (c-int char) 2))))

(spell-slots character)

;; P107. memoize
(def memo-sleepy-identity (memoize sleepy))
