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
             "src/qbits/{{sanitized}}"
             ["src/qbits/{{sanitized}}.clj"            (renderer "base.clj")]
             ["test/qbits/{{sanitized}}/core_test.clj" (renderer "core_test.clj")])))
