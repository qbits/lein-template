(defproject cc.qbits/{{name}} "0.1.0-SNAPSHOT"
  :description ""
  :url "https://github.com/mpenet/{{name}}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0-RC5"]
                 ;; [com.gfredericks/catch-data "0.2.0"]
                 ;; [com.stuartsierra/component "0.3.1"]
                 ;; [prismatic/schema "1.0.4"]
                 ]
  :profiles {:dev  {:dependencies []}
             :test  {:dependencies []}}

  :codox {:source-uri "https://github.com/mpenet/{{name}}/blob/master/{filepath}#L{line}"
          :metadata {:doc/format :markdown}
          :namespaces :all}

  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  ;; :javac-options ["-source" "1.6" "-target" "1.6" "-g"]
  :global-vars {*warn-on-reflection* true})
