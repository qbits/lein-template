(ns leiningen.new.qbits
  (:require
   [leiningen.new.templates :refer [renderer sanitize ->files year]]))

(defn qbits
  [name]
  (let [data {:name name
              :sanitized (sanitize name)
              :year year}
        renderer #((renderer "qbits") % data)]
    (->files data
             ["project.clj"                            (renderer "project.clj")]
             ["README.md"                              (renderer "README.md")]
             ["CHANGELOG.md"                           (renderer "CHANGELOG.md")]
             [".gitignore"                             (renderer ".gitignore")]
             [".travis.yml"                            (renderer ".travis.yml")]
             ["doc/markdown/guide.md"                  (renderer "guide.md")]
             "doc/codox"
             "src/clj/qbits/{{sanitized}}"
             ;; "src/cljs/qbits/{{sanitized}}"
             "src/java/qbits/{{sanitized}}"
             ["src/clj/qbits/{{sanitized}}.clj"        (renderer "base.clj")]
             ["src/java/qbits/{{sanitized}}/Foo.java"  (renderer "base.java")]
             ["test/qbits/{{sanitized}}/test/core_test.clj" (renderer "core_test.clj")])))
