(ns firstWeb.views.welcome
  (:require [firstWeb.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to firstWeb! Horray ray"]))

(defpage [:get "/"] []
  (common/layout
    [:p "차라리 여기서 한글을 쓰는게 낫겠다."]))
