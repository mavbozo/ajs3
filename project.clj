(defproject ajs3 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 ;; https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-s3
                 [com.amazonaws/aws-java-sdk-s3 "1.11.633"]]

  :repl-options {:init-ns ajs3.core})
