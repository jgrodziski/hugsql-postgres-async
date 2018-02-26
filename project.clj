(defproject jgrodziski/hugsql-adapter-postgres-async "0.3.4"
  :description "Postgres.async adapter for HugSQL"
  :url "https://www.github.com/jgrodziski/hugsql-postgres-async"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/core.async "0.3.465" :scope "provided"]
                 [com.layerware/hugsql-adapter "0.4.8"]
                 [alaisi/postgres.async "0.8.0"]])
