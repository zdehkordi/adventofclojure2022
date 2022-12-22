(ns day02.core-spec
  (:require [speclj.core :refer :all]
            [day02.core :refer :all]))

(describe "score"
  (it "calculates score"
      (should= 8 (score "A" "Y"))
      (should= 1 (score "B" "X"))
      (should= 6 (score "C" "Z"))))

(describe "parses input" 
          (it "splits"
              (should= [["A" "Y"]["B" "X"]["C" "Z"]] (parse "sample-input"))))

(describe "score game"
          (it "scores sample"
              (should= 15 (score_game "sample-input")))
          (it "scores input"
              (should= 13268 (score_game "input"))))
