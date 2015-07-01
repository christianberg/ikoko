(ns ikoko.core
  (:gen-class))

(defn multiplex [& entries]
  [{:path "/public.json"
    :filters [:json]
    :data {:entries
           (map #(select-keys % [:type :content :timestamp])
                (filter #(= (:audience %) :public) entries))}}])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
