(defproject lein-nvd "1.4.1"
  :description "National Vulnerability Database [https://nvd.nist.gov/] dependency-checker leiningen plugin."
  :url "https://github.com/rm-hull/lein-nvd"
  :license {
    :name "The MIT License (MIT)"
    :url "http://opensource.org/licenses/MIT"}
  :dependencies [
    [com.cemerick/pomegranate "1.1.0"]
    [nvd-clojure "1.4.1"]]
  :scm {:url "git@github.com:rm-hull/lein-nvd.git"}
  :source-paths ["src"]
  :jar-exclusions [#"(?:^|/).git"]
  :codox {
    :source-paths ["src"]
    :output-path "doc/api"
    :source-uri "http://github.com/rm-hull/lein-nvd/blob/master/{filepath}#L{line}" }
  :min-lein-version "2.8.1"
  :profiles {
    :dev {
      :global-vars {*warn-on-reflection* true}
      :dependencies [
        [org.clojure/clojure "1.10.3"] ]
      :plugins [
        [lein-codox "0.10.7"]
        [lein-cloverage "1.1.1"]]}}
  :eval-in-leiningen true)
