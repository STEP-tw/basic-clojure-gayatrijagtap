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

(deftest some-test
  (testing "all even"
    (is (= true (some?' even? [1 3 5 6]))))
  (testing "all odd"
    (is (= false (some?' even? [1 3 5 7])))))

(deftest ascending-test
  (testing "are ascending"
    (is (= true (ascending? [1 2 3 4]))))
  (testing "are not ascending"
    (is (= false (ascending? [1 3 2 4])))))

(deftest difference-test
  (testing "get elements in coll2 not in coll1"
    (are [x y] (= x y)
               `(4 3) (difference [1 2] [1 2 3 4])
               `() (difference [1 2] [1 2])
               ))
  )