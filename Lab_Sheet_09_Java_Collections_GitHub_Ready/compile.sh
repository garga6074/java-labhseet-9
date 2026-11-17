#!/usr/bin/env bash
set -euo pipefail
mkdir -p out
find src/main/java -name "*.java" -print0 | xargs -0 javac -encoding UTF-8 -d out
echo "All Java programs compiled successfully into out/"
