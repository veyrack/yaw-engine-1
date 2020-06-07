(ns yaw.texmap8
    (:require [yaw.world :as w]))

(def univ (w/start-universe!))
(def world (:world @univ))

(def mcube (w/create-mesh! world
                        :vertices     { 1 [-1.0 1.0 -1.0 -1.0 1.0 1.0 1.0 1.0 1.0 1.0 1.0 -1.0]
                        2[1.0 1.0 1.0 -1.0 -1.0 1.0 1.0 -1.0 1.0 -1.0 1.0 1.0]
                        3[-1.0 1.0 1.0 -1.0 1.0 -1.0 -1.0 -1.0 -1.0 -1.0 -1.0 1.0]
                        4[1.0 -1.0 -1.0 1.0 -1.0 1.0 -1.0 -1.0 1.0 -1.0 -1.0 -1.0]
                        5[1.0 1.0 -1.0 1.0 1.0 1.0 1.0 -1.0 1.0 1.0 -1.0 -1.0]
                        6[-1.0 1.0 -1.0 1.0 -1.0 -1.0 -1.0 -1.0 -1.0 1.0 1.0 -1.0]}

                        :text-coord   {:front  [0.5 0 0 1 1 1 1 0]
                                        :back   [0 0 0 1 1 1 1 0]
                                        :left   [0 0 0 1 1 1 1 0]
                                         :right  [0 0 0 1 1 1 1 0]
                                         :top    [0 0 0 1 1 1 1 0]
                                         :bottom [0 0 0 1 1 1 1 0]
                                         }

                        :normals      {0 [0.0 1.0 0.0 0.0 1.0 0.0 0.0 1.0 0.0 0.0 1.0 0.0],
                         1 [0.0 0.0 1.0 0.0 0.0 1.0 0.0 0.0 1.0 0.0 0.0 1.0],
                          2 [-1.0 0.0 0.0 -1.0 0.0 0.0 -1.0 0.0 0.0 -1.0 0.0 0.0],
                           3 [0.0 -1.0 0.0 0.0 -1.0 0.0 0.0 -1.0 0.0 0.0 -1.0 0.0],
                            4 [1.0 0.0 0.0 1.0 0.0 0.0 1.0 0.0 0.0 1.0 0.0 0.0],
                         5 [0.0 0.0 -1.0 0.0 0.0 -1.0 0.0 0.0 -1.0 0.0 0.0 -1.0]}
                        ;;faces à ajuster

                        :faces {1 [0 1 2 0 2 3],
                         2 [4 5 6 4 7 5],
                         3 [8 9 10 8 10 11],
                         4 [12 13 14 12 14 15],
                         5 [16 17 18 16 18 19],
                         6 [20 21 22 20 23 21]}

                        ;;:faces        {:front  [0 1 3 3 1 2]
                        ;;             :top    [4 0 3 5 4 3]
                        ;;             :back   [7 6 4 7 4 5]
                        ;;             :bottom [2 1 6 2 6 7]
                        ;;             :left   [6 1 0 6 0 4]
                        ;;             :right  [3 2 7 5 3 7]
                        ;;             }
                        ;;:faces        {:front  [0 1 3 1 3 2]
                        ;;               :back   [4 5 7 5 7 6]
                        ;;               :left   [8 9 11 9 11 10]
                        ;;               :right  [12 13 15 13 15 14]
                        ;;               :top    [16 17 19 17 19 18]
                        ;;               :bottom [20 21 23 21 23 22]
                        ;;               }
                        :weight 24
                        :rgb [0 1 1]
                        :texture-name "/resources/dice.png"
                        ))

(def cube (w/create-item! world "cube" :position [0 0 -2] :scale 0.5 :mesh mcube))

(w/rotate! cube :x 30 :y 40 :z 0)