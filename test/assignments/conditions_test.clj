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

(deftest duplicate-first-test
  (testing "non-empty-coll"
    (is (= [1 1 2 3] (duplicate-first [1 2 3]))))
  (testing "empty-coll"
    (is (= nil (duplicate-first []))))
  )

(deftest five-point-someone-test
  (testing "five-point-someone"
    (are [x y] (= x y)
               :satan-bhagat (five-point-someone 5 2)
               :chetan-bhagat (five-point-someone 2 5)
               :greece (five-point-someone 4 2)
               :universe (five-point-someone 2 4)
               ))
  )

(deftest order-in-words-test
  (testing "order-in-words"
    (are [x y] (= x y)
               [:x-greater-than-y :y-greater-than-z] (order-in-words 4 3 2)
               [:x-greater-than-y :z-greater-than-x] (order-in-words 4 3 5)
               [:z-greater-than-x] (order-in-words 2 3 4)
               ))
  )

(deftest zero-aliases-test
  (testing "zero-aliases"
    (are [x y] (= x y)
               :zero (zero-aliases 0)
               :empty-string (zero-aliases "")
               :empty (zero-aliases [])
               :empty-set (zero-aliases #{})
               :empty-map (zero-aliases {})
               :empty (zero-aliases `())
               ))
  )

(deftest zero-separated-palindrome-test
  (testing "zero-seperated-palindrome"
    (is (= `(4 3 2 0 2 3 4) (zero-separated-palindrome [1 2 3])))))