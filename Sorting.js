const numbers = [5, 2, 9, 1, 5, 6];

// Use a custom comparison function to sort in descending order
numbers.sort(function(a, b) {
  return b - a;
});

console.log(numbers); // Output: [9, 6, 5, 5, 2, 1]
