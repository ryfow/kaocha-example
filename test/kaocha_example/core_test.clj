(ns kaocha-example.core-test
  (:require [clojure.test :refer :all]
            [kaocha-example.core :as core]))

(deftest fails
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest passes
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest fails-pretty
  (testing "FIXME, I fail."
    (is (= {:first "Jim" :last "Rabideau"}
           {:first "James" :last "Rabideau"}))))
