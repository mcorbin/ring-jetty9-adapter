(def jetty-version "10.0.8")

(defproject info.sunng/ring-jetty9-adapter-http3 "0.18.0-SNAPSHOT"
  :description "Ring adapter for jetty 9 and above, meta package for http3"
  :url "http://github.com/sunng87/ring-jetty9-adapter"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories {"releases" :clojars}
  :global-vars {*warn-on-reflection* true}
  :dependencies [[org.eclipse.jetty.http3/http3-server ~jetty-version]])
