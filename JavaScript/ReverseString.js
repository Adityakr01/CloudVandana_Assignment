function reverseWords(sentence) {
    // Split the sentence into words
    var words = sentence.split(" ");
    
    // Reverse each word
    var reversedWords = words.map(function(word) {
        return word.split('').reverse().join('');
    });
    
    // Join the reversed words back into a sentence
    var reversedSentence = reversedWords.join(' ');
    
    return reversedSentence;
}

var inputSentence = "This is a sunny day";
var reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);  // Output: "sihT si a ynnus yad"
