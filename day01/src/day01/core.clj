(ns day01.core
  (:require clojure.string :as string) )

(defn parse-inventory [file-name]
  (loop [lines (string/split-lines (slurp file-name))
    input [[]]
    elf 0]
  (if (empty? lines)
    input
    (let [line (first lines)]
      (if (empty? line)
        (recur (rest lines) (conj input []) (inc elf))
        (let [calories (Integer/parseInt line)]
          (recur (rest lines) (update-in input [elf] conj calories) elf)))))))