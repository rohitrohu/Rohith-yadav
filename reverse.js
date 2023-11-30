// A. Reverse Every Word in a Sentence
function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(' ');

    // Reverse each word
    let reversedWords = words.map(word => reverseString(word));

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Helper function to reverse a string
function reverseString(str) {
    return str.split('').reverse().join('');
}

// Example
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);

// B. Sorting an Array in Descending Order
let numbersArray = [5, 2, 8, 1, 9];
let sortedDescending = numbersArray.sort((a, b) => b - a);
console.log("Sorted Array in Descending Order: " + sortedDescending);
