(ns assignments.lists-test
  (:require [clojure.test :refer :all]
            [assignments.lists :refer :all]))

(deftest lists
  (testing "map"
    (testing "identity with single coll"
      (is (= [1 2 3] (map' identity [1 2 3]))))))

(deftest filter-test
  (testing "filter evens"
    (is (= [2 4] (filter' even? [1 2 3 4]))))
  (testing "filter odds"
    (is (= [1 3] (filter' odd? [1 2 3 4])))))