(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0)))))

(deftest informative-division
  (testing "non zero denominator"
    (is (= 2 (informative-divide 4 2))))
  (testing "zero denominator"
    (is (= :infinite (informative-divide 4 0)))))

(deftest harishchandra-test
  (testing "truthy value"
    (is (= 5 (harishchandra 5))))
  (testing "false value"
    (is (= nil (harishchandra false))))
  (testing "nil value"
    (is (= nil (harishchandra nil))))
  )

(deftest yudhishtira-test
  (testing "truthy value"
    (is (= 6 (yudishtira 6))))
  (testing "falsy value"
    (is (= :ashwathama (yudishtira false))))
  (testing "nil value"
    (is (= :ashwathama (yudishtira nil))))
  )