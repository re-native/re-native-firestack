(ns re-native.firestack
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-firestack (js/require "react-native-firestack"))
