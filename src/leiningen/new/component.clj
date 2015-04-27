(ns leiningen.new.component
  (:require
   [leiningen.new.templates :refer [renderer sanitize ->files year]]))

(defn component
  [name]
  (let [data {:name name
              :sanitized (sanitize name)
              :year year}
        renderer #((renderer "component") % data)]
    (->files data
             ["project.clj" (renderer "project.clj")]
             ["README.md" (renderer "README.md")]
             [".gitignore" (renderer ".gitignore")]
             "src/clj/qbits/component/{{sanitized}}"
             ["src/clj/qbits/component/{{sanitized}}.clj" (renderer "base.clj")]
             ["test/qbits/component/{{sanitized}}/test/core_test.clj" (renderer "core_test.clj")])))
