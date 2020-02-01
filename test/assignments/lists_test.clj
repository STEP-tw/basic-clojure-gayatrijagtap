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
               `() (difference [1 2] [1 2]))))

(deftest union-test
  (testing "union of two colls"
    (are [x y] (= x y)
               [1 2 3 4 5] (union [1 2 3] [3 4 5])
               [1 2 3] (union [1 2 3] [1 2 3]))))

(deftest points-around-origin-test
  (testing "points-around-origin"
    (is (= `([-1 -1] [-1 0] [-1 1] [0 -1] [0 0] [0 1] [1 -1] [1 0] [1 1]) (points-around-origin [0 0])))))

(deftest cross-product-test
  (testing "cross-product"
    (are [x y] (= x y)
               `([1 4] [1 3] [1 5] [2 4] [2 3] [2 5] [3 4]) (cross-product [1 2 3] [4 3 5])
               `() (cross-product [1] [1])
               )))

(deftest double-up-test
  (testing "double-up"
    (is (= `(1 1 2 2 3 3) (double-up [1 2 3])))))

(deftest third-or-fifth-test
  (testing "third-or-fifth"
    (is (= `(0 3 5) (third-or-fifth (range 0 6))))))

(deftest sqr-of-the-first-test
  (testing "sqr-of-the-first"
    (is (= `(16 16 16) (sqr-of-the-first [4 5 6])))))

(deftest split-comb-test
  (testing "split-comb"
    (are [x y] (= x y)
               [1 3 2 4 5] (split-comb [1 2 3 4 5])
               [1 3 2 4] (split-comb [1 2 3 4]))))

(deftest palindrome-test
  (testing "palindrome"
    (are [x y] (= x y)
               true (palindrome? [1 2 3 2 1])
               false (palindrome? [1 2 3 4 2 1])
               true (palindrome? [1 2 3 3 2 1]))))