function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(' ');
  
    // Reverse each word
    let reversedWords = words.map(word => {
      return word.split('').reverse().join('');
    });
  
    // Join the reversed words to form the reversed sentence
    let reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  // Example usage:
  let inputSentence = "This is a sunny day";
  let reversedSentence = reverseWords(inputSentence);
  console.log(reversedSentence); // Output: "sihT si a ynnus yad"
  