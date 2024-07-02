#!/bin/bash

# Define the version you want to start from
START_VERSION="v1.0.0"
END_VERSION="HEAD"
CHANGELOG_FILE="CHANGELOG.md"

# Header for the changelog
echo "# Changelog" > $CHANGELOG_FILE
echo "" >> $CHANGELOG_FILE

# Get the current date
CURRENT_DATE=$(date +"%Y-%m-%d")

# Append the current version and date
echo "## [Unreleased] - $CURRENT_DATE" >> $CHANGELOG_FILE
echo "" >> $CHANGELOG_FILE

# Define arrays for different types of changes
declare -a FEATURES
declare -a FIXES
declare -a PERFORMANCE
declare -a DOCS

# Read the git log and categorize the commits
while IFS= read -r line; do
  if [[ $line == feat* ]]; then
    FEATURES+=("$line")
  elif [[ $line == fix* ]]; then
    FIXES+=("$line")
  elif [[ $line == perf* ]]; then
    PERFORMANCE+=("$line")
  elif [[ $line == docs* ]]; then
    DOCS+=("$line")
  fi
done < <(git log --pretty=format:"%s (%h)" $START_VERSION..$END_VERSION)

# Function to print an array to the changelog
print_section() {
  local -n array=$1
  local section_name=$2
  if [ ${#array[@]} -ne 0 ]; then
    echo "### $section_name" >> $CHANGELOG_FILE
    for item in "${array[@]}"; do
      echo "- $item" >> $CHANGELOG_FILE
    done
    echo "" >> $CHANGELOG_FILE
  fi
}

# Print each section to the changelog
print_section FEATURES "Features"
print_section FIXES "Bug Fixes"
print_section PERFORMANCE "Performance Improvements"
print_section DOCS "Documentation"

echo "Changelog generated successfully."
