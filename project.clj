(defproject kaocha-example "0.1.0-SNAPSHOT"
  :description "Example of Kaocha usage"
  :url "http://github.com/ryfow/kaocha-example"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "0.0-266"]
                                     [lambdaisland/kaocha-cloverage "0.0-6"]]}}
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]})
