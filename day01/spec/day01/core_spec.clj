(ns day01.core-spec
    (:require [speclj.core :refer :all]
      [day01.core :refer :all]
      [clojure.string :as string]))

(describe "Parse Input"
    (it "reads file"
        (should= "1000\n2000\n3000\n\n4000\n\n5000\n6000\n\n7000\n8000\n9000\n\n10000"
           (slurp "sample-input")))

    (it "breaks input into lines"
        (should= ["this" "that" "" "the" "other"] (string/split-lines "this\nthat\n\nthe\nother")))

    (it "parses input"
        (should= [[1000 2000 3000] [4000] [5000 6000] [7000 8000 9000] [10000]] (parse-inventory "sample-input"))))
