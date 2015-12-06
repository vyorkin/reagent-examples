(ns reagent-examples.todo.session
  (:require [reagent.core :as r :refer [atom]]
            [alandipert.storage-atom :as storage :refer [local-storage]]))

(def todos (local-storage (atom {}) :todos))
(def counter (local-storage (atom 0) :counter))
