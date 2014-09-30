# Making a Hello World jar

From [vandgrift.com](http://ben.vandgrift.com/2013/03/13/clojure-hello-world.html)

## debug

```bash
bash ../run.sh
```

```clojure
(load-file "src/hello/core.clj")
(hello.core/say-hi "aoeu")
```

## compile

```
lein compile
lein uberjar
```

## run

```bash
java -jar target/hello-0.1.0-SNAPSHOT-standalone.jar something
```