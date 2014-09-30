(require '[clojure.java.io :as io])
(import '[java.net ServerSocket])

(defn receive
  "Read a sequence of lines from the socket"
  [socket]
  (line-seq (io/reader socket)))

(defn serve [port]
  "iterate through lines received on the established TCP connection"
  (with-open [server-sock (ServerSocket. port)
              sock (.accept server-sock)]
    (doseq [msg-in (receive sock)]
      (println msg-in))))

(serve 8000)