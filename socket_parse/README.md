# Clojure TCP Simple Server

Creates a clojure script that listens on TCP port 8000 and prints out lines received through the connection.

```clojure
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
```
based off sample from [clojure-cookbook](https://github.com/clojure-cookbook/clojure-cookbook/blob/master/05_network-io/5-10_tcp-server.asciidoc)

Try it out

```bash
< /usr/share/dict/words nc localhost 8000
```

:)