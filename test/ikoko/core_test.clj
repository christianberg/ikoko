(ns ikoko.core-test
  (:require [clojure.test :refer :all]
            [ikoko.core :refer :all]))

(deftest mulitplex-test
  (testing "Public short update"
    (is (= (multiplex {:type :text
                       :audience :public
                       :content "Hello, world!"
                       :timestamp "2015-06-30 11:37:00"})
           [{:path "/public.json"
             :filters [:json]
             :data {:entries [{:timestamp "2015-06-30 11:37:00"
                               :type :text
                               :content "Hello, world!"}]}}]))))
