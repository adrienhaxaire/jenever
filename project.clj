(defproject jenever "0.1.0-SNAPSHOT"
  :description "Interactive genever database."
  :url "https://github.com/adrienhaxaire/jenever"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot jenever.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
