(ns basics)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(+ 1 2) ; showing return value -> 3
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}
;; <=

;; @@
(println "Hello") ; return value is nil, showing output -> Hello
;; @@
;; ->
;;; Hello
;;;
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(defn hello [name]
  (println "Hello," name))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;clj-basics/hello</span>","value":"#'clj-basics/hello"}
;; <=

;; @@
(hello "sparky")
;; @@
;; ->
;;; Hello, sparky
;;;
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
; This is Clojure code.
; When a set is used as a function, it returns the argument if it is
; in the set and nil otherwise.  When used in a boolean context,
; that indicates whether the argument is in the set.
(def vowel? (set "aeiou"))

(defn pig-latin [word] ; defines a function
  ; word is expected to be a string
  ; which can be treated like a sequence of characters.
  (let [first-letter (first word)] ; assigns a local binding
    (if (vowel? first-letter)
      (str word "ay") ; then part of if
      (str (subs word 1) first-letter "ay")
    )
  )
) ; else part of if
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;clj-basics/pig-latin</span>","value":"#'clj-basics/pig-latin"}
;; <=

;; @@
(println (pig-latin "Wednesday"))
(println (pig-latin "apple"))
;; @@
;; ->
;;; ednesdayWay
;;; appleay
;;;
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@

;; @@
