find . -name '*.txt' | xargs -I{} cat {} | grep -c "the"
