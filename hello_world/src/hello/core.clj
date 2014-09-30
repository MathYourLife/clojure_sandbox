(ns hello.core)

(defn say-hi
    [to]
    (println (str "Well hello there " to)))

(defn -main
  "I don't do a whole lot."
  [to]
  (say-hi to))
