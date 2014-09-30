

(defn hello [name]
  (println "Hello," name))

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
)

(defn group1 []
    (println (+ 1 2))
    (println "Hello")
    (hello "sparky")
    (println (pig-latin "Wednesday"))
    (println (pig-latin "apple"))
)

(group1)


; Samples from
; http://www.beaconhill.com/solutions/kb/clojure/reading-files-in-clojure2.html

(ns stream-files
    (:require [clojure.java.io :as io]))

(def readfile "/home/dcouture/.bashrc")

; Reading a file
(print (slurp readfile))
; slurp
; Reads the file named by f and returns it as a string.

; with-open closes the reader when complete
(with-open [rdr (io/reader readfile)]
    (doseq [line (line-seq rdr)]
           (println line)))

; with-open
; bindings => [name init ...]
; Evaluates body in a try expression with names bound to the values
; of the inits, and a finally clause that calls (.close name) on each
; name in reverse order.

; clojure.java.io.reader
; Attempts to coerce its argument into an open java.io.Reader.
; Default implementations always return a java.io.BufferedReader.
; Default implementations are provided for Reader, BufferedReader,
; InputStream, File, URI, URL, Socket, byte arrays, character arrays,
; and String.
; If argument is a String, it tries to resolve it first as a URI, then
; as a local file name. URIs with a 'file' protocol are converted to
; local file names.
; Should be used inside with-open to ensure the Reader is properly
; closed.

; doseq
; Repeatedly executes body (presumably for side-effects) with
; bindings and filtering as provided by "for". Does not retain
; the head of the sequence. Returns nil.

; line-seq
; Returns the lines of text from rdr as a lazy sequence of strings.
; rdr must implement java.io.BufferedReader.

