(require '[clojure.java.io :as io])

(defn write-thousand-lines [filename]
    (with-open [wrt (io/writer filename)]
    (doseq [x (range 1 1000)]
    (.write wrt (str x "\n")))))
