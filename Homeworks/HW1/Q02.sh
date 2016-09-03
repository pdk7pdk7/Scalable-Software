find . -name '*.txt' | xargs -I{} tail -n5 {} >> allmixedLast5
