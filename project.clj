(defproject cn.leancloud/clj-aws-s3 "0.3.12-SNAPSHOT"
  :description "Clojure Amazon S3 library"
  :url "https://github.com/weavejester/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.amazonaws/aws-java-sdk-s3 "1.11.359"
                  :exclusions [joda-time commons-logging]]
                 [com.amazonaws/aws-java-sdk-cloudwatch "1.11.359"]
                 [clj-time "0.6.0"]]
  :plugins [[codox "0.8.10"]])
