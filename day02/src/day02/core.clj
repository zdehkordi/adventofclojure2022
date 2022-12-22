(ns day02.core (:require [clojure.string :as str]))

(def bonus_map {:X 1 :Y 2, :Z 3})

(def score_map {:A {:X 3 :Y 6 :Z 0}
                :B {:X 0 :Y 3 :Z 6}
                :C {:X 6 :Y 0 :Z 3}})

(defn score [them, you] (+ ((score_map (keyword them)) (keyword you)) (bonus_map (keyword you))))

(defn parse [input]
  (let [lines (str/split-lines (slurp input))] 
       (for [line lines] (str/split line #" ")))
  )


(defn score_game [input] 
  (reduce + (for [i (parse input)] (score (first i) (second i)))))