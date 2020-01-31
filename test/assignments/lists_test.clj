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

(deftest count-test
  (testing "count elements in coll"
    (is (= 4 (count' [1 2 3 4])))))

(deftest reverse-test
  (testing "valid sequence"
    (is (= [4 3 2 1] (reverse' [1 2 3 4]))))
  (testing "invalid sequence"
    (is (= nil (reverse' 1)))))

(deftest every-test
  (testing "all even"
    (is (= true (every?' even? [2 4 6 8]))))
  (testing "not all even"
    (is (= false (every?' even? [2 4 1 8])))))