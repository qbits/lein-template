(defproject cc.qbits/{{name}} "0.1.0-SNAPSHOT"
  :description ""
  :url "https://github.com/mpenet/{{name}}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 ;; [com.gfredericks/catch-data "0.2.0"]
                 ;; [com.stuartsierra/component "0.2.3"]
                 ;; [prismatic/schema "0.4.0"]
                 ]
  :profiles {:1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7  {:dependencies [[org.clojure/clojure "1.7.0-master-SNAPSHOT"]]}
             :dev  {:dependencies [[codox "0.8.10"]]}
             :test  {:dependencies []}}

  :codox {:src-dir-uri "https://github.com/mpenet/{{name}}/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}
          :output-dir "doc/codox"}

    :source-paths ["src/clj"]
    :java-source-paths ["src/java"]
    ;; :javac-options ["-source" "1.6" "-target" "1.6" "-g"]
    :global-vars {*warn-on-reflection* true})
