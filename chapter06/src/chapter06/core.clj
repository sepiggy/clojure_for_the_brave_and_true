(ns chapter06.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; P126. Your Project as a library
(ns-name *ns*)

inc
'inc
(map inc [1 2])
'(map inc [1 2])

;; P127. storing objects with def
(def great-books ["East of Eden" "The Glass Bead Game"])
great-books
(deref #'chapter06.core/great-books)
(ns-interns *ns*)
(get (ns-interns *ns*) 'great-books)

(ns-map *ns*)

(def great-books ["The Power of Bees" "Journey to Upstaris"])
great-books

(create-ns 'cheese.taxonomy)
(ns-name (create-ns 'cheese.taxonomy))

(in-ns 'cheese.analysis)
